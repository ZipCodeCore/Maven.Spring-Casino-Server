package rocks.zipcodewilmington.casinoapplication.mvc.model.games.cardgames;

import rocks.zipcodewilmington.casinoapplication.mvc.model.games.cardgames.toolkit.Deck;

/**
 * Created by leon.hunter on 2/1/2017.
 */
public class CardDealer extends CardPlayer {
    private final Deck deck;

    public CardDealer() {
        this(new Deck());
    }

    public CardDealer(Deck deck) {
        super(null);
        this.deck = deck;
    }


    public final void deal(CardPlayer player, int numberOfCards) {
        for (int i = 0; i < numberOfCards; i++) {
            player.getCard(this.deck);
        }
    }

    public final void deal(Iterable<? extends CardPlayer> players, int numberOfCards) {
        players.forEach(player -> deal(player, numberOfCards));
    }
}
