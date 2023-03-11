package EmpregoFaculdade;
import java.util.Scanner;
public class CalculoHorasAulas {

    public static void main(String[] args) {

        String resultado;

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o nome: ");
        String nome = ler.nextLine();
        System.out.println("Informe o salario: ");
        double salario = ler.nextDouble();
        System.out.println("Informa as horas aula: ");
        int horasAula = ler.nextInt();

        EmpregadoDaFaculdade nome1 = new EmpregadoDaFaculdade(nome, salario, horasAula);

        System.out.println(nome1.getInfo());

    }
}
