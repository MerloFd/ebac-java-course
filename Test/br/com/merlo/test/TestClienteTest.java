package br.com.merlo.test;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
public class TestClienteTest {
    @Test
    public void Testando(){
        TestClienteClass test = new TestClienteClass();
        test.adicionarNome("matheus");

        Assert.assertEquals("matheus",test.getNome());
    }
}