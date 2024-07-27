//Method Overriding

class TV{

	public void switchOn(){
		System.out.println("The TV is On");
	}

	public void chageChannel(){
		System.out.println("The TV Channel is changed");
	}
}

class smartTV extends TV{
        
        @Override
        public void switchOn(){
        	System.out.println("The smartTV is On");
        }

        @Override
        public void chageChannel(){
        	System.out.println("The smartTv Channel is changed");
        }

        public void browsing(){
        	System.out.println("Opening the youtube channel in smartTv");
        }
}
class Main{
	public static void main(String ...args){

		TV t=new TV();
		t.switchOn(); //The TV is On
		t.chageChannel();//The TV Channel is Changed

		smartTV st=new smartTV();
		st.switchOn(); //smart TV overrides the old Tv
		st.chageChannel(); //changeChannel overrides the Old Tv
		st.browsing(); //smartTV Having the extra feature which is browsing

		TV tt=new smartTV();
		tt.switchOn(); //smartTV is On

		tt.chageChannel();//The smartTv channel is changed

		// tt.browsing();  it is not possible!


	}
}