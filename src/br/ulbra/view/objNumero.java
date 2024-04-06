
package br.ulbra.view;

import java.util.ArrayList;


class objNumero {
     public ArrayList<Integer> numerosAL;

    public objNumero() {
        numerosAL = new ArrayList();
    }

     public void adicionar(int numero) {
        numerosAL.add(numero);
    }

    public String listarNumeros() {
        String lista = "Lista de números: \n"; 
       if (!numerosAL.isEmpty()) { 
            for (int i = 0; i < numerosAL.size(); i++) { 
                lista += "Cód " + (i + 1) + " - " + numerosAL.get(i) + "\n";
            }
        } else { 
            lista = "A lista de números se encontra vazia";
        }

        return lista;
    }
}
