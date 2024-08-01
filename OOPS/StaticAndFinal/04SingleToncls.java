class CofeeMachine{

	private float cofeeQnty;
	private float waterQnty;

	static private CofeeMachine my=null;

	private CofeeMachine(){
		cofeeQnty=1.3f;
		waterQnty=2.3f;

	}

	static public CofeeMachine getInstance(){
		if(my==null){
			my=new CofeeMachine();
			return my;
		}
		else return my;

	}
}

class Home{
	public static void main(String ...args){

		CofeeMachine c1=CofeeMachine.getInstance();
		CofeeMachine c2=CofeeMachine.getInstance();
		CofeeMachine c3=CofeeMachine.getInstance();
		System.out.println(c1+" "+c2+" "+c3);

		if(c1==c2) System.out.println("Same");


	}
}