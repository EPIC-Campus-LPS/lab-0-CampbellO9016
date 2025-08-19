package packageName;
import java.util.Scanner;
public class File3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int sc1 = scan.nextInt();
		int sc2 = scan.nextInt();
		int sc3 = scan.nextInt();
		System.out.println("Total Score: " + (sc1 + sc2 + sc3));
		System.out.println("Average Score: " + (sc1 + sc2 + sc3) / 3);
		System.out.println("Total Score: " + (sc1 + sc2 + sc3) % 5);
		

	}

}
