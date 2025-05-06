
import java.util.Scanner;

public class Aluno {
    String nome;
    int matricula;
    float notas[];
  float media;
  String situacao;
  public void setNome(String nome) {
    this.nome = nome;
  }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public void setNotas(float notas[]) {
        this.notas = notas;
    }
    public void setMedia(float media) {
        this.media = media;
    }
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    public String getSituacao() {
        return situacao;
    }
    public float getMedia() {
        return media;
    }
    public float[] getNotas() {
        return notas;
    }
    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
        }
    public void alterarNota() {
        float nota=0;
        int escolhanota=0;
      Scanner sc= new Scanner(System.in);
       
        System.out.println("Escolha a nota que deseja alterar: 1, 2 ou 3? ");   
        escolhanota= sc.nextInt();

      if (escolhanota == 1) {
        System.out.println("Digite a nota que deseja alterar: ");
        nota = sc.nextFloat();
        notas[0] = nota;
        }
        if(escolhanota == 2) {
            System.out.println("Digite a nota que deseja alterar: ");
            nota = sc.nextFloat();
            notas[1] = nota;
        }
        if(escolhanota == 3) {
            System.out.println("Digite a nota que deseja alterar: ");
            nota = sc.nextFloat();
            notas[2] = nota;
           }}}

