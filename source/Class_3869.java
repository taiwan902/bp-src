/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 */
import com.google.common.base.Function;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_3869
implements Function {
    Class_3869() {
    }

    private void Method_3870() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_3871(Class_3538 class_3538) {
        return class_3538 == null ? "<NULL>" : class_3538.Method_3541();
    }

    public Object Method_3872(Object object) {
        return this.Method_3871((Class_3538)object);
    }
}

