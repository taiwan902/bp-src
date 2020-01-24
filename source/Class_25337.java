/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 */
import com.google.common.base.Function;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_25337
implements Function {
    private void Method_25338() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_25339(Class_23823 class_23823) {
        return Class_4231.Method_4259(class_23823.Method_23843()).Method_4261();
    }

    Class_25337() {
    }

    public Object Method_25340(Object object) {
        return this.Method_25339((Class_23823)object);
    }
}

