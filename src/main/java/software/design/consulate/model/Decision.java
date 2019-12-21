package software.design.consulate.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Decision {

    @Id
    @GeneratedValue
    private Long id;

    // TODO sprawa
    private String matter;

    @Enumerated(value = EnumType.STRING)
    private DecisionType decisionType;

    @Lob
    private String reason;

    private Date added;

    public Decision() {
    }

    public Decision(String matter, String decisionType, String reason) {
        this.matter = matter;
        this.decisionType = DecisionType.valueOf(decisionType);
        this.reason = reason;
        this.added = new Date();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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