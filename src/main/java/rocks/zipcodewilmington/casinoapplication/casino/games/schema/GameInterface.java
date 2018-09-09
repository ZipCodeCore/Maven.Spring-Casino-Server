package rocks.zipcodewilmington.casinoapplication.casino.games.schema;

/**
 * @author leon on 9/1/18.
 */
public interface GameInterface<TypeOfPlayer extends PlayerInterface> {
    Iterable<TypeOfPlayer> getPlayers();
    TypeOfPlayer getPlayer(Long id);
    void addPlayer(TypeOfPlayer player);
    void removePlayer(TypeOfPlayer player);
    Boolean contains(TypeOfPlayer player);
}
