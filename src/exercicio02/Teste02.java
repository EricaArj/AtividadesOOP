package exercicio02;

import java.util.Locale;

public class Teste02 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Funcionario f1 = new Funcionario("Samuel","35690","Jonalista",5000.00,74);

        Funcionario f2 = new Funcionario("Maria Julia","98400","Desenvolvedor FullStack Java",10000.00,10);

        f1.visualizar();
        f2.visualizar();
    }
}
