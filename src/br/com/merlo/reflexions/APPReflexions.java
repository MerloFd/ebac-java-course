package br.com.merlo.reflexions;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class APPReflexions {
    public static void main(String[] args) {
        //pegando o nome da class
        //pela classe diretamente
        Class clazz = Produto.class;
        System.out.println("Diretamente: " + clazz);

        //pelo produto da classe
        Produto prod = new Produto();
        Class clazz1 = prod.getClass();
        System.out.println("Pelo produto: " + clazz1);

        //instanciar pela reflexion
        //primeiro pega o construtor
        //é necessario try catch por conta dos erros possiveis
        try {
            Constructor cons = clazz.getConstructor();
            Produto prod1 = (Produto) cons.newInstance();
            System.out.println("O constructor da classe: " + cons);

            //pegando a lista de propriedades da classe
            System.out.println("---LISTA DAS PROPRIEDADES DA CLASSE: ---");
            Field[] fields = prod1.getClass().getDeclaredFields();
            for (Field field: fields){
                //agora tem acesso aos valores dos campos(retorno, nome, modifiers etc)
                //field.get (ctrl+space)

                String nome = field.getName();
                Class<?> type = field.getType();

                System.out.println("Nome da propriedade: " + nome);
                System.out.println("Tipo da propriedade: " + type);
                }

            System.out.println("---LISTA DOS MÉTODOS DA CLASSE: ---");
            Method[] method = prod1.getClass().getDeclaredMethods();
            for (Method m: method){
                String nome = m.getName();
                Class<?> type = m.getReturnType();

                System.out.println("Nome do método: " + nome);
                System.out.println("Tipo do retorno: " + type);

                System.out.println("---EXECUTANDO MÉTODOS---");
                if (m.getName().startsWith("get")) {
                    System.out.println("---Get---");
                    System.out.println(m.invoke(prod1));
                } else{
                    //validar o tipo de parametros para saber qual set que é
                    for (Class classTypes : m.getParameterTypes()){
                        if (classTypes.equals(String.class)){
                            System.out.println(m.invoke(prod1, "Set String"));
                        } else if (classTypes.equals(Long.class)){
                            System.out.println(m.invoke(prod1, 10l));
                        } else {
                            System.out.println(m.invoke(prod1, 20d));
                        }
                    }
                }
            }


        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
