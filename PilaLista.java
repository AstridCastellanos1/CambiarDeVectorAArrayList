public class PilaLista {
    private NodoPila cima;
    
    public PilaLista()
    {
        cima = null;
    }

    public boolean pilaVacia()
    {
        return cima == null;
    }

    public void insertar(Object elemento)
    {
        NodoPila nuevo; //variable temporal de tipo nodo pila
        nuevo = new NodoPila(elemento); //creamos el nodo con el elemento
        nuevo.siguiente = cima; //que siguiente apunte hacia la cima
        cima = nuevo;
    }


    public Object quitar() throws Exception
    {
        if (pilaVacia())
            throw new Exception ("Pila vacía, no se puede extraer.");
        Object aux = cima.elemento; //tomamos el elemento qu etenemos en la cima
        cima = cima.siguiente;//Aquí estamos desapilando
        return aux;
    }


    public Object cimaPila() throws Exception
    {
        if (pilaVacia())
            throw new Exception ("Pila vacía, no se puede leer cima.");
        return cima.elemento;
    }


    public void limpiarPila()
    {
        NodoPila t;
        while(!pilaVacia())
        {
            t = cima;
            cima = cima.siguiente;
            t.siguiente = null;
        }
    }
}
