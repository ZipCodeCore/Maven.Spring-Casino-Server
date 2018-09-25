package rocks.zipcodewilmington.casinoapplication.controller.games.cardgames.highlow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import rocks.zipcodewilmington.casinoapplication.model.games.cardgames.highlow.HighLowGame;
import rocks.zipcodewilmington.casinoapplication.services.games.cardgames.highlow.HighLowGameService;

import java.net.URI;

/**
 * @author leon on 9/20/18.
 */
@Controller
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/casino/highlow/game")
public class HighLowGameController {
    private final HighLowGameService highLowService;

    @Autowired
    private HighLowGameController(HighLowGameService highLowService) {
        this.highLowService = highLowService;
    }

    @PostMapping
    public ResponseEntity<HighLowGame> postGame(@RequestBody HighLowGame highLowGame) {
        highLowGame = highLowService.postGame(highLowGame);

        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(highLowGame.getId())
                .toUri();
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(uri);

        return new ResponseEntity<>(highLowGame, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<HighLowGame> updateGame(@PathVariable Long id) {
        HighLowGame game = highLowService.updateGame(highLowService.getGame(id));
        return new ResponseEntity<>(game, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<HighLowGame> getGame(@PathVariable Long id) {
        HighLowGame game = highLowService.getGame(id);
        return new ResponseEntity<>(game, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HighLowGame> deleteGame(@PathVariable Long id) {
        HighLowGame game = highLowService.deleteGame(id);
        return new ResponseEntity<>(game, HttpStatus.OK);
    }
}
