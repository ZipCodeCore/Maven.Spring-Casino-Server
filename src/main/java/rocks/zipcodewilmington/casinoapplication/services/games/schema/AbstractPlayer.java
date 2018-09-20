package rocks.zipcodewilmington.casinoapplication.services.games.schema;

import rocks.zipcodewilmington.casinoapplication.model.CasinoProfile;

import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

/**
 * @author leon on 9/1/18.
 */
@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
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

    @Id
    public Long getId() {
        return profile.getId();
    }
}
