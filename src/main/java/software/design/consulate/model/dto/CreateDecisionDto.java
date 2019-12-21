package software.design.consulate.model.dto;

import software.design.consulate.model.DecisionType;

public class CreateDecisionDto {

    private String matter;
    private DecisionType decisionType;
    private String reason;

    public CreateDecisionDto() {
    }

    public CreateDecisionDto(String matter, DecisionType decisionType, String reason) {
        this.matter = matter;
        this.decisionType = decisionType;
        this.reason = reason;
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
}
