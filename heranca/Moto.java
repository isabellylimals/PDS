public class Moto {
    protected String cor;
    protected int ano;
    protected String marca;
    
    
        public Moto(String cor, int ano, String marca) {
            this.cor = cor;
            this.ano = ano;
            this.marca = marca;
        }
    
        public String getCor() {
            return cor;
        }
    
    

        public int getAno() {
            return ano;
        }
  
        
    
        public void getAno(int ano) {
            this.ano = ano;
        }
    }
