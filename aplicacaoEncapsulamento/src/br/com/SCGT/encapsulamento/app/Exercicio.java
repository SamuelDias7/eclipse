package br.com.SCGT.encapsulamento.app;

import br.com.SCGT.encapsulamento.bo.Aluno;

public class Exercicio {
	
	public static void main(String[]args) {
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome("Samuel");
		aluno1.setMatricula(12383);
		aluno1.setSerie(3);
		aluno1.setTurma("D");
		
		
		System.out.println(aluno1.getNome());
		System.out.println(aluno1.getMatricula());
		System.out.println(aluno1.getSerie());
		System.out.println(aluno1.getTurma());
		
		
	}
	
	
	
	
	
	
	

}
