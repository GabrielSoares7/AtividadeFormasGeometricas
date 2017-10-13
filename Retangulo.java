package codigos;

public class Retangulo extends ObjetoGeometrico{
    
    double lado;
    double altura;
    
    public Retangulo(double lado, double altura, String cor, boolean preenchido) {
        super(cor, preenchido);
        this.lado = lado;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return lado * altura;
    }

    @Override
    public double calcularPerimetro() {
        return lado * 2 + altura * 2;
    }
    
    @Override
    public String toString() {
        return "Retângulo " + cor + "\nÁrea: " +calcularArea() + "\nPerímetro: " + calcularPerimetro();
    }
}
