
abstract class Super{

	Super(){
		System.out.println("Constructor of the Super");
	}
	void method1(){
		System.out.println("Method1 of SuperClass");

	}
	abstract void method2();
}

class Sub extends Super{
	void method2(){
		System.out.println("Method2 of SubClass");
	}
}


class Main{
	public static void main(String ...args){

		//when the class is abstract then we cannot create the object for that class
		//but we are able to create the referece of that class
		//the sub class method is definately override the super class method if it have
		//in order to subclass not want to become a abstact class

		
        

		Super sup=new Sub(); //constructor os super is called
		sup.method1(); //method 1 of super

		sup.method2();//method 2 of sub

		Sub ss=new Sub(); //Constructor of super is called

		ss.method1(); //method 1 of super is called

		ss.method2(); //method 2 of sub is called

	}
}