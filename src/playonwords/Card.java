package playonwords;

public class Card extends GameObject
{
    protected String letter;
    
    public Card(String S)
    {
        this.letter = S;
    }
    
    public String getLetter()
    {
        return letter;
    }
    
   
    @Override
    void update() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
 
    
}


