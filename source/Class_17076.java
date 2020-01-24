/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 */
import com.google.common.base.Function;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_17076
implements Function {
    private void Method_17077() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_17076() {
    }

    public String Method_17078(Class_23823 class_23823) {
        return (class_23823.Method_23843() & (7 & 17377)) == (641 & 2121) ? "wet" : "dry";
    }

    public Object Method_17079(Object object) {
        return this.Method_17078((Class_23823)object);
    }
}

