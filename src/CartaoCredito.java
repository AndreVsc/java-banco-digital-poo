public public class CartaoCredito {
    private String numeroCartao;
    private String nomeTitular;
    private String validade;
    private double limite;
    private double saldoDevedor;

    public CartaoCredito(String numeroCartao, String nomeTitular, String validade, double limite) {
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
        this.validade = validade;
        this.limite = limite;
        this.saldoDevedor = 0;
    }

    public void realizarCompra(double valor) {
        if (valor <= limite - saldoDevedor) {
            saldoDevedor += valor;
        } else {
            System.out.println("Limite insuficiente.");
        }
    }

    public void pagarFatura(double valor) {
        saldoDevedor -= valor;
    }

    public double getSaldoDevedor() {
        return saldoDevedor;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public String getValidade() {
        return validade;
    }

    public double getLimite() {
        return limite;
    }
}