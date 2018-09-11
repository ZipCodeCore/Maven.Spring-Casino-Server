package rocks.zipcodewilmington.casinoapplication.services.games.cardgames.toolkit;

/**
 * @author leon on 9/8/18.
 */
public enum Rank {
    ACE(1, 11),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(10),
    QUEEN(10),
    KING(10);

    private final Integer primaryValue;
    private final Integer secondaryValue;

    Rank(int value) {
        this(value, null);
    }

    Rank(Integer value, Integer secondaryValue) {
        this.primaryValue = value;
        this.secondaryValue = secondaryValue;
    }

    public int getValue() {
        return this.primaryValue;
    }

    public int getSecondaryValue() {
        return this.secondaryValue;
    }
}
