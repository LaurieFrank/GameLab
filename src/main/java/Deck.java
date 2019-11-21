import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> deck;

    public Deck(){
        this.deck = new ArrayList<Card>();
        buildDeck();
    }

    public int countAllCardsInDeck() {
        return this.deck.size();
    }

    public void buildDeck() {
        for(SuitType suit : SuitType.values()){
            for(RankType rank : RankType.values()){
                Card newCard = new Card(suit, rank);
                this.deck.add(newCard);
            }
        }
    }
}
