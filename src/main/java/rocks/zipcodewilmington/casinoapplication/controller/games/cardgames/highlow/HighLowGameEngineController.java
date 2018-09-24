package rocks.zipcodewilmington.casinoapplication.controller.games.cardgames.highlow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import rocks.zipcodewilmington.casinoapplication.model.games.cardgames.highlow.HighLowPlayer;
import rocks.zipcodewilmington.casinoapplication.services.games.cardgames.highlow.HighLowGameEngineService;

/**
 * @author leon on 9/20/18.
 */
@Controller("casino/highlowengine")
public class HighLowGameEngineController {
    @Autowired
    private HighLowGameEngineService service;

    @PutMapping("/getCard/{gameId}/{playerId}")
    public ResponseEntity<HighLowPlayer> getCard(
            @PathVariable Long playerId,
            @PathVariable Long gameId) {
        return new ResponseEntity<>(service.getCard(playerId, gameId), HttpStatus.OK);
    }
}
