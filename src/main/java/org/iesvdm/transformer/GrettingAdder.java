package org.iesvdm.transformer;

public class GrettingAdder implements Transformer<String>{

    private String saludo;

    public void setSaludo(String greeting) {
        this.saludo = greeting;
    }


    @Override
    public String transform(String obj) {
        return saludo + " " + obj;
    }
}
