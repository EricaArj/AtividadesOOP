package exercicio04;

public class Medicamento extends Farmacia {
    private String principioAtivo;

    public Medicamento() {
    }

    public Medicamento(Long id, String nome, String nomeComercial, String categoria, Double preco, Integer tipo, String principioAtivo) {
        super(id, nome, nomeComercial, categoria, preco, tipo);
        this.principioAtivo = principioAtivo;
    }

    public String getPrincipioAtivo() {
        return principioAtivo;
    }

    public void setPrincipioAtivo(String principioAtivo) {
        this.principioAtivo = principioAtivo;
    }

    @Override
    public void reajuste(float percentual) {

        this.setPreco(this.getPreco() + ((this.getPreco() * percentual) + 0.1f));

    }
    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println(", " + principioAtivo);
    }
}