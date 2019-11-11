public enum RankType {
    ACE(1, 11),
    TWO(2, 2),
    THREE(3, 3),
    FOUR(4, 4),
    FIVE(5, 5),
    SIX(6, 6),
    SEVEN(7, 7),
    EIGHT(8, 8),
    NINE(9, 9),
    TEN(10, 10),
    JACK(10, 10),
    QUEEN(10, 10),
    KING(10,10);

    private final int value;
    private final int altValue;

    RankType(int value, int altValue){
        this.value = value;
        this.altValue = altValue;
    }

    public int getValue(){
        return this.value;
    }

    public int getAltValue(){
        return this.altValue;
    }
}