import java.util.ArrayList;

public class Player {

    private String name;
    private Card hand;

    public Player(String name){
        this.name = name;
        this.hand = null;
    }


    public void takeCardFromDeck(Deck deck){
        Card card = deck.dealCard();
        this.hand = card;
    }


    public Card getCard() {
        return this.hand;
    }
}
