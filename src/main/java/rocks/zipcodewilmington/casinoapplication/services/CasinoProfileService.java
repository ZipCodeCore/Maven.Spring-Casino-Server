package rocks.zipcodewilmington.casinoapplication.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import rocks.zipcodewilmington.casinoapplication.model.CasinoProfile;
import rocks.zipcodewilmington.casinoapplication.repository.CasinoProfileRepository;

/**
 * @author leon on 9/8/18.
 */
@Service
public class CasinoProfileService {
    private CasinoProfileRepository repository;

    @Autowired
    public CasinoProfileService(CasinoProfileRepository repository) {
        this.repository = repository;
    }

    public CasinoProfile createProfile(CasinoProfile casinoProfile) {
        return repository.save(casinoProfile);
    }

    public CasinoProfile updateProfile(CasinoProfile casinoProfile) {
        return repository.save(casinoProfile);
    }

    public CasinoProfile getProfile(Long id) {
        return repository.findOne(id);
    }

    public CasinoProfile deleteProfile(Long id) {
        CasinoProfile profile = repository.findOne(id);
        repository.delete(profile);
        return profile;
    }

    public Iterable<CasinoProfile> getAll() {
        return repository.findAll();
    }
}
