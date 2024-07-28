import java.util.ArrayList;
import java.util.List;

public class Deck
{
    
    private int size;
    private List<Card> deck;
    
    public Deck(Rank[] rankies, Suit[] suities)
    {
        size = 52;
        deck=new ArrayList<>();
        for (Rank r : rankies)
        {
            for (Suit s : suities)
            {
                Card appendcard = new Card(r, s);
                deck.add(appendcard);
            }
        }
        shuffle();
    }
    public boolean isEmpty()
    {
        return size==0;
    }
    public int getSize()
    {
        return size;
    }
    public Card deal()
    {
        if (size == 0)
        {
            return null;
        }
        else
        {
            return deck.get(--size);
        }
    }
    public void shuffle()
    {
        
    }
    public void perfectShuffle()
    {
        size=52;
        int k = 0;
        int[] cards = new int[52];
        int [] shuffled = new int[52];
        for (int j = 0; j<=25; j++)
        {
            shuffled[k]=cards[j];
            k=k+2;
        }
        k=1;
        for (int j =26; j<=51; j++)
        {
            shuffled[k] = cards[j];
            k=k+2;
        }
    }
    public void inShuffle()
    {
        int k = 1;
        int[] cards = new int[52];
        int [] shuffled = new int[52];
        for ( int j = 0; j<=24; j++)
        {
            shuffled[k] = cards[j];
            k=k+2;
            
        }
        k = 0;
        for (int j = 25; j<=51; j++)
        {
            shuffled[k] = cards[j];
            k = k + 2;
        }
    }
}
