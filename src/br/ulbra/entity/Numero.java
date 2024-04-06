
package br.ulbra.entity;

import java.util.ArrayList;
import javax.swing.JOptionPane;



public class Numero {
   public ArrayList<Integer> numerosAL;

    public Numero() {
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

    public String alterar(int codigo, int novoNumero) { 
        String lista = "Lista de números: \n";
         if (!numerosAL.isEmpty()) { 
            if ((codigo - 1) >= 0 && (codigo - 1) <= numerosAL.size()) {
                numerosAL.set((codigo - 1), novoNumero);
                JOptionPane.showMessageDialog(null, "O número código " + codigo + " foi alterado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Este código ainda não foi cadastrado");
            }
        } else { 
            lista = "A lista de números se encontra vazia";
        }

        return lista;
    }

    
    public String deletar(int codigo) {
        String lista = "Lista de números: \n"; 
         if (!numerosAL.isEmpty()) { 
            if ((codigo - 1) >= 0 && (codigo - 1) <= numerosAL.size()) {
                numerosAL.set((codigo - 1), codigo);
                JOptionPane.showMessageDialog(null, "O número código " + codigo + " foi deletado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Este código ainda não foi cadastrado");
            }
        } else { 
            lista = "A lista de números se encontra vazia";
        }

        return lista;
    }

}
  

    
    
   



   

    