package main;

import java.util.HashMap;

public class Escola {
	
	private HashMap<String, Aluno> alunos;
	
	public Escola() {
		this.alunos = new HashMap<String, Aluno>();
	}
	
	public void matricularAluno(Aluno aluno) {
		if (!alunos.containsKey(aluno.getMatricula())) {
			this.alunos.put(aluno.getMatricula(), aluno);
		}
	}
	
	public void listarAlunosMatriculados() {
		for (String matricula : this.alunos.keySet()) {
			Aluno aluno = this.alunos.get(matricula);
			aluno.exibirDados();
		}
	}

}
