/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigos;

/**
 *
 * @author Aluno
 */
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
}
