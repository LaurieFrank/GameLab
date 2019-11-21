import org.junit.Before;

import java.util.ArrayList;

public class DeckTest {

    private Card card;
    private Deck deck;

    @Before
    public void before(){
        card = new Card(SuitType.HEARTS, RankType.EIGHT);
        deck = new ArrayList<Card>();
    }
}
