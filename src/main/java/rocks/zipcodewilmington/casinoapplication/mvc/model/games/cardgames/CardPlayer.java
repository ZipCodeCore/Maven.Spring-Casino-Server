package rocks.zipcodewilmington.casinoapplication.mvc.model.games.cardgames;

import rocks.zipcodewilmington.casinoapplication.mvc.model.CasinoProfile;
import rocks.zipcodewilmington.casinoapplication.mvc.model.games.cardgames.toolkit.Card;
import rocks.zipcodewilmington.casinoapplication.mvc.model.games.cardgames.toolkit.Deck;
import rocks.zipcodewilmington.casinoapplication.mvc.model.games.cardgames.toolkit.Hand;
import rocks.zipcodewilmington.casinoapplication.mvc.model.games.schema.AbstractPlayer;


/**
 * Created by leon.hunter on 2/1/2017.
 */
public class CardPlayer extends AbstractPlayer {
    private final Hand hand = new Hand();

    public CardPlayer(CasinoProfile profile) {
        super(profile);
    }

    /**
     * this method exists for purposes of testing
     * @param card - Card object to add to hand
     */
    public void addCard(Card card) {
        this.hand.add(card);
    }

    public void getCard(Deck deck) {
        addCard(deck.pop());
    }

    @Override
    public String toString() {
        return "CardPlayer{" +
                "hand=" + hand +
                '}';
    }
}