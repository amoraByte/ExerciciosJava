package cadastroAnimais.principal;

public class Cachorro extends Animal{

    private String raca;
    private String adestrado;
    private String verificaAdestrado;

    public Cachorro(String nome, int idade, String especie, String sexo, String vacina, String raca, String adestrado) {
        super(nome,idade,sexo,vacina,especie);
        this.raca = raca;
        this.adestrado = adestrado;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getAdestrado() {
        return adestrado;
    }

    public void setAdestrado(String adestrado) {
        this.adestrado = adestrado;

    }

    @Override
    public String toString() {
        return super.toString()+ "\nRaca: " + raca+ "\nÉ adestrado?: " + adestrado;
    }
}
