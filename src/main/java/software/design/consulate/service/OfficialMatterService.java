package software.design.consulate.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import software.design.consulate.model.Charge;
import software.design.consulate.model.Decision;
import software.design.consulate.model.OfficialMatter;
import software.design.consulate.model.dto.matter.EditOfficialMatterDto;
import software.design.consulate.model.dto.matter.MatterDto;
import software.design.consulate.repository.ApplicationRepository;
import software.design.consulate.repository.OfficialMatterRepository;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OfficialMatterService {

    private OfficialMatterRepository officialMatterRepository;
    private ApplicationRepository applicationRepository;


    public OfficialMatterService(OfficialMatterRepository officialMatterRepository, ApplicationRepository applicationRepository) {
        this.officialMatterRepository = officialMatterRepository;
        this.applicationRepository = applicationRepository;
    }

    @Transactional(readOnly = true)
    public List<MatterDto> findAll() {
        return officialMatterRepository.findAll()
                .stream()
                .map(MatterDto::from)
                .collect(Collectors.toUnmodifiableList());
    }

    @Transactional(readOnly = true)
    public List<MatterDto> findAllWithoutTerminalDecision() {
        return officialMatterRepository.findAll()
                .stream()
                .filter(
                        matter -> matter.getDecisions().stream().noneMatch(Decision::isTerminal)
                )
                .map(MatterDto::from)
                .collect(Collectors.toUnmodifiableList());
    }

    @Transactional(readOnly = true)
    public OfficialMatter getByLocalId(Long id) {
        return officialMatterRepository.findByLocalId(id)
                .orElseThrow(() -> new IllegalStateException("No application with local id: " + id));
    }

    @Transactional
    public void createMatter(Long applicationId) {
        final var application = applicationRepository.findByLocalId(applicationId)
                .orElseThrow(() -> new IllegalStateException("Application with id:" + applicationId + " does not exist!"));
        final var matter = new OfficialMatter(null,
                new Date(),
                "",
                new Charge(0d, "", null, null),
                application,
                Collections.emptyList());
        officialMatterRepository.save(matter);
    }

    @Transactional
    public void createOrRejectMatter(Long id, String manage) {
        switch (manage) {
            case "rejected":
                applicationRepository.deleteByLocalId(id);
                break;
            case "confirmed":
                createMatter(id);
                break;
            default:
                throw new IllegalArgumentException("Wrong parameter");
        }
    }

    @Transactional
    public void delete(Long id) {
        officialMatterRepository.deleteByLocalId(id);
    }

    @Transactional
    public void edit(OfficialMatter matter, EditOfficialMatterDto editOfficialMatterDto) {
        final var officialMatter = officialMatterRepository.findByLocalId(matter.getLocalId())
                .orElseThrow(() -> new IllegalArgumentException("Matter does not exist!"));
        officialMatter.setNote(editOfficialMatterDto.getNote());
        officialMatter.setCharge(new Charge(editOfficialMatterDto.getValue(), editOfficialMatterDto.getCurrency(), new Date(), false));
    }

    @Transactional(readOnly = true)
    public boolean existForApplication(Long localId) {
        return officialMatterRepository.findAll()
                .stream()
                .map(OfficialMatter::getApplication)
                .anyMatch(application -> application.getLocalId().equals(localId));
    }
}
