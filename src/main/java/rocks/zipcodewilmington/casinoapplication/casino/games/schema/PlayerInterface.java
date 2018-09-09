package rocks.zipcodewilmington.casinoapplication.casino.games.schema;

import rocks.zipcodewilmington.casinoapplication.casino.CasinoProfile;

/**
 * @author leon on 9/1/18.
 */
interface PlayerInterface {
    CasinoProfile getProfile();
    String getName();
    Long getId();
}
