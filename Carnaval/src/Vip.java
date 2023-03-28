import javax.swing.*;

public class Vip extends Ingresso{


        public double ingressoVip=100;
        public int acrescimoVip = 50;

        public Vip (double valor){
            super(valor);
            ingressoVip = ingressoVip + acrescimoVip;
           // JOptionPane.showInputDialog("Ingresso Vip");
        }
}
