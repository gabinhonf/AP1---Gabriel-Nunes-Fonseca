import java.util.Scanner;
import java.util.Arrays;

class CircuitoResistencias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] resistencias = new double[4];

        for (int i = 0; i < resistencias.length; i++) {
            System.out.println("Digite o valor da resistência " + (i + 1) + ":");
            resistencias[i] = scanner.nextDouble();
        }

        double resistenciaEquivalente = Arrays.stream(resistencias).sum();
        double maiorResistencia = Arrays.stream(resistencias).max().getAsDouble();
        double menorResistencia = Arrays.stream(resistencias).min().getAsDouble();

        System.out.println("Resistência equivalente: " + resistenciaEquivalente);
        System.out.println("Maior resistência: " + maiorResistencia);
        System.out.println("Menor resistência: " + menorResistencia);
    }
}

