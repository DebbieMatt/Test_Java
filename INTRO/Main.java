// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

           /*  int A;
            int B = 2;
            A = 3;
            int soma = A + B;
            int subtracao = A - B;
            double divisao = (double) A / B;
            int multiplicacao = A * B;

            System.out.println(soma);
            System.out.println(subtracao);
            System.out.println(divisao);
            System.out.println(multiplicacao); */


            /* boolean fim_de_semana = true;
            boolean fazendo_sol = true;
            boolean vamos_a_praia = fim_de_semana && fazendo_sol; // && = and.
        System.out.println(vamos_a_praia); // Atalho sout. */

        /* Tabela Verdade
        Operador && (AND)
        true && true = true  (só será verdadeiro, quando os 2 forem verdade)
        true && false = false
        false && true = false
        false && false = false */

        /* Operador || (OR)
        true || true = true
        true || false = true
        false || true = true
        false || false = false  (só será falso, quando os 2 forem falsos) */

        /* String mensagem = fim_de_semana ? "É fim de semana" : "Não é fim de semana";
        System.out.println(fim_de_semana); // Operador Ternário. */

        int nota = 1000 ;
        String graduação;

        if (nota >= 950) {
            graduação = "medicina";
        }
        else if (nota < 900 && nota >= 800){
            graduação ="psicologia";
        }
        else if (nota < 800 && nota >= 700) {
            graduação ="engenharia";
        }
        else if (nota < 700 && nota >= 600) {
            graduação ="biologia";
        }
        else {
            graduação ="educação fisica";
        }

        switch (graduação){
            case "medicina":
            case "psicologia", "engenharia", "biologia":
                System.out.println("aluno aprovado em: " + graduação);
                break;

            default:
                System.out.println("educação fisica");
        }

    }
}



