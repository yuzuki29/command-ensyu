import java.util.Scanner;
public class Bmi {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int n = 0;n < 2; n++){

            System.out.println("身長");
            int height =Integer.parseInt(sc.nextLine());
            double dh =height;
            System.out.println("体重");
            int weight =Integer.parseInt(sc.nextLine());
            double dw = weight;
            System.out.println("BMI");
            double BMI =(dh / (dw*dw));
            System.out.println(String.format("%.2f",BMI));
        }
    }
}
