import java.util.Scanner;

public class WiFiUtility {
	public void troubleShootWiFi() {
		Scanner sc = new Scanner(System.in);
		
		// 1st step
		System.out.println("First step: reboot your computer");
		System.out.print("Are you able to connect with the internet? (yes or no): ");
		String answ = sc.nextLine().trim();

		while(!answ.equalsIgnoreCase("yes") && !answ.equalsIgnoreCase("no"))
		{
			System.out.println("Please enter yes or no!\n");
			System.out.print("Are you able to connect with the internet? (yes or no): ");
			answ = sc.nextLine().trim();
		}
		if(answ.equalsIgnoreCase("yes"))
		{
			System.out.println("Rebooting your computer seemed to work");
			sc.close();
			return;
		}
		  
		// 2nd step
		System.out.println("Second step: reboot your router");
		System.out.print("Now are you able to connect with the internet? (yes or no): ");
		answ = sc.nextLine().trim();
		while(!answ.equalsIgnoreCase("yes") && !answ.equalsIgnoreCase("no"))
		{
			System.out.println("Please enter yes or no!\n");
			System.out.print("Now are you able to connect with the internet? (yes or no): ");
			answ = sc.nextLine().trim();
		}
		if(answ.equalsIgnoreCase("yes"))
		{
			System.out.println("Rebooting your router seemed to work");
			sc.close();
			return;
		}
		  
		// 3rd step
		System.out.println("Third step: make sure the cables to your router are plugged in firmly and your router is getting power");
		System.out.print("Now are you able to connect with the internet? (yes or no): ");
		answ = sc.nextLine().trim();
		while(!answ.equalsIgnoreCase("yes") && !answ.equalsIgnoreCase("no"))
		{
			System.out.println("Please enter yes or no!\n");
			System.out.print("Now are you able to connect with the internet? (yes or no): ");
			answ = sc.nextLine().trim();
		}
		if(answ.equalsIgnoreCase("yes"))
		{
			System.out.println("Checking the router's cables seemed to work");
			sc.close();
			return;
		}
		  
		// 4th step
		System.out.println("Fourth step: move your computer closer to your router");
		System.out.print("Now are you able to connect with the internet? (yes or no): ");
		answ = sc.nextLine().trim();
		while(!answ.equalsIgnoreCase("yes") && !answ.equalsIgnoreCase("no"))//check user input
		{
			System.out.println("Please enter yes or no!\n");
			System.out.print("Now are you able to connect with the internet? (yes or no): ");
			answ = sc.nextLine().trim();
		}
		if(answ.equalsIgnoreCase("yes"))
		{
			System.out.println("Moving your computer closer to the router seemed to work");
			sc.close();
			return;
		}
		  
		// 5th step
		System.out.println("Fifth step: contact your ISP\n"
		+ "Make sure your ISP is hooked up to your router.");
		
		sc.close();
	}
}
