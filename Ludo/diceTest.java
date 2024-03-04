import java.util.Random;

public class diceTest {

    public int randomInts()   
    {   
        Random random1 = new Random();  
        int x = random1.ints(1,1,7).findFirst().getAsInt();
        return x;
    }  
} 