package org.iesvdm.transformer;

import java.util.ArrayList;
import java.util.List;

import static org.iesvdm.transformer.Transformers.transformList;

public class Main {

    public static void main(String[] args) {

        String prueba = "1,2,3";
        String[] nums = prueba.split(",");
        for(String num : nums) {
            System.out.println(num);
        }

        ArrayList<Integer> array1 = new ArrayList<>();
        array1.add(1);
        array1.add(2);
        array1.add(3);

        ArrayList<Integer> array2 = new ArrayList<>();
        array2.add(4);
        array2.add(5);
        array2.add(6);;

    }
}

