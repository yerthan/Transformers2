import org.iesvdm.transformer.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.annotation.processing.SupportedAnnotationTypes;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio6 {

    @Test
    public void test() {

        GrettingAdder adder = new GrettingAdder();
        adder.setSaludo("hola");
        ArrayList<String> nombre = new ArrayList<>();
        nombre.add("Jose");
        nombre.add("Ana");

        Transformers.<String>applyDest(adder, nombre);
        assertEquals("hola Jose", nombre.get(0));

        }
}
