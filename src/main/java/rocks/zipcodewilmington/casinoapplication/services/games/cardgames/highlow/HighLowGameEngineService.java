package rocks.zipcodewilmington.casinoapplication.services.games.cardgames.highlow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rocks.zipcodewilmington.casinoapplication.model.games.cardgames.highlow.HighLowGame;
import rocks.zipcodewilmington.casinoapplication.model.games.cardgames.highlow.HighLowPlayer;

/**
 * @author leon on 9/20/18.
 */
@Service
public class HighLowGameEngineService {
    private HighLowGameService gameService;
    private HighLowPlayerService playerService;

    @Autowired
    public HighLowGameEngineService(HighLowGameService gameService, HighLowPlayerService playerService) {
        this.gameService = gameService;
        this.playerService = playerService;
    }

    public HighLowPlayer getCard(Long playerId, Long gameId) {
        HighLowPlayer player = playerService.getPlayer(playerId);
        HighLowGame game = gameService.getGame(gameId);
        return playerService.updatePlayer(game.evaluateTurn(player));
    }
}
