class Super{

	public void display(){
		System.out.println("Hello!");
	}
}

class Sub extends Super{
   
   @Override
   public void display(){
   	System.out.println("Hello, World!");
   	//This sub class overrides the super class display() method
   }
}


class Main{

	public static void main(String ...args){

		Super sup=new Super();
		sup.display();

		Sub sub=new Sub();
		sub.display();


         
	}
}