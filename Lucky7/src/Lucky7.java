import java.util.Random;
import java.util.Scanner;

public class Lucky7 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int number1 = 0;
		int number2 = 0;
		int number3 = 0;
		int money = 5;
		String playOrno;

		
//		if (number1==7 || number2==7 || number3==7) {
//			System.out.println("You win");
//		}else {
//			System.out.println("You lost");
//		}
//		for (int i=5; i>0 ; i--) {
		while(money != 0) {
			
			System.out.println("Now the money is "+ money);

			System.out.println("DO you want to play?");
			playOrno = scanner.nextLine();
			if (playOrno.equalsIgnoreCase("No")) {
				System.out.println("You get " + money + "!");
				break;
			}
			
			number1 = random.nextInt(10)+1;
			number2 = random.nextInt(10)+1;
			number3 = random.nextInt(10)+1;
			
			System.out.println(number1);
			System.out.println(number2);
			System.out.println(number3);
			
			money = money -1;
			
			if(number1 ==7 && number2 ==7 && number3 == 7 ) {
				System.out.println("You win $10! ");
				money =money +10;
//				System.out.println("Now you have "+ money);
				continue;
			}
			if((number1 ==7 && number2 ==7)||(number2 ==7 && number3 ==7)||(number1 ==7 && number3 ==7)) {
				System.out.println("You win $5! ");
				money =money+5;
//				System.out.println("Now you have "+ money);
				continue;
			}
			if(number1 ==7 || number2 ==7 || number3 == 7 ) {
				System.out.println("You win $3! ");
				money =money+3;
//				System.out.println("Now you have "+ money);
				continue;
			}else {
				System.out.println("You Lost ");
				
			}
}
		System.out.println("I hope to see you again!");
	}

}


