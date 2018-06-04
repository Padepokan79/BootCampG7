/*
Date / Time : 2018-04-28 10:11:00 AM
Created By  : Khairil Anwar
Created Date: 2018-04-28 10:11:00 AM
Updated Date: -
*/

public class EscapeSequencesComments {
	public static void main(String[] args) {
		//This exercise demonstrates escape sequences & comments (like these)!
		System.out.println( "Learn\tJava\n\tthe\nHard\tWay\n\n" );
		System.out.println( "\tLearn Java the \"Hard\" Way!\n" );
		//System.out.frimp( "Learn Java the Hard Way");
		System.out.println( "Hello\n" ); //This line prints Hello
		System.out.println( "Jello\by\n" ); //This line prints Jelly
		/* The Quick brown fox jumped over a lazy dog.
		   Quick wafting zephyrs vex bold Jim. */
		System.out /*testing*/ .println( "Hard to believe, eh?" );
		System.out.println( "Surprised? /* abcde */ Or what did you expect?" );
		System.out.println( "\\ // -=- \\ //" ); //cannot put comments inside print(--)ln 
		System.out.println( "\\\\ \\\\\\ \\\\\\\\" ); //it takes 2 to make 1
		System.out.println( "I hope you understand \"escape sequences\" now. \n" );
		// and comments. :)
	}
}