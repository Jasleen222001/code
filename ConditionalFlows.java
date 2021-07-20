package session1;
import java.util.Scanner;
public class ConditionalFlows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scanner=new Scanner(System.in);
    int KOTAK200=1;
    int ICICITREATS=2;
    double amounttopay=1635.0;
    
    if(amounttopay>=399) {
    	System.out.println("You are eligible for applying any promo code");
    	System.out.println("1.KOTAK200 for orders above Rs. 399 . 20% off upto 200");
    	System.out.println("2. ICICITREATS for orders above Rs. 499. Flat 30% off upto Rs. 200");
    	int promocode=scanner.nextInt(); //either 1 or 2
    	if(promocode==ICICITREATS&& amounttopay>=499)
    	{
    		double discountICICI =0.20*amounttopay;
    		System.out.println("Promocode applied . you got discount worth \u20b9 "+discountICICI);
    		System.out.println("Please pay :\u20b9 "+(amounttopay-discountICICI));
    	}
    
    else if(promocode==KOTAK200) {
    	double discountKOTAK=0.20*amounttopay;
    	if(discountKOTAK>200)
    	{
    		discountKOTAK=200;
    	}
    	System.out.println("Promocode KOTAK200 applied. You got discount worth "+discountKOTAK);
    	System.out.println("Please pay "+(amounttopay-discountKOTAK));
    }
    else  (promocode!=1 || promocode!=2)
    {
    	System.out.println("Please enter right promocode");
    }
    }
    else {
    	
    	System.out.println("You are not  eligible for applying any promo code ");
    	System.out.println("Please pay :\u2069"+ amounttopay);
    }
    if(discountICICI>discountKOTAK)
    {
    	System.out.println("You should prefer ICICI bank promocode as it is offering more discount");
    }
    else
    {
    	System.out.println("You should prefer Kotak bank promo code as it is offering more discount");
    }
    
	}
}