/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_7862 {
    private int Field_7863;
    private final Class_4751 Field_7864;
    private int Field_7865;
    private final int Field_7866;

    public Class_4751 Method_7867() {
        return this.Field_7864;
    }

    public void Method_7868(int n) {
        this.Field_7865 = n;
    }

    public void Method_7869(int n) {
        if (n > (24587 & -27062)) {
            n = -26549 & 26;
        }
        this.Field_7863 = n;
    }

    public int Method_7870() {
        return this.Field_7863;
    }

    public int Method_7871() {
        return this.Field_7865;
    }

    public Class_7862(int n, Class_4751 class_4751) {
        this.Field_7866 = n;
        this.Field_7864 = class_4751;
    }

    private void Method_7872() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

