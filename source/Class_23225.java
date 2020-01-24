/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_23225
implements Class_1486 {
    private int Field_23226;

    public void Method_23227(Class_29900 class_29900) {
        this.Field_23226 = class_29900.Method_30016();
    }

    public void Method_23228(Class_10954 class_10954) {
        this.Method_23230((Class_14856)class_10954);
    }

    public Class_23225() {
    }

    public Class_23225(int n) {
        this.Field_23226 = n;
    }

    public void Method_23229(Class_29900 class_29900) {
        class_29900.Method_29949(this.Field_23226);
    }

    public void Method_23230(Class_14856 class_14856) {
        class_14856.Method_14911(this);
    }

    private void Method_23231() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

