package SampleGit_01;

public class Main {
	
	public static void main(String[] args) {
		
		Hellosys();
		System.out.println("Git Test dayo!");
		Goonight gn = new Goonight();
		gn.gooNight();
	}
	private static void Hellosys() {
		System.out.println("Hello～.");
	}

}
class Goonight{
	
	void gooNight() {
	System.out.println("goonight!");

	}
}