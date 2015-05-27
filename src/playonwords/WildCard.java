package playonwords;


public class WildCard extends Card
{
    
    protected String wildType;
    
    public WildCard(String wildType)
    {
        super("");
        this.wildType = wildType;
        
    }
    
    public String invokeTextBox()
    {
        return " ";
    }
    
    public boolean setWildRules(String wildType, String letter)
    {
        boolean valid = false;
        
        if(wildType == "WILDVOWEL")
        {
            valid = isVowel(letter.charAt(0)) && letter.length() == 1;
            
        }
        
        else if(wildType == "WILDCONSONANT")
        {
            valid = isConsonant(letter.charAt(0)) && letter.length() == 1;
        }
          
        else if(wildType == "DOUBLEDOSE")
        {
            valid = (isConsonant(letter.charAt(0)) && isConsonant(letter.charAt(1)) && letter.length() == 2)
                    | (isVowel(letter.charAt(0)) && isVowel(letter.charAt(1)) && letter.length() == 2);
        }
        
        return valid;
    }
    
    public void setWildType(String letter)
    {
        if(validString(letter))
        {
                wildType = letter;
        }
        
    }
    
    private boolean isVowel(char c)
    {
            return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y';
    }
    
    private boolean isConsonant(char d)
    {
            return !isVowel(d) || d == 'y';
    }
    
    private boolean validString(String letter)
    {
        boolean validity = false;
        
        if(letter.length() == 1)
        {
            if(letter.equals("WILDVOWEL"))
            {
                if(isVowel(letter.charAt(0)))
                    {
                        validity = true;
                    }
            }
            
            else if(letter.equals("WILDCONSONANT"))
            {
                if(!isVowel(letter.charAt(0)))
                {
                    validity = true;
                }   
            }    
             
            else if(letter.length() == 2)
            {
                if(letter.equals("DOUBLEDOSE"))
                {
                    validity = true;
                }
            }
        }
        
        return validity;
        
    }
    
    public String getWildLetter()
    {
        return letter;
    }
    
}



