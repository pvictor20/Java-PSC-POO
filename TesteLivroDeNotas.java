import javax.swing.JOptionPane;

public class TesteLivroDeNotas {
    public static void main(String[] args) {
        LivroDeNotas livro = new LivroDeNotas();
        livro.setNomeDoCurso(JOptionPane.showInputDialog("Qual o nome do curso?"));
        livro.exibirMensagem(livro.getNomeDoCurso());
    }
}
