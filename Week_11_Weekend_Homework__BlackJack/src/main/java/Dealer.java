import java.util.ArrayList;

public class Dealer {

    private ArrayList<Card> hand;

    public Dealer(){
        this.hand = new ArrayList<Card>();
    }

    public int getNumberOfCards() {
        return this.hand.size();
    }

    public void takeCardFromDeck(Card card) {
        this.hand.add(card);
    }

    public int showHandTotal(){
        int total = 0;
        for (Card card : this.hand) {
            total += card.getValueFromEnum();
        }
        return total;
    }
}
