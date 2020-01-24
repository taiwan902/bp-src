/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 */
import com.google.common.base.Function;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Map;

public final class Class_3899
implements Function {
    public Object Method_3900(Object object) {
        return this.Method_3901((Map.Entry)object);
    }

    public String Method_3901(Map.Entry entry) {
        if (entry == null) {
            return "<NULL>";
        }
        Class_3538 class_3538 = (Class_3538)entry.getKey();
        return class_3538.Method_3541() + "=" + class_3538.Method_3540((Comparable)entry.getValue());
    }

    private void Method_3902() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_3899() {
    }
}

