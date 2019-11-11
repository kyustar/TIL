import java.util.Scanner;

public class ReverseStar{
	public static void main(String[] args){

	System.out.println("출력하고 싶은 줄 수를 입력하시오.");
	Scanner sc  = new Scanner (System.in);
	int line = sc.nextInt();
	
	for(int col = 0 ; col < line ; col++) {

		for(int row = 0 ; row < line - col ; row++){

			System.out.print(" * ");
			}
		System.out.println("");
		}
	}
}
