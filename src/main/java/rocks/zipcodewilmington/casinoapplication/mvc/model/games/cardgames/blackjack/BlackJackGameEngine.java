package rocks.zipcodewilmington.casinoapplication.mvc.model.games.cardgames.blackjack;

import rocks.zipcodewilmington.casinoapplication.mvc.model.games.schema.AbstractGameEngine;

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
