package rocks.zipcodewilmington.casinoapplication.model;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.casinoapplication.model.games.cardgames.highlow.HighLowGame;

/**
 * @author leon on 9/8/18.
 */
public class CasinoProfileTest {
    @Test
    public void test() {
        // given
        CasinoProfile profile = new CasinoProfile(0L, "Leon", 9999999.0);
        String expected = "{\"id\":0,\"name\":\"Leon\",\"balance\":9999999.0}";

        // when
        String actual = profile.toString();

        // then
        Assert.assertEquals(expected, actual);
    }
}
