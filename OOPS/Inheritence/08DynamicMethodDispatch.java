//Run Time polymorphism
class Super{

	void method1(){
		System.out.println("Super Class method1");
	}

	void method2(){
		System.out.println("Super class method2");
	}
}

class Sub extends Super{

	void method2(){
		System.out.println("Sub class Method2");
	}

	void method3(){
		System.out.println("Sub class Method3");
	}
}
class Main{
	public static void main(String ...args){

		//Creating super reference to the sub class object
		//this is also called the run time polymorphism
		//according to the object is printed

		Super sup=new Sub();
		sup.method1(); //Super class method1

		sup.method2(); //sub class method2 overrides in the runtime itself

		//sup.method3(); //accessing of this method not possible


	}
}