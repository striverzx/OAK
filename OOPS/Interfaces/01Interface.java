
interface Test1{
	void method1();
	void method2();
}

class Test2 implements Test1{

	public void method1(){
		System.out.println("Method1 of the Test2");
	}

	public void method2(){
		System.out.println("Method2 of the Test2");
	}

	public void method3(){
		System.out.println("Method3 of the Test2");
	}
}
class Main{
	public static void main(String ...args){

		Test2 t2=new Test2();
		t2.method1();
		t2.method2();
		t2.method3();

		Test1 t1=new Test2();
		t1.method1();
		t1.method2();

        //we cannot access the method3 from different class reference
		// t1.method3();






	}
}