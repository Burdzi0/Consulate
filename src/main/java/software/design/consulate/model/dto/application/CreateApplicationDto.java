package software.design.consulate.model.dto.application;

public class CreateApplicationDto {

    protected String title;
    protected String content;
    protected String firstName;
    protected String lastName;
    protected String maidenName;
    protected String email;
    protected char sex;
    protected String martialState;
    protected String birthday;
    protected String passportCreationTime;
    protected String passportExpirationTime;
    protected String pesel;
    protected String passportGenerator;
    protected String purpose;
    protected String arriveTime;
    protected int visitationLength;
    protected String nationalities;
    protected String passportNumber;

    public CreateApplicationDto() {
    }

    public CreateApplicationDto(String title, String content, String firstName, String lastName, String maidenName, String email, char sex, String martialState, String birthday, String passportCreationTime, String passportExpirationTime, String pesel, String passportGenerator, String purpose, String arriveTime, int visitationLength, String nationalities, String passportNumber) {
        this.title = title;
        this.content = content;
        this.firstName = firstName;
        this.lastName = lastName;
        this.maidenName = maidenName;
        this.email = email;
        this.sex = sex;
        this.martialState = martialState;
        this.birthday = birthday;
        this.passportCreationTime = passportCreationTime;
        this.passportExpirationTime = passportExpirationTime;
        this.pesel = pesel;
        this.passportGenerator = passportGenerator;
        this.purpose = purpose;
        this.arriveTime = arriveTime;
        this.visitationLength = visitationLength;
        this.nationalities = nationalities;
        this.passportNumber = passportNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMaidenName() {
        return maidenName;
    }

    public void setMaidenName(String maidenName) {
        this.maidenName = maidenName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getMartialState() {
        return martialState;
    }

    public void setMartialState(String martialState) {
        this.martialState = martialState;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPassportCreationTime() {
        return passportCreationTime;
    }

    public void setPassportCreationTime(String passportCreationTime) {
        this.passportCreationTime = passportCreationTime;
    }

    public String getPassportExpirationTime() {
        return passportExpirationTime;
    }

    public void setPassportExpirationTime(String passportExpirationTime) {
        this.passportExpirationTime = passportExpirationTime;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getPassportGenerator() {
        return passportGenerator;
    }

    public void setPassportGenerator(String passportGenerator) {
        this.passportGenerator = passportGenerator;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(String arriveTime) {
        this.arriveTime = arriveTime;
    }

    public int getVisitationLength() {
        return visitationLength;
    }

    public void setVisitationLength(int visitationLength) {
        this.visitationLength = visitationLength;
    }

    public String getNationalities() {
        return nationalities;
    }

    public void setNationalities(String nationalities) {
        this.nationalities = nationalities;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }
}
