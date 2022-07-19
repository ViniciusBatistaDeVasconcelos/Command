package model;

public class TarefaAberturaConta implements Tarefa {

    private Conta conta;

    public TarefaAberturaConta(Conta conta) {
        this.conta = conta;
    }

    public void executar() {
        this.conta.abrirConta();
    }

    public void cancelar() {
        this.conta.fecharConta();
    }
}
