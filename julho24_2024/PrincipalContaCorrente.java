package com.atividades.julho24_2024;

import java.util.Date;

public class PrincipalContaCorrente {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João", "123.456.789-00", "Silva");
        Cliente cliente2 = new Cliente("Maria", "987.654.321-00", "Oliveira");

        ContaCorrente conta1 = new ContaCorrente(1, cliente1, 1000.0, new Date());
        ContaCorrente conta2 = new ContaCorrente(2, cliente2, 500.0, new Date());

        System.out.println("Saldo inicial conta1: R$ " + conta1.getSaldo());
        conta1.depositar(200.0);
        conta1.sacar(50.0);

        System.out.println("Saldo inicial conta2: R$ " + conta2.getSaldo());
        conta2.depositar(100.0);
        conta2.sacar(30.0);

        System.out.println("Transferência de conta1 para conta2:");
        conta1.transferir(conta2, 500.0);

        System.out.println("Saldo final conta1: R$ " + conta1.getSaldo());
        System.out.println("Saldo final conta2: R$ " + conta2.getSaldo());

        System.out.println("Nome do cliente da conta1: " + conta1.getCliente().getNome());
    }

}
