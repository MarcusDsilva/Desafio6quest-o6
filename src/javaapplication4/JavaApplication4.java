/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
      int cont;
      double valorcompra, bonus;
      String nome,perc="", res="                   listagem dos bonus\n"
              +"         NOME            VALOR R$             BONUS\n";    
      for(cont=1; cont<=2; cont++){
          nome = JOptionPane.showInputDialog("Informe o nome:");
          valorcompra = Double.parseDouble(JOptionPane.
                  showInputDialog("Informe o valor da compra no ano passado:"));
          if(valorcompra <= 500000){
             bonus = valorcompra * 0.1;
             perc = "10%";
          }else{
               bonus = valorcompra *0.15;
               perc = "15%";
          }
        res = res + " "+nome+" - R$"+valorcompra
               +" - obteve - "+perc+" R$ "+bonus+"\n"; 
    }
      JOptionPane.showMessageDialog(null, res);
}
}