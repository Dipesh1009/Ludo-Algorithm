import java.util.Random;

public class test {
    public static void main(String[] args){
        System.out.println(randomInts());
    }

    public static int randomInts()   
    {   
        Random random1 = new Random();  
        int x = random1.ints(1,1,7).findFirst().getAsInt();
        return x;
    }  
} 