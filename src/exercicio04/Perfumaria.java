package exercicio04;

public class Perfumaria extends Farmacia {

    private String fragancia;

    public Perfumaria() {
    }

    public Perfumaria(Long id, String nome, String nomeComercial, String categoria, Double preco, Integer tipo, String fragancia) {
        super(id, nome, nomeComercial, categoria, preco, tipo);
        this.fragancia = fragancia;
    }

    public String getFragancia() {
        return fragancia;
    }

    public void setFragancia(String fragancia) {
        this.fragancia = fragancia;
    }

    @Override
    public void reajuste(float percentual) {

        this.setPreco(this.getPreco() + (this.getPreco() * percentual));
    }
    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println(", " + fragancia);
    }
}
