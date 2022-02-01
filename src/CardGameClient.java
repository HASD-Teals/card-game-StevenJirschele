public class CardGameClient {
    public static void main(String[] args) throws Exception {
    Deck myDeck = new Deck();
    Card[] Cards = myDeck.getCards();
    System.out.println(Cards[0].isEqual(Cards[13]));
    //myDeck.shuffleCards();
    System.out.println(Cards[0].isEqual(Cards[13]));
    System.out.println(myDeck.toString());
    System.out.println(myDeck.cardNum());
    }
}
