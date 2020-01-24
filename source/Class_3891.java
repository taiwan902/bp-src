/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 */
import com.google.common.base.Function;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import java.util.List;

public class Class_3891
implements Function {
    private void Method_3892() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private Class_3891() {
    }

    Class_3891(Class_18127 class_18127) {
        this();
    }

    public Object Method_3893(Object object) {
        return this.Method_3894((Object[])object);
    }

    public List Method_3894(Object[] arrobject) {
        return Arrays.asList(arrobject);
    }
}

