/*
 Imagina que eres parte del equipo de QA en una empresa que ejecuta pruebas automáticas durante la madrugada.
  Al amanecer, debes revisar un archivo errores.log que contiene miles de líneas con mensajes de error, advertencia y éxito.
Tu misión será analizar el archivo de forma eficiente, detectar la frecuencia de errores y advertencias, y generar un resumen del análisis.import java.io.BufferedReader;
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AnalizadorDeLogs {

    public static void main(String[] args) {
        //Definir la ruta del archivo de logs
        Path rutaLog = Paths.get("src/errores.log"); // Path correcto
        Path rutaError = Paths.get("src/registro_fallos.txt");

        String contenido = """
                "ERROR\
                
                ERROR\
                
                "WARNING""";

        int lineas = 0;
        int errores = 0;
        int advertencias = 0;

        //Lectura eficiente usando try-with-resources y BufferedReader
        try (BufferedReader lector = Files.newBufferedReader(rutaLog)) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                lineas++;
                if (linea.contains("ERROR")) {
                    errores++;
                }
                if (linea.contains("WARNING")) {
                    advertencias++;
                }
            }

            //Mostrar resumen
            System.out.println("📊 Análisis completado:");
            System.out.println("➡️ Total de líneas leídas: " + lineas);
            System.out.println("❌ Total de errores (ERROR): " + errores);
            System.out.println("⚠️ Total de advertencias (WARNING): " + advertencias);

            double porcentajeErrores = (lineas > 0) ? ((double) errores / lineas) * 100 : 0;
            double porcentajeAdvertencias = (lineas > 0) ? ((double) advertencias / lineas) * 100 : 0;

            System.out.printf(" -Porcentaje de líneas con errores: %.2f%%\n", porcentajeErrores);
            System.out.printf(" -Porcentaje de líneas con advertencias: %.2f%%\n", porcentajeAdvertencias);

        } catch (IOException e) {
            System.out.println("❌ Error al procesar el archivo de logs: " + e.getMessage());

            //Registrar fallo en archivo externo
            try (BufferedWriter escritor = Files.newBufferedWriter(rutaError)) {
                escritor.write("Error al leer el archivo 'errores.log': " + e.getMessage());
            } catch (IOException ex) {
                System.out.println("❌ No se pudo escribir en el archivo de registro de fallos.");
            }
        }
    }
}
