package org.iesvdm;

import org.iesvdm.transformer.Joiner;
import org.iesvdm.transformer.Transformer;
import org.iesvdm.transformer.Transformers;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        ArrayList<Integer> array1 = new ArrayList<>();
        array1.add(1);
        array1.add(2);
        array1.add(3);

        ArrayList<Integer> array2 = new ArrayList<>();
        array2.add(4);
        array2.add(5);
        array2.add(6);

        // Definir un Transformer que sume los elementos y duplique un solo elemento
        Transformer<Integer> intTransformer = new Transformer<>() {
            @Override
            public Integer transform(Integer item) {
                return item * 2;  // Duplica el valor
            }
        };

        // Definir un Joiner que sume los elementos de dos listas
        Joiner<Integer> sumJoiner = new Joiner<Integer>() {
            @Override
            public Integer join(Integer item1, Integer item2) {
                return item1 + item2;  // Suma los dos elementos
            }
        };

        // Probar applyConst: No modifica la lista original
        ArrayList<Integer> transformedList = Transformers.applyConst(intTransformer, array1);
        System.out.println("Lista original: " + array1);
        System.out.println("Lista transformada (applyConst): " + transformedList);

        // Probar applyDest: Modifica la lista original
        Transformers.applyDest(intTransformer, array1);
        System.out.println("Lista modificada (applyDest): " + array1);

        // Probar zipArrayList: Combina las dos listas
       /* ArrayList<Integer> zippedList = Transformers.zipArrayList(sumJoiner, array1, array2);
        System.out.println("Lista combinada (zipArrayList): " + zippedList);*/
    }
    }
