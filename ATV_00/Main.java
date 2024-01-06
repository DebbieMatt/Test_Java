package INICIAL;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static <string> void main(String[] args) {
        String name = "Debby";

        LocalDate hoje = LocalDate.now();
        Locale Brasil = new Locale("pt", "BR");
        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, Brasil));
        // diz que dia da semana no meu idioma PT - BR

        String dia_semana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, Brasil);
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();
        if (agora.getHour() >= 0 && agora.getHour() < 12) {
            saudacao = "Bom dia";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18) {
            saudacao = "Boa tarde";
        } else if (agora.getHour() >= 18 && agora.getHour() < 24) {
            saudacao = "Boa noite";
        } else {
            saudacao = "Não consigo identificar";
        }

        System.out.printf("Olá, %s. Hoje é %s, %s. %n", name, dia_semana, saudacao.toLowerCase()); // defini formato e
                                                                                                   // valores.

        int peso = 75;
        double altura = 1.80;
        double IMC = peso / (altura * altura);
        System.out.println(IMC);

        int preco = 75;
        string porcentagem = (string) "5%";
        double desconto = (double) preco * 5 / 100;
        System.out.println(desconto);

        /*
         * // Algoritmo "calcular_area_de_um_triangulo"
         * int base = 0, tamanho = 0, area;
         * 
         * Scanner scan = new Scanner(System.in); // leitor de teclado ou input.
         * System.out.println("Informe o valor da base: ");
         * base = scan.nextInt(); //inserção de dados.
         * 
         * System.out.println("Informe o valor da altura:");
         * tamanho = scan.nextInt();
         * 
         * area = (int) (base * tamanho) / 2;
         * 
         * System.out.
         * printf("O TRIÂNGULO COM BASE %d, E ALTURA %d, TEM a ÁREA IGUAL A %d", base,
         * tamanho, area);
         */

        System.out.println("Informe um valor qualquer ");
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt(); // inserção de dados.

        System.out.println("Informe outro valor qualquer");
        int n2 = scan.nextInt();

        if (n1 > n2) {
            System.out.println("O numero" + n1 + "é maior que" + n2);
        } else
            System.out.println("O numero" + n2 + "é maior que" + n1);

        // %s significa string. %n significa quebra de linha.
        // System.out.println(name.toUpperCase()); // letras maiuscula.
        // System.out.println(name.toLowerCase()); // letras minuscula.
    }
}