public class App {
    public static void main(String[] args) {
        QuadroNegro quadroNegro = new QuadroNegro();
        
        quadroNegro.criaQuadrado(10.6, "Branco");
        quadroNegro.criaRetangulo(50.5, 20.4, "Azul");
        quadroNegro.criaTriangulo(6.7, 5.5, "Amarelo");
        quadroNegro.criaCircunferencia(10, "Verde");

        quadroNegro.mostraAreaObjetos();
        quadroNegro.mostraPerimetroObjetos();
        quadroNegro.mostraCorObjetos();
    }
}
