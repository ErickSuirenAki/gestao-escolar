package main;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Usuario {
	
	private List<Disciplina> disciplinas;
	
	public Professor(String nome, String matricula, String cpf, String curso, String titulacao) {
		super(nome,matricula,cpf,curso);
		this.disciplinas = new ArrayList<Disciplina>();
		 this.setTitulacao(titulacao);
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
	
	@Override
	public double calculaSalario(int horas, double valorHora) {
		double salario = horas*valorHora;
		if(getTitulacao().equalsIgnoreCase("especialização")) {
			double retribuicao = (horas*valorHora)*0.05;
			salario+= retribuicao;
			return salario;
		}
		else if(getTitulacao().equalsIgnoreCase("mestrado")) {
			double retribuicao = (horas*valorHora)*0.15;
			salario+= retribuicao;
			return salario;
		}
		else if(getTitulacao().equalsIgnoreCase("doutorado")) {
			double retribuicao = (horas*valorHora)*0.30;
			salario+= retribuicao;
			return salario;
		}
		else {
			return salario;
		}
		
	}

}
