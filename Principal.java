package Data;

public class Principal {
    public static void main(String[] args) {
        // Crear instancia del AnalizadorDepartamentos
        AnalizadorDepartamentos analizador = new AnalizadorDepartamentos();

        // Agregar departamentos de ejemplo
        analizador.agregarDepartamento(new Departamento(
            "Cundinamarca", 116, 22.623, 2680000, 14.5, "1"
        ));

        analizador.agregarDepartamento(new Departamento(
            "Amazonas", 6, 109665, 73000, 28.0, "8"
        ));

        analizador.agregarDepartamento(new Departamento(
            "Antioquia", 125, 63612, 6800000, 24.0, "4"
        ));

        // Realizar análisis
        analizador.analizarDepartamentos();
    }
}
