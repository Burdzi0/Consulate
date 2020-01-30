package software.design.consulate.model;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
public class Decision {

    @Id
    @GeneratedValue
    private Long id;

    private String centralId;

    private String matter;

    @Enumerated(value = EnumType.STRING)
    private DecisionType decisionType;

    @Lob
    @Size(min = 15, message = "Decision has to be at least 15 letters long")
    private String reason;

    private Date added;

    public Decision() {
    }

    public Decision(String centralId, String matter, String decisionType, String reason) {
        this.centralId = centralId;
        this.matter = matter;
        this.decisionType = DecisionType.valueOf(decisionType);
        this.reason = reason;
        this.added = new Date();
    }

    public boolean isTerminal() {
        return this.decisionType.equals(DecisionType.NEGATIVE) ||
                this.decisionType.equals(DecisionType.POSITIVE);
    }

    public boolean isNotTerminal() {
        return !isTerminal();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCentralId() {
        return centralId;
    }

    public void setCentralId(String centralId) {
        this.centralId = centralId;
    }

    public String getMatter() {
        return matter;
    }

    public void setMatter(String matter) {
        this.matter = matter;
    }

    public DecisionType getDecisionType() {
        return decisionType;
    }

    public void setDecisionType(DecisionType decisionType) {
        this.decisionType = decisionType;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Date getAdded() {
        return added;
    }

    public void setAdded(Date added) {
        this.added = added;
    }
}
