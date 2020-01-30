package software.design.consulate.model.dto.application;

import software.design.consulate.model.Application;

import java.text.SimpleDateFormat;
import java.util.UUID;

public class ApplicationDto extends CreateApplicationDto {

    private final static SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
    private Long centralId;
    private Long localId;

    public ApplicationDto() {
    }

    public ApplicationDto(Long centralId, Long localId, String title, String content, String firstName, String lastName, String maidenName, String email, char sex, String martialState, String birthday, String passportCreationTime, String passportExpirationTime, String pesel, String passportGenerator, String purpose, String arriveTime, int visitationLength, String nationalities, String passportNumber) {
        super(title, content, firstName, lastName, maidenName, email, sex, martialState, birthday, passportCreationTime, passportExpirationTime, pesel, passportGenerator, purpose, arriveTime, visitationLength, nationalities, passportNumber);
        this.centralId = centralId;
        this.localId = localId;
    }

    public static ApplicationDto from(Application application) {
        return new ApplicationDto(application.getCentralId(),
                application.getLocalId(),
                application.getTitle(),
                application.getContent(),
                application.getFirstName(),
                application.getLastName(),
                application.getMaidenName(),
                application.getEmail(),
                application.getSex(),
                application.getMartialState(),
                format.format(application.getBirthday()),
                format.format(application.getPassportCreationTime()),
                format.format(application.getPassportExpirationTime()),
                application.getPesel(),
                application.getPassportGenerator(),
                application.getPurpose(),
                format.format(application.getArriveTime()),
                application.getVisitationLength(),
                application.getNationalities(),
                application.getPassportNumber()
        );
    }


    public Long getCentralId() {
        return centralId;
    }

    public void setCentralId(Long centralId) {
        this.centralId = centralId;
    }

    public Long getLocalId() {
        return localId;
    }

    public void setLocalId(Long localId) {
        this.localId = localId;
    }
}
