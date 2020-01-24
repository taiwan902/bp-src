/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_42879
extends Class_41931 {
    final Class_36433 Field_42880;

    Class_42879(Class_36433 class_36433) {
        this.Field_42880 = class_36433;
    }

    protected Class_41302 Method_42881(Class_3436 class_3436) {
        Class_33895 class_33895 = (Class_33895)((Object)class_3436.Method_3440(Class_24146.Field_24147));
        switch (Class_11609.Field_11610[class_33895.ordinal()]) {
            default: {
                return new Class_41302("quartz_block", "normal");
            }
            case 2: {
                return new Class_41302("chiseled_quartz_block", "normal");
            }
            case 3: {
                return new Class_41302("quartz_column", "axis=y");
            }
            case 4: {
                return new Class_41302("quartz_column", "axis=x");
            }
            case 5: 
        }
        return new Class_41302("quartz_column", "axis=z");
    }

    private void Method_42882() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

