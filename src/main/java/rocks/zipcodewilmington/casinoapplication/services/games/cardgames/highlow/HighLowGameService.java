package rocks.zipcodewilmington.casinoapplication.services.games.cardgames.highlow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rocks.zipcodewilmington.casinoapplication.model.games.cardgames.highlow.HighLowGame;
import rocks.zipcodewilmington.casinoapplication.repository.games.cardgames.highlow.HighLowGameRepository;

/**
 * @author leon on 9/20/18.
 */
@Service
public class HighLowGameService {
    private HighLowGameRepository repository;

    @Autowired
    public HighLowGameService(HighLowGameRepository repository) {
        this.repository = repository;
    }

    public HighLowGame postGame(HighLowGame highLowGame) {
        return repository.save(highLowGame);
    }

    public HighLowGame getGame(Long id) {
        return repository.findOne(id);
    }

    public HighLowGame updateGame(HighLowGame highLowGame){
        return repository.save(highLowGame);
    }

    public HighLowGame deleteGame(Long id) {
        HighLowGame game = repository.findOne(id);
        repository.delete(game);
        return game;
    }
}
