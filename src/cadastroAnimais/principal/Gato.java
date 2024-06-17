package cadastroAnimais.principal;

public class Gato extends Animal{
        private String corDoPelo;
        private String castrado;


    public Gato(String nome, int idade, String corDoPelo, String especie, String castrado, String sexo, String vacina) {
        super(nome, idade, sexo, vacina, String.valueOf(especie));
        this.corDoPelo = corDoPelo;
        this.castrado = castrado;
    }

    public String getCorDoPelo() {
        return corDoPelo;
    }

    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
    }

    public String getCastrado() {
        return castrado;
    }

    public void setCastrado(String castrado) {
        this.castrado = castrado;
    }
    @Override
    public String toString() {
        return super.toString()+ "\nCor do pelo: " + corDoPelo+ "\nÉ castrado?: " + castrado;
    }

}//fim da classe gato
