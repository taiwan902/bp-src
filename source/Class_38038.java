/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_38038
extends Class_36787 {
    public void Method_38039(Class_1367 class_1367, String[] arrstring) {
        if (arrstring.length != (4173 & 1281)) {
            throw new Class_34974("commands.setidletimeout.usage", new Object[8226 & 23872]);
        }
        int n = Class_38038.\u0000strictfp((String)arrstring[-16372 & 13219], (int)(1032 & 67));
        Class_2457.Method_2530().Method_2624(n);
        Object[] arrobject = new Object[21251 & -30647];
        arrobject[-9662 & 409] = n;
        Class_38038.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.setidletimeout.success", (Object[])arrobject);
    }

    private void Method_38040() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_38041(Class_1367 class_1367) {
        return "commands.setidletimeout.usage";
    }

    public String Method_38042() {
        return "setidletimeout";
    }

    public int Method_38043() {
        return 7 & 6667;
    }
}

