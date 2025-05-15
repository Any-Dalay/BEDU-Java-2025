/*
Estás colaborando como desarrollador Java en un laboratorio de biotecnología molecular.
Tu tarea es ayudar al equipo de bioinformática a organizar el registro de las muestras genéticas que llegan diariamente al laboratorio.
Deben llevar el control de:
📥 El orden de llegada de las muestras (pueden repetirse si se replican).
🧬 Las especies únicas que han sido procesadas.
🧑‍🔬 El ID de cada muestra asociado con el nombre del investigador responsable.
*/

import java.util.*;

public class RegistroMuestras {
    public static void main(String[] args) {

        // Paso 1: ArrayList para registrar el orden de llegada de las muestras genéticas
        ArrayList<String> listamMuestras = new ArrayList<>();

        // TODO: Agrega aquí los nombres de las especies en orden (pueden repetirse)
        listamMuestras.add("Homo sapiens");
        listamMuestras.add("Mus musculus");
        listamMuestras.add("Arabidopsis thaliana");
        listamMuestras.add("Homo sapiens");

        System.out.println("📋 Muestras recibidas en orden:");
        for (int i = 0; i < listamMuestras.size(); i++) {
            System.out.println((i + 1) + ". " + listamMuestras.get(i));
        }

        // Paso 2: HashSet para obtener las especies únicas procesadas
        HashSet<String> especiesUnicas = new HashSet<>(listamMuestras);

        System.out.println("\n✅ Especies únicas procesadas:");
        for (String especie : especiesUnicas) {
            System.out.println("- " + especie);
        }

        // Paso 3: HashMap para asociar el ID de muestra con el nombre del investigador
        HashMap<String, String> muestrasInvestigador = new HashMap<>();

        // TODO: Agrega aquí las asociaciones ID → Investigador
        muestrasInvestigador.put("M-001", "Dra. Flores");
        muestrasInvestigador.put("M-002", "Dr. Mendoza");
        muestrasInvestigador.put("M-003", "Dra. Rivera");

        System.out.println("\n👩‍🔬 Asignación de muestras a investigadores:");
        for (Map.Entry<String, String> entry : muestrasInvestigador.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        // Paso 4: Búsqueda de investigador por ID de muestra
        String idBuscar = "M-002"; // Puedes cambiar este valor si lo deseas
        System.out.println("\n🔍 Investigador responsable de la muestra " + idBuscar + ": " + muestrasInvestigador.get(idBuscar));
    }
}