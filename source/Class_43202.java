/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_43202
extends Class_42376 {
    private final Class_6340 Field_43203;

    public Class_43202(int n, int n2, int n3, Class_6340 class_6340, String string) {
        super(n, n2, n3, 17046 & -31265, -32746 & 3093, string);
        this.Field_43203 = class_6340;
    }

    private void Method_43204() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_43202(int n, int n2, int n3, String string) {
        this(n, n2, n3, null, string);
    }

    public Class_6340 Method_43205() {
        return this.Field_43203;
    }

    public Class_43202(int n, int n2, int n3, int n4, int n5, String string) {
        super(n, n2, n3, n4, n5, string);
        this.Field_43203 = null;
    }
}

