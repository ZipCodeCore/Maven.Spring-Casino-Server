package rocks.zipcodewilmington.casinoapplication.services.games.schema;

/**
 * @author leon on 9/1/18.
 */
abstract public class AbstractGameEngine<
        GameTypePlayer extends PlayerInterface,
        GameType extends GameInterface<GameTypePlayer>>
        implements GameEngineInterface<GameTypePlayer, GameType> {

    protected final GameType game;
    protected final Iterable<GameTypePlayer> players;

    public AbstractGameEngine(GameType game) {
        this.game = game;
        this.players = game.getPlayers();
    }

    public GameType getGame() {
        return game;
    }

    @Override
    public void run() {
        players.forEach(this::evaluateTurn);
    }
}
