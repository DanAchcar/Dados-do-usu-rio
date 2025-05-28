import java.util.Scanner;

public class DadosUsuario {
    public static void main(String[] args) {
        // Declaração das variáveis
        try (Scanner scanner = new Scanner(System.in)) {
            String nome, curso, dataNascimento;
            double altura, peso;
            // Entrada dos dados do usuário
            System.out.print("Digite seu nome: ");
             nome = scanner.nextLine();
            System.out.print("Digite sua altura (em metros, ex: 1.75): ");
             altura = scanner.nextDouble();
            scanner.nextLine(); // Limpa o buffer do scanner
            System.out.print("Digite o nome do seu curso: ");
              curso = scanner.nextLine();
            System.out.print("Digite sua data de nascimento (ex: 01/01/2000): ");
               dataNascimento = scanner.nextLine();
            System.out.print("Digite seu peso (em kg, ex: 70.5): ");
               peso = scanner.nextDouble();
            // Saída dos dados
            System.out.println("\n--- Dados do Usuário ---");
            System.out.println("Nome: " + nome);
            System.out.println("Altura: " + altura + " m");
            System.out.println("Curso: " + curso);
            System.out.println("Data de Nascimento: " + dataNascimento);
            System.out.println("Peso: " + peso + " kg");
        }
    }
}

