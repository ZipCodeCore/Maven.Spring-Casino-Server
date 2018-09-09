package rocks.zipcodewilmington.casinoapplication.casino.games.cardgame;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.casinoapplication.casino.games.cardgames.CardPlayer;
import rocks.zipcodewilmington.casinoapplication.casino.games.cardgames.toolkit.Card;
import rocks.zipcodewilmington.casinoapplication.casino.games.cardgames.toolkit.Rank;
import rocks.zipcodewilmington.casinoapplication.casino.games.cardgames.toolkit.Suit;

/**
 * @author leon on 9/8/18.
 */
public class CardPlayerTest {
    @Test
    public void testAddCard() {
        // given
        Card card = new Card(Rank.ACE, Suit.CLUBS);
        CardPlayer cardPlayer = new CardPlayer(null);

        // when
        cardPlayer.addCard(card);

        // then : TODO - Implement `then` clause
        Assert.fail();
    }
}
