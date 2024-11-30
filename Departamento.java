package Data;

public class Departamento {
    private String nombre;
    private int numeroMunicipios;
    private double extensionTierra;
    private int numeroHabitantes;
    private double temperaturaPromedio;
    private String indicativoTelefonico;

    // Constructor
    public Departamento(String nombre, int numeroMunicipios, double extensionTierra, 
                        int numeroHabitantes, double temperaturaPromedio, String indicativoTelefonico) {
        this.nombre = nombre;
        this.numeroMunicipios = numeroMunicipios;
        this.extensionTierra = extensionTierra;
        this.numeroHabitantes = numeroHabitantes;
        this.temperaturaPromedio = temperaturaPromedio;
        this.indicativoTelefonico = indicativoTelefonico;
    }

    // Getters
    public String getNombre() { return nombre; }
    public int getNumeroMunicipios() { return numeroMunicipios; }
    public double getExtensionTierra() { return extensionTierra; }
    public int getNumeroHabitantes() { return numeroHabitantes; }
    public double getTemperaturaPromedio() { return temperaturaPromedio; }
    public String getIndicativoTelefonico() { return indicativoTelefonico; }

    @Override
    public String toString() {
        return "Departamento: " + nombre + 
               ", Municipios: " + numeroMunicipios + 
               ", Extensión: " + extensionTierra + " mt2" +
               ", Habitantes: " + numeroHabitantes +
               ", Temperatura: " + temperaturaPromedio + "°C" +
               ", Indicativo: " + indicativoTelefonico;
    }
}