package main;

public class Main {

    public static void main(String[] args) {

        // =========================
        // 1) Criando escola
        // =========================
        Escola escola = new Escola();

        // =========================
        // 2) Criando professor
        // =========================
        Professor professor = new Professor("Carlos Silva");

        // =========================
        // 3) Criando disciplinas
        // =========================
        Disciplina poo = new Disciplina("Programação Orientada a Objetos", 101, professor);
        Disciplina ed = new Disciplina("Estrutura de Dados", 102, professor);
        Disciplina bd = new Disciplina("Banco de Dados", 103, professor);

        // =========================
        // 4) Criando alunos
        // =========================
        Aluno aluno1 = new Aluno("Ana Souza", "2024001", "111.111.111-11", "Computação", 10);
        Aluno aluno2 = new Aluno("Bruno Lima", "2024002", "222.222.222-22", "Computação", 20);
        Aluno aluno3 = new Aluno("Carla Mendes", "2024003", "333.333.333-33", "Computação", 30);

        // =========================
        // 5) Matriculando alunos na escola
        // =========================
        escola.matricularAluno(aluno1);
        escola.matricularAluno(aluno2);
        escola.matricularAluno(aluno3);

        System.out.println("===== ALUNOS MATRICULADOS NA ESCOLA =====");
        escola.listarAlunosMatriculados();

        // =========================
        // 6) Exibindo relatório do usuário
        // =========================
        System.out.println("\n===== RELATÓRIO DE USUÁRIO =====");
        aluno1.exibirRelatorio();

        // =========================
        // 7) Testando getters e setters de Usuario
        // =========================
        System.out.println("\n===== TESTE DE GETTERS/SETTERS =====");
        System.out.println("Nome original: " + aluno1.getNome());
        aluno1.setNome("Ana Clara Souza");
        System.out.println("Novo nome: " + aluno1.getNome());

        System.out.println("Matrícula original: " + aluno1.getMatricula());
        aluno1.setMatricula("2024999");
        System.out.println("Nova matrícula: " + aluno1.getMatricula());

        System.out.println("CPF original: " + aluno1.getCpf());
        aluno1.setCpf("999.999.999-99");
        System.out.println("Novo CPF: " + aluno1.getCpf());

        System.out.println("Curso original: " + aluno1.getCurso());
        aluno1.setCurso("Sistemas de Informação");
        System.out.println("Novo curso: " + aluno1.getCurso());

        // voltando matrícula para manter coerência
        aluno1.setMatricula("2024001");
        aluno1.setCurso("Computação");

        // =========================
        // 8) Matrícula dos alunos nas disciplinas
        // =========================
        aluno1.realizarMatricula(poo);
        aluno1.realizarMatricula(ed);

        aluno2.realizarMatricula(poo);
        aluno2.realizarMatricula(bd);

        aluno3.realizarMatricula(ed);
        aluno3.realizarMatricula(bd);

        // =========================
        // 9) Exibindo dados da disciplina
        // =========================
        System.out.println("\n===== DADOS DAS DISCIPLINAS =====");
        poo.exibirDados();
        System.out.println();
        ed.exibirDados();
        System.out.println();
        bd.exibirDados();

        // =========================
        // 10) Lançando notas
        // =========================
        professor.adicionarNota(aluno1, 8.0, 7.5, 101);
        professor.adicionarNota(aluno1, 6.0, 5.5, 102);

        professor.adicionarNota(aluno2, 9.0, 8.5, 101);
        professor.adicionarNota(aluno2, 7.0, 6.0, 103);

        professor.adicionarNota(aluno3, 4.0, 5.0, 102);
        professor.adicionarNota(aluno3, 10.0, 9.0, 103);

        // =========================
        // 11) Histórico dos alunos
        // =========================
        System.out.println("\n===== HISTÓRICO DO ALUNO 1 =====");
        aluno1.exibirHistorico();

        System.out.println("\n===== HISTÓRICO DO ALUNO 2 =====");
        aluno2.exibirHistorico();

        System.out.println("\n===== HISTÓRICO DO ALUNO 3 =====");
        aluno3.exibirHistorico();

        // =========================
        // 12) Professor visualizando um aluno
        // =========================
        System.out.println("\n===== PROFESSOR VISUALIZANDO ALUNO EM UMA DISCIPLINA =====");
        professor.visualizarAluno("Programação Orientada a Objetos", aluno1);

        // =========================
        // 13) Professor visualizando notas de todos
        // =========================
        System.out.println("\n===== PROFESSOR VISUALIZANDO NOTAS DE TODOS OS ALUNOS =====");
        professor.visualizarNotasAlunos();

        // =========================
        // 14) Testando conceito diretamente
        // =========================
        System.out.println("\n===== TESTE DE CONCEITOS =====");
        System.out.println("Média 8.0 -> " + aluno1.exibirConceito(8.0));
        System.out.println("Média 6.0 -> " + aluno1.exibirConceito(6.0));
        System.out.println("Média 4.0 -> " + aluno1.exibirConceito(4.0));

        // =========================
        // 15) Testando turma
        // =========================
        Turma turmaManha = new Turma("Manhã", 1);
        turmaManha.adicionarAluno(aluno1);
        turmaManha.adicionarAluno(aluno2);
        turmaManha.adicionarAluno(aluno3);

        System.out.println("\n===== RELATÓRIO DA TURMA =====");
        turmaManha.exibirRelatorio();
        System.out.println("Total geral de alunos nas turmas: " + turmaManha.getTotalAlunos());

        // =========================
        // 16) Acesso ao mapa de alunos da disciplina
        // =========================
        System.out.println("\n===== QUANTIDADE DE ALUNOS EM POO =====");
        System.out.println("Total: " + poo.getAlunos().size());

        System.out.println("\n===== NOTAS DO ALUNO 1 EM POO PELO getNotas() =====");
        double[] notasAluno1Poo = poo.getNotas(aluno1);
        System.out.println("Nota 1: " + notasAluno1Poo[0]);
        System.out.println("Nota 2: " + notasAluno1Poo[1]);

        // =========================
        // 17) Métodos visualizarNotaDisciplina
        // =========================
        
        aluno1.visualizarNotaDisciplina("Programação Orientada a Objetos");
        aluno1.visualizarNotaDisciplina(101);
    }
}