/*
 * Decompiled with CFR 0.145.
 */
import java.io.PrintStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;

public class Class_44408 {
    private ArrayList Field_44409 = new ArrayList();

    public void Method_44410(String string) {
        System.out.println(string + "GameData");
        for (int i = -32639 & 17220; i < this.Field_44409.size(); ++i) {
            ((Class_26398)this.Field_44409.get(i)).Method_26403(string + "\t");
        }
    }

    private void Method_44411() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

