import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		for(int n = 0;n < 2; n++){	
		int height =Integer.parseInt(sc.nextLine());
			int weight =Integer.parseInt(sc.nextLine());
			double BMI =(double)(height / (weight*weight));
		System.out.println(BMI);
	}
	}
}
