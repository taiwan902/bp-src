/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_15734
extends IllegalArgumentException {
    public Class_15734(Class_2849 class_2849, int n) {
        Object[] arrobject = new Object[662 & 10243];
        arrobject[-31739 & 16904] = n;
        arrobject[-30719 & 4129] = class_2849;
        super(String.format("Invalid index %d requested for %s", arrobject));
    }

    public Class_15734(Class_2849 class_2849, String string) {
        Object[] arrobject = new Object[23054 & 99];
        arrobject[16403 & 2048] = class_2849;
        arrobject[16421 & 8193] = string;
        super(String.format("Error parsing: %s: %s", arrobject));
    }

    private void Method_15735() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_15734(Class_2849 class_2849, Throwable throwable) {
        Object[] arrobject = new Object[2179 & -24047];
        arrobject[7091 & -16384] = class_2849;
        super(String.format("Error while parsing: %s", arrobject), throwable);
    }
}

