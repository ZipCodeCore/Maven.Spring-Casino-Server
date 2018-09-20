package rocks.zipcodewilmington.casinoapplication.services.games.cardgames.toolkit;

/**
 * @author leon on 9/8/18.
 */

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Entity
public class Hand implements Iterable<Card> {
    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    @ElementCollection(targetClass = Card.class)
    private List<Card> cardList = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Card> getCardList() {
        return cardList;
    }

    public void setCardList(List<Card> cardList) {
        this.cardList = cardList;
    }

    public boolean isEmpty() {
        return size() < 1;
    }

    public void remove(Card card) {
        cardList.remove(card);
    }

    public void add(Card card) {
        cardList.add(card);
    }

    public boolean contains(Card card) {
        return cardList.contains(card);
    }

    public int size() {
        return cardList.size();
    }

    @Override
    public Iterator<Card> iterator() {
        return cardList.iterator();
    }

    @Override
    public String toString() {
        return cardList.toString();
    }
}
