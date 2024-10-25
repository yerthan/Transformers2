package org.iesvdm.transformer;

public class IntegerChecker implements Checker{

    public Integer num;

    public IntegerChecker(Integer num){
        this.num = num;
    }


    @Override
    public boolean check(Integer o) {

        Integer num = o.intValue();

        return num % 2 == 0;
    }
}
