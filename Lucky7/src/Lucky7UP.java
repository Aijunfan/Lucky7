import java.util.Random;
import java.util.Scanner;

public class Lucky7UP {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int number1 = 0;
		int number2 = 0;
		int number3 = 0;
		int money = 5;
		String playOrno;
		int addMoney;
		int winMoney1;
		int winMoney2;
		int winMoney3;

		while(money != 0) {
			
			System.out.println("Now the money is $"+ money);
			
			System.out.println("DO you want to play?");
			playOrno = scanner.nextLine();
			if (playOrno.equalsIgnoreCase("No")) {
				System.out.println("You get $" + money + "!");
				break;
			}else {
			
				System.out.println("How much will you add?");					
				addMoney = scanner.nextInt();
				if (addMoney > money) {
					System.out.println("Not enough!");
					continue;
				}else {
					System.out.println("You put $" + addMoney + " to this round.");
				}
						
				number1 = random.nextInt(10)+1;
				number2 = random.nextInt(10)+1;
				number3 = random.nextInt(10)+1;
				
				System.out.println(number1);
				System.out.println(number2);
				System.out.println(number3);
				
				money = money -addMoney;
				
				if(number1 ==7 && number2 ==7 && number3 == 7 ) {
					winMoney1 = 10* addMoney;
					System.out.println("You win $"+ winMoney1+ "! ");
					money =money +winMoney1;
	//				System.out.println("Now you have "+ money);
					continue;
				}
				if((number1 ==7 && number2 ==7)||(number2 ==7 && number3 ==7)||(number1 ==7 && number3 ==7)) {
					winMoney2 = 5 * addMoney;
					System.out.println("You win $" + winMoney2 + "! ");
					money =money+addMoney;
	//				System.out.println("Now you have "+ money);
					continue;
				}
				if(number1 ==7 || number2 ==7 || number3 == 7 ) {
					winMoney3 = 3 * addMoney;
					System.out.println("You win $" + winMoney3 + "!");
					money =money+winMoney3;
	//				System.out.println("Now you have "+ money);
					continue;
				}else {
					System.out.println("You Lost ");
					
				}
				}		
			}
		System.out.println("I hope to see you again!");
	}

}
