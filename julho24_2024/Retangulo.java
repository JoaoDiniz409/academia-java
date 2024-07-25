package com.atividades.julho24_2024;

public class Retangulo {
    private double lado1;
    private double lado2;
    private double area;
    private double perimetro;

    public Retangulo() {
    }

    public Retangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public void calcularArea() {
        this.area = lado1 * lado2;
    }

    public void calcularPerimetro() {
        this.perimetro = ( 2 * lado1 ) + ( 2 * lado2 );
    }

    public double getArea() {
        calcularArea();
        return area;
    }

    public double getPerimetro() {
        calcularPerimetro();
        return perimetro;
    }

}
