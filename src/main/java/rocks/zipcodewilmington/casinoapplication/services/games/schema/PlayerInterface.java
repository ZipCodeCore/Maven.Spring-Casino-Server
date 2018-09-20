package rocks.zipcodewilmington.casinoapplication.services.games.schema;

import rocks.zipcodewilmington.casinoapplication.model.CasinoProfile;

/**
 * @author leon on 9/1/18.
 */
interface PlayerInterface {
    CasinoProfile getCasinoProfile();
    String getName();
    Long getId();
}
