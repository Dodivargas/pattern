package builder;

import modelo.Pessoa;
import modelo.Atividade;

public class PessoaBuilder {

    private Pessoa pessoa;

    public PessoaBuilder() {
        this.pessoa = new Pessoa();
    }
    public static PessoaBuilder builder(){
        return new PessoaBuilder();
    }

    public PessoaBuilder passandoNome(String nome){
        this.pessoa.setNome(nome);
        return this;
    }
    public PessoaBuilder pelaIdade(Integer idade){
        this.pessoa.setIdade(idade);
        return this;
    }
    public PessoaBuilder criaAtiviade(String nome,String horaInicio,String horaFim,String tipo){
        Atividade atividade = new Atividade();
        atividade.setNome(nome);
        atividade.setHoraIncio(horaInicio);
        atividade.setHoraFim(horaFim);
        atividade.setTipo(tipo);
        this.pessoa.setAtividade(atividade);
        return this;
    }
    public Pessoa build(){
        return this.pessoa;
    }
}
