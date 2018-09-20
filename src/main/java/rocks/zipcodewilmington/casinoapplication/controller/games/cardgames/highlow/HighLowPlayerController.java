package rocks.zipcodewilmington.casinoapplication.controller.games.cardgames.highlow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import rocks.zipcodewilmington.casinoapplication.model.games.cardgames.highlow.HighLowPlayer;
import rocks.zipcodewilmington.casinoapplication.services.games.cardgames.highlow.HighLowPlayerService;

import java.net.URI;

/**
 * @author leon on 9/20/18.
 */
@Controller
@RequestMapping(value = "/casino/highlow/player")
public class HighLowPlayerController {
    private final HighLowPlayerService highLowService;

    @Autowired
    private HighLowPlayerController(HighLowPlayerService highLowService) {
        this.highLowService = highLowService;
    }

    @PostMapping
    public ResponseEntity<HighLowPlayer> createPlayer(HighLowPlayer player) {
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(player.getId())
                .toUri();
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(uri);

        highLowService.postPlayer(player);
        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<HighLowPlayer> updatePlayer(HighLowPlayer highLowGame) {
        HighLowPlayer game = highLowService.updatePlayer(highLowGame);
        return new ResponseEntity<>(game, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<HighLowPlayer> getPlayer(@PathVariable Long id) {
        HighLowPlayer game = highLowService.getPlayer(id);
        return new ResponseEntity<>(game, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HighLowPlayer> deletePlayer(@PathVariable Long id) {
        HighLowPlayer game = highLowService.deletePlayer(id);
        return new ResponseEntity<>(game, HttpStatus.OK);
    }
}
