import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
	 Scanner in = new Scanner(System.in);
    
	 System.out.println("enter your chrismaslist"); 
		
		
		 System.out.println("enter item 1");
			String item1 = in.nextLine();
		
		
			System.out.println("enter item 2");
           String item2 = in.nextLine();
            
           System.out.println("enter item 3");
           String item3 = in.nextLine();
           
           System.out.println("enter item 4");
           String item4 = in.nextLine();
           
          in.nextLine();
           
          System.out.println("enter item 5");
           String item5 = in.nextLine();
           
           System.out.println("dear santa this year for chrismas i want" + item1+"i also want"+item2+"and"+item3+"and another prsent i want is"+item4+"and for my last present i want"+item5);
           
	}
}

