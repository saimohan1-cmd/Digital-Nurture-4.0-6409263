package FinancialForecastingExample;
import java.util.*;
public class ForeCast {
    public static double predictValue(double presentVal,double rate,int years){
        if(years==0){
            return presentVal;
        }
        return predictValue(presentVal, rate, years-1)*(1+rate);
    }
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.print("Enter the Present value: ");
        double presentVal = scan.nextDouble();
        System.out.print("Enter the rate: ");
        double rate = scan.nextDouble();
        System.out.print("Enter the number of years: ");
        int years = scan.nextInt();
        double predictedValue = predictValue(presentVal, rate, years);
        System.out.printf("Future value after %d years : RS %.2f\n",years,predictedValue);
        scan.close();
    }
}
