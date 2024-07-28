public enum Rank {
    ACE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(0),
    QUEEN(0),
    KING(0);

    private final int pointValue;
    private Rank(int pointValue)
    {
        this.pointValue = pointValue;
    }
    public int getPointValue()
    {
        return pointValue;
    }

    @Override
    public String toString()
    {
        if (getPointValue() < 11) {
            return String.valueOf(getPointValue());
        } else {
            return name().toLowerCase();
        }
    }
}