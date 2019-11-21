import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
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
        shuffleDeck();
    }

    public void shuffleDeck() {
       Collections.shuffle(this.deck);
    }

    public Card dealCard(){
        return this.deck.remove(0);
    }

    public String playGame(Player player1, Player player2){
        player1.takeCardFromDeck();
    }
}
