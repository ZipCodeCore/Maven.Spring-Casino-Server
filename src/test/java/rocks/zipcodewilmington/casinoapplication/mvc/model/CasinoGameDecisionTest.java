package rocks.zipcodewilmington.casinoapplication.mvc.model;

import org.junit.Test;
import rocks.zipcodewilmington.casinoapplication.mvc.model.games.schema.GameEngineInterface;

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
