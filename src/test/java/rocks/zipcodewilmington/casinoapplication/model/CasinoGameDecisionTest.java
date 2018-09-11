package rocks.zipcodewilmington.casinoapplication.model;

import org.junit.Test;
import rocks.zipcodewilmington.casinoapplication.services.CasinoGameDecision;
import rocks.zipcodewilmington.casinoapplication.services.games.schema.GameEngineInterface;

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
