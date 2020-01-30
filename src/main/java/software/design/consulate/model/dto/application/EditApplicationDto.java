package software.design.consulate.model.dto.application;

public class EditApplicationDto extends  CreateApplicationDto {

    protected Long id;

    public EditApplicationDto() {
    }

    public EditApplicationDto(Long id) {
        this.id = id;
    }

    public EditApplicationDto(String title, String content, String firstName, String lastName, String maidenName, String email, char sex, String martialState, String birthday, String passportCreationTime, String passportExpirationTime, String pesel, String passportGenerator, String purpose, String arriveTime, int visitationLength, String nationalities, String passportNumber, Long id) {
        super(title, content, firstName, lastName, maidenName, email, sex, martialState, birthday, passportCreationTime, passportExpirationTime, pesel, passportGenerator, purpose, arriveTime, visitationLength, nationalities, passportNumber);
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
