import java.util.Scanner;
public class Ex2{
    public static Scanner leia = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Digite a hora de início do jogo: ");
        int horaInicio = leia.nextInt();
        System.out.println("Digite o horário de términio do jogo: ");
        int horaTerminio = leia.nextInt();

        if(horaInicio < 24 && horaTerminio < 24){
            if(horaInicio > horaTerminio){
                System.out.println("A duração de jogo foi " + ((24-horaInicio)+horaTerminio) + " horas.");
            }else if(horaInicio < horaTerminio){
                System.out.println("A duração do jogo foi " + (horaTerminio-horaInicio) + " horas.");
            }
        }else{
            System.out.println("O horário informado não é valido!!!");
        }
    }
}