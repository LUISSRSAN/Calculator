/*
 * Name:Luis Santiago
 * Description: Terminal Calculator application
 * Date Created : March 22nd,2023
 * Date Modified : April 3rd ,2023

 */



import java.util.Scanner;
public class MyCalculator {
	
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
   //The calculator can operate in two modes: Standard and Scientific modes. 
		
		
		/*
		 * The Standard mode will allow the user to perform the following operations: 
		 *(+, -, *, /) add, subtract, multiply, and divide
		 */
		
		Scanner scan = new Scanner (System.in);
		
		String mode;
		Boolean test = true;
		double num=0;
		//double num2=0;
		
		String operator = "";
		String startOver = "Y";
		
		// Choose a mode 
		
		while ( startOver.equals("Y")) {
			int numbers = 0; 
			double result=0.0;
			double quotient = 1.0;
			double difference = 0.0;
			double sum = 0.0;
			double product = 1.0;
			
        System.out.println("Enter the calculator mode: Standard/Scientific?");
        
        
		mode = scan.next();
		
		// if  standard else if Scientific 
		
		
		if (mode.equals("Standard")) {
		System.out.println("The calculator will operate in standard mode.");
		do {
		System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");
		operator = scan.next();
		
			// Enter number // Addition complete 
		if (operator.equals("+")) {
			System.out.println("How many numbers do you want to add?");
			test = true;
			numbers = scan.nextInt();
			System.out.println("Enter "+ numbers +" numbers");
		
			for (int i =0 ;i <numbers ;i++) {
			
				num = scan.nextDouble();
			sum  =sum + num;
			}
			System.out.println("Result: " + sum );
			
			
		}
			//subtraction not working properly 
		else if (operator.equals("-")) {
			System.out.println("How many numbers do you want to subtract?");
			test = true ;
			numbers = scan.nextInt();
			System.out.println("Enter "+ numbers +" numbers");
			
			difference = scan.nextDouble();
			for (int i =1 ;i <=numbers-1 ;i++) {
			num = scan.nextDouble();
			
			difference = difference - num;
			}
			System.out.println("Result: " + difference );
			
		}
		
		//not working properly 
		else if (operator.equals("*")) {
			System.out.println("How many numbers do you want to multiply?");
			test = true;
			numbers = scan.nextInt();
			System.out.println("Enter "+ numbers +" numbers");
			
			for (int i =1 ;i <=numbers ;i++) {
			num = scan.nextDouble();
			product = product * num;
			}
			System.out.println("Result: " + product );
			
		}
		
		//returns 0.0
		else if (operator.equals("/")) {
			System.out.println("How many numbers do you want to divide?");
			test = true;
			numbers = scan.nextInt();
			System.out.println("Enter "+ numbers +" numbers");
			quotient = scan.nextDouble();
			for (int i =1 ;i <=numbers-1 ;i++) {
			num = scan.nextDouble();
			
			quotient /= num;
			}
			System.out.println("Result: " + quotient );
			
		}
		
		else {
			System.out.println("Invalid operator " + operator);
			 test = false ;
			
		}
		
		
	} while (test != true);
		
		}
		// Scientific Mode 
		
		else if (mode.equals("Scientific")){
			System.out.println("The calculator will operate in scientific mode.");
			System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, 'sin' for sin x, 'cos' for cos x, 'tan' for tan x:");
		    operator = scan.next();
		// need to fix basic 
		
	//Sin
		    if (operator.equals("+")) {
				System.out.println("How many numbers do you want to add?");
				numbers = scan.nextInt();
				System.out.println("Enter "+ numbers +" numbers");
			
				for (int i =0 ;i <numbers ;i++) {
				
					num = scan.nextDouble();
				sum  =sum + num;
				}
				System.out.println("Result: " + sum );
				
				
			}
				//subtraction not working properly 
			else if (operator.equals("-")) {
				System.out.println("How many numbers do you want to subtract?");
				numbers = scan.nextInt();
				System.out.println("Enter "+ numbers +" numbers");
				
				
				difference = scan.nextDouble();
				for (int i =1 ;i <=numbers - 1 ;i++) {
				num = scan.nextDouble();
				
				difference = difference - num;
				}
				System.out.println("Result: " + difference );
				
			}
			
			//not working properly 
			else if (operator.equals("*")) {
				System.out.println("How many numbers do you want to multiply?");
				numbers = scan.nextInt();
				System.out.println("Enter "+ numbers +" numbers");
				
				for (int i =1 ;i <=numbers ;i++) {
				num = scan.nextDouble();
				product = product * num;
				}
				System.out.println("Result: " + product );
				
			}
			
			//returns 0.0
			else if (operator.equals("/")) {
				System.out.println("How many numbers do you want to divide?");
				numbers = scan.nextInt();
				System.out.println("Enter "+ numbers +" numbers");
				quotient = scan.nextDouble();
				for (int i =1 ;i <=numbers -1 ;i++) {
				num = scan.nextDouble();
				
				quotient /= num;
				}
				System.out.println("Result: " + quotient );
			}
		    
		    
		    else if (operator.equals("sin")){
			System.out.println("Enter a number in radians to find the sine");
			num = scan.nextDouble();
			result = Math.sin(num);
			System.out.println("Result: " + result);
				
	}
		//COS
		else if (operator.equals("cos")) {
			System.out.println("Enter a number in radians to find the cosine");
			num = scan.nextDouble();
			result = Math.cos(num);
			System.out.println("Result: " + result);
		}
		
		//Tan
		else if (operator.equals("tan")) {
			System.out.println("Enter a number in radians to find the tangent");
			num = scan.nextDouble();
			result = Math.tan(num);
			System.out.println("Result: " + result);
		}
		
		
		else {
			System.out.println("Invalid");
		}
		
		
	
		
		}
		System.out.println("Do you want to start over? (Y/N)");
		startOver = scan.next();
		}
		
		//Addition is working 
		//subtraction is not working 
		//99 47 12 4 3 
		//multiplication fixed 
		//division not working either 
		//Cosine,Sine,Tan are working 
		//5 2 23
		//10 245 
		
	//Goodbye 
	System.out.println("Goodbye");
    
    scan.close();
    
	}

}
