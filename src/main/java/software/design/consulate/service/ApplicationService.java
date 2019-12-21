package software.design.consulate.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import software.design.consulate.model.Application;
import software.design.consulate.model.dto.ApplicationDto;
import software.design.consulate.model.dto.CreateApplicationDto;
import software.design.consulate.repository.ApplicationRepository;

import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import static software.design.consulate.model.dto.ApplicationDto.from;

@Service
public class ApplicationService {

    private final ApplicationRepository repository;

    public ApplicationService(ApplicationRepository repository) {
        this.repository = repository;
    }

    @Transactional(readOnly = true)
    public List<ApplicationDto> findAll() {
        return repository.findAll()
                .stream()
                .map(ApplicationDto::from)
                .collect(Collectors.toUnmodifiableList());
    }

    @Transactional
    public ApplicationDto save(CreateApplicationDto applicationDto) {
        return from(repository.save(newApplication(applicationDto)));
    }

    private Application newApplication(CreateApplicationDto applicationDto) {
        return new Application(UUID.randomUUID(),
                applicationDto.getTitle(),
                applicationDto.getContent(),
                applicationDto.getFirstName(),
                applicationDto.getLastName(),
                applicationDto.getMaidenName(),
                applicationDto.getEmail(),
                applicationDto.getSex(),
                applicationDto.getMartialState(),
                applicationDto.getBirthday(),
                applicationDto.getPassportCreationTime(),
                applicationDto.getPassportExpirationTime(),
                applicationDto.getPesel(),
                applicationDto.getPasportGenerator(),
                applicationDto.getPurpose(),
                applicationDto.getArriveTime(),
                applicationDto.getVisitationLenght(),
                Collections.emptyList());
    }
}
