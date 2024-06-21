import java.util.Random;
import java.util.Scanner;

public class GeradorDeSenhas {
    private static final String letrasMaiusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String letrasMinusculas = "abcdefghijklmnopqrstuvwxyz";
    private static final String numeros = "0123456789";
    private static final String caracters = "!@#$%&*-_?";

    private static final String todosCaracters = letrasMaiusculas+letrasMinusculas+numeros+caracters;
    private static final Random random = new Random();

    /**
     * The function generates a random password of a specified length by selecting characters from a
     * predefined set.
     * 
     * @param tamanho The parameter "tamanho" in the method "gerarSenha" represents the length of the
     * password that will be generated. It specifies how many characters the password should have.
     * @return The method `gerarSenha` returns a randomly generated password of the specified length as
     * a String.
     */
    public static String gerarSenha(int tamanho) {
       StringBuilder senha = new StringBuilder(tamanho);

       for (int i = 0; i < tamanho; i++) {
        int index = random.nextInt(todosCaracters.length());
        senha.append(todosCaracters.charAt(index));
       }
       return senha.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nDigite o tamanho desejado para a sua senha:\n");
        int tamanho = scanner.nextInt();

        String senhaGerada = gerarSenha(tamanho);
        System.out.println("A senha gerada foi: "+ senhaGerada);

        scanner.close();
    }
}
