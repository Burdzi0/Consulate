package software.design.consulate.model.dto.matter;

import software.design.consulate.model.Application;
import software.design.consulate.model.Charge;
import software.design.consulate.model.Decision;
import software.design.consulate.model.OfficialMatter;

import java.util.Date;
import java.util.List;

public class MatterDto {

    private Long localId;

    private Long centralId;

    private Date creationDate;

    private String note;

    private Charge charge;

    private Application application;

    private List<Decision> decisions;

    public MatterDto(Long localId, Long centralId, Date creationDate, String note, Charge charge, Application application, List<Decision> decisions) {
        this.localId = localId;
        this.centralId = centralId;
        this.creationDate = creationDate;
        this.note = note;
        this.charge = charge;
        this.application = application;
        this.decisions = decisions;
    }

    public static MatterDto from(OfficialMatter matter) {
        return new MatterDto(matter.getLocalId(),
                matter.getCentralId(),
                matter.getCreationDate(),
                matter.getNote(),
                matter.getCharge(),
                matter.getApplication(),
                matter.getDecisions());
    }

    public Long getLocalId() {
        return localId;
    }

    public void setLocalId(Long localId) {
        this.localId = localId;
    }

    public Long getCentralId() {
        return centralId;
    }

    public void setCentralId(Long centralId) {
        this.centralId = centralId;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Charge getCharge() {
        return charge;
    }

    public void setCharge(Charge charge) {
        this.charge = charge;
    }

    public Application getApplication() {
        return application;
    }

    public void setApplication(Application application) {
        this.application = application;
    }

    public List<Decision> getDecisions() {
        return decisions;
    }

    public void setDecisions(List<Decision> decisions) {
        this.decisions = decisions;
    }
}
