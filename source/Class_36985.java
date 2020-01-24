/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_36985
implements Callable {
    final Class_4879 Field_36986;

    private void Method_36987() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_36985(Class_4879 class_4879) {
        this.Field_36986 = class_4879;
    }

    public String Method_36988() {
        Class_3436 class_3436 = this.Field_36986.Field_4884.Method_375(this.Field_36986.Field_4886);
        int n = class_3436.Method_3442().Method_3434(class_3436);
        if (n < 0) {
            return "Unknown? (Got " + n + ")";
        }
        Object[] arrobject = new Object[-31597 & 4365];
        arrobject[-15856 & 10279] = Integer.toBinaryString(n);
        String string = String.format("%4s", arrobject).replace(" ", "0");
        Object[] arrobject2 = new Object[16414 & -23197];
        arrobject2[4660 & -16000] = n;
        arrobject2[14401 & -15087] = string;
        return String.format("%1$d / 0x%1$X / 0b%2$s", arrobject2);
    }

    public Object Method_36989() {
        return this.Method_36988();
    }
}

