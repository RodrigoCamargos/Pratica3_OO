import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        double Ingresso = 0;
        double ingressoCamarote = 0;
        double ingressoVip = 0;

        int opcao = Integer.parseInt(JOptionPane.showInputDialog("Selecione o tipo de ingresso: \n(1) Ingresso Normal \n(2) VIP  \n(3) Camarote. "));

        if (opcao == 1) {

            Normal a = new Normal(Ingresso);
            JOptionPane.showInputDialog("Ingresso Normal, o valor do ingresso é de " + a.ingresso);

        } else if (opcao == 2) {

            Vip c = new Vip(ingressoVip);
            JOptionPane.showInputDialog("Ingresso Vip, o valor do Vip é de " + c.ingressoVip);

        } else if (opcao == 3) {

            Camarote b = new Camarote(ingressoCamarote);
            JOptionPane.showInputDialog("Ingresso Camarote, o valor do Camarote é de " + b.ingressoCamarote);
            
        } else {
            JOptionPane.showInputDialog("Opção invalida");

            }
        }
    }