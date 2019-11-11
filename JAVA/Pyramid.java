import java.util.Scanner;

public class Pyramid{
public static void main(String[] args){
	

	int row,col;
	int half;

	while(true){

	System.out.println("출력하고 싶은 피라미드의 줄 수를 입력하시오.");
	
	Scanner sc = new Scanner(System.in);
	int line = sc.nextInt();
	half = line;

	if(line>=1){

	  for(row=0; row < line; row++){
		
		for( col=0; col < half-row; col++ ){
			System.out.print(" ");
		}
		for( col = half-row; col <= half+row; col++ ){
			System.out.print("*");
		}
	System.out.println("");
	
	 }
		System.out.println("계속 하시겠습니까? (y/n) (y:계속, n:증지)");
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		System.out.println("");

		if( s.equals("y") || s.equals("Y") ) { continue; }

		else if( s.equals("n") || s.equals("N") ) {
		System.out.println("종료");
		System.out.println("");
		break;	}

		else{
			 System.out.println("잘못입력하셨습니다.");
			 System.out.println("");
		 }
		
       	    }
	else { 
		System.out.println(" 1 이상의 양수를 입력하시오.");
		System.out.println("");	
	     }
	}	
     }
  
}		
