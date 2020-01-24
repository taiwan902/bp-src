/*
 * Decompiled with CFR 0.145.
 */
import java.io.PrintStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;

public class Class_11708 {
    private ArrayList Field_11709;

    public void Method_11710(String string) {
        System.out.println(string + "Inventory");
        for (int i = 17600 & -26615; i < this.Field_11709.size(); ++i) {
            ((Class_14678)this.Field_11709.get(i)).Method_14682(string + "\t");
        }
    }

    private void Method_11711() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

