public class CardGameClient {
    public static void main(String[] args) throws Exception {
        Deck myDeck1 = new Deck();
        Deck myDeck2 = new Deck();
        Card[] Cards1 = myDeck1.getCards();
        Card[] Cards2 = myDeck2.getCards();

        myDeck1.shuffleCards();
        myDeck2.shuffleCards();

        System.out.println(myDeck1.toString());
        System.out.println("\n");
        System.out.println(myDeck2.toString());
    }
}
