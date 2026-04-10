package main;

public class Turma {
	
	private String turno;
	private int id;
	private static int totalAlunos = 0;
	private boolean estaLotada;
	private Aluno [] alunos;
	private int cont=0;
	
	public Turma(String turno, int id) {
		this.turno = turno;
		this.id = id;
		this.alunos = new Aluno[5];
		this.estaLotada = false;
	}
	
	public void adicionarAluno(Aluno aluno) {
		this.alunos[cont] = aluno;
		cont++;
		totalAlunos++;
		if (cont > 4) {
			this.estaLotada=true;
		}
	}
	
	public int getTotalAlunos() {
		return totalAlunos;
	}
	
	public void exibirRelatorio() {
		System.out.println("Turma: " + this.turno);
		System.out.println("Está lotada? " +  this.estaLotada);
		System.out.println("Quantidade de alunos matriculados: " + this.cont);
	}
	

}
