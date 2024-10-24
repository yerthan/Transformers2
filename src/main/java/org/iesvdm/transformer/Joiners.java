package org.iesvdm.transformer;


import java.util.ArrayList;

public class Joiners
{
    public static <T> LispList<T> zipLists(Joiner<T> joiner,LispList<T> ls1,LispList<T> ls2)
    {
        if(ls1.isEmpty()||ls2.isEmpty())
            return LispList.empty();
        else
        {
            T h = joiner.join(ls1.head(),ls2.head());
            LispList<T> t = zipLists(joiner,ls1.tail(),ls2.tail());
            return t.cons(h);
        }
    }


    public static <T> ArrayList<T> zipArrayList(Joiner T, ArrayList<T> array1, ArrayList<T> array2 ){

        ArrayList list = new ArrayList();


        if(array1.isEmpty()){
            System.out.println("The first arrayList is empty");
        }else if (array2.isEmpty()){
            System.out.println("The second arrayList is empty");
        }else{
            System.out.println("both are not empty");

            int suma = array1.size() + array2.size();

            for(int i=0;i<suma;i++) {
                T joined = (T) T.join(array1.get(i), array2.get(i));
                list.add(joined);
            }
        }

        return list;
    }
}