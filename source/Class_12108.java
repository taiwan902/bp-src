/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
import com.google.common.base.Predicate;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_12108
implements Predicate {
    private final Class_23823 Field_12109;

    public boolean Method_12110(Object object) {
        return this.Method_12111((Class_1061)object);
    }

    public boolean Method_12111(Class_1061 class_1061) {
        if (!class_1061.Method_1285()) {
            return (-32667 & 20480) != 0;
        }
        if (!(class_1061 instanceof Class_859)) {
            return (-32728 & 3152) != 0;
        }
        Class_859 class_859 = (Class_859)class_1061;
        return (class_859.Method_1012(Class_34093.Method_34150(this.Field_12109)) != null ? -32639 & 90 : (int)((class_859 instanceof Class_34093 ? ((Class_34093)class_859).Method_34153() : (class_859 instanceof Class_27288 ? 18961 & 1325 : class_859 instanceof Class_626)) ? 1 : 0)) != 0;
    }

    public Class_12108(Class_23823 class_23823) {
        this.Field_12109 = class_23823;
    }

    private void Method_12112() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

