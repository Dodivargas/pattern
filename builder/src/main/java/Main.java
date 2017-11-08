import builder.PessoaBuilder;
import modelo.Pessoa;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = PessoaBuilder.builder()
                        .passandoNome("Macaco")
                        .pelaIdade(20)
                        .criaAtiviade("Nadar","14:00","15:00","Esporte")
                        .build();

        System.out.println(pessoa);

    }
}
