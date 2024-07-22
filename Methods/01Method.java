import java.util.*;
import java.util.*;
class Solve{

	static int findMax(int a,int b){
		return (a>b) ? a : b;
	}

	public static void main(String args[]){

		Scanner sc=new Scanner(System.in);

		int a=sc.nextInt();
		int b=sc.nextInt();
		int c;

		c=findMax(a,b); //call static Method() from static method only
		
		System.out.println(c);	
	}
}