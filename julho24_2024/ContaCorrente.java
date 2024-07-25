package com.atividades.julho24_2024;

import java.util.Date;

public class ContaCorrente {

    private int numero;
    private Cliente cliente;
    private double saldo;
    private Date data;

    public ContaCorrente(int numero, Cliente cliente, double saldo, Date data) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = saldo;
        this.data = data;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso. Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso. Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido!");
        }
    }

    public void exibirExtrato() {
        System.out.println("Extrato da conta " + numero + ":");
        System.out.println("Cliente: " + cliente.getNome() + " " + cliente.getSobrenome());
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("Data: " + data);
    }

    public void transferir(ContaCorrente destino, double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            destino.depositar(valor);
            System.out.println("Transferência de R$ " + valor + " realizada com sucesso. Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Transferência cancelada. Saldo insuficiente ou valor de transferência inválido!");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

}
