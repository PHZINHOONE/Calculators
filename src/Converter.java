import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        int restart;
        restart = 0;
        while (restart == 0) {
            Scanner converter = new Scanner(System.in);
            System.out.println("Type 1 if you want to convert into Celsius or type 2 if you want to convert to Fahrenheit");
            int converter1 = converter.nextInt();
            if (converter1 == 1) {
                Scanner celsius = new Scanner(System.in);
                System.out.println("Type the temperature in Fahreinheit");
                float Fahreinheit = celsius.nextFloat();
                float celsius1;
                celsius1 = (Fahreinheit - 32);
                float celsius2;
                celsius2 = (float) (celsius1 / 1.8);
                System.out.println("The temperature in Celsius is " + celsius2);
            }

            if (converter1 == 2) {
                Scanner leitura = new Scanner(System.in);
                System.out.println("Type the temperature in Celsius");
                float celsius = leitura.nextFloat();
                float fahreinheit1;
                fahreinheit1 = (float) (1.8 * celsius);
                float fahreinheit2;
                fahreinheit2 = (fahreinheit1 + 32);
                System.out.println("The temperature in Fahrenheit is " + fahreinheit2);
            }
            Scanner reiniciar = new Scanner(System.in);
            System.out.println("Type 0 if you want to start again or anything else to stop");
            int restartConverter = reiniciar.nextInt();
            restart = (restart + restartConverter);
            if (restart == 0){
                System.out.println("The converter will restart");
                }
            else {
                System.out.println("Stopping the converter");
                }
            }
        }
    }

