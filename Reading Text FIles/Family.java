
/**
 * Reads text file
 *
 * @author Rebekah Shi 
 * @version 1/10/19
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class Family
{
    public static void main(String[]args) throws IOException
    {
        int allBoys = 0;
        int allGirls = 0;
        int girlAndBoy = 0;
        int sample = 0;
        int counter = 0;
        double probabilityAllBoys = 0;
        double probabilityAllGirls = 0;
        double probabilityGirlAndBoy = 0;
        
        String token = "";
        Scanner inFile = new Scanner(new File("MaleFemaleInFamily.txt"));
        while(inFile.hasNext())
        {
           token = inFile.next();
           System.out.println(token); 
           if(token.equals("BB"))
           {
               allBoys++;
            }
            else if(token.equals("GG"))
            {
                allGirls++;
            }
            else
            {
              girlAndBoy++;
            }
            counter++;
       }
            sample = counter;
            inFile.close();
            
            //calculate probability
            probabilityAllBoys = (double)(allBoys)/(double)(sample);
            probabilityAllGirls = (double)(allBoys)/(double)(sample);
            probabilityGirlAndBoy = (double)(girlAndBoy)/(double)(sample);
            
            //output
            System.out.println("Sample size: " + sample);
            System.out.println("Number of families with only boys: " + allBoys);
            System.out.println("Number of families with only girls: " +allGirls);
            System.out.println("Number of families with a girl and boy: " +girlAndBoy);
            System.out.println("Probability of all boys: " + probabilityAllBoys);
            System.out.println("Probability of all girls: " + probabilityAllGirls);
            System.out.println("Probability of a boy and girl: " + probabilityGirlAndBoy);
            
            
            
        }
}
