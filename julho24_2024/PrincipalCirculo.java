package com.atividades.julho24_2024;

import javax.swing.*;

public class PrincipalCirculo {

    public static void main(String[] args) {

        String raioStr = JOptionPane.showInputDialog("Digite o valor do raio: ");

        double raio = Double.parseDouble(raioStr);

        Circulo circulo = new Circulo(raio);

        double area = circulo.getArea();
        double perimetro = circulo.getPerimetro();

        JOptionPane.showMessageDialog(null, "Área: " + area + "\nPerímetro: " + perimetro);
    }
}
