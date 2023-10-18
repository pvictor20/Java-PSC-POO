public class Pessoa {

    private String nome; //botao direito em nome depois em source action depois getters and setters
    private int idade;

    //public Pessoa(){
        //System.out.println("Construindo pessoa...");
    //}

    public Pessoa (String nome, int idade){
        System.out.println("Construindo pessoa...");
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    

    
}
