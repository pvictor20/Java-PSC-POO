public class TesteConstrutoresPadrao {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Asta", 18);
        Aluno a = new Aluno("Klebinho", 22); //aparece duas vezes pessoa por causa das subclasses, porque aluno extend Pessoa e Aluno
    }
}
