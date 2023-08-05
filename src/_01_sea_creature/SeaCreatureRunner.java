package _01_sea_creature;

public class SeaCreatureRunner {
	public static void main(String[] args) {
		SeaCreature spongebob = new SeaCreature("spongebob");
		SeaCreature patrick = new SeaCreature("patrick");
		SeaCreature squidward = new SeaCreature("squidward");
		
		spongebob.eat();
		//spongebob.laugh();
		
		System.out.println(patrick.getName());
		patrick.eat();
		//patrick.laugh();
		
		System.out.println(squidward.getName());
		squidward.eat();
		//squidward.laugh();
		
		System.out.println(patrick.judgeName(patrick.getName()));
	}
}
