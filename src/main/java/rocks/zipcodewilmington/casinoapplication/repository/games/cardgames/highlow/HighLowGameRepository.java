package rocks.zipcodewilmington.casinoapplication.repository.games.cardgames.highlow;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import rocks.zipcodewilmington.casinoapplication.model.games.cardgames.highlow.HighLowGame;

/**
 * @author leon on 9/20/18.
 */
@Repository
public interface HighLowGameRepository extends CrudRepository<HighLowGame, Long> {
}
