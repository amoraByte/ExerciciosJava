package cadastroAnimais.principal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>();
        Scanner leitura  = new Scanner(System.in);
        String opcao;

        do{
            System.out.println("Digite o nome do animal: ");
            String nome = leitura.nextLine();

            System.out.println("Digite a idade do animal: ");
            int idade = leitura.nextInt();

            System.out.println("Digite a sexo do animal: ");
            String sexo = leitura.nextLine();

            System.out.println("O animal é vacinado? (se for vacinado digite sim, se não for vacinado deixe vazio)");
            String vacina = leitura.nextLine();

            System.out.println("Digite a espécie do animal: ");
            String especie = leitura.nextLine();

            if(especie.equalsIgnoreCase("gato")){

                System.out.println("digite a cor do pelo do aniimal: ");
                String corDoPelo = leitura.nextLine();

                System.out.println("O gato é castrado? ");
                String castrado = leitura.nextLine();

                Gato gato = new Gato(nome,idade,corDoPelo,especie,castrado,sexo,vacina);

            }
            else if (especie.equalsIgnoreCase("cachorro") || especie.equalsIgnoreCase("cao")){
                System.out.println("Informe a raça do cachoro: ");
                String raca = leitura.nextLine();

                System.out.println("O cachorro é adestrado? ");
                String adestrado = leitura.nextLine();

                Cachorro cachorro = new Cachorro(nome,idade,especie,sexo,vacina,raca,adestrado);

            }

            System.out.println("Cadastrar mais algum animal? (s/n) ");
            opcao = leitura.nextLine();

        }while(opcao.equalsIgnoreCase("s"));

        System.out.println("Animais cadastrados: ");
        for(Animal animal: animais){
            System.out.println(animal);
        }
    }
}
