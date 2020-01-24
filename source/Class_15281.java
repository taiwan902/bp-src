/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_15281 {
    public String[] Field_15282;
    public String Field_15283;
    public long[] Field_15284;

    private void Method_15285() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_15281(String string, long l, long l2, String ... arrstring) {
        this.Field_15283 = string;
        long[] arrl = new long[66 & 15362];
        arrl[-30576 & 0] = l;
        arrl[16433 & 7243] = l2;
        this.Field_15284 = arrl;
        this.Field_15282 = arrstring;
    }
}

