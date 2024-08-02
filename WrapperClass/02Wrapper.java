//Wrapper Class
//Wrapper class to Primitive 
//Unboxing

class Home{
	public static void main(String ...args){
		
		Integer x=Integer.valueOf(10);

		int a=x.intValue(); //Unboxing

		int b=x; //Auto-Unboxing

		System.out.println(x);
		System.out.println(a);
		System.out.println(b);

	}
}