import java.util.Random;

/**
 * 1~10 범위의 난수를 받아 별찍기!
 */
public class HW1 {
	public static void main (String[] args) {
	
		Random random = new Random();
	
		int num = random.nextInt(10) + 1;
	
		for (int row = 0; row < num; row++) {
			int size = row;
			for(int col = 0; col <= size; col++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}


