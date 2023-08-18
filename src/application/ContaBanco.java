package application;

import entites.ContaTerminal;

import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaTerminal conta = new ContaTerminal();

        System.out.print("Digite numero da conta: ");
        conta.setNumero(sc.nextInt());
        sc.nextLine();
        System.out.print("Digite numero da agencia: ");
        conta.setAgencia(sc.nextLine());
        System.out.print("Digite nome da conta: ");
        conta.setNome(sc.nextLine());
        System.out.print("Digite saldo da conta: ");
        conta.setSaldo(sc.nextDouble());

        System.out.println(conta);
    }
}
