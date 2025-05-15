/*
Eres educadora y estás preparando el temario mensual de clases para un grupo de docentes que colaboran contigo.
Cada tema tiene:
-Un nombre
-Un número de prioridad (1 = urgente, 2 = importante, 3 = opcional)
-Tu equipo también comparte materiales y enlaces digitales por tema, que se almacenan en un repositorio compartido.

El sistema debe:
-Gestionar los temas activos usando una lista concurrente.
-Ordenar los temas por nombre (alfabético) y por prioridad (orden ascendente).
-Mantener un repositorio concurrente de materiales asociados a cada tema, donde se guarde el título del tema como clave y el enlace o recurso sugerido como valor.
*/

import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;

public class PlaneacionEducativa {
    public static void main(String[] args) {

        //Creamos una lista concurrente de temas
        CopyOnWriteArrayList<Tema> temas = new CopyOnWriteArrayList<>();
        temas.add(new Tema("Redes de Computadoras", 2));
        temas.add(new Tema("Programación", 1));
        temas.add(new Tema("Base de datos", 2));
        temas.add(new Tema("Graficación", 3));

        //Ordenamos los temas alfabéticamente usando Comparable
        Collections.sort(temas);
        System.out.println("-Temas ordenados alfabéticamente:");
        for (Tema t : temas) {
            System.out.println(t);
        }

        //Ordenamos los temas por prioridad usando Comparator
        temas.sort(new Comparator<Tema>() {
            @Override
            public int compare(Tema a, Tema b) {
                return Integer.compare(a.prioridad, b.prioridad); // Prioridad ascendente
            }
        });

        System.out.println("\n -Temas ordenados por prioridad (1-3):");
        for (Tema t : temas) {
            System.out.println(t);
        }

        //Creamos un mapa concurrente de recursos
        ConcurrentHashMap<String, String> recurso = new ConcurrentHashMap<>();
        recurso.put("Redes de Computadoras", "https://recursos.edu/redescomp");
        recurso.put("Programación", "https://recursos.edu/programacion");
        recurso.put("Base de Datos", "https://recursos.edu/basededatos");
        recurso.put("Graficación", "https://recursos.edu/graficacion");

        //Mostramos el repositorio de recursos por tema
        System.out.println("\n -Repositorio de recursos por tema:");
        for (String tema : recurso.keySet()) {
            System.out.println(tema + " → " + recurso.get(tema));
        }
    }
}