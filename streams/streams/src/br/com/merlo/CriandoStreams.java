package br.com.merlo;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {

        //pra criar uma stream, basta criar uma collection e colocar um .stream() no final
        List<String> lista1 = new ArrayList<>();
        lista1.add("value");
        lista1.add("value1");
        lista1.add("value2");

        Stream<String> streamLista = lista1.stream();

        //da pra criar uma collection sem passar pela implementação, usando o Collection.of
        List<String> lista = List.of("matheus","merlo");
        Stream<String> listaStream = lista.stream();

        Set<String> set = Set.of("listagem","de Sets");
        Stream<String> setStream = set.stream();

        Map<String, String> map = Map.of("Chave", "valor");
        Stream<String> mapStreamValues = map.values().stream();
        Stream<String> mapStringKeys = map.keySet().stream();

        //criar a listagem pelo collection.of( ) já aplicando a Stream
        Stream<String> streamListDireto = List.of("Listagem", "Direta", "com Stream").stream();

        Stream<String> streamSetDireto =Set.of("Listagem", "Direta", "com Stream").stream();

        Map<String, String> map1 = Map.of("Chaves", "Valores");
        Stream<String> mapaChaves = map.keySet().stream();
        Stream<String> mapaValores = map.values().stream();

        //Criar a listagem a partir da classe Stream
        Stream<Integer> numberStream = Stream.of(1,2,3,4,5);
        Stream<String> stringStream = Stream.of("valores","da","stream");

        IntStream intStreams = Arrays.stream(new int[]{1, 2, 3, 4, 5});
    }
}
