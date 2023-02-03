package exercicio.collections.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class ExemploMap {
    public static void main(String[] args) {
        System.out.println("Crie um dicionario que relacione os modelos e seus respectivos consumos");
        Map<String, Double> carrospopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("pegout", 14.5);
            put("fusca", 15.6);
        }};
        System.out.println("Substitua o consumo do gol por 15.2 km/h");
        carrospopulares.put("gol", 15.2);
        System.out.println("Confira se o modelo tucson esta no dicionario: " 
        + carrospopulares.containsKey("tucson"));
        System.out.println("Exiba o consumo do uno: " + carrospopulares.get("uno"));
        System.out.println("exiba os modelos: " + carrospopulares.keySet());
        //Set<String> carros = carrospopulares.keySet();
        //System.out.println("carros: " + carros);
        System.out.println("exiba o consumo dos carros: " + carrospopulares.values());
        //Collection<Double> values = carrospopulares.values();
        System.out.println("exiba o modelo mais economico e o seu consumo");
        Double consumoMaisEficiente = Collections.max(carrospopulares.values());
        Set<Map.Entry<String, Double>> entries = carrospopulares.entrySet();
        String modeloMaisEficiente = "";

        for(Map.Entry<String, Double> entry : entries){
            if (entry.getValue().equals(consumoMaisEficiente)){
                modeloMaisEficiente = entry.getKey();
                System.out.print("modelo mais eficiente: " + modeloMaisEficiente + "-"
                + consumoMaisEficiente);
            }
        }
        
        System.out.println("\nExiba o modelo menos econômico e seu consumo");
        Double consumoMenosEficiente = Collections.min(carrospopulares.values());
        String modeloMenosEficiente = "";
        for(Map.Entry<String, Double> entry: carrospopulares.entrySet()){
            if (entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + "-"
                 + consumoMenosEficiente);
            }
        }
        Iterator<Double> iterator = carrospopulares.values().iterator();
        Double soma = 0d;
        while(iterator.hasNext()) soma += iterator.next();
        System.out.println("Exiba a soma dos consumos: " + soma);
        System.out.println("Exiba a média dos consumos: " + (soma/carrospopulares.size()));
        Iterator<Double> iterator2 = carrospopulares.values().iterator();
        while(iterator2.hasNext()) if(iterator2.next().equals(15.6)) iterator2.remove();
        System.out.println("exiba os carros na ordem informada:");
        Map<String, Double> carrospopulares1 = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("pegout", 14.5);
            put("fusca", 15.6);
        }};
        System.out.println("exiba os carros na ordem de modelos:");
        Map<String, Double> carrospopulares2 = new TreeMap<>(carrospopulares1);
        System.out.println(carrospopulares2);
        System.out.println("apague um dicionario de carros");
        carrospopulares2.clear();
        System.out.println("confira se o dicionario esta vazio: " + carrospopulares.isEmpty());
        //System.out.println(carrospopulares.toString());
    }
}