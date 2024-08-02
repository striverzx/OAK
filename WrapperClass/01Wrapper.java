//Wrapper Classes in Java
//Primitive type -->Wrapper Class
//Boxing

class Home{
	public static void main(String ...args){
		
		//Boxing
		//converting the primitive type of data into corresponding wrapper class is called the boxing

		int i=10;
		Integer i1=Integer.valueOf(i); //Boxing

		Integer i2=i; //Auto-Boxing

		System.out.println(i); //int
		System.out.println(i1); //wrapper class
		System.out.println(i2); //Wrapper class
	}
}