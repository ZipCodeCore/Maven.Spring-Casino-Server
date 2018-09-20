package rocks.zipcodewilmington.casinoapplication.services.games.schema;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import rocks.zipcodewilmington.casinoapplication.model.CasinoProfile;

import javax.persistence.*;
import javax.swing.tree.RowMapper;

/**
 * @author leon on 9/1/18.
 */
@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
abstract public class AbstractPlayer implements PlayerInterface {
    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    private CasinoProfile casinoProfile;


    public AbstractPlayer(CasinoProfile profile) {
        this.casinoProfile = profile;
    }

    public CasinoProfile getCasinoProfile() {
        return casinoProfile;
    }

    public String getName() {
        return casinoProfile.getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            throw new Error(e);
        }
    }
}
