import java.util.Scanner;

public class PercentualDesconto {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
		
    int M = input.nextInt();
    int S = input.nextInt();
    input.close();

    double desconto = ((double)(M-S)/M)*100;
    System.out.println("O desconto foi de " + (int)desconto + "%");
    }
     
}
