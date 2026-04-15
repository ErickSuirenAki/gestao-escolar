package main;

public class Main {

    public static void main(String[] args) {

        // =========================
        // 1) Criando escola
        // =========================
        Escola escola = new Escola();

        // =========================
        // 2) Criando professor (AGORA COM HERANÇA)
        // =========================
        Professor professor = new Professor("Carlos Silva", "1001", "111.111.111-11", "Computação", "mestrado");

        // =========================
        // 3) Criando diretor
        // =========================
        Diretor diretor = new Diretor(
                "Marcos Paulo", "2001", "999.999.999-99", "Administração", 0, "Campus Centro"
        );
        diretor.setTitulacao("doutorado");

        // =========================
        // 4) Criando disciplinas
        // =========================
        Disciplina poo = new Disciplina("Programação Orientada a Objetos", 101, professor);
        Disciplina ed = new Disciplina("Estrutura de Dados", 102, professor);
        Disciplina bd = new Disciplina("Banco de Dados", 103, professor);

        // =========================
        // 5) Criando alunos (AGORA COM BOLSISTA)
        // =========================
        Aluno aluno1 = new Aluno("Ana Souza", "2024001", "111.111.111-11", "Computação", true);
        Aluno aluno2 = new Aluno("Bruno Lima", "2024002", "222.222.222-22", "Computação", false);
        Aluno aluno3 = new Aluno("Carla Mendes", "2024003", "333.333.333-33", "Computação", true);

        // =========================
        // 6) Matriculando alunos na escola
        // =========================
        escola.matricularAluno(aluno1);
        escola.matricularAluno(aluno2);
        escola.matricularAluno(aluno3);

        System.out.println("===== ALUNOS MATRICULADOS NA ESCOLA =====");
        escola.listarAlunosMatriculados();

        // =========================
        // 7) Matrícula dos alunos nas disciplinas
        // =========================
        aluno1.realizarMatricula(poo);
        aluno1.realizarMatricula(ed);

        aluno2.realizarMatricula(poo);
        aluno2.realizarMatricula(bd);

        aluno3.realizarMatricula(ed);
        aluno3.realizarMatricula(bd);

        // =========================
        // 8) Lançando notas
        // =========================
        professor.adicionarNota(aluno1, 8.0, 7.5, 101);
        professor.adicionarNota(aluno1, 6.0, 5.5, 102);

        professor.adicionarNota(aluno2, 9.0, 8.5, 101);
        professor.adicionarNota(aluno2, 7.0, 6.0, 103);

        professor.adicionarNota(aluno3, 4.0, 5.0, 102);
        professor.adicionarNota(aluno3, 10.0, 9.0, 103);

        // =========================
        // 9) Histórico dos alunos
        // =========================
        System.out.println("\n===== HISTÓRICO DO ALUNO 1 =====");
        aluno1.exibirHistorico();

        // =========================
        // 10) TESTE DE SALÁRIOS
        // =========================
        System.out.println("\n===== TESTE DE SALÁRIOS =====");

        double salProf = professor.calculaSalario(40, 50);
        System.out.println("Salário Professor: " + salProf);

        double salDiretor = diretor.calculaSalario(40, 80);
        System.out.println("Salário Diretor: " + salDiretor);

        double salAluno1 = aluno1.calculaSalario(20, 30);
        double salAluno2 = aluno2.calculaSalario(20, 30);

        System.out.println("Aluno 1 (bolsista): " + salAluno1);
        System.out.println("Aluno 2 (não bolsista): " + salAluno2);

        // =========================
        // 11) Professor visualizando notas
        // =========================
        System.out.println("\n===== PROFESSOR VISUALIZANDO NOTAS =====");
        professor.visualizarNotasAlunos();

        // =========================
        // 12) Turma
        // =========================
        Turma turmaManha = new Turma("Manhã", 1);
        turmaManha.adicionarAluno(aluno1);
        turmaManha.adicionarAluno(aluno2);
        turmaManha.adicionarAluno(aluno3);

        System.out.println("\n===== RELATÓRIO DA TURMA =====");
        turmaManha.exibirRelatorio();

        // =========================
        // 13) Teste direto disciplina
        // =========================
        System.out.println("\n===== NOTAS DO ALUNO 1 EM POO =====");
        double[] notas = poo.getNotas(aluno1);
        System.out.println("Nota 1: " + notas[0]);
        System.out.println("Nota 2: " + notas[1]);
    }
}