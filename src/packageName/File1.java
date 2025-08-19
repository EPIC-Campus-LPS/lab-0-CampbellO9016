package packageName;
import java.util.Scanner;
public class File1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Verb: ");
		String verb = scan.nextLine();
		System.out.print("Adjective: ");
		String adjective = scan.nextLine();
		System.out.print("Noun: ");
		String noun = scan.nextLine();
		scan.close();
		System.out.println("They wanted to " + verb + " a " + adjective +" "+ noun + " for the science fair.");

	}

}
