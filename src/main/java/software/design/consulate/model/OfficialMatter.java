package software.design.consulate.model;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class OfficialMatter {

    private Long centralId;

    private Date creationDate;

    @Lob
    private String note;

    @OneToOne(cascade = CascadeType.ALL)
    private Charge charge;

    @OneToOne(cascade = CascadeType.ALL)
    private Application application;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Decision> decisions;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long localId;

    public OfficialMatter() {
    }

    public OfficialMatter(Long centralId, Date creationDate, String note, Charge charge, Application application, List<Decision> decisions) {
        this.centralId = centralId;
        this.creationDate = creationDate;
        this.note = note;
        this.charge = charge;
        this.application = application;
        this.decisions = decisions;
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
