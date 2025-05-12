import interfaces.Funcionario;
import objects.Administrador;
import objects.EmpregadoConcreto;
import objects.Gerente;
import objects.Vendedor;

class Main {
    public static void main(String[] args) {
        System.out.println("Salve salve");
        Funcionario administrador = new Administrador();
        Funcionario vendedor = new Vendedor();
        Funcionario gerente = new Gerente();
        Funcionario empregado = new EmpregadoConcreto();

        administrador.setSalario(2000.0);
        vendedor.setSalario(2042.0);
        gerente.setSalario(3423.12);
        empregado.setSalario(213.21);

        System.out.println("Salario mensal dos funcionários: ");
        System.out.println("Salario do administrador: " + administrador.calcularSalario(0));
        System.out.println("Salario do vendedor: " + administrador.calcularSalario(0));
        System.out.println("Salario do gerente: " + gerente.calcularSalario(0));
        System.out.println("Salario do empregado: " + empregado.calcularSalario(0));

        System.out.println("");
        System.out.println("Salario anual dos funcionarios: ");
        System.out.println("Salario do administrador: " + administrador.calcularSalario(1));
        System.out.println("Salario do vendedor: " + administrador.calcularSalario(1));
        System.out.println("Salario do gerente: " + gerente.calcularSalario(1));
        System.out.println("Salario do empregado: " + empregado.calcularSalario(1));

    }
}