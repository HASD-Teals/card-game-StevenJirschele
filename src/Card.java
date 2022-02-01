public class Card {
    // PROPERTIES
    private String color;
    private char symbol;
    private int rank;
    private int value;
    private boolean playable;

    // CONSTRUCTORS
    public Card() {
        this.color = "";
        this.symbol = Character.MIN_VALUE;
        this.rank = 0;
        this.value = 0;
        this.playable = false;
    }

    public Card(String color, char symbol, int rank, int value, boolean playable) {
        this.color = color;
        this.symbol = symbol;
        this.rank = rank;
        this.value = value;
        this.playable = playable;
    }

    // ACCESSORS
    public String getColor() {
        return this.color;
    }

    public char getSymbol() {
        return this.symbol;
    }

    public int getRank() {
        return this.rank;
    }

    public int getValue() {
        return this.value;
    }

    public boolean getPlayable() {
        return this.playable;
    }

    // MUTATORS
    public void setColor(String color) {
        this.color = color;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setPlayable(boolean playable) {
        this.playable = playable;
    }

    // METHODS
    public String toString() {
        return this.color + " " + this.rank + " "+ this.symbol + " " + this.value + " " + this.playable + "\n";
    }
    public boolean isEqual(Card otherCard) {
        if(this.value == otherCard.value) {
            return true;
        } 
        else {
            return false;
        }
    }
}
