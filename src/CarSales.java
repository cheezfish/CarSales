
/**
 * @author Imran Aziz 16:30 6/11/17
 */
import java.util.Scanner;

public class CarSales 
{
    public String salesunroof;
    public String saletype;
    public static void main(String [] args) 
    {
        Sale s1 = new Sale();
        int total = 10000;
        s1 = setType(s1, "Electric");
        s1 = setSunroof(s1, "yes");
        
        if (s1.type.equalsIgnoreCase("Electric"))
        {
            total = total - 1000;
        }
        else if (s1.type.equalsIgnoreCase("Hybrid"))
        {
            total = total;
        }
        else
        {
            System.out.println("Please input either electric or hybrid");
        }
        
        if (s1.sunroof.equalsIgnoreCase("yes"))
        {
            total = total + 500;
        }
        else if (s1.sunroof.equalsIgnoreCase("no"))
        {
            total = total;
        }
        else
        {
            System.out.println("Please input either yes or no");
        }
        
        System.out.println("The total cost of your car is £" + total);
        
        
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
            setType(s, saletype);
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
            setSunroof(s, salesunroof);
        }
        
        return s;  
    }
}

class Sale
{
    String type;
    String sunroof;
}