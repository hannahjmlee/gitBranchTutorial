public class TheMotivator {
	public void feedback(int score) {
		if (score == 100)
			System.out.println("You're awesome");
		else if (score > 85)
			System.out.println("That's great");
		else if (score > 60)
			System.out.println("That's okee");
		else if (score > 30)
			System.out.println("Well, what can I say?");
		else
			System.out.println("You suck");
		
	}
	public static void main(String[] args) {
		TheMotivator tm = new TheMotivator();
		tm.feedback(60);
		
		TheMotivator tm1 = new TheMotivator();
		tm1.feedback(80);
		
		TheMotivator tm2 = new TheMotivator();
		tm2.feedback(90);
	}
}