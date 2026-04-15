package main;

public class Diretor extends Usuario{
	
	private double salario;
	private String campus;
	
	
	public Diretor(String nome, String matricula, String cpf, String curso, double salario, String campus) {
		super(nome,matricula,cpf,curso);
		this.salario = salario;
		this.campus = campus;
		
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getCampus() {
		return campus;
	}
	public void setCampus(String campus) {
		this.campus = campus;
	}

	@Override
	public double calculaSalario(int horas, double valorHora) {
		salario = horas*valorHora;
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
