public class DemoTransportes {
    public static void main(String[] args) {
       
        Carro carro = new Carro("Vermelho", 2020, "Fusca");
        System.out.println("Carro: " + carro.getCor() + ", " + carro.getAno() + ", " + carro.marca);
        
       
        Moto moto = new Moto("Preto", 2019, "Honda");
        System.out.println("Moto: " + moto.getCor() + ", " + moto.getAno() + ", " + moto.marca);
        
        
        Caminhao caminhao = new Caminhao("Branco", 2021, "Volvo");
        System.out.println("Caminhão: " + caminhao.getCor() + ", " + caminhao.getAno() + ", " + caminhao.getMarca());
    }
}
