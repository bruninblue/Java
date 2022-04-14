import java.util.Scanner;

public class EstruRepetDoWhile{
    public static Scanner leia = new Scanner(System.in);
    public static void main(String[] args){

        int contador = 2;
        int num2;

        System.out.println("Digite o primeiro número: ");
        int num1 = leia.nextInt();
        
        do{
            System.out.println("Digite o segundo número: ");
            num2 = leia.nextInt();
            if(num2 == 0){
                System.out.println("Digite o segundo número: ");
                num2 = leia.nextInt();
            }
        }while(num2 == 0);

        System.out.println(num1/num2);
    }
}