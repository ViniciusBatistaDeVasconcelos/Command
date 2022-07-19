package model;

public class Conta {

    private Titular titular;
    private String contaCorrente;
    private String agencia;
    private String banco;
    private String cidade;
    private String estado;
    private String situacao;

    public Conta(Titular titular, String contaCorrente, String agencia, String banco, String cidade, String estado) {
        this.titular = titular;
        this.contaCorrente = contaCorrente;
        this.agencia = agencia;
        this.banco = banco;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getSituacao() {
        return situacao;
    }

    public void abrirConta() {
        this.situacao = "Conta aberta";
    }

    public void fecharConta() {
        this.situacao = "Conta fechada";
    }
}
