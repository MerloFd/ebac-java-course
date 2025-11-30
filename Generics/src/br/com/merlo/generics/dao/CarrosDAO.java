package br.com.merlo.generics.dao;

import br.com.merlo.generics.domain.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarrosDAO <T extends Carro> implements ICarrosDAO<T>{

    public List<T> lista;

    public CarrosDAO(){
        this.lista = new ArrayList<>();
    }


    @Override
    public Boolean cadastrarPedido(T modelo) {
        if (lista.contains(modelo)){
            return false;
        }
        lista.add(modelo);
        return true;
    }

    @Override
    public T consultarPedidos(Long codigo) {
        for (T carro : lista) {
            if (carro.getCodigo().equals(codigo)) {
                return carro;
            }
        }
        return null;
    }
}
