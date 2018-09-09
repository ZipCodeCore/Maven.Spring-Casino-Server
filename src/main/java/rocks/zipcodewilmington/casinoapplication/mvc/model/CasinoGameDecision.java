package rocks.zipcodewilmington.casinoapplication.mvc.model;

import rocks.zipcodewilmington.casinoapplication.mvc.model.games.cardgames.blackjack.BlackJackGameEngine;
import rocks.zipcodewilmington.casinoapplication.mvc.model.games.schema.GameEngineInterface;

import java.util.function.Supplier;

/**
 * @author leon on 9/8/18.
 */
public enum CasinoGameDecision {
    BLACKJACK(BlackJackGameEngine::new);
//    GOFISH(GoFishGameEngine::new),

    private final Supplier<GameEngineInterface> gameEngineSupplier;

    CasinoGameDecision(Supplier<GameEngineInterface> gameEngineSupplier) {
        this.gameEngineSupplier = gameEngineSupplier;
    }

    public GameEngineInterface createNewGame() {
        return gameEngineSupplier.get();
    }

    public static GameEngineInterface getGame(String gameName) {
        // TODO - Sanitize `gameName`
        return valueOf(gameName).createNewGame();
    }

}
