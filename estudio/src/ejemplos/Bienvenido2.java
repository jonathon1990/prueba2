package ejemplos;
import java.util.Scanner;

public class Bienvenido2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String myLine = scan.nextLine();
        System.out.println(myLine);
        System.out.printf("mi nombre es <3 %s <3", myLine);
        System.out.printf("\nmi nombre es <3 " + myLine + " <3");

	}

}
