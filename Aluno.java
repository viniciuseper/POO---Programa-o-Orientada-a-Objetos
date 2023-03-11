package NotasAlunos;

public class Aluno {

    private String nome;
    private String matricula;
    private double notaAV1, notaAV2, notaAE;
    private String curso;
    private int periodo;
    private double somaNota;
    public Aluno(String nome, String matricula, double notaAV1, double notaAV2, String curso, int periodo) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaAV1 = notaAV1;
        this.notaAV2 = notaAV2;
        this.curso = curso;
        this.periodo = periodo;
    }
    public void alterarAV1(double nota){
        this.notaAV1 = nota;
    }
    public void alterarAV2(double nota){
        this.notaAV2 = nota;
    }
    public void alterarAE(double nota){
        this.notaAE = nota;
    }

    public void avaliarAluno(){

        somaNota = this.notaAV1 + this.notaAV2;

        if (somaNota >= 60){
            System.out.println("Aprovado");
        }
        else{
            System.out.println("Recuperação");
        }
    }
    public void avaliarRecuperacao(double notaAE){

        if(((notaAE + somaNota)/2) >= 60){
            System.out.println("Aprovado");
        }
        else{
            System.out.println("Reprovado");
        }
    }
}