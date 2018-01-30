package w18comp1008s2jan30;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author JWright
 */
public class DeckOfCards {
    private ArrayList<Card> deck;
    
    /**
     * This is the constructor, it ensures we have a valid deck of cards
     * defined
     */
    public DeckOfCards()
    {
        //creating a deck of cards
        deck = new ArrayList<>();
        String[] faceNames = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        String[] validSuits = {"hearts","spades","clubs","diamonds"}; 
    
        for (String suit : validSuits)
        {
            for (String faceName : faceNames)
                deck.add(new Card(faceName, suit));
        }
    }
    
    /**
     * This displays the deck to the console
     */
    public void displayDeck()
    {
        for (Card card:deck)
        {
            System.out.println(card);
        }
    }
    
    /**
     * This method will return the top card in the deck
     */
    public Card dealTopCard()
    {
        return deck.remove(0);
    }
    
    /**
     * This will randomize the order of the Card objects in the deck
     */
    public void shuffle()
    {
        Collections.shuffle(deck);
    }
    
    /**
     * This method will return a random Card from the deck
     */
    public Card getRandomCard()
    {
        SecureRandom rng = new SecureRandom();
        return deck.remove(rng.nextInt(deck.size()));
    }
}
