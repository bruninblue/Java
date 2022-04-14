import java.util.Scanner;

public class ContFor{
    public static Scanner leia = new Scanner(System.in);
    public static void main(String[] args){
        
        for(int i = 0; i < 3; i++){
            System.out.println("Digite o nome do usuario: ");
            String usuario = leia.next();
            System.out.println("Digite a senha do usuario: ");
            String senha = leia.next();
            if(usuario.equals("admin") && senha.equals("c3c")){
                System.out.println("Acesso permitido");
                break;
            }else{
                if(i < 3){
                    System.out.println("Acesso bloqueado");
                }else{
                    System.out.println("Informações erradas, digite novamente");
                }
            }
        }
    }
}