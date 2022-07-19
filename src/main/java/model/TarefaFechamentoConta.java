package model;

public class TarefaFechamentoConta implements Tarefa {

    private Conta conta;

    public TarefaFechamentoConta(Conta conta) {
        this.conta = conta;
    }

    public void executar() {
        this.conta.fecharConta();
    }

    public void cancelar() {
        this.conta.abrirConta();
    }
}
