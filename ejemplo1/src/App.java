import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);

        System.out.println("Ingresa num1");
        int num1=sc.nextInt();

        System.out.println("Ingresa num2");
        int num2=sc.nextInt();

        int resultado=num1+num2;

        System.out.println("El resultado es: "+resultado);
        sc.close();
    }
}

