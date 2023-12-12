package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;



public class IVentana extends JFrame {
    private MiArray adaptadorLista;
    private JTextArea resultTextArea;

    public IVentana(MiArray adaptadorLista) {
        this.adaptadorLista = adaptadorLista;

        setTitle("Interfaz MiArray");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new BorderLayout());

        resultTextArea = new JTextArea();
        resultTextArea.setEditable(false);
        add(resultTextArea, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new GridLayout(2, 4));
        addButton("Agregar", e -> {
            int valor = (int) (Math.random() * 100);
            adaptadorLista.aadir(valor);
            updateResultText();
        }, buttonPanel);

        addButton("Eliminar", e -> {
            if (!adaptadorLista.esVacio()) {
                int posicion = (int) (Math.random() * adaptadorLista.tamao());
                adaptadorLista.eliminar(posicion);
                updateResultText();
            }
        }, buttonPanel);

        addButton("Vaciar", e -> {
            adaptadorLista.vaciar();
            updateResultText();
        }, buttonPanel);

        addButton("Es Vacío", e -> {
            resultTextArea.append("¿Es vacío? " + adaptadorLista.esVacio() + "\n");
        }, buttonPanel);

        addButton("Tamaño", e -> {
            resultTextArea.append("Tamaño: " + adaptadorLista.tamao() + "\n");
        }, buttonPanel);

        addButton("Primero", e -> {
            if (!adaptadorLista.esVacio()) {
                resultTextArea.append("Primero: " + adaptadorLista.primero() + "\n");
            }
        }, buttonPanel);

        addButton("Último", e -> {
            if (!adaptadorLista.esVacio()) {
                resultTextArea.append("Último: " + adaptadorLista.ultimo() + "\n");
            }
        }, buttonPanel);

        addButton("Devolver Posición", e -> {
            if (!adaptadorLista.esVacio()) {
                int posicion = (int) (Math.random() * adaptadorLista.tamao());
                resultTextArea.append("Posición " + posicion + ": " + adaptadorLista.devolverPosicion(posicion) + "\n");
            }
        }, buttonPanel);

        add(buttonPanel, BorderLayout.SOUTH);
    }

    private void addButton(String text, ActionListener listener, JPanel panel) {
        JButton button = new JButton(text);
        button.addActionListener(listener);
        panel.add(button);
    }

    private void updateResultText() {
        resultTextArea.setText("");
        for (int i = 0; i < adaptadorLista.tamao(); i++) {
            resultTextArea.append(adaptadorLista.devolverPosicion(i) + " ");
        }
        resultTextArea.append("\n");
    }
}
