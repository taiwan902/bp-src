/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_14562 {
    private int Field_14563;
    private Class_26869[] Field_14564 = new Class_26869[5158 & -31487];

    public Class_26869 Method_14565() {
        Class_26869 class_26869 = this.Field_14564[11264 & -11744];
        this.Field_14564[28432 & 67] = this.Field_14564[this.Field_14563 -= 647 & -20471];
        this.Field_14564[this.Field_14563] = null;
        if (this.Field_14563 > 0) {
            this.Method_14571(32 & -32176);
        }
        class_26869.Field_26875 = -1 & -1;
        return class_26869;
    }

    public void Method_14566() {
        this.Field_14563 = 8722 & 22593;
    }

    private void Method_14567() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_26869 Method_14568(Class_26869 class_26869) {
        if (class_26869.Field_26875 >= 0) {
            throw new IllegalStateException("OW KNOWS!");
        }
        if (this.Field_14563 == this.Field_14564.length) {
            Class_26869[] arrclass_26869 = new Class_26869[this.Field_14563 << (20489 & -23805)];
            System.arraycopy(this.Field_14564, -26032 & 8193, arrclass_26869, -28474 & 1049, this.Field_14563);
            this.Field_14564 = arrclass_26869;
        }
        this.Field_14564[this.Field_14563] = class_26869;
        class_26869.Field_26875 = this.Field_14563;
        int n = this.Field_14563;
        this.Field_14563 = n + (3137 & 137);
        this.Method_14572(n);
        return class_26869;
    }

    public void Method_14569(Class_26869 class_26869, float f) {
        float f2 = class_26869.Field_26878;
        class_26869.Field_26878 = f;
        if (f < f2) {
            this.Method_14572(class_26869.Field_26875);
        } else {
            this.Method_14571(class_26869.Field_26875);
        }
    }

    public boolean Method_14570() {
        return (this.Field_14563 == 0 ? 12419 & 17921 : 18 & -32575) != 0;
    }

    private void Method_14571(int n) {
        Class_26869 class_26869 = this.Field_14564[n];
        float f = class_26869.Field_26878;
        do {
            float f2;
            Class_26869 class_268692;
            int n2 = (4097 & 1107) + (n << (-27371 & 201));
            int n3 = n2 + (-30715 & 513);
            if (n2 >= this.Field_14563) break;
            Class_26869 class_268693 = this.Field_14564[n2];
            float f3 = class_268693.Field_26878;
            if (n3 >= this.Field_14563) {
                class_268692 = null;
                f2 = 0.4871795f * Float.POSITIVE_INFINITY;
            } else {
                class_268692 = this.Field_14564[n3];
                f2 = class_268692.Field_26878;
            }
            if (f3 < f2) {
                if (f3 >= f) break;
                this.Field_14564[n] = class_268693;
                class_268693.Field_26875 = n;
                n = n2;
                continue;
            }
            if (f2 >= f) break;
            this.Field_14564[n] = class_268692;
            class_268692.Field_26875 = n;
            n = n3;
        } while (true);
        this.Field_14564[n] = class_26869;
        class_26869.Field_26875 = n;
    }

    private void Method_14572(int n) {
        Class_26869 class_26869 = this.Field_14564[n];
        float f = class_26869.Field_26878;
        while (n > 0) {
            int n2 = n - (-24543 & 195) >> (13 & 24737);
            Class_26869 class_268692 = this.Field_14564[n2];
            if (f >= class_268692.Field_26878) break;
            this.Field_14564[n] = class_268692;
            class_268692.Field_26875 = n;
            n = n2;
        }
        this.Field_14564[n] = class_26869;
        class_26869.Field_26875 = n;
    }
}

