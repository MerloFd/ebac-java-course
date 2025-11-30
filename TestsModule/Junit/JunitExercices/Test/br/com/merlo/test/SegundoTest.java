package br.com.merlo.test;

import org.junit.Assert;
import org.junit.Test;

public class SegundoTest {
    @Test
    public void Teste2(){
        String nome = "matheus";
        Assert.assertEquals("matheus",nome);
    }
}
