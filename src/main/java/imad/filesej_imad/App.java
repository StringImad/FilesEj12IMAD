/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imad.filesej_imad;

import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.DoubleStream;

/**
 *
 * @author MSI
 */
public class App{

    private int codigo;
    private String nombre;
    private String descripcion;
    private DoubleStream Kb;
    private LocalDate fecha;
    private static int contadorInstancias;
    private static Random random = new Random();

    public App() {
      char aleatorio = (char) (65 + random.nextInt(26));
        this.codigo = getContadorInstancias();
        this.nombre = "App" + getContadorInstancias() + aleatorio;
        this.descripcion = generarDescripciones();
        this.Kb = generarTamnyoApp();
        this.fecha = generarFechaAleatoria();
        contadorInstancias++;
    }

    public App(int codigo, String nombre, String descripcion, DoubleStream Kb, LocalDate fecha) {
        char aleatorio = (char) (65 + random.nextInt(26));
        this.codigo = getContadorInstancias();
        this.nombre = "App" + getContadorInstancias() + aleatorio;
        this.descripcion = generarDescripciones();
        this.Kb = generarTamnyoApp();
        this.fecha = fecha;
        contadorInstancias++;
    }

    public static int getContadorInstancias() {
        return contadorInstancias;
    }

    public static void setContadorInstancias(int contadorInstancias) {

        App.contadorInstancias = contadorInstancias;
    }

    private static String generarDescripciones() {
        int aleatorio = random.nextInt(10);
        String contenidoDescripcion[] = {"Descripcion de prueba 1",
            "prueba descripcion 2",
            "prueba descripcion 3", "prueba descripcion 4",
            "vprueba descripcion 5",
            "prueba descripcion 6", "Descripcion de prueba 7", "Descripcion de prueba 8",
            "Descripcion de prueba 9", "Descripcion de prueba 10"};

        return contenidoDescripcion[aleatorio];
    }

    private static DoubleStream generarTamnyoApp() {
        double minimo = 100;
        double maximo = 1024;
        //  List<Integer> doubles = random.ints(0, 50).limit(20).boxed().collect(Collectors.toList());
        DoubleStream stream = random.doubles(1, minimo, maximo);

        return stream;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    private static LocalDate generarFechaAleatoria() {
        LocalDate fechaAleatoria;
        int aleatorio = 0;
        aleatorio = random.nextInt(30) + 1;
        fechaAleatoria = LocalDate.of(random.nextInt(10) + 2020, random.nextInt(12) + 1, random.nextInt(30) + 1);
        DateTimeFormatter formatoFecha = DateTimeFormatter. ofPattern("dd-MM-yyyy");
        formatoFecha.format(fechaAleatoria);
        return fechaAleatoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public DoubleStream getKb() {
        return Kb;
    }

    public void setKb(DoubleStream Kb) {
        this.Kb = Kb;
    }

    public static Random getRandom() {
        return random;
    }

    public static void setRandom(Random random) {
        App.random = random;
    }

    @Override
    public String toString() {
        return codigo + "\t" + nombre + "\t"  + descripcion + "\t" + Kb + "\t"  + fecha;
    }
    
    
}
