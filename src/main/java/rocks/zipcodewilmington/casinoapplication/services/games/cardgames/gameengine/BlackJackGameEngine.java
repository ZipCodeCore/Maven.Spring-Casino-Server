package rocks.zipcodewilmington.casinoapplication.services.games.cardgames.gameengine;

import rocks.zipcodewilmington.casinoapplication.model.games.cardgames.blackjack.BlackJackGame;
import rocks.zipcodewilmington.casinoapplication.model.games.cardgames.blackjack.BlackJackPlayer;
import rocks.zipcodewilmington.casinoapplication.services.games.schema.AbstractGameEngine;

/**
 * @author leon on 9/8/18.
 */
public class BlackJackGameEngine extends AbstractGameEngine<BlackJackPlayer, BlackJackGame> {
    public BlackJackGameEngine() {
        this(new BlackJackGame());
    }

    public BlackJackGameEngine(BlackJackGame game) {
        super(game);
    }

    @Override
    public void evaluateTurn(BlackJackPlayer blackJackPlayer) {
        // TODO - implement logic
    }
}
