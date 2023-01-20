import java.util.Scanner;

public class Turno {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Olá, digite o turno que você estuda. Use M-matutino, V-Vespertino ou N- Noturno.");

        char turno = leitor.next().toUpperCase().charAt(0);

        leitor.close();

        if(turno == 'M'){
            System.out.println("Bom Dia!");
        }
        else if(turno == 'V'){
            System.out.println("Boa Tarde!");
        }
        else if(turno == 'N'){
            System.out.println("Boa Noite!");
        }
        else{
            System.out.println("Valor Inválido!");
        }
    }
}
