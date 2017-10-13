package codigos;

public abstract class ObjetoGeometrico implements FormaGeometrica {
    String cor;
    boolean preenchido;

    public ObjetoGeometrico(String cor, boolean preenchido) {
        this.cor = cor;
        this.preenchido = preenchido;
    }
}