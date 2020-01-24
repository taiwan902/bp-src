/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_36425 {
    private final Class_3436 Field_36426 = Class_9265.Field_9351.Method_3293();
    private final short[] Field_36427 = new short[538298524 & 58785825];

    private void Method_36428() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_3436 Method_36429(int n) {
        if (n >= 0 && n < this.Field_36427.length) {
            Class_3677 class_3677 = Class_3238.Field_3280.Method_3675(this.Field_36427[n]);
            return class_3677 != null ? class_3677 : this.Field_36426;
        }
        throw new IndexOutOfBoundsException("The coordinate is out of range");
    }

    public void Method_36430(int n, int n2, int n3, Class_3436 class_3436) {
        int n4 = n << (8204 & -27186) | n3 << (3100 & 72) | n2;
        this.Method_36432(n4, class_3436);
    }

    public Class_3436 Method_36431(int n, int n2, int n3) {
        int n4 = n << (9501 & 4140) | n3 << (9354 & 12) | n2;
        return this.Method_36429(n4);
    }

    public void Method_36432(int n, Class_3436 class_3436) {
        if (n < 0 || n >= this.Field_36427.length) {
            throw new IndexOutOfBoundsException("The coordinate is out of range");
        }
        this.Field_36427[n] = (short)Class_3238.Field_3280.Method_3672((Class_3677)class_3436);
    }
}

