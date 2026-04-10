# Gestão Escolar

Sistema desenvolvido na disciplina de Programação Orientada a Objetos (POO), ministrada pelo Prof. Lucas Marques.

## Objetivo do Sistema

O objetivo do sistema é simular uma gestão escolar simples, permitindo:

- cadastrar alunos e professores;
- matricular alunos na escola e em disciplinas;
- associar disciplinas a professores;
- lançar e consultar notas;
- exibir histórico escolar e conceitos dos alunos;
- organizar alunos em turmas.


## Tecnologias Utilizadas

- Java
- Programação Orientada a Objetos
- Coleções (`ArrayList` e `HashMap`)
- Encapsulamento, herança e associação entre classes

## Classes do Projeto

- `Usuario`: classe base com os dados do usuário.
- `Aluno`: representa os alunos e suas matrículas.
- `Professor`: representa os professores e o lançamento de notas.
- `Disciplina`: controla alunos matriculados e notas.
- `Escola`: gerencia os alunos cadastrados.
- `Turma`: organiza os alunos por turno.
- `Main`: utilizada para testar todas as funcionalidades do sistema.

## Funcionalidades Implementadas

- Cadastro de alunos
- Cadastro de professores
- Criação de disciplinas
- Matrícula em disciplinas
- Registro de notas
- Consulta de histórico escolar
- Cálculo de média e conceito
- Controle de lotação de turma
