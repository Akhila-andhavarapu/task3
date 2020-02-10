package com.mycompany.hometask3;
import java.util.Scanner;

import com.mycompany.hometask3.Addition;
import com.mycompany.hometask3.Substraction;
import com.mycompany.hometask3.Multiplication;
import com.mycompany.hometask3.Division;

public class App 
{
    public static void main( String[] args )

    {
    	Division ob=new Division();
    	
    	 System.out.println("Select your operation" );
         System.out.println("1.Addtion");
         System.out.println("2.Substraction");
         System.out.println("3.Multiplication");
         System.out.println("4.Divsion");
    	Scanner sc= new Scanner(System.in);
    	System.out.println("Enter your option:");
    	int op=sc.nextInt();
    	System.out.println("Enter a and b values:");
    	double a=sc.nextDouble();
    	double b=sc.nextDouble();    	
         switch(op)
        {
        	case 1: ob.add(a, b);
        	break;
        	case 2:ob.sub(a, b);
        	break;
        	case 3:ob.mul(a, b);
        	break;
        	case 4:ob.div(a, b);
        	break;
        	default:
        		System.out.println("Enter a valid option");
        }
       
     }
}

