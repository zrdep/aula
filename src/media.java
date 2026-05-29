import java.util.Scanner;
public class media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 7) {
            System.out.println("A média é: " + media);
            System.out.println("A média é maior ou igual a 7, aprovado!");
        } else {
            System.out.println("A média é: " + media);
            System.out.println("A média é menor que 7, reprovado!");
        }
        sc.close();
    };
}
