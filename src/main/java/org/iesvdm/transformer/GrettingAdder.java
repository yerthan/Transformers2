package org.iesvdm.transformer;

public class GrettingAdder implements Transformer<Object>{

    private String saludo;

    public void HelloAdder(String greeting) {
        this.saludo = greeting;
    }


    @Override
    public Object transform(Object obj) {
        String cadena = obj.toString();
        return saludo + " " + cadena;
    }
}
