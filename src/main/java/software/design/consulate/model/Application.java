package software.design.consulate.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
    protected Date pasportCreationTime;
    protected Date pasportExpirationTime;
    protected String pesel;
    protected String pasportGenerator;
    protected String purpose;
    protected Date arriveTime;
    protected int visitationLenght;
    @Id
    private UUID centralId;
    private UUID localId;

    @OneToMany
    private List<Charge> charges;

    public Application() {
        this.centralId = UUID.randomUUID();
    }

    public Application(UUID localId, String title, String content, String firstName, String lastName, String maidenName, String email, char sex, String martialState, Date birthday, Date pasportCreationTime, Date pasportExpirationTime, String pesel, String pasportGenerator, String purpose, Date arriveTime, int visitationLenght, List<Charge> charges) {
        this.centralId = UUID.randomUUID();
        this.localId = localId;
        this.title = title;
        this.content = content;
        this.firstName = firstName;
        this.lastName = lastName;
        this.maidenName = maidenName;
        this.email = email;
        this.sex = sex;
        this.martialState = martialState;
        this.birthday = birthday;
        this.pasportCreationTime = pasportCreationTime;
        this.pasportExpirationTime = pasportExpirationTime;
        this.pesel = pesel;
        this.pasportGenerator = pasportGenerator;
        this.purpose = purpose;
        this.arriveTime = arriveTime;
        this.visitationLenght = visitationLenght;
        this.charges = charges;
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

    public Date getPasportCreationTime() {
        return pasportCreationTime;
    }

    public void setPasportCreationTime(Date pasportCreationTime) {
        this.pasportCreationTime = pasportCreationTime;
    }

    public Date getPasportExpirationTime() {
        return pasportExpirationTime;
    }

    public void setPasportExpirationTime(Date pasportExpirationTime) {
        this.pasportExpirationTime = pasportExpirationTime;
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

    public List<Charge> getCharges() {
        return charges;
    }

    public void setCharges(List<Charge> charges) {
        this.charges = charges;
    }
}
