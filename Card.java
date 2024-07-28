

public class Card
{
    // instance variables - replace the example below with your own
    private Suit suit;
    private Rank rank;
    public Card(Rank Rank, Suit Suit)
    {
        // initialise instance variables
        suit = Suit;
        rank = Rank;
    }
    public Rank getRank(){
        return rank;
    
    }
    public Suit getSuit(){
        return suit;
    }
    public void print()
    {
        if (rank.getPointValue()>=2 && rank.getPointValue()<=10){
            System.out.println(rank.getPointValue() + " of " +  suit.name());
        }
        else{
            System.out.println(rank.name() + " of " + suit.name());
        }
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public boolean matches(Card other)
    {
        return rank==other.rank && suit==other.suit;
    }

}
// public class Main
// {
//     public static void main(String[] args)
//     {
//         Card s1 = new Card(Rank.Ten,Suit.Spades);
//         Card s2 = new Card(Rank.Ten, Suit.Spades);
//         Card r3 = new Card(Rank.Ten, Suit.Diamonds);
//         Card b4 = new Card(Rank.Nine, Suit.Spades);
//         System.out.println(s1.matches(s2));
//         Deck decker = new Deck(Rank.values(), Suit.values());
//         System.out.println(decker.size());
//         System.out.println(decker.deal());
//         System.out.println(decker.deal());
//         System.out.println(decker.deal());
//         System.out.println(decker.deal());
//         System.out.println(decker.size());
//         while (decker.isEmpty()==false)
//         {
//             decker.deal();
//         }
//     }
//     //the deck contains the 1 of each card and suit
    
// }