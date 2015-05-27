package playonwords;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class Deck extends GameObject
{
    protected ArrayList<Card> deckOfCards;
    protected final int deckSize = 80;
    
    protected Deck() 
    {
        ArrayList<Card> deckOfCards = new ArrayList<Card>();
        initializeDeck(80, deckOfCards);
        
    }

    public void initializeDeck(int deckSize, ArrayList deckOfCards)
    {        
        setCardType(6, "A", deckOfCards);
        setCardType(2, "B", deckOfCards);
        setCardType(1, "C", deckOfCards);
        setCardType(1, "CH", deckOfCards);
        setCardType(1, "CK", deckOfCards);
        setCardType(3, "D", deckOfCards);
        setCardType(8, "E", deckOfCards);
        setCardType(2, "F", deckOfCards);
        setCardType(2, "G", deckOfCards);
        setCardType(2, "H", deckOfCards);
        setCardType(6, "I", deckOfCards);
        setCardType(1, "JX", deckOfCards);
        setCardType(1, "K", deckOfCards);
        setCardType(3, "L", deckOfCards);
        setCardType(2, "M", deckOfCards);
        setCardType(5, "N", deckOfCards);
        setCardType(7, "O", deckOfCards);
        setCardType(2, "P", deckOfCards);
        setCardType(1, "QU", deckOfCards);
        setCardType(4, "R", deckOfCards);
        setCardType(3, "S", deckOfCards);
        setCardType(1, "SH", deckOfCards);
        setCardType(1, "ST", deckOfCards);
        setCardType(5, "T", deckOfCards);
        setCardType(1, "TH", deckOfCards);
        setCardType(2, "U", deckOfCards);
        setCardType(1, "VZ", deckOfCards);
        setCardType(1, "W", deckOfCards);
        setCardType(2, "Y", deckOfCards);
        setCardType(1, "WILDVOWEL", deckOfCards);
        setCardType(1, "WILDCONSONANT", deckOfCards);
        setCardType(1, "DOUBLEDOSE", deckOfCards);
                
    }
    
    public void setCardType(int cardQuantity, String letter, ArrayList deckOfCards)
    {
        for(int j = 0; j < 80; j++)
        {
            if(letter.length() < 2)
            {
                for(int i = 0; i < cardQuantity; i++)
                {
                    Card createdCard = new Card(letter);
                    deckOfCards.add(createdCard);
                }
            }

            else if(letter.length() == 2)
            {
                for(int i = 0; i < cardQuantity; i++)
                {
                    WildCard createdWildCard = new WildCard(letter);
                    deckOfCards.add(createdWildCard);
                }
            }  
        }
    }
            
    @Override
    void update()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}


