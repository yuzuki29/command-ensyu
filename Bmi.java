import java.util.Scanner;
public class Bmi {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		for(int n = 0;n < 2; n++){

			System.out.println("身長");
		int height =Integer.parseInt(sc.nextLine());

			System.out.println("体重");
			int weight =Integer.parseInt(sc.nextLine());

			System.out.println("BMI");
			double BMI =(double)(height / (weight*weight));
		System.out.println(BMI);
	}
	}
}
