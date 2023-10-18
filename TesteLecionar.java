public class TesteLecionar {
    public static void main(String[] args) {
        ProfessorHorista profHorista = new ProfessorHorista();
        profHorista.setNome("Victor");

        ProfessorPesquisador profPesq = new ProfessorPesquisador();
        profPesq.setNome("Bonarelli");

        profHorista.lecionar();
        profPesq.lecionar();
    }
}
