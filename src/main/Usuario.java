package main;

public class Usuario {
	
	protected String nome;
	protected String matricula;
	private String cpf;
	private String curso;
	protected String titulacao;
	
	public Usuario(String nome, String matricula, String cpf, String curso) {
		this.curso = curso;
		this.matricula = matricula;
		this.cpf = cpf;
		this.nome = nome;
	}
	
	
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getMatricula() {
		return matricula;
	}



	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public String getCurso() {
		return curso;
	}



	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
	public String getTitulacao() {
	    return titulacao;
	}

	public void setTitulacao(String titulacao) {
	    this.titulacao = titulacao;
	}


	public void exibirRelatorio() {
		System.out.println("*******Dados do usuário********");
		System.out.println("Nome: " + this.nome);
		System.out.println("Matrícula: " + this.matricula);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Curso: " + this.curso);
	}
	
	
	public double calculaSalario(int horas, double valorHora) {
		return 0;
	}

}
