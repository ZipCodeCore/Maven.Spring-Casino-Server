package rocks.zipcodewilmington.casinoapplication.services.games.cardgames.toolkit;

import javax.persistence.*;

/**
 * @author leon on 9/8/18.
 */
@Entity
public class Card {

    @Id
    @GeneratedValue
    private Long id;

    @Enumerated(EnumType.STRING)
    private final Rank rank;

    @Enumerated(EnumType.STRING)
    private final Suit suit;

    public Card() {
        this.rank = null;
        this.suit = null;
    }

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return this.suit;
    }

    public Integer getValue() {
        return rank.getValue();
    }

    public Integer getSecondaryValue() {
        return rank.getSecondaryValue();
    }

    @Override
    public String toString() {
        return getRank().name() + " of " + getSuit().name();
    }
}
