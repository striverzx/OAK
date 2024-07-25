class Person{
	private String name;
	private int age;

	public Person(){
		this.name="ManiKanta";
		this.age=21;
	}

	public Person(String s,int a){
		this.name=s;
		this.age=a;
	}

	public Person(Person p){
		this.name=p.name;
		this.age=p.age;
	}

	public void display(){
		System.out.println(name);
		System.out.println(age);
	}

	
}

class Solve{
	public static void main(String ...args){

		Person p1=new Person();
		p1.display();

		Person p2=new Person("Mahesh",50);
		p2.display();

		Person p3=new Person(p2);
		p3.display();



	}
}