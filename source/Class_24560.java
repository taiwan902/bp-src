/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_24560
implements Class_1486 {
    private Class_29480 Field_24561;
    private Class_34772[] Field_24562;

    public Class_24560() {
    }

    public void Method_24563(Class_29900 class_29900) {
        class_29900.Method_30010(this.Field_24561.Field_29483);
        class_29900.Method_30010(this.Field_24561.Field_29482);
        class_29900.Method_29982(this.Field_24562.length);
        Class_34772[] arrclass_34772 = this.Field_24562;
        int n = arrclass_34772.length;
        for (int i = 13804 & 2048; i < n; ++i) {
            Class_34772 class_34772 = arrclass_34772[i];
            class_29900.Method_29922(class_34772.Method_34779());
            class_29900.Method_29982(Class_3238.Field_3280.Method_3672((Class_3677)class_34772.Method_34777()));
        }
    }

    public Class_34772[] Method_24564() {
        return this.Field_24562;
    }

    public void Method_24565(Class_10954 class_10954) {
        this.Method_24567((Class_14856)class_10954);
    }

    static Class_29480 Method_24566(Class_24560 class_24560) {
        return class_24560.Field_24561;
    }

    public void Method_24567(Class_14856 class_14856) {
        class_14856.Method_14872(this);
    }

    private void Method_24568() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_24560(int n, short[] arrs, Class_17665 class_17665) {
        this.Field_24561 = new Class_29480(class_17665.Field_17666, class_17665.Field_17668);
        this.Field_24562 = new Class_34772[n];
        for (int i = 4876 & -30720; i < this.Field_24562.length; ++i) {
            this.Field_24562[i] = new Class_34772(this, arrs[i], class_17665);
        }
    }

    public void Method_24569(Class_29900 class_29900) {
        this.Field_24561 = new Class_29480(class_29900.Method_29914(), class_29900.Method_29914());
        this.Field_24562 = new Class_34772[class_29900.Method_30004()];
        for (int i = 2570 & 4497; i < this.Field_24562.length; ++i) {
            this.Field_24562[i] = new Class_34772(this, class_29900.Method_30008(), Class_3238.Field_3280.Method_3675(class_29900.Method_30004()));
        }
    }
}

