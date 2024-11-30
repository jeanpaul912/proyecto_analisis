package Data;

import java.util.ArrayList;
import java.util.Comparator;

public class AnalizadorDepartamentos {
    private ArrayList<Departamento> departamentos;

    public AnalizadorDepartamentos() {
        departamentos = new ArrayList<>();
    }

    public void agregarDepartamento(Departamento departamento) {
        departamentos.add(departamento);
    }

    public void analizarDepartamentos() {
        if (departamentos.isEmpty()) {
            System.out.println("No hay departamentos para analizar.");
            return;
        }

        // Análisis de departamento con mayor extensión y menor temperatura
        Departamento mayorExtension = departamentos.stream()
            .max(Comparator.comparing(Departamento::getExtensionTierra))
            .orElse(null);

        Departamento menorTemperatura = departamentos.stream()
            .min(Comparator.comparing(Departamento::getTemperaturaPromedio))
            .orElse(null);

        // Análisis de departamento con mayor número de habitantes y menor extensión
        Departamento mayorHabitantes = departamentos.stream()
            .max(Comparator.comparing(Departamento::getNumeroHabitantes))
            .orElse(null);

        Departamento menorExtension = departamentos.stream()
            .min(Comparator.comparing(Departamento::getExtensionTierra))
            .orElse(null);

        // Mostrar resultados
        System.out.println("Análisis de Departamentos para el DANE\n");
        
        System.out.println("Departamento con mayor extensión y menor temperatura:");
        if (mayorExtension != null) {
            System.out.println("Mayor Extensión: " + mayorExtension.getNombre() + 
                               " con " + mayorExtension.getExtensionTierra() + " mt2");
        }
        if (menorTemperatura != null) {
            System.out.println("Menor Temperatura: " + menorTemperatura.getNombre() + 
                               " con " + menorTemperatura.getTemperaturaPromedio() + "°C\n");
        }

        System.out.println("Departamento con mayor número de habitantes y menor extensión:");
        if (mayorHabitantes != null) {
            System.out.println("Mayor Habitantes: " + mayorHabitantes.getNombre() + 
                               " con " + mayorHabitantes.getNumeroHabitantes() + " habitantes");
        }
        if (menorExtension != null) {
            System.out.println("Menor Extensión: " + menorExtension.getNombre() + 
                               " con " + menorExtension.getExtensionTierra() + " mt2");
        }
    }
}