package software.design.consulate.model.dto;

import software.design.consulate.model.Decision;
import software.design.consulate.model.DecisionType;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DecisionDto {

    private long id;
    private String matter;
    private String decisionType;
    private String reason;
    private String added;

    public DecisionDto(long id, String matter, DecisionType decisionType, String reason, Date added) {
        this.id = id;
        this.matter = matter;
        this.decisionType = decisionType.getValue();
        this.reason = reason;
        this.added = new SimpleDateFormat("dd/MM/yyyy").format(added);
    }

    public static DecisionDto from(Decision decision) {
        return new DecisionDto(decision.getId(),
                decision.getMatter(),
                decision.getDecisionType(),
                decision.getReason(),
                decision.getAdded());
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMatter() {
        return matter;
    }

    public void setMatter(String matter) {
        this.matter = matter;
    }

    public String getDecisionType() {
        return decisionType;
    }

    public void setDecisionType(DecisionType decisionType) {
        this.decisionType = decisionType.getValue();
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getAdded() {
        return added;
    }

    public void setAdded(Date added) {
        new SimpleDateFormat("dd/MM/yyyy").format(added);
    }
}
