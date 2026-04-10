package main;

import java.util.HashMap;

public class Disciplina {
	
	private String nome;
	private int codigo;
	private Professor professor;
	private HashMap<Aluno, double[]> alunos;
	
	public Disciplina(String nome, int codigo, Professor professor) {
		this.nome = nome;
		this.codigo = codigo;
		this.professor = professor;
		this.alunos = new HashMap<Aluno, double[]>();
		professor.adicionarDisciplina(this);
	}
	
	
	public void exibirDados() {
		System.out.println("Dados da Disciplina: ");
		System.out.println("Nome: " + this.nome);
		System.out.println("Código: " + this.codigo);		
		System.out.println("Professor: " + this.professor.getNome());
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public String getNomeDisciplina() {
		return this.nome;
	}
	
	
	public void adicionarNotas(Aluno aluno, double nota1, double nota2) {
		double notas[] = {nota1, nota2};
		this.alunos.put(aluno, notas);
	}
	
	public void matricularAluno(Aluno aluno) {		
		this.alunos.put(aluno, null);
	}
	
	public void verNotas() {
		for (Aluno aluno : this.alunos.keySet()) {
			aluno.exibirHistorico();
		}
	}
	
	public HashMap<Aluno, double[]> getAlunos(){
		return this.alunos;
	}	
	
	
	public double [] getNotas(Aluno aluno) {
		return this.alunos.get(aluno);
	}
	       
	

}
