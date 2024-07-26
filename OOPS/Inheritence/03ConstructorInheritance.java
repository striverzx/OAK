class Parent{

	public Parent(){
		System.out.println("Parent Constructor");
	}
}

class Child extends Parent{

	public Child(){
		System.out.println("Child Constructor");

	}

}

class GrandChild extends Child{

	public GrandChild(){
		System.out.println("GrandChild Constructor");
	}
}



class Main{
	public static void main(String ...args){

		Parent p=new Parent();
		//Parent Constructor


		Child c=new Child();
		//Parent Constructor
		//Child Constructor

		GrandChild gc=new GrandChild();
		//Parent Constructor
		//Child Constructor
		//GrandChild Constructor

	}
}