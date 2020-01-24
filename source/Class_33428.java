/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_33428
implements Class_21832 {
    final Class_44314 Field_33429;

    private void Method_33430() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_33428(Class_44314 class_44314) {
        this.Field_33429 = class_44314;
    }

    public void Method_33431(Class_27581 class_27581) {
        if (class_27581.isCancelled()) {
            if (Class_41102.Method_41125(this.Field_33429.Field_44315) != null) {
                Class_41102.Method_41125(this.Field_33429.Field_44315).cancel((14644 & 128) != 0);
            }
            Class_41102.Method_41132(this.Field_33429.Field_44315, null);
            this.Field_33429.close(this.Field_33429.voidPromise());
        }
    }

    public void Method_33432(Class_21065 class_21065) {
        this.Method_33431((Class_27581)class_21065);
    }
}

