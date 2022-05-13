
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pila {

    static void ejercicioPilas() throws IOException{
        PilaLineal pila;
        int x;
        final int CLAVE  = -1;
        
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Teclee los elementos. Termina con -1");
        
        try{
            pila = new PilaLineal();
            do{
                x = Integer.parseInt(entrada.readLine());
            }while(x != CLAVE);
            
            System.out.println("Elementos en la pila: ");
            
        
            while(!pila.pilaVacia()){
                x = (Integer) (pila.quitar());
                System.out.println(x + " ");
            }
        }catch(Exception ex){
            System.out.println("Error ");
        }
    }
    
    static void vectores(){
        PilaVector pila = new PilaVector();
        int x;
        BufferedReader entrada = new BufferedReader(
                new InputStreamReader(System.in));
        
        System.out.println("Teclea número de elementos: ");
        
        try {
            x = Integer.parseInt(entrada.readLine());
            for (int j = 1; j <= x; j++)
            {
                Double d;
                d = Double.valueOf(entrada.readLine());
                pila.insertar(d);
            }
            
            // vaciado de la pila
            System.out.println("Elementos de la Pila: ");
            while (!pila.pilaVacia())
            {
                Double d;
                d = (Double)pila.quitar();
                if (d.doubleValue() > 0.0)
                    System.out.print(d + " ");
                }
            }
        catch (Exception er)
        {
            System.err.println("Excepcion: " + er);
        }
        System.out.println(" ");
    }
    
    static void ListaEnlazada(){
        PilaLista pila = new PilaLista();
        int x;
        BufferedReader entrada = new BufferedReader(
                new InputStreamReader(System.in));
        
        System.out.println("Teclea número de elementos: ");
        
        try {
            x = Integer.parseInt(entrada.readLine());
            
            for (int j = 1; j <= x; j++)
            {
                int d;
                d = Integer.parseInt(entrada.readLine());
                pila.insertar(d);
            }
            
            // vaciado de la pila
            System.out.println("Elementos de la Pila: ");
            while (!pila.pilaVacia())
            {
                int d;
                d = (Integer)pila.quitar();
                if (d > 0)
                    System.out.print(d + " ");
                }
            }
        catch (Exception er)
        {
            System.err.println("Excepcion: " + er);
        }
        System.out.println(" ");
    }
    
    
    public static void main(String[] args) throws IOException {
        
        //ejercicioPilas();
        //vectores();
        ListaEnlazada();
    }
    
}