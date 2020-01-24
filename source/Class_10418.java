/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 */
import com.google.common.base.Function;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_10418
implements Function {
    public String Method_10419(Class_23823 class_23823) {
        return Class_40915.Method_40933(class_23823.Method_23843()).Method_40927();
    }

    private void Method_10420() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_10418() {
    }

    public Object Method_10421(Object object) {
        return this.Method_10419((Class_23823)object);
    }
}

