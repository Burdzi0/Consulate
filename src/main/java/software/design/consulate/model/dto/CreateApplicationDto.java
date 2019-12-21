package software.design.consulate.model.dto;

import java.util.Date;

public class CreateApplicationDto {

    protected String title;
    protected String content;
    protected String firstName;
    protected String lastName;
    protected String maidenName;
    protected String email;
    protected char sex;
    protected String martialState;
    protected Date birthday;
    protected Date passportCreationTime;
    protected Date passportExpirationTime;
    protected String pesel;
    protected String pasportGenerator;
    protected String purpose;
    protected Date arriveTime;
    protected int visitationLenght;

    public CreateApplicationDto() {
    }

    public CreateApplicationDto(String title, String content, String firstName, String lastName, String maidenName, String email, char sex, String martialState, Date birthday, Date passportCreationTime, Date passportExpirationTime, String pesel, String pasportGenerator, String purpose, Date arriveTime, int visitationLenght) {
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
        this.pasportGenerator = pasportGenerator;
        this.purpose = purpose;
        this.arriveTime = arriveTime;
        this.visitationLenght = visitationLenght;
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getPassportCreationTime() {
        return passportCreationTime;
    }

    public void setPassportCreationTime(Date passportCreationTime) {
        this.passportCreationTime = passportCreationTime;
    }

    public Date getPassportExpirationTime() {
        return passportExpirationTime;
    }

    public void setPassportExpirationTime(Date passportExpirationTime) {
        this.passportExpirationTime = passportExpirationTime;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getPasportGenerator() {
        return pasportGenerator;
    }

    public void setPasportGenerator(String pasportGenerator) {
        this.pasportGenerator = pasportGenerator;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public Date getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(Date arriveTime) {
        this.arriveTime = arriveTime;
    }

    public int getVisitationLenght() {
        return visitationLenght;
    }

    public void setVisitationLenght(int visitationLenght) {
        this.visitationLenght = visitationLenght;
    }
}
