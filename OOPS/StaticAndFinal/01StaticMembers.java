class HondaCity{
 
    //Static variables
	static long price=10;
	int a,b;

    //Static methods 
    //static methods can only access the static variables and static methods

	static double onRoadPrice(String c){
		switch(c){

			case "Delhi":
			return price*0.01;
			case "Mumbai":
			return price*0.09;
			default:
			return 0.0;


		}
	}
}

class Home{
	public static void main(String ...args){
        
        //Accessing the static variables and methods using the object of the class
		HondaCity h1=new HondaCity();
		System.out.println(h1.price);
		System.out.println(h1.onRoadPrice("Delhi"));

		//We can access the static variables and static methods without even creating the
		//instace(Object) of the class
		//They care basically loaded when the class is Loaded

		System.out.println(HondaCity.price);
		System.out.println(HondaCity.onRoadPrice("Delhi"));
		System.out.println(HondaCity.onRoadPrice("Mumbai"));
	}
}