package modelo;

public class Pessoa {

    private String nome;
    private Integer idade;

    public Atividade getAtividade() {
        return atividade;
    }

    public void setAtividade(Atividade atividade) {
        this.atividade = atividade;
    }

    private Atividade atividade;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }


    @Override
    public String toString(){
        return "Nome: " + nome + "Idade: " + idade + "modelo.Atividade: " + atividade;
    }

}
