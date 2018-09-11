package rocks.zipcodewilmington.casinoapplication.services.games.schema;

/**
 * @author leon on 9/1/18.
 * implementers of this interface are responsible for mediating behavior between a game and a player
 */
public interface GameEngineInterface<
        TypeOfPlayer extends PlayerInterface,
        TypeOfGame extends GameInterface<TypeOfPlayer>> {
    TypeOfGame getGame();
    void evaluateTurn(TypeOfPlayer player);
    void run();
}
