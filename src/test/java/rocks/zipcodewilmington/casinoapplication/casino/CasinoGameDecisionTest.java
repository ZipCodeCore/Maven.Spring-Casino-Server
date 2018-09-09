package rocks.zipcodewilmington.casinoapplication.casino;

import org.junit.Test;
import rocks.zipcodewilmington.casinoapplication.casino.games.cardgames.blackjack.BlackJackGame;
import rocks.zipcodewilmington.casinoapplication.casino.games.schema.GameEngineInterface;

/**
 * @author leon on 9/8/18.
 */
public class CasinoGameDecisionTest {
    @Test
    public void testBlackJackGameDecision() {
        GameEngineInterface bjg  = CasinoGameDecision.getGame("BLACKJACK");
        bjg.run();
    }
}
