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
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/casino/highlow/player")
public class HighLowPlayerController {
    private final HighLowPlayerService highLowService;

    @Autowired
    private HighLowPlayerController(@RequestBody HighLowPlayerService highLowService) {
        this.highLowService = highLowService;
    }

    @PostMapping
    public ResponseEntity<HighLowPlayer> createPlayer(@RequestBody HighLowPlayer player) {
        player = highLowService.postPlayer(player);
        
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(player.getId())
                .toUri();
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(uri);

        return new ResponseEntity<>(player, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<HighLowPlayer> updatePlayer(@RequestBody HighLowPlayer player) {
        player = highLowService.updatePlayer(player);
        return new ResponseEntity<>(player, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<HighLowPlayer> getPlayer(@PathVariable Long id) {
        HighLowPlayer player = highLowService.getPlayer(id);
        return new ResponseEntity<>(player, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HighLowPlayer> deletePlayer(@PathVariable Long id) {
        HighLowPlayer player = highLowService.deletePlayer(id);
        return new ResponseEntity<>(player, HttpStatus.OK);
    }
}
