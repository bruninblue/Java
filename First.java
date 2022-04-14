import java.util.Scanner;

public class First{
    public static Scanner leia = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Digite seu nome: ");
        String nome = leia.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = leia.nextInt();
        System.out.println("Digite sua altura: ");
        float altura = leia.nextFloat();
        System.out.println("Digite seu peso: ");
        double peso = leia.nextDouble();
    
        if(nome = null || idade = null || altura = null || peso = null){
            System.out.println("Algum valor está nulo!!!");
        }else{
            System.out.println("Nome: " + nome + " | Idade: " + idade + " | Altura: " + altura + " | Peso: " + peso);
            System.out.println(String.format("Nome: %s", nome, " Idade: %d", idade, " Altura: %f", altura, " Peso: %f", peso));    
        }
        
    }
}