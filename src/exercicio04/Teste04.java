package exercicio04;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste04 {

	public static void main(String[] args) {
		

		Scanner leia = new Scanner(System.in);
		
		ArrayList<Farmacia> medicamentos = new ArrayList<Farmacia>();
		
		long id;
		String nome, nomeComercial, fabricante, foto, opcao;
		float preco;
		
		String principioAtivo;
        String resposta;
		
		do {
			
		System.out.println("\nId: " );
		id = leia.nextLong();
		
		System.out.println("\nNome: " );
		leia.skip("\\R?");
		nome = leia.nextLine();
		
		System.out.println("\nNome Comercial: " );
		nomeComercial = leia.nextLine();
		
		System.out.println("\nFabricante: " );
		fabricante = leia.nextLine();
		
		System.out.println("\nFoto: " );
		foto = leia.nextLine();
		
		System.out.println("\nPreço: " );
		 System.out.println("Tipo: ");
         int tipo = leia.nextInt();

         
		switch (tipo) {
             case 1 -> {
                 System.out.println("Principio Ativo: ");
                 leia.skip("\\R?");
                 principioAtivo = leia.nextLine();
                 medicamento.add(new Medicamento(id, nome, nomeComercial, fabricante, preco, tipo, principioAtivo));
             }
             case 2 ->{
                 System.out.println("Fragância: ");
                 leia.skip("\\R?");
                 String fragrancia = leia.nextLine();
                 medicamento.add(new Perfumaria(id, nome, nomeComercial, fabricante, preco, tipo, fragrancia));
             }
         }
		
		System.out.println("\nDeseja continuar? " );
		leia.skip("\\R?");
		opcao = leia.nextLine();
		
		}while(opcao.equalsIgnoreCase("S"));
		
		
		for(var medicamento : medicamentos)
			medicamento.visualizar();
		
		
		leia.close();
	}

}
