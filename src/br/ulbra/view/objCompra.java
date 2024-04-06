
package br.ulbra.view;

import java.util.ArrayList;
import javax.swing.JOptionPane;

class objCompra {
  public ArrayList compras;

    public objCompra (){
        compras = new ArrayList();
    }
    //create - salvar add
    public void salvar(String item){
        compras.add(item);
        JOptionPane.showMessageDialog (null, "salvo com sucesso, aeee!!");    }
    //read - listar
    public String listar (){
        String res = "";
        if (!compras.isEmpty())
            for (int i = 0; i < compras.size(); i++){
                res += (i + 1) + "- " + compras.get(i) + "\n";
            }
        else{
            res = "Pô mano...a lista tá vazia...";
        }
        return (null);
        