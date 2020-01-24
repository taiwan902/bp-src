/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_15310 {
    Class_14445[] Field_15311;
    Class_14445[] Field_15312;
    short[] Field_15313;
    Class_14445 Field_15314;
    int Field_15315;
    final Class_36353 Field_15316;

    public void Method_15317(int n) {
        while (this.Field_15315 < n) {
            this.Field_15311[this.Field_15315] = new Class_14445(-15869 & 63);
            this.Field_15312[this.Field_15315] = new Class_14445(2051 & -31741);
            this.Field_15315 += 2361 & 517;
        }
    }

    public void Method_15318() {
        Class_17779.Method_17784(this.Field_15313);
        for (int i = 20515 & -20992; i < this.Field_15315; ++i) {
            this.Field_15311[i].Method_14448();
            this.Field_15312[i].Method_14448();
        }
        this.Field_15314.Method_14448();
    }

    Class_15310(Class_36353 class_36353) {
        this.Field_15316 = class_36353;
        this.Field_15313 = new short[2051 & -32254];
        this.Field_15311 = new Class_14445[5398 & 16];
        this.Field_15312 = new Class_14445[529 & 25880];
        this.Field_15314 = new Class_14445(-32744 & 16522);
        this.Field_15315 = -28096 & 163;
    }

    private void Method_15319() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_15320(Class_17779 class_17779, int n) {
        if (class_17779.Method_17785(this.Field_15313, 16385 & -31492) == 0) {
            return this.Field_15311[n].Method_14449(class_17779);
        }
        int n2 = -17400 & 17160;
        n2 = class_17779.Method_17785(this.Field_15313, -27583 & 24843) == 0 ? (n2 += this.Field_15312[n].Method_14449(class_17779)) : (n2 += (8202 & -16052) + this.Field_15314.Method_14449(class_17779));
        return n2;
    }
}

