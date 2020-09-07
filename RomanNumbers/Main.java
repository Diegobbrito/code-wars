package RomanNumbers;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Roman r = new Roman();

        System.out.println("Entre com o numero a ser convertido");
        var num = scan.nextInt();
        System.out.println(r.solution(num));
    }
}
