/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_30378
implements Class_1486 {
    private long Field_30379;

    public void Method_30380(Class_14485 class_14485) {
        class_14485.Method_14487(this);
    }

    public Class_30378() {
    }

    public long Method_30381() {
        return this.Field_30379;
    }

    public void Method_30382(Class_10954 class_10954) {
        this.Method_30380((Class_14485)class_10954);
    }

    public void Method_30383(Class_29900 class_29900) {
        this.Field_30379 = class_29900.Method_30001();
    }

    private void Method_30384() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_30378(long l) {
        this.Field_30379 = l;
    }

    public void Method_30385(Class_29900 class_29900) {
        class_29900.Method_29957(this.Field_30379);
    }
}

