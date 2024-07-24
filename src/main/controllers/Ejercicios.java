package main.controllers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Ejercicios {
    public void contarFrecuenciaDePalabras(String text){
        Map<String,Integer> frecuencia = new HashMap<>();
        for(int i=0; i<text.length(); i++){
            frecuencia.put(text, i);

        }


    }
    public void verificarCaracteresUnicos(String input){
        HashSet<Character> caracteres = new HashSet<>();
        for(int i=0; i<input.length(); i++){
            caracteres.add(input.charAt(i));

            if(caracteres[i]=input.charAt(i)){
                System.out.println("La cadena no tiene todos los carácteres únicos");
            }else{
                System.out.println("La cadena de carácteres tiene todos los carácteres únicos");
            }
        }

    }
}
