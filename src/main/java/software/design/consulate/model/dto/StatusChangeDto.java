package software.design.consulate.model.dto;

public class StatusChangeDto {

    protected String manage;

    public StatusChangeDto() {
    }

    public StatusChangeDto(String manage) {
        this.manage = manage;
    }

    public String getManage() {
        return manage;
    }

    public void setManage(String manage) {
        this.manage = manage;
    }
}
