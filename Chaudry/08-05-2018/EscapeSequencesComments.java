public class EscapeSequencesComments{
	public static void main(String[] args){
		//This exercise demonstrates escape sequences & comment (Like these)!
		System.out.print( "Learn\tJava\n\tthe\nHard\tWay\n\n" );
		System.out.print( "\tLearn Java the \"Hard\" Way!\n" );
		//System.out.print( "Learn Java the Hard Way" );
		System.out.print( "Hello\n" ); //this line prints hello
		System.out.print( "Jello\by\n" ); //this line prints jelly
		/*the quick brown fox jumped over a lazy dog.
		quick wafting zephyrs vex bold jim*/
		System.out/*testing*/.println( "Hard to believe, eh?" );
		System.out.println( "Surprised? /* abcde */ Or what did you expect?" );
		System.out.println( "\\ // -=- \\ //" );
		System.out.println( "\\\\ \\\\\\ \\\\\\\\" ); //it takes 2 to make 1
		System.out.print( "I hope you understand \"escape sequences\" now.\n" );
		// and comments :)
	}
}