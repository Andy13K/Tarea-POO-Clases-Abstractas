public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo("Circulo-A1", 10);
        System.out.println(circulo.nombre + ": Area = " + circulo.calcularArea() + ", Perimetro = " + circulo.calcularPerimetro());

        Rectangulo rectangulo = new Rectangulo("Rectangulo-B1", 23, 13);
        System.out.println(rectangulo.nombre + ": Area = " + rectangulo.calcularArea() + ", Perimetro = " + rectangulo.calcularPerimetro());

        Cuadrado cuadrado = new Cuadrado ("Cuadrado-C1", 15);
        System.out.println(cuadrado.nombre + ": Area = " + cuadrado.calcularArea() + ", Perimetro = " + cuadrado.calcularPerimetro());
        
    }
}