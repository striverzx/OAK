class Circle{
	public double radius;

	public Circle(){
		radius=0;
	}

	public double area(){
		return Math.PI*radius*radius;
	}

	public double perimeter(){
		return 2*Math.PI*radius;
	}
	public double circumference(){
		return area();
	}
}

//Cyclinder class derived from the class Circle
class Cyclinder extends Circle{

	//Cyclinder having the extra features which is height and volume 
	public double height;

	public Cyclinder(){
		height=0;
	}

	public double volume(){
		return area()*height;
	}
}

class Solve{
	public static void main(String ...args){

		Cyclinder c=new Cyclinder();

		c.radius=7;
		c.height=10;

        System.out.println(c.area());
		System.out.println(c.volume());

		



	}
}