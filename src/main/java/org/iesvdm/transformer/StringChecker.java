package org.iesvdm.transformer;

public class StringChecker implements Checker{

    String frase ;

    public StringChecker(String f){
        this.frase = f;
    }


    @Override
    public boolean check(Integer t) {
        return frase.length() < t;
    }


}
