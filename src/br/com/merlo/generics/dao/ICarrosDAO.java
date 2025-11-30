package br.com.merlo.generics.dao;

import br.com.merlo.generics.domain.Carro;

public interface ICarrosDAO <T extends Carro> {
    public Boolean cadastrarPedido(T modelo);
    public T consultarPedidos(Long codigo);
}
