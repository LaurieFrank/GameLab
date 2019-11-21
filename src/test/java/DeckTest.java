import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    private Deck deck;

    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void countAllCardsInDeck(){
        assertEquals(52, deck.countAllCardsInDeck());
    }



    @Test
    public void cardIsDealt(){
        deck.dealCard();
        assertEquals(51, deck.countAllCardsInDeck());
    }
}
