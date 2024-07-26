//This is like a Home work or practice for basic Inheritance concpet

class cellPhone{

	public long number;
	public long imei;

	public cellPhone(){
		number=94920;
		imei=1234238737338364L;
	}

	public long getImei(){
		return imei;
	}

	public void Call(){
		System.out.println("Calling to Annaya please wait...!");
	}


	public void findImei(){
		System.out.println("you Imei Number is");
		System.out.println(getImei());
	}
}

class smartPhone extends cellPhone{

	public long macNumber;

	public smartPhone(){
		macNumber=12344321L;
	}

	public void openWhatsApp(){
		System.out.println("You got 5 messages from Mohan!");
	}


}

class Solve{
	public static void main(String ...args){

		cellPhone cell=new cellPhone();
		System.out.println(cell.getImei());
		cell.Call();
		cell.findImei();

		smartPhone smart=new smartPhone();
		System.out.println(smart.macNumber);
		smart.Call();
		smart.openWhatsApp();

		



	}
}