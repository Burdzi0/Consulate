package software.design.consulate.model;

public enum DocumentType {
    PASSPORT("Paszport"), ID("Dowód osobisty"), DRIVING_LICENSE("Prawo jazdy");

    private String type;

    DocumentType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
