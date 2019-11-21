public enum SuitType {
    HEARTS("hearts"),
    DIAMONDS("diamonds"),
    SPADES("spades"),
    CLUBS("clubs");

    private final String suitValue;

    SuitType(String suitValue) {
        this.suitValue = suitValue;
    }

    public String getValue() {
        return this.suitValue;

    }
}