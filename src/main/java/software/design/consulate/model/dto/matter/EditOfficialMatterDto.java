package software.design.consulate.model.dto.matter;

public class EditOfficialMatterDto {

    private String note;

    private double value;

    private String currency;

    public EditOfficialMatterDto() {
    }

    public EditOfficialMatterDto(String note, double value, String currency) {
        this.note = note;
        this.value = value;
        this.currency = currency;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
