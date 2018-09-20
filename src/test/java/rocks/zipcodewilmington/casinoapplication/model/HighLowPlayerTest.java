package rocks.zipcodewilmington.casinoapplication.model;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.casinoapplication.model.games.cardgames.highlow.HighLowPlayer;

/**
 * @author leon on 9/20/18.
 */
public class HighLowPlayerTest {
    @Test
    public void test() {
        // given
        CasinoProfile profile = new CasinoProfile(0L, "Leon", 99999999.0);
        HighLowPlayer highLowPlayer = new HighLowPlayer(profile);
        String expected = "{\"id\":null,\"casinoProfile\":{\"id\":0,\"name\":\"Leon\",\"balance\":9.9999999E7},\"hand\":null,\"name\":\"Leon\"}";

        // when
        String actual = highLowPlayer.toString();

        // then
        Assert.assertEquals(expected, actual);
    }
}
