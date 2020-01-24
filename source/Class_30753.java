/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_30753
implements Class_1486 {
    private int Field_30754;
    private Class_4751 Field_30755;
    private Class_3238 Field_30756;
    private int Field_30757;

    private void Method_30758() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_30759() {
        return this.Field_30757;
    }

    public Class_4751 Method_30760() {
        return this.Field_30755;
    }

    public void Method_30761(Class_29900 class_29900) {
        this.Field_30755 = class_29900.Method_29910();
        this.Field_30754 = class_29900.Method_30016();
        this.Field_30757 = class_29900.Method_30016();
        this.Field_30756 = Class_3238.Method_3323(class_29900.Method_30004() & (16383 & 20479));
    }

    public void Method_30762(Class_14856 class_14856) {
        class_14856.Method_14889(this);
    }

    public void Method_30763(Class_10954 class_10954) {
        this.Method_30762((Class_14856)class_10954);
    }

    public Class_30753() {
    }

    public Class_3238 Method_30764() {
        return this.Field_30756;
    }

    public int Method_30765() {
        return this.Field_30754;
    }

    public void Method_30766(Class_29900 class_29900) {
        class_29900.Method_29996(this.Field_30755);
        class_29900.Method_29949(this.Field_30754);
        class_29900.Method_29949(this.Field_30757);
        class_29900.Method_29982(Class_3238.Method_3435(this.Field_30756) & (4095 & 4095));
    }

    public Class_30753(Class_4751 class_4751, Class_3238 class_3238, int n, int n2) {
        this.Field_30755 = class_4751;
        this.Field_30754 = n;
        this.Field_30757 = n2;
        this.Field_30756 = class_3238;
    }
}

