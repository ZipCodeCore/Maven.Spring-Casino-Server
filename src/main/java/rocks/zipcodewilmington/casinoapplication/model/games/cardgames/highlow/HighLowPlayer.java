package rocks.zipcodewilmington.casinoapplication.model.games.cardgames.highlow;

import rocks.zipcodewilmington.casinoapplication.model.CasinoProfile;
import rocks.zipcodewilmington.casinoapplication.services.games.cardgames.CardPlayer;

import javax.persistence.Entity;

/**
 * @author leon on 9/20/18.
 */
@Entity
public class HighLowPlayer extends CardPlayer {
    public HighLowPlayer(CasinoProfile profile) {
        super(profile);
    }
}
