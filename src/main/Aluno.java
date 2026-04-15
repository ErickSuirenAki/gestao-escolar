package main;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Usuario{
	

	private List<Disciplina> disciplinas;
	private boolean bolsista;

	
	public Aluno(String nome, String matricula, String cpf, String curso, boolean bolsista) {
		super(nome, matricula, cpf, curso);
		this.disciplinas = new ArrayList<Disciplina>();
		this.bolsista = bolsista;
	}	
	

	
	public boolean isBolsista() {
		return bolsista;
	}



	public void setBolsista(boolean bolsista) {
		this.bolsista = bolsista;
	}



	public void realizarMatricula(Disciplina disciplina) {
		if (this.disciplinas.size() < 6) {
			this.disciplinas.add(disciplina);
			disciplina.matricularAluno(this);
		}
		
	}
	
	public int getTotalDisciplinas() {
		return this.disciplinas.size();
	}	
	
	private double calcularMedia(double nota1, double nota2) {
		return (nota1+nota2)/2;
	}
	
	public String exibirConceito(double media) {
		String conceito;
		if (media >= 7 && media <= 10) {
			conceito = "Aprovado";
		}else if (media < 7 && media >= 5) {
			conceito = "Final";
		}else {
			conceito = "Reprovado";
		}
		return conceito;
		
	}	
	
	public void exibirHistorico() {
		System.out.println("---Histórico Escolar---");
		System.out.println("Aluno: " + this.nome);
		for (Disciplina disc : this.disciplinas) {			
			System.out.println("Código: " + disc.getCodigo());
			System.out.println("Nome da disciplina: " + disc.getNomeDisciplina());
			double [] notas = disc.getNotas(this);
			double media = this.calcularMedia(notas[0], notas[1]);
			System.out.println("Média: " + media);
			System.out.println("Conceito: " + this.exibirConceito(media));			
		}
		
	}
	
	public void exibirDados() {
		System.out.println("Nome do aluno: " + this.nome);
		System.out.println("Matrícula: " + this.matricula);
		System.out.println("Quantidade de disciplinas matriculadas: " + this.getTotalDisciplinas());
	}
	
	public void visualizarNotaDisciplina(String nome) {
		for (Disciplina disc : this.disciplinas) {
			if (disc.getNomeDisciplina().equalsIgnoreCase(nome)) {
				System.out.println("Disciplina: " + nome);
				System.out.println("Notas: " + disc.getNotas(this)[0] + "\t" +
						disc.getNotas(this)[1]);
			}
		}
		
	}
	
	public void visualizarNotaDisciplina(int codigo) {
		for (Disciplina disc : this.disciplinas) {
			if (disc.getCodigo() == codigo) {
				System.out.println("Disciplina: " + nome);
				System.out.println("Notas: " + disc.getNotas(this)[0] + "\t" +
						disc.getNotas(this)[1]);
			}
		}
	}
	
	@Override	
	public double calculaSalario(int horas, double valorHora) {
		if(!isBolsista()) {
			return 0;
			
		}
			return horas*valorHora;
		
	}
	
	
	

}
