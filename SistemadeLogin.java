import java.util.Scanner;

class SistemaLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String loginCorreto = "java8";
        String senhaCorreta = "java8";

        for (int tentativas = 0; tentativas < 3; tentativas++) {
            System.out.println("Digite o login:");
            String login = scanner.next();

            System.out.println("Digite a senha:");
            String senha = scanner.next();

            if (login.equals(loginCorreto) && senha.equals(senhaCorreta)) {
                System.out.println("Login bem-sucedido!");
                return;
            } else {
                System.out.println("Login ou senha incorretos. Tentativa " + (tentativas + 1) + " de 3.");
            }
        }

        System.out.println("Acesso bloqueado.");
    }
}
