package rocks.zipcodewilmington.casinoapplication.model;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.casinoapplication.model.games.cardgames.highlow.HighLowGame;

/**
 * @author leon on 9/20/18.
 */
public class HighLowGameTest {
    @Test
    public void test() {
        // given
        HighLowGame game = new HighLowGame();
        String expected = "{\"id\":null,\"playerList\":[],\"players\":[]}";

        // when
        String actual = game.toString();

        // then
        System.out.println(expected);
        Assert.assertEquals(expected, actual);
    }
}
