
/**
 * @author Imran Aziz 16:30 6/11/17
 */
import java.util.Scanner;

public class CarSales 
{
    public String salesunroof;
    public String saletype;
    public static void main(String [] args) //Deals with price data in relation to user input
    {
        Sale s1 = new Sale();
        int total = 10000;
        s1 = setType(s1, "Electric");
        s1 = setSunroof(s1, "yes");
        
        if (getType(s1).equalsIgnoreCase("Electric"))
        {
            total = total - 1000;
        }
        else if (getType(s1).equalsIgnoreCase("Hybrid"))
        {
            total = total;
        }
        
        if (getSunroof(s1).equalsIgnoreCase("yes"))
        {
            total = total + 500;
        }
        else if (getSunroof(s1).equalsIgnoreCase("no"))
        {
            total = total;
        }
        
        System.out.println("The total cost of your car is £" + total);
        
        System.exit(0);
        
        
    }
    
    public static String getType(Sale s)
    {
        return s.type;
    }
    
    public static String getSunroof(Sale s)
    {
        return s.sunroof;
    }
    
    public static Sale setType (Sale s, String saletype)
    {
        
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please enter car type: ");
        saletype = scan1.nextLine();
        s.type = saletype;
        
        if (saletype.equalsIgnoreCase("Electric") || saletype.equalsIgnoreCase("Hybrid"))
        {
            return s;   
        }
        else 
        {
            System.out.println("Please input either electric or hybrid");
            System.out.println("");
            setType(s, saletype); //asks again if input isn't satisfactory
        }
        
        return s;
      
    }
    
    
    
    public static Sale setSunroof (Sale s, String salesunroof)
    {
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Please enter whether you would like a sunroof: ");
        salesunroof = scan2.nextLine();
        s.sunroof = salesunroof;
        
        if (salesunroof.equalsIgnoreCase("yes") || salesunroof.equalsIgnoreCase("no"))
        {
            return s;    
        }
        else 
        {
            System.out.println("Please input either yes or no");
            System.out.println("");
            setSunroof(s, salesunroof); //asks again if input isn't satisfactory
        }
        
        return s;  
    }
}

class Sale //sets up my sale class
{
    String type;
    String sunroof;
}