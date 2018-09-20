package rocks.zipcodewilmington.casinoapplication.controller.games.cardgames.highlow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import rocks.zipcodewilmington.casinoapplication.model.games.cardgames.highlow.HighLowGame;
import rocks.zipcodewilmington.casinoapplication.services.games.cardgames.highlow.HighLowGameService;

import java.net.URI;

/**
 * @author leon on 9/20/18.
 */
@Controller
public class HighLowGameController {
    private final HighLowGameService highLowService;

    @Autowired
    private HighLowGameController(HighLowGameService highLowService) {
        this.highLowService = highLowService;
    }

    @PostMapping
    public ResponseEntity<HighLowGame> postGame(HighLowGame highLowGame) {
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(highLowGame.getId())
                .toUri();
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(uri);

        highLowService.postGame(highLowGame);
        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<HighLowGame> updateGame(HighLowGame highLowGame) {
        HighLowGame game = highLowService.updateGame(highLowGame);
        return new ResponseEntity<>(game, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<HighLowGame> getGame(Long id) {
        HighLowGame game = highLowService.getGame(id);
        return new ResponseEntity<>(game, HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<HighLowGame> deleteGame(Long id) {
        HighLowGame game = highLowService.deleteGame(id);
        return new ResponseEntity<>(game, HttpStatus.OK);
    }
}
