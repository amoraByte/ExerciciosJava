package cadastroAnimais.principal;

public class Animal { //superClasse

        private String nome;
        private String especie;
        private int idade;
        private String sexo;
        private String vacina;
        private String verificaVacina;


    public Animal(String nome, int idade, String sexo, String vacina, String especie) {

        this.nome = nome;
        this.especie = String.valueOf(especie);
        this.idade = idade;
        this.sexo = sexo;
        this.vacina = vacina;
    }

public String getSexo() {
    return sexo;
}

public void setSexo(String sexo) {
    this.sexo = sexo;
}

public String getVacina() {
    return vacina;
}

public void setVacina(String vacina) {
    this.vacina = vacina;

}
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "Nome: " + nome+ "\nEspecie: " + especie+ "\nIdade: " + idade+ "\nSexo: " + sexo + "\nÉ vacinado? : " + vacina;
    }

} //fim classe principal
