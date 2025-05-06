// Exercício
//  • Crie 3 classes:– Moto– Carro– Caminhao
//  • Cada classe deve conter 3 atributos
//  • Na primeira coloque todos os atributos public, na  
// segunda protected e na terceira private
//  • Crie uma classe de teste em outro pacote que crie  um 
// objeto de cada uma dessas 3 classes
//  • Altere os valores dos atributos dos 3 objetos criados e 
// observe os resultados

public class Carro {
    public String cor;
    public int ano;
    public String marca;
   

    public Carro(String cor, int ano, String marca) {
        this.cor = cor;
        this.ano = ano;
        this.marca = marca;
    }
    public String getCor() {
        return cor;
    }
  public  String getMarca() {
        return marca;
    }
    public int getAno() {
        return ano;
    }

}
