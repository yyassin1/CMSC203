/*
 * Class: CMSC203 
 * Instructor: Dr. Ahmed Tarek
 * Description: Build an application that will step through some possible problems to restore 
   internet connectivity.  Assume that your computer uses wi-fi to connect to a router that 
   connects to an Internet Service Provider (ISP) which connects to the Internet.
 * Due: 2/08/2021
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Yassin Yassin
*/


import java.util.Scanner;

class WIFIDiagnosis

{
	
public void WifiTrouble()

{
	
	Scanner sc = new Scanner(System.in);
	//prompt the following to the user
	System.out.println("First step: reboot your computer");
	System.out.print("Are you able to connect with the internet? (yes or no) ");
	// Accept a string from the user
	String input = sc.nextLine().trim();
	// while loop to repeat the function until the user type yes or no
while(!input.equalsIgnoreCase("yes") && !input.equalsIgnoreCase("no"))
	
{
	//error message
	System.out.println("Incorrect Input! Please enter yes or no!\n");
	System.out.print("Are you able to connect with the internet? (yes or no) ");
	//input again
	input = sc.nextLine().trim();

}

if(input.equalsIgnoreCase("yes"))
	
{
	//if the input is yes prompt the following
	System.out.println("Rebooting your computer seemed to work");
	return;

} 
// if the input is no prompt the following
System.out.println("Second step: reboot your router");
System.out.print("Now are you able to connect with the internet? (yes or no) ");
// accept input from the user
input = sc.nextLine().trim();

//while loop to repeat the function until the user type yes or no
while(!input.equalsIgnoreCase("yes") && !input.equalsIgnoreCase("no"))

{
	//error message
	System.out.println("Please enter yes or no!\n");
	System.out.print("Now are you able to connect with the internet? (yes or no) ");
	input = sc.nextLine().trim();
}

if(input.equalsIgnoreCase("yes"))

{
	//if the input is yes prompt the following
	System.out.println("Rebooting your router seemed to work");
	return;
} 

//if the input is no prompt the following
System.out.println("Third step: make sure the cables to your router are plugged in firmly and your router is getting power");
System.out.print("Now are you able to connect with the internet? (yes or no) ");
input = sc.nextLine().trim();

//while loop to repeat the function until the user type yes or no
while(!input.equalsIgnoreCase("yes") && !input.equalsIgnoreCase("no"))

{
	//error message
	System.out.println("Please enter yes or no!\n");
	System.out.print("Now are you able to connect with the internet? (yes or no) ");
	input = sc.nextLine().trim();

}

if(input.equalsIgnoreCase("yes"))

{
	//if the input is yes prompt the following
	System.out.println("Checking the router's cables seemed to work");
	return;

}
  
//if the input is no prompt the following
System.out.println("Fourth step: move your computer closer to your router");
System.out.print("Now are you able to connect with the internet? (yes or no) ");
input = sc.nextLine().trim();

//while loop to repeat the function until the user type yes or no
while(!input.equalsIgnoreCase("yes") && !input.equalsIgnoreCase("no"))

{
	//error message
	System.out.println("Please enter yes or no!\n");
	System.out.print("Now are you able to connect with the internet? (yes or no) ");
	input = sc.nextLine().trim();

}

if(input.equalsIgnoreCase("yes"))

{
	//if the input is yes prompt the following
	System.out.println("Moving your computer closer to the router seemed to work");
	return;

}

//if the input is no prompt the following
System.out.println("Fifth step: contact your ISP\n" + "Make sure your ISP is hooked up to your router.");

}
}


public class WIFIDiagnosiss 

{
  //star the program in the main function
public static void main(String[] args) 

{
  
// print the header
System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work.\n");
  
// calling the WIFIDiagnosis function
WIFIDiagnosis diagnosis = new WIFIDiagnosis();
diagnosis.WifiTrouble();

}
}