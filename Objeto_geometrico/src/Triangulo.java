public class Triangulo extends ObjetoGeometrico {
    private double base;
    private double altura;

    public Triangulo(double b, double a) {
        base = b;
        altura = a;
    }

    public double getArea() {
        area = base * altura / 2;
        return area;
    }

    public double getPerimetro() {
        perimetro = 3 * base; // Supondo que é um triângulo equilátero
        return perimetro;
    }
}
