import java.util.Scanner;

public class Picker {

	public static void main(String[] args) {
		//Make scanner and ask for input
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input an option\nActivity - 1\nRestaurant - 2\nExit - 3");
		
		//Set flag
		boolean flag = true;
		
		//While still working, ask for input.
		while(flag) {
			int input = scan.nextInt();
			if(input == 1) {
				Activity act = new Activity();
				System.out.println(act.pickActivity());
				flag = false;
			}
			else if(input == 2) {
				//restaurant code here;
				flag = false;
			}
			else if(input == 3) { flag = false; }
			else { System.out.println("Please input a number from 1 to 3"); }
			
		}
	
		System.out.println("Done");
		
		
		

	}

}
