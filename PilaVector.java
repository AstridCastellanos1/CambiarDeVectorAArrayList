import java.util.ArrayList;
//import java.util.Vector;

public class PilaVector {
    private int cima;
    private ArrayList listaPila;
    
    public PilaVector(){
        cima = -1;
        listaPila = new ArrayList();
    }
    
    public void insertar(Object elemento) throws Exception{
        cima++;
        listaPila.add(elemento);
    }
    
    public Object quitar() throws Exception{
        Object aux;
        if(pilaVacia()){
            throw new Exception("Pila vacía");
        }
        aux = listaPila.get(cima);//Para obtener el elemento que se encuentra en la posición actual de cima
        listaPila.remove(cima);
        cima--;
        return aux;
    }
    
    //Método para acceso a la cima de la pila
    public Object cimaPila() throws Exception{
        if(pilaVacia()){
            throw new Exception("Pila vacia, no se puede");
        }
        return listaPila.get(cima);
    }
    
    //Método para verificar si la pila está vacía
    public boolean pilaVacia(){
        return cima == -1;
    }
    
    public void limpiarPila() throws Exception{
        while(!pilaVacia()){
            quitar();
        }
    } 
}


