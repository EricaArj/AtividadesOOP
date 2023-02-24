package exercicio01;

public class PessoaJuridica extends Cliente01 {

    private String cpf;

    public PessoaJuridica(String nome, String telefone, Integer idade, String email, String endereco, Integer tipo, String cpf) {
        super(nome, telefone, idade, email, endereco, tipo);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println(", " + cpf);
    }
}