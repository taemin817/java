package day10.others;

public class 김병진_라면자판기 {
	public static void main(String[] args) {
		//커피정보를 담을 수 있는 변수가 만들어짐
		김병진_라면 coffee = new 김병진_라면();
		
		//값을 지정
		coffee.input (450,3,2,2500);

		//값을 출력
		coffee.printInfo();
		//System.out.println(coffee.설탕);
	}

}
