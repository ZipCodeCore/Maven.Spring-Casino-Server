package rocks.zipcodewilmington.casinoapplication.mvc.model.games.schema;

import rocks.zipcodewilmington.casinoapplication.mvc.model.CasinoProfile;

/**
 * @author leon on 9/1/18.
 */
interface PlayerInterface {
    CasinoProfile getProfile();
    String getName();
    Long getId();
}
