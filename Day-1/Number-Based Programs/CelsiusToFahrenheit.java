
import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        System.out.println("Enter celsius:");
        float celsius = sc.nextFloat();
        float fahrenheit= ((celsius*1.8f)+32);
        System.out.println("Fahrenheit:"+fahrenheit );
    }
}