class Example{

	final int VAL1=10;

	final int VAL2;

	Example(){

		VAL2=20;
	}
}

class Home{
	public static void main(String ...args){

     Example e=new Example();
     System.out.println(e.VAL1);
     System.out.println(e.VAL2);
     
		
		

	}
}