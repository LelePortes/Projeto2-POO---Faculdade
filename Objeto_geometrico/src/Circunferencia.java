public class Circunferencia extends ObjetoGeometrico {
    private final double pi = 3.14159265358979323846;
    private double raio;

    public Circunferencia(double r) {
        raio = r;
    }

    public double getArea() {
        area = pi * (raio * raio);
        return area;
    }

    public double getPerimetro() {
        perimetro = 2 * pi * raio;
        return perimetro;
    }
}
