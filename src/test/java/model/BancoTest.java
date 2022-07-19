package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BancoTest {

    Banco banco;
    Conta conta;

    @BeforeEach
    void setUp() {
        banco = new Banco();
        conta = new Conta(new Titular("Gabriela Giovanna Peixoto", "787.332.336-67"), "1116416-6", "3936", "Banco do Brasil", "Rio Negro", "MS");
    }

    @Test
    void deveAbrirConta() {
        Tarefa contaAbertura = new TarefaAberturaConta(conta);
        banco.executarTarefa(contaAbertura);

        assertEquals("Conta aberta", conta.getSituacao());
    }

    @Test
    void deveFecharConta() {
        Tarefa contaFechamento = new TarefaFechamentoConta(conta);
        banco.executarTarefa(contaFechamento);

        assertEquals("Conta fechada", conta.getSituacao());
    }

    @Test
    void deveCancelarFechamentoConta() {

        Tarefa contaAbertura = new TarefaAberturaConta(conta);
        Tarefa contaFechamento = new TarefaFechamentoConta(conta);

        banco.executarTarefa(contaAbertura);
        banco.executarTarefa(contaFechamento);

        banco.cancelarUltimaTarefa();

        assertEquals("Conta aberta", conta.getSituacao());
    }
}