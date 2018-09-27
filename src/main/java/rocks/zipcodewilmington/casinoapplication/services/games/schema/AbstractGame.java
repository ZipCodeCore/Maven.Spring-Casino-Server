package rocks.zipcodewilmington.casinoapplication.services.games.schema;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 9/8/18.
 * Performs CRUD operations on List object
 */
@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
abstract public class AbstractGame<TypeOfPlayer extends PlayerInterface>
        implements GameInterface<TypeOfPlayer> {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    private final List<TypeOfPlayer> players;

    public AbstractGame() {
        this(new ArrayList<>());
    }

    public AbstractGame(List<TypeOfPlayer> playerList) {
        this.players = playerList;
    }

    @Override
    public void addPlayer(TypeOfPlayer player) {
        players.add(player);
    }

    @Override
    public void removePlayer(TypeOfPlayer player) {
        players.remove(player);
    }

    @Override
    public Boolean contains(TypeOfPlayer player) {
        return players.contains(player);
    }

    @Override
    public Iterable<TypeOfPlayer> getPlayers() {
        return players;
    }

    @Override
    public TypeOfPlayer getPlayer(Long id) {
        return players
                .stream()
                .filter(player -> player.getId().equals(id))
                .findFirst()
                .get();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    @Override
    public String toString() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            throw new Error(e);
        }
    }

    public abstract TypeOfPlayer evaluateTurn(TypeOfPlayer player);
}
