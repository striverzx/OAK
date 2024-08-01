class StaticBlocks{

	static int x=10;

	static{
		System.out.println("Block-1");
	}

	static{
		System.out.println("Block-2");
	}
}

class Home{
	public static void main(String ...args){

		
		System.out.println(StaticBlocks.x);

	}
}