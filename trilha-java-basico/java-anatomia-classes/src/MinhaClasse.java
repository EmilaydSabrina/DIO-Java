public class MinhaClasse {

/**
 * @param args
 */
public static void main (String [] args) {
    String primeiroNome = "Emilayd";
    String segundoNome = "Sabrina";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
    System.out.println(nomeCompleto);
   
}

public static String nomeCompleto(String primeiroNome, String segundoNome) {
    return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
}

}
