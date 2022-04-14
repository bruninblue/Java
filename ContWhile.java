import java.util.Scanner;

public class ContWhile{
    public static Scanner leia = new Scanner(System.in);
    public static void main(String[] args){

        int contador = 1; 

        System.out.println("Digite o nome do usuario: ");
        String usuario = leia.next();
        System.out.println("Digite a senha do usuario: ");
        String senha = leia.next();
        while(contador > 0){           
            if(usuario.equals("admin") && senha.equals("c3c")){
                System.out.println("Acesso permitido");
                break;
            }else{
                System.out.println("Informações erradas, digite novamente");
                contador = contador - 1;
                System.out.println("Digite o nome do usuario: ");
                usuario = leia.next();
                System.out.println("Digite a senha do usuario: ");
                senha = leia.next();
            }
            if(contador == 0){
                System.out.println("Acesso bloaqueado");
            }
        }
    }
}