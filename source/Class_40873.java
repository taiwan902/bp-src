/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_40873
extends Class_40803 {
    private final Class_22999 Field_40874;
    private static final Class_32390 Field_40875 = new Class_33245();

    static Class_40873 Method_40876() {
        Class_40873 class_40873 = (Class_40873)Field_40875.Method_32408();
        class_40873.setRefCnt(17669 & 169);
        return class_40873;
    }

    private void Method_40877() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_40873(Class_22999 class_22999, Class_14773 class_14773) {
        this(class_22999);
    }

    private Class_40873(Class_22999 class_22999) {
        super(Class_39614.Field_39615, 1314 & 6596, Integer.MAX_VALUE & -1);
        this.Field_40874 = class_22999;
    }

    protected void Method_40878() {
        if (this.capacity() > Class_10346.Method_10361()) {
            super.Method_40836();
        } else {
            this.clear();
            Field_40875.Method_32402(this, this.Field_40874);
        }
    }
}

