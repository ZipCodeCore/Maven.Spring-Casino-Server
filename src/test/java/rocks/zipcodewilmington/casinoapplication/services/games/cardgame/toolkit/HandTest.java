package rocks.zipcodewilmington.casinoapplication.services.games.cardgame.toolkit;

/**
 * @author leon on 9/8/18.
 */
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.casinoapplication.services.games.cardgames.toolkit.Card;
import rocks.zipcodewilmington.casinoapplication.services.games.cardgames.toolkit.Deck;
import rocks.zipcodewilmington.casinoapplication.services.games.cardgames.toolkit.Hand;

public class HandTest {
    // Given
    private Hand hand = new Hand();
    private Deck deck = new Deck();


    @Test
    public void constructorTest() {
        // When
        boolean outcome = hand.isEmpty();

        // Then
        Assert.assertTrue(outcome);
    }
    @Test
    public void addCardTest() {
        // Given
        Card card = deck.pop();

        // When
        hand.add(card);

        // Then
        Assert.assertTrue(hand.contains(card));
    }
    @Test
    public void removeCardTest() {
        // Given
        Card card = deck.pop();
        Assert.assertFalse(hand.contains(card));

        // When
        hand.add(card);
        hand.remove(card);

        // Then
        Assert.assertFalse(hand.contains(card));
    }
    @Test
    public void sizeTest() {
        // Given
        int numberOfCardsToAdd = 51;

        // When
        for (int i = 0; i < numberOfCardsToAdd; i++) {
            hand.add(deck.pop());
        }

        Assert.assertEquals(numberOfCardsToAdd, hand.size());
    }
    @Test
    public void toStringTest() {

    }
}
