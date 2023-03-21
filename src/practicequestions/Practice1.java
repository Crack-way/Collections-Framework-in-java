package practicequestions;
import java.util.Scanner;
public class Practice1 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        double discount=0;
        System.out.println("Input the meal Cost");
        double mealCost= sc.nextInt();
        System.out.println("Input the tip percent");
        double tipP=sc.nextDouble();
        System.out.println("Input the tax percent");
        double taxP=sc.nextDouble();
        double tip=0;
        double tax=0;
        double totalCost=0;
        if (mealCost >= 5000 && mealCost <= 10000) {
            discount=500;

        }
        else if(mealCost>10000){
            discount=700;
            tipP=tipP - (tipP *((double)20/100));

        }

        tip=tipP /100 * mealCost;
        tax= taxP/100 * mealCost;
        totalCost= mealCost + tip + tax - discount ;

        System.out.println("Total Cost:"+ (int)totalCost);



        }


    }
