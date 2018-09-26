package rocks.zipcodewilmington.casinoapplication.controller.games.cardgames.highlow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import rocks.zipcodewilmington.casinoapplication.model.games.cardgames.highlow.HighLowPlayer;
import rocks.zipcodewilmington.casinoapplication.services.games.cardgames.highlow.HighLowGameEngineService;

/**
 * @author leon on 9/20/18.
 */
@Controller
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/casino/highlow/engine")
public class HighLowGameEngineController {
    private HighLowGameEngineService service;

    @Autowired
    public HighLowGameEngineController(HighLowGameEngineService service) {
        this.service = service;
    }

    @PutMapping("/getCard/{gameId}/{playerId}")
    public ResponseEntity<HighLowPlayer> getCard(
            @PathVariable Long playerId,
            @PathVariable Long gameId) {
        return new ResponseEntity<>(service.getCard(playerId, gameId), HttpStatus.OK);
    }
}
