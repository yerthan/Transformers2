package org.iesvdm.transformer;

import java.util.ArrayList;

public class arrayListChecker<T> implements Checker{

    ArrayList<T> arrayList ;

    public arrayListChecker(){
        this.arrayList = new ArrayList<>();
    }

    @Override
    public boolean check(Integer t) {
        return false;
    }
}
