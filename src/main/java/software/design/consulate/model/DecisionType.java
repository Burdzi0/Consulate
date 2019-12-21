package software.design.consulate.model;

public enum DecisionType {
    POSITIVE("Pozytywna"), NEGATIVE("Negatywna"), TO_BE_SUPPLEMENTED("Do uzupełnienia");

    private String value;

    DecisionType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

