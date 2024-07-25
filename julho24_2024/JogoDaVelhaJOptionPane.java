package com.atividades.julho24_2024;

import javax.swing.*;

public class JogoDaVelhaJOptionPane {
    public static void main(String[] args) {
        String[][] tabuleiro = {
                {" "," "," "},
                {" "," "," "},
                {" "," "," "}};

        boolean isJogador1 = true;
        String linhaStr;
        String colunaStr;
        int linha;
        int coluna;
        boolean temVencedor = false;

        for (int i = 0; i < 9 && !temVencedor; i++) {
            if (isJogador1) {

                linhaStr = JOptionPane.showInputDialog("Escolha a linha jogador 1: ");
                linha = Integer.parseInt(linhaStr);

                colunaStr = JOptionPane.showInputDialog("Escolha a coluna jogador 1: ");
                coluna = Integer.parseInt(colunaStr);

                if (tabuleiro[linha][coluna].equals(" ")){
                    tabuleiro[linha][coluna] = "X";
                    imprimirTabuleiro(tabuleiro);
                    temVencedor = verificarVencedor(tabuleiro, "X");
                    if (temVencedor) {
                        JOptionPane.showMessageDialog(null, "Jogador 1 venceu!");
                    }
                    isJogador1 = false;
                } else {
                    JOptionPane.showMessageDialog(null, "Este campo já foi ocupado por outro jogador. Escolha outra casa.");
                }

            } else {
                linhaStr = JOptionPane.showInputDialog("Escolha a linha jogador 2: ");
                linha = Integer.parseInt(linhaStr);
                colunaStr = JOptionPane.showInputDialog("Escolha a coluna jogador 2: ");
                coluna = Integer.parseInt(colunaStr);

                if (tabuleiro[linha][coluna].equals(" ")) {
                    tabuleiro[linha][coluna] = "O";
                    imprimirTabuleiro(tabuleiro);
                    temVencedor = verificarVencedor(tabuleiro, "O");
                    if (temVencedor) {
                        JOptionPane.showMessageDialog(null, "Jogador 2 venceu!");
                    }
                    isJogador1 = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Este campo já foi ocupado por outro jogador. Escolha outra casa.");
                }
            }
        }

        if (!temVencedor) {
            JOptionPane.showMessageDialog(null, "Empate!");
        }
    }

    public static void imprimirTabuleiro(String[][] tabuleiro) {
        System.out.print("\n\n 0   1    2\n\n");
        for (int posicao1 = 0; posicao1 < 3; posicao1++) {
            for (int posicao2 = 0; posicao2 < 3; posicao2++) {
                System.out.print(" " + tabuleiro[posicao1][posicao2]);
                if (posicao2 < 2) {
                    System.out.print(" | ");
                }
                if (posicao2 == 2) {
                    System.out.print("  " + posicao1);
                }
            }
            if (posicao1 < 2) {
                System.out.print("\n------------");
            }
            System.out.println("\n");
        }
    }

    public static boolean verificarVencedor(String[][] tabuleiro, String jogador) {
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0].equals(jogador) && tabuleiro[i][1].equals(jogador) && tabuleiro[i][2].equals(jogador)) {
                return true;
            }
            if (tabuleiro[0][i].equals(jogador) && tabuleiro[1][i].equals(jogador) && tabuleiro[2][i].equals(jogador)) {
                return true;
            }
        }
        if (tabuleiro[0][0].equals(jogador) && tabuleiro[1][1].equals(jogador) && tabuleiro[2][2].equals(jogador)) {
            return true;
        }
        if (tabuleiro[0][2].equals(jogador) && tabuleiro[1][1].equals(jogador) && tabuleiro[2][0].equals(jogador)) {
            return true;
        }
        return false;
    }
}
