package rocks.zipcodewilmington.casinoapplication.services.games.cardgame.blackjack;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.casinoapplication.model.games.cardgames.blackjack.BlackJackGame;
import rocks.zipcodewilmington.casinoapplication.services.games.cardgames.gameengine.BlackJackGameEngine;
import rocks.zipcodewilmington.casinoapplication.model.games.cardgames.blackjack.BlackJackPlayer;
import rocks.zipcodewilmington.casinoapplication.services.games.cardgames.toolkit.Card;
import rocks.zipcodewilmington.casinoapplication.services.games.cardgames.toolkit.Rank;
import rocks.zipcodewilmington.casinoapplication.services.games.cardgames.toolkit.Suit;

/**
 * @author leon on 9/8/18.
 */
public class BlackJackGameEngineTest {
    @Test
    public void testBlackJackPlayerWithBlackJack() {
        // Given : initialization
        Card ace = new Card(Rank.ACE, Suit.CLUBS);
        Card jack = new Card(Rank.JACK, Suit.CLUBS);
        BlackJackPlayer player = new BlackJackPlayer(null);
        BlackJackGame game = new BlackJackGame();
        BlackJackGameEngine engine = new BlackJackGameEngine(game);

        // Given : Setup
        game.addPlayer(player);
        player.addCard(ace);
        player.addCard(jack);

        // When
        engine.evaluateTurn(player);

        // Then : TODO - implement `then` clause
        Assert.fail();
    }
}
