	import java.util.Scanner;

	public class Assignment {

	Scanner sc = new Scanner(System.in);

	      //function to checkPalindrome

	      public void checkPalindrome()  {
	      System.out.println("Enter a number for palindrome check-> ");  
		  int number = sc.nextInt(); //It is the number variable to be checked for palindrome  
		  int remainder,reverse=0,temp;    
		  temp=number;  
		  while(number>0){    
		   remainder=number%10;  //getting remainder 
		   reverse=(reverse*10)+remainder; 
		   number=number/10;    
		  }
		  if(temp==reverse)    
		   System.out.println("Palindrome number! ");    
		  else    
		   System.out.println("Not palindrome!");    

	      }

	 

	       //function to printPattern

	       public void printPattern() {
	    	 //i for rows and j for columns      
	   		//row denotes the number of rows you want to print  
	   			 System.out.println("Define the number of rows for downward triangle star pattern -> ");
	   			int row = sc.nextInt();
	   		int i, j;   
	   		//outer loop for rows  
	   		for(i=0; i<row; i++)   
	   		{   
	   		//inner loop for columns  
	   		for(j=0; j<row-i; j++)   
	   		{   
	   		//prints stars   
	   		System.out.print("* "); 
	   		}   
	   		//throws the cursor in a new line after printing each line  
	   		System.out.println();   
	   		}   
	      }

	 

	          //function to check no is prime or not

	        public void checkPrimeNumber() {
	        	 System.out.println("Enter a number -> ");		
	     		int n = sc.nextInt();//it is the number to be checked  
	     		 int i,quotient=0,flag=0;      
	     		    
	     		  quotient=n/2; 
	     		  
	     		  if(n==0||n==1){  //prime number is greater than 1
	     		   System.out.println(n+" is not prime number");      
	     		  }
	     		  else{  
	     		   for(i=2;i<=quotient;i++){      
	     		    if(n%i==0){      
	     		     System.out.println(n+" is not prime number");      
	     		     flag=1;      
	     		     break;      
	     		    }      
	     		   }      
	     		   if(flag==0)  { System.out.println(n+" is prime number"); }  
	     		  }//end of else 

	        }

	         

	          // function to print Fibonacci Series

	          public void printFibonacciSeries() {

	        	  System.out.println("Enter a number -> ");
	      		Scanner sc = new Scanner(System.in);
	      		int count = sc.nextInt();
	      	 int n1=0,n2=1,n3,i;    
	      	 System.out.print(n1+" "+n2);//printing 0 and 1    
	      	    
	      	 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
	      	 {    
	      	  n3=n1+n2;    
	      	  System.out.print(" "+n3);    
	      	  n1=n2;    
	      	  n2=n3;    
	      	 }    
	      	  

	          }

	 

	//main method which contains switch and do while loop

	      public static void main(String[] args) {

	                Assignment obj = new Assignment();

	                int choice;

	                Scanner sc = new Scanner(System.in);

	do {

	System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

	+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

	+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

	System.out.println();

	 

	choice = sc.nextInt();

	switch (choice) {

	 

	case 0:

	choice = 0;

	break;

	 

	case 1: {

	obj.checkPalindrome();

	}

	break;

	 

	case 2: {

	 

	obj.printPattern();

	}

	break;

	 

	case 3: {

	obj.checkPrimeNumber();

	}

	break;

	 

	case 4: {

	 

	obj.printFibonacciSeries();

	}

	break;

	 

	default:

	System.out.println("Invalid choice. Enter a valid no.\n");

	}

	 

	} while (choice != 0);

	System.out.println("Exited Successfully!!!");

	sc.close();

	}

	 

	}