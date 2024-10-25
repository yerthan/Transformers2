package org.iesvdm.transformer;

import java.util.ArrayList;

public class Transformers
{
    public static <T> ArrayList<T> applyConst(Transformer<T> tran, ArrayList<T> a)
    {
        ArrayList<T> b = new ArrayList<>();
        for(T t : a)
            b.add(tran.transform(t));
        return b;
    }


    //Exercise 2 we must create a constructor called applyDest

    public static <T> ArrayList<T> applyDest(Transformer<T> tran, ArrayList<T> a){

        ArrayList<T> b = new ArrayList<>();

        for (T t : a){
            int i = a.indexOf(t);
            a.set(i, tran.transform(t));
        }

        return a;
    }


    //Exercise 5
    public static <T> LispList<T> transformList(Transformer<T> tran, LispList<T> l) {
        ArrayList<T> a = new ArrayList<>();

        if (l.isEmpty()) {
            System.out.println("The ArrayList is empty");
        } else {

            T transformedHead = tran.transform(l.head());
            LispList<T> transformedTail = transformList(tran, l.tail());
            return transformedTail.cons(transformedHead);
        }


        return l;
    }


}

