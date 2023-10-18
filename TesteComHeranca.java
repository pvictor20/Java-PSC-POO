public class TesteComHeranca extends Aluno{
    public static void main(String[] args) {
        var aluno = new AlunoDeGraduacao();
        aluno.setNome("Vito");
        aluno.setIdade(21);
        System.out.printf("Nome: %s, idade: %d", aluno.getNome(), aluno.getIdade());
    }
}
