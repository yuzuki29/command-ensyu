import java.util.Scanner;
public class Bmi {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int n = 0;n < 2; n++){

            System.out.println("身長");
             double height =sc.nextDouble();
            System.out.println("体重");
            double weight =sc.nextDouble();
            System.out.println("BMI");
            double BMI =(weight / (height*height));
            System.out.println(String.format("%.2f",BMI));
        }
    }
}
