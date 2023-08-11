public abstract class FigurasGeometricas {
    protected String nombre;

    public FigurasGeometricas(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularArea();

    public abstract double calcularPerimetro();
}