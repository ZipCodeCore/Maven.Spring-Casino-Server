package rocks.zipcodewilmington.casinoapplication.casino.games.cardgames.blackjack;

import rocks.zipcodewilmington.casinoapplication.casino.games.schema.AbstractGameEngine;

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
