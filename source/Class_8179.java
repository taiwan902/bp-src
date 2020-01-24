/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ComparisonChain
 */
import com.google.common.collect.ComparisonChain;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Comparator;

public final class Class_8179
implements Comparator {
    final Class_4751 Field_8180;

    public int Method_8181(Class_1061 class_1061, Class_1061 class_10612) {
        return ComparisonChain.start().compare(class_1061.Method_1172(this.Field_8180), class_10612.Method_1172(this.Field_8180)).result();
    }

    Class_8179(Class_4751 class_4751) {
        this.Field_8180 = class_4751;
    }

    public int Method_8182(Object object, Object object2) {
        return this.Method_8181((Class_1061)object, (Class_1061)object2);
    }

    private void Method_8183() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

