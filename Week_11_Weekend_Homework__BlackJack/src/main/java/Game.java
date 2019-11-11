import java.util.ArrayList;

public class Game {

    private ArrayList<Player> players;
    private Deck deck;
    private Dealer dealer;

    public Game(Deck deck, Dealer dealer){
        this.players = new ArrayList<Player>();
        this.deck = deck;
        this.dealer = dealer;

        Player player1 = new Player();
        this.players.add(player1);
    }

    public int getNumberOfPlayers(){
        return this.players.size();
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public int playGame(int numberOfCardsDealt){
        Card card1 = deck.cardDealtFromDeck();
        dealer.takeCardFromDeck(card1);
        Card card2 = deck.cardDealtFromDeck();
        dealer.takeCardFromDeck(card2);
        for(Player player : this.players){
            for (int i = 0; i < numberOfCardsDealt; i++){
                Card card = deck.cardDealtFromDeck();
                player.takeCardFromDeck(card);
            }
        }
        return numberOfCardsDealt;
//        Card card3 = deck.cardDealtFromDeck();
//        player1.takeCardFromDeck(card3);
//        Card card4 = deck.cardDealtFromDeck();
//        player1.takeCardFromDeck(card4);
    }
}
