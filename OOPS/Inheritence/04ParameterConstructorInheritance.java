class Parent{

	public Parent(){
		System.out.println("Non-Param of Parent Constructor");
	}

	public Parent(int x){
		System.out.println("Parameter of Parent "+x);
	}
}

class Child extends Parent{

	public Child(){
		System.out.println("Non-Param of Child Constructor");
	}

	public Child(int y){
		System.out.println("Paramer of Child "+y);
	}

	public Child(int x,int y){
		super(x); //it goes to the parent Parameter constructor
		System.out.println("2 Param of Child "+y);

	}
}



class Main{
	public static void main(String ...args){

		Parent p1=new Parent();
		//Non-Param of Parent
		
		Parent p2=new Parent(10);
		//Parameter of parent 10

		Child c1=new Child();
		//Non-Param of Parent Constructor
		//Non-Param of Child Constructor

		Child c2=new Child(20);
		//Non-param of Parent Constructor
		//Param of Child 20

		Child c3=new Child(40,50);
		//Parameter of Parent 40 
		//2 parameter of Child 50
		
		

		


		

	}
}