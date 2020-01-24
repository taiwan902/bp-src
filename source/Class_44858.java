/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 */
import com.google.common.base.Function;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_44858
extends Class_41056 {
    protected final Class_3238 Field_44859;
    protected final Function Field_44860;

    public Class_44858(Class_3238 class_3238, Class_3238 class_32382, Function function) {
        super(class_3238);
        this.Field_44859 = class_32382;
        this.Field_44860 = function;
        this.\u0000strictfp(-32768 & 1664);
        this.\u0000strictfp((-12263 & 133) != 0);
    }

    public Class_44858(Class_3238 class_3238, Class_3238 class_32382, String[] arrstring) {
        this(class_3238, class_32382, new Class_15775(arrstring));
    }

    public int Method_44861(int n) {
        return n;
    }

    public String Method_44862(Class_23823 class_23823) {
        return super.Method_41065() + "." + (String)this.Field_44860.apply((Object)class_23823);
    }

    private void Method_44863() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

