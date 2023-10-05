package crudHeranca;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		
		ArrayList<Funcionarios> funcionario = new ArrayList<Funcionarios>();
		
		System.out.println("-------Testando e adicionando itens na ArrayList-------" + "\n");
			
			funcionario.add(new Funcionarios("João Marcos", 75000.0));
			funcionario.add(new Funcionarios("Lua Bitencourt", 7000.0));
			funcionario.add(new Funcionarios("Tânia Azevedo", 2300.0));
			funcionario.add(new Funcionarios("Amauri Peixoto", 6520.0));
			funcionario.add(new Funcionarios("Gael Moura", 25000.0));
			funcionario.add(new Funcionarios("Reidson Negreiros", 2500.0));
			
			for (Funcionarios func : funcionario) {
				System.out.println("Nome: " + func.getNome() +"\n" + "Salário: " + func.getSalario());
				System.out.println(" ");
			}
			
		System.out.println("-------Testando o método de consulta aos itens da ArrayList-------" + "\n");
			
			System.out.println("Nome: " + funcionario.get(0).getNome() + "\n" );
			System.out.println("Nome: " + funcionario.get(1).getNome() + "\n" );
			System.out.println("Nome: " + funcionario.get(2).getNome() + "\n" );
			System.out.println("Nome: " + funcionario.get(3).getNome() + "\n" );
			System.out.println("Nome: " + funcionario.get(4).getNome() + "\n" );
			System.out.println("Nome: " + funcionario.get(5).getNome() + "\n" );
			
		System.out.println("-------Testando o método de alteração com os itens da ArrayList-------" + "\n");	
		
			System.out.println("  Alterando o nome do terceiro item(2), consultado anteriormente! " + "\n");

				funcionario.get(2).setNome("Italo Senna");
				
				System.out.println("Nome: " + funcionario.get(0).getNome() + "\n" );
				System.out.println("Nome: " + funcionario.get(1).getNome() + "\n" );
				System.out.println("Nome: " + funcionario.get(2).getNome() + "\n" );
				System.out.println("Nome: " + funcionario.get(3).getNome() + "\n" );
				System.out.println("Nome: " + funcionario.get(4).getNome() + "\n" );
				System.out.println("Nome: " + funcionario.get(5).getNome() + "\n" );
				
			System.out.println("  Alterando o nome do quarto item(3), consultado anteriormente! " + "\n");

				funcionario.get(3).setNome("Diego Souza");
				
				System.out.println("Nome: " + funcionario.get(0).getNome() + "\n" );
				System.out.println("Nome: " + funcionario.get(1).getNome() + "\n" );
				System.out.println("Nome: " + funcionario.get(2).getNome() + "\n" );
				System.out.println("Nome: " + funcionario.get(3).getNome() + "\n" );
				System.out.println("Nome: " + funcionario.get(4).getNome() + "\n" );
				System.out.println("Nome: " + funcionario.get(5).getNome() + "\n" );
			
			System.out.println("  Alterando os salários dos nomes alterados anteriormente! " + "\n");
			
				System.out.println(" Eram: " + "\n");
				
				System.out.println("Salário: " + funcionario.get(2).getSalario() + "\n" );
				System.out.println("Salário: " + funcionario.get(3).getSalario() + "\n" );
				
				System.out.println(" Foram atualizados para: " + "\n");
			
				funcionario.get(2).setSalario(5000.0);
				funcionario.get(3).setSalario(11000.0);
				
				System.out.println("Salário: " + funcionario.get(2).getSalario() + "\n" );
				System.out.println("Salário: " + funcionario.get(3).getSalario() + "\n" );
				
			System.out.println("-------Consultando todo o ArrayList com os nomes e salários atualizados-------" + "\n");

				for (Funcionarios func : funcionario) {
					System.out.println("Nome: " + func.getNome() +"\n" + "Salário: " + func.getSalario());
					System.out.println(" ");
					}
				
			System.out.println("-------Testando o metodo exclusão com os itens da ArrayList-------" + "\n");
			
				System.out.println("Removendo o sexto e último item(5) do ArrayList" + "\n");
				
					funcionario.remove(5);
					
					for (Funcionarios func : funcionario) {
						System.out.println("Nome: " + func.getNome() +"\n" + "Salário: " + func.getSalario());
						System.out.println(" ");
						}
					
				
				
				
				}
				
	

}
