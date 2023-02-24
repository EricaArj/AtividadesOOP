package exercicio02;

import java.util.Locale;

public class Funcionario {

    private String nome;
    private String matricula;
    private String cargo;
    private Double salario;
    private Integer cargaHoraria;

    public Funcionario() {
    }

    public Funcionario(String nome, String matricula, String cargo, Double salario, Integer cargaHoraria) {
        this.nome = nome;
        this.matricula = matricula;
        this.cargo = cargo;
        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    public void visualizar() {
    	System.out.println("Nome: " +this.nome);
    	System.out.println("Numero de Matricula: " +this.matricula);
    	System.out.println("Cargo: " +this.cargo);
    	System.out.println("Salario: " +this.salario);
    	System.out.println("CargaHaria: " +this.cargaHoraria);
    }
   
}
