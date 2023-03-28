import javax.swing.*;

public class Camarote extends Ingresso {


        public double ingressoCamarote =100;
        public double acrescimoCamarote = 200;

        public Camarote (double valor ){
            super(valor);
            ingressoCamarote = ingressoCamarote + acrescimoCamarote;
            //JOptionPane.showInputDialog("Ingresso Camarote");
        }
}
