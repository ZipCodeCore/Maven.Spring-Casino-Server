package rocks.zipcodewilmington.casinoapplication.mvc.model.games.toolkit;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.casinoapplication.mvc.model.games.cardgames.toolkit.Card;
import rocks.zipcodewilmington.casinoapplication.mvc.model.games.cardgames.toolkit.Deck;
import rocks.zipcodewilmington.casinoapplication.mvc.model.games.cardgames.toolkit.Rank;
import rocks.zipcodewilmington.casinoapplication.mvc.model.games.cardgames.toolkit.Suit;

import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 9/8/18.
 */
public class CardDeckTest {
    Deck cardDeck = new Deck();

    @Test
    public void testCardsForValidSuitValues() {
        List<Suit> suits = Arrays.asList(Suit.values());
        for (Card card : cardDeck) {
            Suit suit = card.getSuit();
            String errorMessage = "Ensuring suits contain a suit of [ %s ]";
            Assert.assertTrue(String.format(errorMessage, suit), suits.contains(suit));
        }
    }

    @Test
    public void testCardsForValidRankValues() {
        List<Rank> ranks = Arrays.asList(Rank.values());
        for (Card card : cardDeck) {
            Rank rank = card.getRank();
            String errorMessage = "Ensuring ranks contain a rank of [ %s ]";
            Assert.assertTrue(String.format(errorMessage, rank), ranks.contains(rank));
        }
    }

    @Test
    public void testSize() {
        Assert.assertEquals(52, cardDeck.size());
    }

    @Test
    public void testShuffle() {
        // Given
        String preShuffleDeck = cardDeck.toString();

        // When
        cardDeck.shuffle();
        String postShuffleDeck = cardDeck.toString();

        // Then
        Assert.assertNotEquals(preShuffleDeck, postShuffleDeck);
    }

    @Test
    public void ensureRandomnessByRepeatShuffleAndCheckForSamenessUpTo1000Times() {
        // Given
        String preShuffleDeck = cardDeck.toString();

        // When
        String postShuffleDeck;
        int numberOfShuffles = 0;
        do {
            cardDeck.shuffle();
            postShuffleDeck = cardDeck.toString();
            numberOfShuffles++;

            // Then
            Assert.assertNotEquals(preShuffleDeck, postShuffleDeck);
        } while (!postShuffleDeck.equals(preShuffleDeck) && numberOfShuffles < 1000);


    }

}
