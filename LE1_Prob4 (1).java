/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	   int i;
	   int n= Integer.parseInt(args[0]);
	   {
	       for(i=1;i<=10;i++)
	       {
	           int mul=n*i;
	           System.out.println(args[0]+" x "+i+" = "+mul);
	       }
	   }
	    
	}	
	
}