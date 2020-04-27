package com.kod.stream;

import com.kod.stream.beautifier.PoemBeautifier;
import com.kod.stream.beautifier.PoemDecorator;

public class StreamMain {
    public static void main(String[] args) {
        System.out.println("Welcome to module 7 - Stream");

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("lalala",String::toUpperCase);
        poemBeautifier.beautify("hej", tekst -> tekst.toUpperCase());
        poemBeautifier.beautify("no co tam?",tekst -> tekst.replace('o','a') );
        poemBeautifier.beautify("ALE JAJA", tekst -> tekst.toLowerCase());
    }
}