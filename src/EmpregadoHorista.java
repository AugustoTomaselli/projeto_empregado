public class EmpregadoHorista extends Empregado {
    int totalDeHorasTrabalhadas;
    double valorDaHora;

    public double calcularSalario(){
        return totalDeHorasTrabalhadas * valorDaHora;
    }
}
