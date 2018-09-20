package rocks.zipcodewilmington.casinoapplication.services.games.cardgames.highlow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rocks.zipcodewilmington.casinoapplication.model.games.cardgames.highlow.HighLowPlayer;
import rocks.zipcodewilmington.casinoapplication.repository.games.cardgames.highlow.HighLowPlayerRepository;

/**
 * @author leon on 9/20/18.
 */
@Service
public class HighLowPlayerService {
    private HighLowPlayerRepository repository;

    @Autowired
    public HighLowPlayerService(HighLowPlayerRepository repository) {
        this.repository = repository;
    }

    public HighLowPlayer postPlayer(HighLowPlayer player) {
        return repository.save(player);
    }

    public HighLowPlayer getPlayer(Long id) {
        return repository.findOne(id);
    }

    public HighLowPlayer updatePlayer(HighLowPlayer player){
        return repository.save(player);
    }

    public HighLowPlayer deletePlayer(Long id) {
        HighLowPlayer player = repository.findOne(id);
        repository.delete(player);
        return player;
    }
}
