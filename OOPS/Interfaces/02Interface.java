class Phone{

	void call(){
		System.out.println("Calling");
	}
	void sms(){
		System.out.println("Sending the S M S");
	}
}

interface ICamera{
	//By default these are abstract and public also
	void click();
	void record();
}

interface IMusicPlayer{
	//By default these are abstract methods and also public 

	void play();
	void pause();
	void stop();

}

class smartPhone extends Phone  implements ICamera,IMusicPlayer{

	public void videoCalling(){
		System.out.println("Video calling feature in smartPhone");
	}

	//defing or overriding the Icamers methods 
	public void click(){
		System.out.println("Camera is clicked 4K Pic");
	}
	public void record(){
		System.out.println("Recording the video");
	}

	//defining or overriding the ImusicPlayer methods 
	//In Java, methods in an interface are implicitly public and abstract. However, when you implement these methods in a class, you need to explicitly specify the public access modifier. This is because the default access modifier for methods in a class is package-private, and you cannot reduce the visibility of the inherited methods.
	
	public void play(){
		System.out.println("playing the music");
	}
	public void pause(){
		System.out.println("paused the music");
	}
	public void stop(){
		System.out.println("Stoped the music");
	}
}

class Main{
	public static void main(String ...args){
		smartPhone s=new smartPhone();
		//The normal features of Phone
		s.call();
		s.sms();

		//The smartPhone feature
		s.videoCalling();

        //The Camera features 
		s.click();
		s.record();

		//The MusicPlayer
		s.play();
		s.pause();
		s.stop();

		Phone p=new smartPhone();
		p.call();
		p.sms();


		ICamera c=new smartPhone();
		c.click();
		c.record();

		IMusicPlayer m=new smartPhone();
		m.play();
		m.pause();
		m.stop();
		
		

	}
}

/*
OUTPUT:
Calling
Sending the S M S
Video calling feature in smartPhone
Camera is clicked 4K Pic
Recording the video
playing the music
paused the music
Stoped the music
Calling
Sending the S M S
Camera is clicked 4K Pic
Recording the video
playing the music
paused the music
Stoped the music
*/