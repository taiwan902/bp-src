/*
 * Decompiled with CFR 0.145.
 */
import java.io.PrintStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;

public class Class_32495
extends Class_14678 {
    private ArrayList Field_32496 = new ArrayList();

    public void Method_32497(String string) {
        System.out.println(string + "Item Container " + this.\u0000strictfp + "," + this.\u0000strictfp);
        for (int i = -32448 & 2070; i < this.Field_32496.size(); ++i) {
            ((Class_14678)this.Field_32496.get(i)).Method_14682(string + "\t");
        }
    }

    private void Method_32498() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

