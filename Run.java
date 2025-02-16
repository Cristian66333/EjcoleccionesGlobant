import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Run{
    public static void main(String[] args) {
        ArrayList<Integer> numeros = leerValores();

        mostrarResultados(numeros, calcularSuma(numeros), calcularPromedio(numeros));

    }
    public static ArrayList<Integer> leerValores(){
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> valores = new ArrayList<>();
        int entrada=0;
        while (entrada!=-99) {
            System.out.println("Ingrese un número (-99 para salir)");
            entrada = sc.nextInt();
            if (entrada!=-99) valores.add(entrada);

        }
        return valores;
    }
    public static int calcularSuma(ArrayList<Integer> numeros){
        int suma = 0;
        Iterator<Integer> iteratorNumeros = numeros.iterator();
        while (iteratorNumeros.hasNext()) {
            suma += iteratorNumeros.next();
        }

        return suma;
    }
    public static int calcularPromedio(ArrayList<Integer> numeros){
        int promedio = 0;
        Iterator<Integer> iteratorNumeros = numeros.iterator();
        while (iteratorNumeros.hasNext()) {
            promedio += iteratorNumeros.next();
        }
        promedio /= numeros.size();
        return promedio;
    }
    public static void mostrarResultados(ArrayList<Integer> numeros,int suma, int media){
        int numerosMayoresMedia = 0;
        Iterator<Integer> iteratorNumeros = numeros.iterator();
        while (iteratorNumeros.hasNext()) {
            if (iteratorNumeros.next()>media) {
                numerosMayoresMedia++;
            }
        }
        
        System.out.printf("Datos: %s \nSuma: %d \nMedia: %d \nCantidad mayores a media: %d", numeros.toString(), suma, media, numerosMayoresMedia);
    }
}