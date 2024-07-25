package com.atividades.julho24_2024;

public class Circulo {

    private double raio;
    private double area;
    private double perimetro;

    public Circulo() {
    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    public void calcularArea() {
        this.area = raio * raio * 3.14;
    }

    public  void  calcularPerimetro() {
        this.perimetro = 2 * 3.14 * raio;
    }

    public double getPerimetro() {
        calcularPerimetro();
        return perimetro;
    }

    public double getArea() {
        calcularArea();
        return area;
    }
}
