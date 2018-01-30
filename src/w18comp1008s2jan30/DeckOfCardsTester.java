package w18comp1008s2jan30;

/**
 *
 * @author JWright
 */
public class DeckOfCardsTester {
    public static void main(String[] args)
    {
        DeckOfCards deck = new DeckOfCards();    //this calls our constructor and 
                                                 //creates a valid deck of cards
        deck.shuffle();
        deck.displayDeck();
        System.out.printf("The top card is %s%n",deck.dealTopCard());
        
        System.out.printf("A random card is %s%n",deck.getRandomCard());
        
    }
}
