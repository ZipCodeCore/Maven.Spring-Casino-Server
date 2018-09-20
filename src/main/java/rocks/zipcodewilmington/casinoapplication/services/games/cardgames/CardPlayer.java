package rocks.zipcodewilmington.casinoapplication.services.games.cardgames;

import rocks.zipcodewilmington.casinoapplication.model.CasinoProfile;
import rocks.zipcodewilmington.casinoapplication.services.games.cardgames.toolkit.Card;
import rocks.zipcodewilmington.casinoapplication.services.games.cardgames.toolkit.Deck;
import rocks.zipcodewilmington.casinoapplication.services.games.cardgames.toolkit.Hand;
import rocks.zipcodewilmington.casinoapplication.services.games.schema.AbstractPlayer;

import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;


/**
 * Created by leon.hunter on 2/1/2017.
 */
@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class CardPlayer extends AbstractPlayer {

    @OneToOne
    private Hand hand;

    public CardPlayer(CasinoProfile profile) {
        super(profile);
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
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
}