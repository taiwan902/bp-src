/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 */
import com.google.common.base.Function;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_15775
implements Function {
    final String[] Field_15776;

    public Object Method_15777(Object object) {
        return this.Method_15779((Class_23823)object);
    }

    private void Method_15778() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_15779(Class_23823 class_23823) {
        int n = class_23823.Method_23843();
        if (n < 0 || n >= this.Field_15776.length) {
            n = 1286 & -32527;
        }
        return this.Field_15776[n];
    }

    Class_15775(String[] arrstring) {
        this.Field_15776 = arrstring;
    }
}

