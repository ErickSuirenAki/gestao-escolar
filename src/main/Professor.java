package main;

import java.util.ArrayList;
import java.util.List;

public class Professor {
	
	private String nomeProfessor;
	private List<Disciplina> disciplinas;
	
	public Professor(String nomeProfessor) {
		this.disciplinas = new ArrayList<Disciplina>();
		this.nomeProfessor = nomeProfessor;
	}
	
	public String getNome() {
		return this.nomeProfessor;
	}
	
	public void adicionarDisciplina(Disciplina disciplina) {
		this.disciplinas.add(disciplina);
	}
	
	public void visualizarNotasAlunos() {
		for (Disciplina d: this.disciplinas) {
			d.verNotas();
		}
	}
	
	public void visualizarAluno(String nomeDisciplina, Aluno aluno) {
		for (Disciplina disciplina : this.disciplinas) {
			if (disciplina.getNomeDisciplina().equalsIgnoreCase(nomeDisciplina)) {
				aluno.exibirHistorico();
			}
		}
	}
	
	public void adicionarNota(Aluno aluno, double nota1, double nota2, int cod) {
		for (Disciplina disc : this.disciplinas) {
			if (disc.getCodigo() == cod) {
				disc.adicionarNotas(aluno, nota1, nota2);
			}
		}
		
	}

}
