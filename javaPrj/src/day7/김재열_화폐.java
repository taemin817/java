package day7;

import java.util.Scanner;

public class 김재열_화폐 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();

		int money1 = (money / 50000); // 오만원
		int money2 = (money % 50000) / 10000; // 만원
		int money3 = (money % 10000) / 5000; // 오천원
		int money4 = (money % 5000) / 1000; // 천원
		int money5 = (money % 1000) / 500; // 오백원
		int money6 = (money % 500) / 100; // 백원
		int money7 = (money % 100) / 50; // 오십원
		int money8 = (money % 50) / 10; // 십원

		System.out.println(money1 + " " + money2 + " " + money3 + " " + money4 + " " + money5 + " " + money6 + " "
				+ money7 + " " + money8);


	}

}
