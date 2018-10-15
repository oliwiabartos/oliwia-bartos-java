package com.kodilla.stream;
import com.kodilla.stream.beautifier.PoemBeautifier;
public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier beautify = new PoemBeautifier();
        beautify.beautify("Abc",(s)->s.toUpperCase());
        beautify.beautify("SBCDFGJRRR",(s)->s.toLowerCase());
        beautify.beautify("ANNA KOWALSKA", (s)->s.toLowerCase()+ " abABbc");


    }
}