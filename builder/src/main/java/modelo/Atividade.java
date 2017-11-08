package modelo;

public class Atividade {


    private String nome;
    private String horaIncio;
    private String horaFim;
    private String tipo;


    public Atividade() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHoraIncio() {
        return horaIncio;
    }

    public void setHoraIncio(String horaIncio) {
        this.horaIncio = horaIncio;
    }

    public String getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(String horaFim) {
        this.horaFim = horaFim;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    @Override
    public String toString(){
        return "nomeAtividade: " + nome + "HoraInicio: " + horaIncio + "horaFim: " + horaFim + "Tipo: " + tipo;
    }
}