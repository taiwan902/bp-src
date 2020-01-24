/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public abstract class Class_21785 {
    protected int Field_21786;
    protected int Field_21787;
    protected int Field_21788;
    protected Class_29437 Field_21789 = new Class_29437();
    protected Class_561 Field_21790;

    private void Method_21791() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_21792() {
    }

    public abstract int Method_21793(Class_26869[] var1, Class_1061 var2, Class_26869 var3, Class_26869 var4, float var5);

    public abstract Class_26869 Method_21794(Class_1061 var1, double var2, double var4, double var6);

    public void Method_21795(Class_561 class_561, Class_1061 class_1061) {
        this.Field_21790 = class_561;
        this.Field_21789.Method_29442();
        this.Field_21786 = Class_13337.Method_13377(class_1061.Method_1266() + 1.0f);
        this.Field_21788 = Class_13337.Method_13377(class_1061.Method_1287() + 1.0f);
        this.Field_21787 = Class_13337.Method_13377(class_1061.Method_1266() + 1.0f);
    }

    protected Class_26869 Method_21796(int n, int n2, int n3) {
        int n4 = Class_26869.Method_26885(n, n2, n3);
        Class_26869 class_26869 = (Class_26869)this.Field_21789.Method_29447(n4);
        if (class_26869 == null) {
            class_26869 = new Class_26869(n, n2, n3);
            this.Field_21789.Method_29453(n4, class_26869);
        }
        return class_26869;
    }

    public abstract Class_26869 Method_21797(Class_1061 var1);
}

