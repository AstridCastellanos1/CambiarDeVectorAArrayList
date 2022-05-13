public class PilaLineal {
    private static final int TAMPILA = 40;
    private int cima;
    private Object[] listaPila;
    
    public PilaLineal(){
        cima = -1;
        listaPila = new Object[TAMPILA];
    }
    
    //Método para insertar en la pila(push)
    public void insertar (Object elemento) throws Exception{
    
        if (pilaLlena()){
            throw new Exception("UnderFlow está llena");
        }
        
        cima++;
        listaPila[cima] = elemento;
        System.out.println(elemento);
    }
    
    public void imprimir(){
    
        for(int i = 0; i < 5; i++){
            System.out.println(listaPila[i]);
        }
    }
    
    //Método para quitar elementos de la pila(pop)
    public Object quitar() throws Exception{
        Integer aux;
        
        if(pilaVacia()){
            throw new Exception ("Pila vacía, no se puede sacar");
        }
        
        //Guardar el elemento en la cima
        aux = (Integer) listaPila[cima];
        
        //Decrementar cima y retornar el elemento
        cima--;
        return aux;
    }
    
    //Limpiar la pila
    public void limpiarPila() throws Exception{
        cima = -1;
    }
    
    //Método para acceso a la cima de la pila
    public Object cimaPila() throws Exception{
        if(pilaVacia()){
            throw new Exception("Pila vacia, no se puede");
        }
        return listaPila[cima];
    }
    
    //Método para verificar si la pila está vacía
    public boolean pilaVacia(){
        return cima == -1;
    }
    
    //Método para verificar si la pila está llena
    public boolean pilaLlena(){
        return cima == TAMPILA - 1;
    }
}
