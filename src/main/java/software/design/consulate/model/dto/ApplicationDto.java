package software.design.consulate.model.dto;

import software.design.consulate.model.Application;

import java.util.Date;
import java.util.UUID;

public class ApplicationDto extends CreateApplicationDto {

    private UUID centralId;
    private UUID localId;

    public ApplicationDto() {
    }

    public ApplicationDto(UUID centralId, UUID localId, String title, String content, String firstName, String lastName, String maidenName, String email, char sex, String martialState, Date birthday, Date pasportCreationTime, Date pasportExpirationTime, String pesel, String pasportGenerator, String purpose, Date arriveTime, int visitationLenght) {
        super(title, content, firstName, lastName, maidenName, email, sex, martialState, birthday, pasportCreationTime, pasportExpirationTime, pesel, pasportGenerator, purpose, arriveTime, visitationLenght);
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
                application.getBirthday(),
                application.getPasportCreationTime(),
                application.getPasportExpirationTime(),
                application.getPesel(),
                application.getPasportGenerator(),
                application.getPurpose(),
                application.getArriveTime(),
                application.getVisitationLenght());
    }

    public UUID getCentralId() {
        return centralId;
    }

    public void setCentralId(UUID centralId) {
        this.centralId = centralId;
    }

    public UUID getLocalId() {
        return localId;
    }

    public void setLocalId(UUID localId) {
        this.localId = localId;
    }
}
