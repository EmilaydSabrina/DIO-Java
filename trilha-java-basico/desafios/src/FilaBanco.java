import java.util.Scanner;

public class FilaBanco {
    public static void main(String[] args) {
        
        String[] nomesFila = new String[3]; 
        Scanner nome = new Scanner(System.in);

        String nome1 = nome.nextLine();
        String nome2 = nome.nextLine();
        String nome3 = nome.nextLine();
        nome.close();

        nomesFila[0] = nome1;
        nomesFila[1] = nome2;
        nomesFila[2] = nome3;

        for(int i = 0; i < nomesFila.length; i++) {
            System.out.println(nomesFila[i] + " - esta na posicao: " + (i+1));
        }
    }

}
