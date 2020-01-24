/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
import com.google.common.base.Predicate;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_30868
implements Predicate {
    private Class_44640 Field_30869;

    private void Method_30870() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_30871(Class_859 class_859) {
        return ((class_859 instanceof Class_626 || class_859 instanceof Class_38719) && class_859.\u0000strictfp((Class_1061)this.Field_30869) > 31.5 * 0.2857142857142857 ? 47 & 2449 : 20592 & 268) != 0;
    }

    public Class_30868(Class_44640 class_44640) {
        this.Field_30869 = class_44640;
    }

    public boolean Method_30872(Object object) {
        return this.Method_30871((Class_859)object);
    }
}

