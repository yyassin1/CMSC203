import java.util.Random;
import java.util.Scanner;
public class RandomNumberGuesser 
{


    public static void main(String args[]) 
    {
        
     Scanner sc = new Scanner(System.in); 
     while(true)
     {
         
     int nextGuess;
     int highGuess=99;
     int lowGuess=0;
     
     RNG rc=new RNG();
     rc.resetCount();
     int randNum = rc.rand(highGuess+1);
    
     while(true) 
     {
     if(rc.getCount()==0)
     System.out.println("Enter your first guess");
     else 
     System.out.println("Enter your next guess between "+lowGuess+ " and " + highGuess);
     
     nextGuess=sc.nextInt();
     rc.Count();
     int guess = rc.getCount();
     System.out.println("Number of guess is " + guess);
     
     if(rc.inputValidation(nextGuess))
     {
          break;
     }
      else 
      {
           if(nextGuess >= highGuess || nextGuess<= lowGuess)
           {
           continue;
           }
        else if(nextGuess > randNum)
        {
           highGuess=nextGuess;
        }
        else if (nextGuess < randNum)
        {
            lowGuess=nextGuess;
        }
      }
      
     }
      System.out.println("Do you want to try again. (yes or no)");
      
       String ans = sc.nextLine();
       Scanner in = new Scanner(System.in); 
       ans = in.nextLine();
       
      
      if(ans=="no" || ans=="No")
      {
          System.out.println("Thanks for playing ");
          break;
      }
      else if(ans=="yes" || ans=="Yes")
      {
          System.out.println("Thanks for playing ");
          continue;
      }
      else 
      {
          break;
     }
      
    }
}
}