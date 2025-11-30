package br.com.merlo.test;

import org.junit.Assert;
import org.junit.Test;

public class PrimeiroTest {

    @Test
    public void Test(){
        String nome = "matheus";
        Assert.assertEquals("matheus",nome);
    }

    @Test
    public void OutroTest(){
        String nome = "matheus";
        Assert.assertEquals("matheus",nome);
    }
}