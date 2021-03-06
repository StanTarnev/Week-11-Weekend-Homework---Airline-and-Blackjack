import java.util.ArrayList;

public class Game {

    private ArrayList<Player> players;
    private Deck deck;
    private Dealer dealer;

    public Game(Deck deck, Dealer dealer){
        this.players = new ArrayList<Player>();
        this.deck = deck;
        this.dealer = dealer;
    }

    public int getNumberOfPlayers(){
        return this.players.size();
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void playGame(){
        Card card1 = deck.cardDealtFromDeck();
        dealer.takeCardFromDeck(card1);
        Card card2 = deck.cardDealtFromDeck();
        dealer.takeCardFromDeck(card2);
        for(Player player : this.players){
           Card card3 = deck.cardDealtFromDeck();
           player.takeCardFromDeck(card3);
           Card card4 = deck.cardDealtFromDeck();
           player.takeCardFromDeck(card4);

        }
    }
}
