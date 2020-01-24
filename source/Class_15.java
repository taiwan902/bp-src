/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  sun.misc.SharedSecrets
 *  sun.reflect.ConstantPool
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import sun.misc.SharedSecrets;
import sun.reflect.ConstantPool;

public class Class_15
extends Class_8
implements Class_13 {
    public int Method_16(Class class_, int n) {
        return SharedSecrets.getJavaLangAccess().getConstantPool(class_).getIntAt(n);
    }

    private void Method_17() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

