package software.design.consulate.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
public class Application {

    protected String title;
    protected String content;
    protected String firstName;
    protected String lastName;
    protected String maidenName;
    protected String email;
    protected char sex;
    protected String martialState;
    protected Date birthday;
    protected String nationalities;
    protected Date passportCreationTime;
    protected Date passportExpirationTime;
    protected String pesel;
    protected String passportGenerator;
    protected String purpose;
    protected Date arriveTime;
    protected int visitationLength;
    protected String passportNumber;

    private Long centralId;

    @Id
    @GeneratedValue
    private Long localId;

    @OneToMany
    private List<Charge> charges;

    public Application() {

    }

    public Application(Long centralId, String title, String content, String firstName, String lastName, String maidenName, String email, char sex, String martialState, Date birthday, String nationalities, Date passportCreationTime, Date passportExpirationTime, String pesel, String passportGenerator, String purpose, Date arriveTime, int visitationLength, String passportNumber,  List<Charge> charges) {
        this.centralId = centralId;
        this.title = title;
        this.content = content;
        this.firstName = firstName;
        this.lastName = lastName;
        this.maidenName = maidenName;
        this.email = email;
        this.sex = sex;
        this.martialState = martialState;
        this.birthday = birthday;
        this.nationalities = nationalities;
        this.passportCreationTime = passportCreationTime;
        this.passportExpirationTime = passportExpirationTime;
        this.pesel = pesel;
        this.passportGenerator = passportGenerator;
        this.purpose = purpose;
        this.arriveTime = arriveTime;
        this.visitationLength = visitationLength;
        this.passportNumber = passportNumber;
        this.charges = charges;
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

    public Date getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(Date arriveTime) {
        this.arriveTime = arriveTime;
    }

    public int getVisitationLength() {
        return visitationLength;
    }

    public void setVisitationLength(int visitationLength) {
        this.visitationLength = visitationLength;
    }

    public List<Charge> getCharges() {
        return charges;
    }

    public void setCharges(List<Charge> charges) {
        this.charges = charges;
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
