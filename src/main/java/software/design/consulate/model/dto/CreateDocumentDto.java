package software.design.consulate.model.dto;

import software.design.consulate.model.DocumentType;

public class CreateDocumentDto {

    private String firstName;
    private String lastName;
    private String maidenName;
    private char sex;
    private String martialState;
    private String birthday;
    private String number;
    private String expireTime;
    private String creationTime;
    private String generator;

    private DocumentType documentType;

    public CreateDocumentDto() {
    }

    public CreateDocumentDto(String firstName, String lastName, String maidenName, char sex, String martialState, String birthday, String number, String expireTime, String creationTime, String generator, DocumentType documentType) {
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
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

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }
}
