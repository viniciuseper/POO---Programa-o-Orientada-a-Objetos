package EmpregoFaculdade;

public class EmpregadoDaFaculdade {

    private String nome;
    private double salario;
    private int horasAula;
    public EmpregadoDaFaculdade(String nome, double salario, int horasAula) {
        this.nome = nome;
        this.salario = salario;
        this.horasAula = horasAula;
    }
    double getGastos(){
        return this.horasAula*40 + this.salario;
    }
    String getInfo(){
        return "Nome: " + this.nome + " com salário " + getGastos();
    }
}
