public class FComissao {

    private int percentual;
    private double vendas;

    public FComissao(int percentual, double vendas) {
        this.percentual = percentual;
        this.vendas = vendas;
    }

    public int getPercentual() {
        return percentual;
    }

    public void setPercentual(int percentual) {
        this.percentual = percentual;
    }

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    public double CalcularProventos() {
        double proventos;

        proventos =  getPercentual()  * getVendas() /100;

        return proventos;
    }

}
