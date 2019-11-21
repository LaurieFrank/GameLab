import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PlayerTest {

    private Player player1;
    private Player player2;
    private Deck deck;


    @Before
    public void before() {
        player1 = new Player("Laurie");
        player2 = new Player("Zsolt");
        deck = new Deck();

    }

    @Test
    public void dealPlayerCard(){
        player1.takeCardFromDeck(deck);
        assertEquals(51, deck.countAllCardsInDeck());
    }

    @Test
    public void playerHasCard(){
        player1.takeCardFromDeck(deck);
        assertNotNull(player1.getCard());
    }

}