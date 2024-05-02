//Nombre: Michel de los Angeles Pineda Romero. 2024-1364U 1M1-S 
import java.util.Scanner;

public class ArregloInverso {
    
    // Llenar un arreglo con valores ingresados por el usuario
    public static void llenarArray(int[] arreglo) throws Exception {
        if (arreglo == null) {
            throw new IllegalArgumentException("El arreglo no puede ser nulo");
        }
        if (arreglo.length == 0) {
            throw new IllegalArgumentException("El arreglo debe contener de 1 a más elementos");
        }
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos del arreglo: ");
        int cantidad = scanner.nextInt();
        
        System.out.println("Ingrese los " + cantidad + " elementos del arreglo: ");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }
        
        scanner.close(); // Cerrar el Scanner
    }
    
    // Invertir un arreglo
    public static int[] arregloInvertido(int[] arreglo) {
        int[] resultado = new int[arreglo.length];
        
        for (int i = 0; i < arreglo.length; i++) {
            resultado[i] = arreglo[arreglo.length - 1 - i];
        }
        
        return resultado;
    }
    
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese la cantidad de elementos del arreglo: ");
            int tamaño = scanner.nextInt();
            
            // Definir el tamaño del arreglo
            int[] arreglo = new int[tamaño];
            
            // Llenar el arreglo
            llenarArray(arreglo);
            
            // Imprimir el arreglo original
            System.out.println("Arreglo original: ");
            for (int num : arreglo) {
                System.out.print(num + " ");
            }
            System.out.println();
            
            // Obtener y mostrar el arreglo invertido
            int[] arregloInvertido = arregloInvertido(arreglo);
            System.out.println("Arreglo invertido: ");
            for (int num : arregloInvertido) {
                System.out.print(num + " ");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
