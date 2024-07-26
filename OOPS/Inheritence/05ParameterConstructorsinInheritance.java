class Rectangle{
	public int length;
	public int breadth;

	public Rectangle(){
		length=breadth=1;
	}
	public Rectangle(int l,int b){
		length=l;
		breadth=b;
	}

	public int area(){
		return length*breadth;
	}

	public int perimeter(){
		return 2*(length*breadth);
	}
}

class Cuboid extends Rectangle{
	public int height;

	public Cuboid(){
		height=3;

	}
	public Cuboid(int h){
		height=h;
	}

	public Cuboid(int l,int b,int h){
		super(l,b); //This super values go to the parent class/Super Class
		height=h;
	}

	public int volume(){
		return length*breadth*height;
	}
}



class Main{
	public static void main(String ...args){


		Rectangle r1=new Rectangle();
		System.out.println(r1.area()); 
		//1

		Rectangle r2=new Rectangle(2,3);
		System.out.println(r2.area());
		//6
        
		Cuboid c1=new Cuboid();
		System.out.println(c1.volume());
		//3 -->1*1*3

		Cuboid c2=new Cuboid(2,3,5);
		System.out.println(c2.area()); //2*3

		System.out.println(c2.perimeter()); // 2*(2+3)

		System.out.println(c2.volume()); //2*3*5



		

		
		
		

		


		

	}
}