import javax.swing.*;

public class Prog06 {
    public static void main(String[] args) {

        float nota1 = 0, nota2 = 0, media = 0;
        String msg= "-Resultado- \n";

        nota1= Float.parseFloat(
                JOptionPane.showInputDialog(null, "Informe a nota 1: "));

        nota2= Float.parseFloat(
                JOptionPane.showInputDialog(null, "Informe a nota 2: "));

        media = (nota1 + nota2)/2;

        if (media>=7 & media <11){
            msg += "Media: " + media + "\nAprovado!";
            JOptionPane.showMessageDialog(null,msg);
        }
        else if (media <=6){
            msg +="Media: " +media+ "\nReprovado";
            JOptionPane.showMessageDialog(null,msg);
        }
        else if (media >10){
            msg +="Erro na digitacao das notas!";
            JOptionPane.showMessageDialog(null,msg);
        }

    }
}
