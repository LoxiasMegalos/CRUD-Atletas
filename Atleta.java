public abstract class Atleta {
    
    protected String nome;
    protected int idade;

    public Atleta(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
