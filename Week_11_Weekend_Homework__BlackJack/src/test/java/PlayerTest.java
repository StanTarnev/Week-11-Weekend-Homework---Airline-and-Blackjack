import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Card card1;
    Card card2;

    @Before
    public void before(){
        player = new Player();
        card1 = new Card(SuitType.CLUBS, RankType.EIGHT);
        card2 = new Card(SuitType.DIAMONDS, RankType.TEN);
    }

    @Test
    public void playerStartingWithoutCards(){
        assertEquals(0, player.getNumberOfCards());
    }

    @Test
    public void canTakeTwoCards(){
        player.takeCardFromDeck(card1);
        assertEquals(1, player.getNumberOfCards());
    }

    @Test
    public void canShowHandTotal(){
        player.takeCardFromDeck(card1);
        player.takeCardFromDeck(card2);
        assertEquals(18, player.showHandTotal());
    }

}
