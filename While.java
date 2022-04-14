import java.util.Scanner;

public class While{
    public static Scanner leia = new Scanner(System.in);
    public static void main(String[] args){

        System.out.println("Digite o primeiro número: ");
        int num1 = leia.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = leia.nextInt();

        while(num2 == 0){
            System.out.println("O segundo número é zero, digite um número diferente de zero: ");
            num2 = leia.nextInt();;
        }

        System.out.println(num1/num2);
    }
}