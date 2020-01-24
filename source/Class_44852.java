/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_44852
extends Class_40565 {
    private final Class_22999 Field_44853;
    private static final Class_32390 Field_44854 = new Class_33726();

    private void Method_44855() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    static Class_44852 Method_44856() {
        Class_44852 class_44852 = (Class_44852)Field_44854.Method_32408();
        class_44852.setRefCnt(16897 & 5391);
        return class_44852;
    }

    protected void Method_44857() {
        if (this.capacity() > Class_10346.Method_10361()) {
            super.Method_40574();
        } else {
            this.clear();
            Field_44854.Method_32402(this, this.Field_44853);
        }
    }

    private Class_44852(Class_22999 class_22999) {
        super(Class_39614.Field_39615, 8517 & -11894, Integer.MAX_VALUE & Integer.MAX_VALUE);
        this.Field_44853 = class_22999;
    }

    Class_44852(Class_22999 class_22999, Class_14773 class_14773) {
        this(class_22999);
    }
}

