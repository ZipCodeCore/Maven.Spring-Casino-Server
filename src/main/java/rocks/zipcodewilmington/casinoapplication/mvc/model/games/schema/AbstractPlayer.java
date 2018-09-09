package rocks.zipcodewilmington.casinoapplication.mvc.model.games.schema;

import rocks.zipcodewilmington.casinoapplication.mvc.model.CasinoProfile;

/**
 * @author leon on 9/1/18.
 */
abstract public class AbstractPlayer implements PlayerInterface {
    private final CasinoProfile profile;

    public AbstractPlayer(CasinoProfile profile) {
        this.profile = profile;
    }

    public CasinoProfile getProfile() {
        return profile;
    }

    public String getName() {
        return profile.getName();
    }

    public Long getId() {
        return profile.getId();
    }
}
