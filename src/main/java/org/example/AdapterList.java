package org.example;


import java.util.ArrayList;
import java.util.List;

public class AdapterList implements MiArray {
    private List<Integer> lista;

    public AdapterList() {
        lista = new ArrayList<>();
    }

    @Override
    public void aadir(int valor) {
        lista.add(valor);
    }

    @Override
    public void eliminar(int posicion) {
        if (posicion >= 0 && posicion < lista.size()) {
            lista.remove(posicion);
        }
    }

    @Override
    public void vaciar() {
        lista.clear();
    }

    @Override
    public boolean esVacio() {
        return lista.isEmpty();
    }

    @Override
    public int tamao() {
        return lista.size();
    }

    @Override
    public int primero() {
        if (!lista.isEmpty()) {
            return lista.get(0);
        }
        return 0;
    }

    @Override
    public int ultimo() {
        if (!lista.isEmpty()) {
            return lista.get(lista.size() - 1);
        }
        return 0;
    }

    @Override
    public int devolverPosicion(int posicion) {
        if (posicion >= 0 && posicion < lista.size()) {
            return lista.get(posicion);
        }
        return 0;
    }
}
