package rocks.zipcodewilmington.casinoapplication.casino.games;

import org.junit.Test;
import rocks.zipcodewilmington.casinoapplication.casino.games.cardgames.blackjack.BlackJackPlayer;
import rocks.zipcodewilmington.casinoapplication.casino.games.schema.AbstractGame;

/**
 * @author leon on 9/9/18.
 */
public class AbstractGameTest {
    @Test
    public void testBlackJackGame() {
        AbstractGame<BlackJackPlayer> blackJackPlayerAbstractGame = new AbstractGame<BlackJackPlayer>(){};

        blackJackPlayerAbstractGame.addPlayer(new BlackJackPlayer(null));
        blackJackPlayerAbstractGame.removePlayer(new BlackJackPlayer(null));
        Iterable<BlackJackPlayer> players = blackJackPlayerAbstractGame.getPlayers();
        boolean contains = blackJackPlayerAbstractGame.contains(new BlackJackPlayer(null));
    }
}
