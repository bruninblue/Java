import java.util.Scanner;
public class Ex1{
    public static Scanner leia = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Quer quantas maçãs meu nobre? ");
        int num = leia.nextInt();

        if(num < 12){
            System.out.println("O número de maçãs é " + num);
            System.out.println("O valor a pagar será: " + " R$" +(num * 2.50) + " conto.");
        }else{
            System.out.println("O número de maçãs é: " + num);
            System.out.println("O valor a pagar será " + " R$" +(num * 1.90) + " conto.");        }
    }
}