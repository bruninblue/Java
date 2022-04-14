import java.util.Scanner;

public class ContDoWhile{
    public static Scanner leia = new Scanner(System.in);
    public static void main(String[] args){
        
        int contador = 1;
        System.out.println("Digite o nome do usuario: ");
        String usuario = leia.next();
        System.out.println("Digite a senha do usuario: ");
        String senha = leia.next();

        do{
            contador = contador - 1;
            
            if(usuario.equals("admin") && senha.equals("c3c")){
                System.out.println("Acesso permitido");
                break;

            }else if(usuario != "admin" || senha != "c3c"){
                System.out.println("Você digitou alguma informação errada, digite-as novamenteo");
           
                System.out.println("Digite o nome do usuario: ");
                usuario = leia.next();
                System.out.println("Digite a senha do usuario: ");
                senha = leia.next();
            }

            if(contador == 0){
                System.out.println("Seu acesso foi bloqueado");
            }
        }while(contador > 0);
        
    }
}