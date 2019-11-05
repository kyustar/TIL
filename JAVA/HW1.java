import java.util.Random;

/**
 * 1~10 범위의 난수를 받아 별찍기!
 */
public class HW1 {
	public static void main (String[] args) {
	
		Random random = new Random();
	
		int num = random.nextInt(10) + 1;
	
		for (int i = 0; i < num; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}


