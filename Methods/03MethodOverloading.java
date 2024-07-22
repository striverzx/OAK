import java.util.*;
import java.util.*;
class Solve{

    
    static int max(int x,int y){
    	return (x>y) ? x: y;
    }

    static float max(float x,float y){
    	return (x>y) ? x: y;
    }

    static int max(int x,int y,int z){
    	return (x>y && x>z) ? x :(y>x && y>z)? y:z ;
    }
	public static void main(String args[]){

		System.out.println(max(10,20)); //calling the integral literals =>20

		System.out.println(max(10.5f,45.07f)); //Calling the float literals =>45.07

		System.out.println(max(4,40,400)); //Calling the 3 parameter/arguments =>400



		

	}
}