/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 */
import com.google.common.base.Function;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;

public final class Class_28260
implements Function {
    public Object Method_28261(Object object) {
        return this.Method_28263((Class_1782)object);
    }

    private void Method_28262() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Iterator Method_28263(Class_1782 class_1782) {
        return class_1782.iterator();
    }

    Class_28260() {
    }
}

