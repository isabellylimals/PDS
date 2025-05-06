public class Cachorro {
   String nome;
   String raca;
    int idade;

    public Cachorro(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }
    public String informarEstado(){
        
        return nome + " " + raca + " " + idade;
    }
    void clonarCachorro(Cachorro cachorro2){
       
    }
}
