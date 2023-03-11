package NotasAlunos;
public class AvaliarAluno {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("João","123",25,25,"ADS", 3);
        aluno1.avaliarAluno();
        aluno1.avaliarRecuperacao(20);
    }
}
