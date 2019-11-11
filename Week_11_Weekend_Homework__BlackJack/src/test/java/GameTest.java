import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;
    Deck deck;
    Dealer dealer;
    Player player1;
    Player player2;

    @Before
    public void before(){
        deck = new Deck();
        dealer = new Dealer();
        player1 = new Player();
        game = new Game(deck, dealer);
        game.addPlayer(player1);


    }

    @Test
    public void canShowGameStartingWithOnePlayer(){
        assertEquals(1, game.getNumberOfPlayers());
    }

    @Test
    public void canAddPlayerToGame(){
        game.addPlayer(player2);
        assertEquals(2, game.getNumberOfPlayers());
    }

    @Test
    public void gameCanBePlayed(){
        game.playGame();
        assertEquals(48, deck.getNumberOfCards());
        assertEquals(2, dealer.getNumberOfCards());
        assertEquals(2, game.getPlayers().get(0).getNumberOfCards());
    }
}
