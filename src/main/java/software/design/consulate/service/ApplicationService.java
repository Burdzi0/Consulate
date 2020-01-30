package software.design.consulate.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import software.design.consulate.model.Application;
import software.design.consulate.model.dto.application.ApplicationDto;
import software.design.consulate.model.dto.application.CreateApplicationDto;
import software.design.consulate.model.dto.application.EditApplicationDto;
import software.design.consulate.repository.ApplicationRepository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

import static software.design.consulate.model.dto.application.ApplicationDto.from;

@Service
public class ApplicationService {

    private final ApplicationRepository repository;
    private final SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

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

    @Transactional(readOnly = true)
    public ApplicationDto getByLocalId(Long id) {
        return from(repository.findByLocalId(id)
                .orElseThrow(() -> new IllegalStateException("No application with local id: " + id))
        );
    }

    @Transactional
    public ApplicationDto save(CreateApplicationDto applicationDto) {
        return from(repository.save(newApplication(applicationDto)));
    }

    @Transactional
    public void edit(EditApplicationDto applicationDto) {
        final var application = repository.getOne(applicationDto.getId());
        editApplication(application, applicationDto);
    }

    @Transactional
    public void delete(Long id) {
        repository.deleteByLocalId(id);
    }

    private Application newApplication(CreateApplicationDto applicationDto) {
        Date arrival = null;
        Date birthday = null;
        Date passportCreation = null;
        Date passportExpire = null;

        try {
            arrival = format.parse(applicationDto.getArriveTime());
            birthday = format.parse(applicationDto.getBirthday());
            passportCreation = format.parse(applicationDto.getPassportCreationTime());
            passportExpire = format.parse(applicationDto.getPassportExpirationTime());
        } catch (ParseException e) {
            throw new IllegalArgumentException("Not a date!", e);
        }

        return new Application(null,
                applicationDto.getTitle(),
                applicationDto.getContent(),
                applicationDto.getFirstName(),
                applicationDto.getLastName(),
                applicationDto.getMaidenName(),
                applicationDto.getEmail(),
                applicationDto.getSex(),
                applicationDto.getMartialState(),
                birthday,
                applicationDto.getNationalities(),
                passportCreation,
                passportExpire,
                applicationDto.getPesel(),
                applicationDto.getPassportGenerator(),
                applicationDto.getPurpose(),
                arrival,
                applicationDto.getVisitationLength(),
                applicationDto.getPassportNumber(),
                Collections.emptyList());
    }

    @Transactional
    public void editApplication(Application application, EditApplicationDto dto) {
        Date arrival = null;
        Date birthday = null;
        Date passportCreation = null;
        Date passportExpire = null;

        try {
            arrival = format.parse(dto.getArriveTime());
            birthday = format.parse(dto.getBirthday());
            passportCreation = format.parse(dto.getPassportCreationTime());
            passportExpire = format.parse(dto.getPassportExpirationTime());
        } catch (ParseException e) {
            throw new IllegalArgumentException("Not a date!", e);
        }

        application.setTitle(dto.getTitle());
        application.setContent(dto.getContent());
        application.setFirstName(dto.getFirstName());
        application.setLastName(dto.getLastName());
        application.setMaidenName(dto.getMaidenName());
        application.setEmail(dto.getEmail());
        application.setSex(dto.getSex());
        application.setMartialState(dto.getMartialState());
        application.setBirthday(birthday);
        application.setNationalities(dto.getNationalities());
        application.setPassportCreationTime(passportCreation);
        application.setPassportExpirationTime(passportExpire);
        application.setPesel(dto.getPesel());
        application.setPassportGenerator(dto.getPassportGenerator());
        application.setPurpose(dto.getPurpose());
        application.setArriveTime(arrival);
        application.setVisitationLength(dto.getVisitationLength());
        application.setPassportNumber(dto.getPassportNumber());
        application.setPassportNumber(dto.getPassportNumber());
    }
}
