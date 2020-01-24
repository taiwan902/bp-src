/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_15274 {
    public long[] Field_15275;
    public String Field_15276;
    public String[] Field_15277;

    public Class_15274(String string, long l, long l2, String ... arrstring) {
        this.Field_15276 = string;
        long[] arrl = new long[6 & 23043];
        arrl[-30719 & 17426] = l;
        arrl[9751 & -16023] = l2;
        this.Field_15275 = arrl;
        this.Field_15277 = arrstring;
    }

    private void Method_15278() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

