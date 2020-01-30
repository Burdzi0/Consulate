package software.design.consulate.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Document {

    @Id
    @GeneratedValue
    private Long id;

    private String firstName;
    private String lastName;
    private String maidenName;
    private char sex;
    private String martialState;
    private Date birthday;
    private String number;
    private Date creationTime;
    private Date expireTime;
    private String generator;

    private DocumentType documentType;

    public Document() {
    }

    public Document(String firstName, String lastName, String maidenName, char sex, String martialState, Date birthday, String number, Date expireTime, String generator, DocumentType documentType, Date creationTime) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.maidenName = maidenName;
        this.sex = sex;
        this.martialState = martialState;
        this.birthday = birthday;
        this.number = number;
        this.expireTime = expireTime;
        this.creationTime = creationTime;
        this.generator = generator;
        this.documentType = documentType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public String getGenerator() {
        return generator;
    }

    public void setGenerator(String generator) {
        this.generator = generator;
    }

    public DocumentType getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType;
    }
}
