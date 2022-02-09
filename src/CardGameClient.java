public class CardGameClient {
    public static void main(String[] args) throws Exception {
        Deck myDeck1 = new Deck();
        Deck myDeck2 = new Deck();

        myDeck1.shuffleCards();
        myDeck2.shuffleCards();

        System.out.println(myDeck1.toString());
        System.out.println("\n");
        System.out.println(myDeck2.toString());
        System.out.print(isEqual2(myDeck1, myDeck2));
    }
    public static int isEqual2(Deck Deck1, Deck Deck2) {
        int counter = 0;
        for(int i = 0; i < 52; i++) {
            if(Deck1.getCardAt(i).getColor() == Deck2.getCardAt(i).getColor() 
            && Deck1.getCardAt(i).getValue() == Deck2.getCardAt(i).getValue() 
            && Deck1.getCardAt(i).getSymbol() == Deck2.getCardAt(i).getSymbol()) {
                System.out.println("Found Match At " + i + "\n" + Deck1.getCardAt(i).toString());
                counter++;
            } 
        }
        if(counter <= 0) {
            System.out.println("There Are No Matches");
        }
        return counter;
    }
}
