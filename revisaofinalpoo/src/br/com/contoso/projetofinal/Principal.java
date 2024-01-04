package br.com.contoso.projetofinal;

import br.com.contoso.dto.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Sistema Contoso!");
		
		// Instanciando objetos
		Funcionario funcionario = new Funcionario();
		
		// Chamar e definir valores para os meus atributos
		funcionario.nome = "Samuel Dias";
		funcionario.cargo = "Programador java";
		funcionario.idade = 17;
		
		System.out.println("Nome:" + funcionario.nome);
		System.out.println("Cargo:" + funcionario.cargo);
		System.out.println("Idade:" + funcionario.idade);

	}

}
