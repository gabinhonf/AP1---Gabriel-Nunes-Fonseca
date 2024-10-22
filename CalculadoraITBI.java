import javax.swing.JOptionPane;

public class CalculadoraITBI {
    public static void main(String[] args) {
        double valorTransacao = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de transação do imóvel:"));
        double valorVenal = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor venal do imóvel:"));
        double porcentagemITBI = Double.parseDouble(JOptionPane.showInputDialog("Digite a porcentagem do ITBI:"));

        double maiorValor = Math.max(valorTransacao, valorVenal);
        double impostoITBI = (maiorValor * porcentagemITBI) / 100;

        JOptionPane.showMessageDialog(null, "O valor do imposto ITBI é: " + impostoITBI);
    }
}