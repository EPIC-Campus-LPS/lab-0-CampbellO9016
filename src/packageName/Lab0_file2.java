package packageName;
import java.util.Scanner;
public class Lab0_file2 {
	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	int byr = scan.nextInt();
	System.out.println("You will turn 100 in " + (byr + 100));
	scan.close();
}
}