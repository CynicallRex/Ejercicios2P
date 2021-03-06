public class Lista {
    protected Nodo inicio, fin;
    public  Lista(){
        inicio = null;
        fin = null;
    }

    public void agregarAlInicio(int elemento){
        inicio = new Nodo(elemento, inicio);
        if (fin == null){
            fin = inicio;
        }
    }
    public void mostrarLista(){
        Nodo recorrer = inicio;
        while (recorrer != null){
            System.out.println("["+recorrer.dato+"]--->");
            recorrer = recorrer.siguiente;
        }
    }
}
