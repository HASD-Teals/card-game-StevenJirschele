import java.util.Random;
public class Deck {
    // PROPERTIES
    private Card[] cards;

    // CONSTRUCTORS
    public Deck() {
        this.cards = new Card[52];
        int counter = 0;
        for(int i = 2; i <= 14; i++) {
            Card temp = new Card("Red", '\u0003', i, i, true);
            cards[counter] = temp;
            counter++;
        }
        for(int i = 2; i<= 14; i++) {
            Card temp = new Card("Red", '\u0004', i, i, true);
            cards[counter] = temp;
            counter++;
        }
        for(int i = 2; i <= 14; i++) {
            Card temp = new Card("Black", '\u0005', i, i, true);
            cards[counter] = temp;
            counter++;
        }
        for(int i = 2; i <= 14; i++) {
            Card temp = new Card("Black", '\u0006', i, i, true);
            cards[counter] = temp;
            counter++;
        }
    }

    // ACCESSORS
    public Card[] getCards() {
        return this.cards;
    }
    public int cardNum() {
        int counter = 0;
        for(int i = 0; i < this.cards.length; i++) {
            counter++;
        }
        return counter;
    }

    // MUTATORS
    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    // METHODS
    public void shuffleCards() {
        // Shuffle this.cards in a random order
        Random rand = new Random();
        for(int i = 0; i < this.cards.length; i++) {
            int random = rand.nextInt(cards.length);
            Card temp = this.cards[random];
            this.cards[random] = this.cards[i];
            this.cards[i] = temp;
        }
    }
    public String toString() {
        String temp = "";
        for(Card c:this.cards) {
            temp += c.toString(); 
        }
        return temp;
    }
    public Card getCardAt(int pos) {
        return this.cards[pos];
    }
}
