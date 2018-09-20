package rocks.zipcodewilmington.casinoapplication.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import rocks.zipcodewilmington.casinoapplication.model.CasinoProfile;

/**
 * @author leon on 9/8/18.
 */
@Repository
public interface CasinoProfileRepository extends CrudRepository<CasinoProfile, Long> {
}
