package org.example;


public interface MiArray {
    public void aadir(int valor);
    public void eliminar (int posicion);
    public void vaciar ();
    public boolean esVacio();
    public int tamao();
    public int primero();
    public int ultimo();
    public int devolverPosicion(int posicion);
}
