/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_10339
implements Class_10321 {
    private final int Field_10340;
    private final Class_6002 Field_10341;

    public Class_6002 Method_10342() {
        return new Class_6002(this.Field_10341);
    }

    Class_10339(Class_6002 class_6002, int n) {
        this.Field_10341 = class_6002;
        this.Field_10340 = n;
    }

    public int Method_10343() {
        return this.Field_10340;
    }

    private void Method_10344() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Object Method_10345() {
        return this.Method_10342();
    }
}

