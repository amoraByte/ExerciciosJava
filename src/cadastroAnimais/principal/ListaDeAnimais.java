package cadastroAnimais.principal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListaDeAnimais {
     private List<Animal> animais;

     public ListaDeAnimais() {
         this.animais = new ArrayList<Animal>();
     } //fim listadeAnimais()

    public void cadastrar(Animal animal) {
         animais.add(animal);
    }
    public void cadastra(Animal animal) {
         animais.add(animal);
    }

    public void listarAnimais()
    {
        if(animais.isEmpty()){
            System.out.println("Nenhum animal cadastrado");
        }
        else{
            animais.sort(new Comparator<Animal>() {
                @Override
                public int compare(Animal o1, Animal o2) {
                    return o1.getNome().compareTo(o2.getNome());
                }
            });
            for (Animal animal : animais) {
                System.out.println("\n"+animal);
            }
        }
    }
}


