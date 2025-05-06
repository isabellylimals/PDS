public class Demoaluno{
    public static void main(String args[]){
        Aluno aluno= new Aluno();
        aluno.setNome("Lucas");
        aluno.setMatricula(123456);
        aluno.setNotas(new float[]{10, 9, 8});
        aluno.setMedia(9.0f);
        aluno.setSituacao("Aprovado");
        
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Matricula: " + aluno.getMatricula());
        System.out.println("Notas: " + aluno.getNotas()[0] + ", " + aluno.getNotas()[1] + ", " + aluno.getNotas()[2]);
        System.out.println("Media: " + aluno.getMedia());
        System.out.println("Situacao: " + aluno.getSituacao());
        aluno.alterarNota();
        System.out.println("Notas apos alteracao: " + aluno.getNotas()[0] + ", " + aluno.getNotas()[1] + ", " + aluno.getNotas()[2]);
    }
   
}