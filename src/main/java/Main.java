public class Main {
    public static void main(String[] args) {

        Card card1 = new Card(Suit.CLUBS,Rank.ACE);
        Card card2 = new Card(Suit.SPADES,Rank.JACK);
        Card card3 = new Card(Suit.HEARTS,Rank.QUEEN);

       card1.printDescription();
       card2.printDescription();
       card3.printDescription();
    }
}
