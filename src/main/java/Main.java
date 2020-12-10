import java.util.Scanner;

/**
 * Your printer has been infected by a virus and is printing gibberish.
 * After staring at several printed pages for a while, you realize that it is printing every line inside-out.
 * In other words, the left half of each line is being printed starting in the middle of the page and proceeding out
 * toward the left margin. Similarly, the right half of each line is being printed starting at the right margin and
 * proceeding in toward the middle of the page.
 *
 * For example, the line:
 * THIS LINE IS GIBBERISH
 *
 * is being printed as:
 * I ENIL SIHTHSIREBBIG S
 *
 * In the same way, the line " MANGOS " is being printed as "NAM  SOG".Your task is to unscramble a String line from
 * its printed form back into its original order. You can assume that line contains an even number of characters.
 *
 * Input
 * The input contains many test cases. The first line of input contains an integer N that indicates the number of test
 * cases. Follow N lines, each one with a string with the maximum of 100 uppercase letters ('A'-'Z') and spaces (' ').
 * that must be unscrambled from its printed form back into its original order, like example above.
 *
 * Output
 * Each line of input must produce a line of output, with the decoded message, like example above.
 * ENTRADAS:
 * I ENIL SIHTHSIREBBIG S
 * LEVELKAYAK
 * H YPPAHSYADILO
 * ABCDEFGHIJKLMNOPQRSTUVWXYZ
 * VOD OWT SNEH HCNERF EGDIRTRAP A DNA SE
 *
 * SAÍDAS:
 * THIS LINE IS GIBBERISH
 * LEVELKAYAK
 * HAPPY HOLIDAYS
 * MLKJIHGFEDCBAZYXWVUTSRQPON
 * FRENCH HENS TWO DOVES AND A PARTRIDGE
 */
public class Main {
    private static void inverter(String linha){
        String metade1 = "", metade2 = "";
        int meio = (linha.length()/2)-1;

        //percorre do meio até a primeira posição
        for(int i=meio;i>=0;i--)
            metade1 += linha.charAt(i);

        for(int j=linha.length()-1;j>meio;j--)
            metade2 += linha.charAt(j);

        System.out.println(metade1 + metade2);
    }

    public static void main(String[] args){

        Scanner entrada1= new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        System.out.print("Informe a quantidade de linhas a serem testadas: ");
        int n = entrada1.nextInt();

        for(int i=1; i<=n; i++){
            System.out.print("Informe a linha a ser corrigida: ");
            inverter(entrada2.nextLine());
        }
    }
}
