import java.util.Scanner;

class CalculadoraDesconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do produto:");
        double valorProduto = scanner.nextDouble();

        System.out.println("Digite a porcentagem de desconto:");
        double desconto = scanner.nextDouble();

        double valorDesconto = (valorProduto * desconto) / 100;
        double valorFinal = valorProduto - valorDesconto;

        System.out.println("Valor do desconto: " + valorDesconto);
        System.out.println("Valor final do produto: " + valorFinal);
    }
}