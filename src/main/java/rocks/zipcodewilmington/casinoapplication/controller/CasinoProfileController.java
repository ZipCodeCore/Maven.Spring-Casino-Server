package rocks.zipcodewilmington.casinoapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import rocks.zipcodewilmington.casinoapplication.model.CasinoProfile;
import rocks.zipcodewilmington.casinoapplication.services.CasinoProfileService;

import java.net.URI;

/**
 * @author leon on 9/8/18.
 */
@Controller(value = "/casino/profile")
public class CasinoProfileController {
    private final CasinoProfileService service;

    @Autowired
    private CasinoProfileController(CasinoProfileService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<CasinoProfile> createProfile(CasinoProfile profile) {
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(profile.getId())
                .toUri();
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(uri);

        service.createProfile(profile);
        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<CasinoProfile> updateProfile(CasinoProfile profile) {
        CasinoProfile game = service.updateGame(profile);
        return new ResponseEntity<>(game, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<CasinoProfile> getProfile(@PathVariable Long id) {
        CasinoProfile game = service.getGame(id);
        return new ResponseEntity<>(game, HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<CasinoProfile> deleteProfile(@PathVariable Long id) {
        CasinoProfile game = service.deleteGame(id);
        return new ResponseEntity<>(game, HttpStatus.OK);
    }
}
