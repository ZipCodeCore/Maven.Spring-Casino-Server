package rocks.zipcodewilmington.casinoapplication.services.games.cardgames.toolkit;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/**
 * @author leon on 9/8/18.
 */
public class Deck implements Iterable<Card> {
    private List<Card> cardStack = new Stack<>();

    public Deck() {
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                push(new Card(rank, suit));
            }
        }
    }

    public Card pop() {
        Card topCard = peek();
        cardStack.remove(0);
        return topCard;
    }

    public Card push(Card card) {
        cardStack.add(card);
        return card;
    }

    public Card peek() {
        return cardStack.get(0);
    }

    public boolean isEmpty() {
        return cardStack.isEmpty();
    }

    public void shuffle() {
        Collections.shuffle(cardStack);
    }

    @Override
    public Iterator<Card> iterator() {
        return cardStack.iterator();
    }

    public int size() {
        return cardStack.size();
    }

    @Override
    public String toString() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            throw new Error(e);
        }
    }
}
