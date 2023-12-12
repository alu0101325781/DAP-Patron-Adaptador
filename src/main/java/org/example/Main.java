package org.example;
import org.example.*;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Crea una instancia de AdaptadorLista y la pasa a la InterfazMiArray
            MiArray adapterList = new AdapterList();
            IVentana interfaz = new IVentana(adapterList);
            interfaz.setVisible(true);
        });
    }
}
