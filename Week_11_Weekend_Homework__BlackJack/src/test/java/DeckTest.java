import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;

    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void canPopulateDeck(){
        assertEquals(52, deck.getNumberOfCards());
    }

    @Test
    public void twoCardsCanBeDealtFromDeck(){
        deck.cardDealtFromDeck();
        assertEquals(51, deck.getNumberOfCards());
    }
}
