package com.atividades.julho24_2024;

import javax.swing.*;

public class PrincipalRetangulo {

    public static void main(String[] args) {

        String lado1Str = JOptionPane.showInputDialog("Digite o lado 1: ");
        String lado2Str = JOptionPane.showInputDialog("Digite o lado 2: ");

        double lado1 = Double.parseDouble(lado1Str);
        double lado2 = Double.parseDouble(lado2Str);

        Retangulo retangulo = new Retangulo(lado1, lado2);

        double area = retangulo.getArea();
        double perimetro = retangulo.getPerimetro();

        JOptionPane.showMessageDialog(null, "Área: " + area + "\nPerímetro: " + perimetro);
    }
}
