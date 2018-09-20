package rocks.zipcodewilmington.casinoapplication.model.games.cardgames.highlow;

import rocks.zipcodewilmington.casinoapplication.services.games.cardgames.toolkit.Deck;
import rocks.zipcodewilmington.casinoapplication.services.games.schema.AbstractGame;

import javax.persistence.Entity;

/**
 * @author leon on 9/20/18.
 */
@Entity
public class HighLowGame extends AbstractGame<HighLowPlayer> {

    @Override
    public HighLowPlayer evaluateTurn(HighLowPlayer player) {
        player.addCard(new Deck().pop());
        return player;
    }
}
