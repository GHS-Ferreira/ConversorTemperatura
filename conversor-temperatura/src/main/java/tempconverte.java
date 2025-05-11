import java.util.Scanner;

public class tempconverte {
    
    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

       
        double celsius = fahrenheitParaCelsius(fahrenheit);
        System.out.printf("A temperatura em Celsius é: %.2f°C%n", celsius);
    }
}
