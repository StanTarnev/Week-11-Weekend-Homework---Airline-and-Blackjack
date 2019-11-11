import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    Dealer dealer;
    Card card1;
    Card card2;

    @Before
    public void before(){
        dealer = new Dealer();
        card1 = new Card(SuitType.SPADES, RankType.TWO);
        card2 = new Card(SuitType.HEARTS, RankType.THREE);
    }

    @Test
    public void dealerStartingWithoutCards(){
        assertEquals(0, dealer.getNumberOfCards());
    }

    @Test
    public void canTakeTwoCards(){
        dealer.takeCardFromDeck(card1);
        assertEquals(1, dealer.getNumberOfCards());
    }

    @Test
    public void canShowHandTotal(){
        dealer.takeCardFromDeck(card1);
        dealer.takeCardFromDeck(card2);
        assertEquals(5, dealer.showHandTotal());
    }
}
