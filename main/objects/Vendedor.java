package objects;

import interfaces.Funcionario;

public class Vendedor implements Funcionario {

    private Double salario;

    @Override
    public Double calcularSalario(int periodo) {
        if (periodo == 0) {
            return calcularSalarioMensal();

        }
        if (periodo == 1) {
            return calcularSalarioAnual();
        }
        return null;
    }

    @Override
    public Double calcularSalarioAnual() {
        return salario * 12;
    }

    @Override
    public Double calcularSalarioMensal() {
        return salario;
    }

    @Override
    public Double getSalario() {
        return salario;
    }

    @Override
    public void setSalario(Double salario) {
        this.salario = salario;
    }

}
