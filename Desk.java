import java.util.Arrays;

public class Desk {

    private Card[] cards;

    public Desk(Card[] cards) {
        this.cards = cards;
    }

    public Desk() {
        this.cards = null;
    }

    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Desk desk = (Desk) o;
        return Arrays.equals(cards, desk.cards);
    }

    @Override
    public String toString() {
        return "Desk{" +
                "cards=" + Arrays.toString(cards) +
                '}';
    }

    public void FrenchDesk(){
        
    }

}
