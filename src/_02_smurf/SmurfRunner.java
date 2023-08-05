package _02_smurf;

public class SmurfRunner {
	public static void main(String[] args) {
		
		Smurf handy = new Smurf("Handy");
		System.out.println(handy.getName());
		handy.eat();
		
		Smurf papa = new Smurf("Papa");
		Smurf smurfette = new Smurf("Smurfette");
		
		System.out.println(papa.getName());
		System.out.println(papa.getHatColor());
		System.out.println(papa.isGirlOrBoy());
		
		System.out.println(smurfette.getName());
		System.out.println(smurfette.getHatColor());
		System.out.println(smurfette.isGirlOrBoy());
		
	}
}

/* 
 * 1. Watch this Smurf cartoon: https://www.youtube.com/watch?v=7-RDGT5Lsp8 
 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
 * 3. &  4. see comments in code below
 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
 * 6. Make a Smurfette and print her name, hat color and girl or boy. 
 */