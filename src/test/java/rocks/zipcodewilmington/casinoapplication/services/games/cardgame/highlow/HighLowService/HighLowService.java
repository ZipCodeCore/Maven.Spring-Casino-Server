package rocks.zipcodewilmington.casinoapplication.services.games.cardgame.highlow.HighLowService;

import org.springframework.stereotype.Service;
import rocks.zipcodewilmington.casinoapplication.repository.games.cardgames.highlow.HighLowRepository.HighLowGameRepository;

/**
 * @author leon on 9/20/18.
 */
@Service
public class HighLowService {
    private HighLowGameRepository highLowRepository;

    public HighLowService(HighLowGameRepository highLowRepository) {
        this.highLowRepository = highLowRepository;
    }
}
