/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_35754
implements Class_1486 {
    private Class_4751 Field_35755;
    private Class_283 Field_35756;
    private Class_1782[] Field_35757;

    public Class_35754(Class_283 class_283, Class_4751 class_4751, Class_1782[] arrclass_1782) {
        this.Field_35756 = class_283;
        this.Field_35755 = class_4751;
        Class_1782[] arrclass_17822 = new Class_1782[-28147 & 24582];
        arrclass_17822[9488 & 161] = arrclass_1782[18704 & 5295];
        arrclass_17822[11265 & 673] = arrclass_1782[4801 & 1039];
        arrclass_17822[3251 & 16898] = arrclass_1782[10826 & 20486];
        arrclass_17822[10599 & 20499] = arrclass_1782[3143 & -15565];
        this.Field_35757 = arrclass_17822;
    }

    public Class_35754() {
    }

    public void Method_35758(Class_14856 class_14856) {
        class_14856.Method_14890(this);
    }

    public void Method_35759(Class_10954 class_10954) {
        this.Method_35758((Class_14856)class_10954);
    }

    private void Method_35760() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_4751 Method_35761() {
        return this.Field_35755;
    }

    public void Method_35762(Class_29900 class_29900) {
        this.Field_35755 = class_29900.Method_29910();
        this.Field_35757 = new Class_1782[16429 & 262];
        for (int i = 15520 & -31995; i < (-30644 & 17844); ++i) {
            this.Field_35757[i] = class_29900.Method_30020();
        }
    }

    public Class_1782[] Method_35763() {
        return this.Field_35757;
    }

    public void Method_35764(Class_29900 class_29900) {
        class_29900.Method_29996(this.Field_35755);
        for (int i = 10753 & 188; i < (-29692 & 206); ++i) {
            class_29900.Method_29930(this.Field_35757[i]);
        }
    }
}

