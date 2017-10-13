package codigos;

import java.text.DecimalFormat;

public class Circulo extends ObjetoGeometrico{
    double raio;

    public Circulo(double raio, String cor, boolean preenchido) {
        super(cor, preenchido);
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return pi*raio*raio;
    }
    
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.##");
        return "Círculo " + cor +"\nRaio: " + raio + "\nÁrea: " + df.format(calcularArea()) + "\nPerímetro: " + df.format(calcularPerimetro());
    }

    @Override
    public double calcularPerimetro() {
        return 2 * pi * raio;
    }
}
