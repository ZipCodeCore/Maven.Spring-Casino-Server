package rocks.zipcodewilmington.casinoapplication.casino.games.cardgames.toolkit;

import java.util.*;

/**
 * @author leon on 9/8/18.
 */
public class Deck implements Iterable<Card> {
    private Stack<Card> cardStack = new Stack<>();

    public Deck() {
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                push(new Card(rank, suit));
            }
        }
    }

    public Card pop() {
        return cardStack.pop();
    }

    public Card push(Card card) {
        return cardStack.push(card);
    }

    public Card peek() {
        return cardStack.peek();
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
        List<Card> list = new ArrayList<>();
        iterator().forEachRemaining(list::add);
        return list.toString();
    }
}
