/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Lists
 */
import com.google.common.base.Function;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Class_3878 {
    private static Iterable Method_3879(Iterable iterable) {
        return Iterables.transform((Iterable)iterable, (Function)new Class_3891(null));
    }

    private void Method_3880() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static Object[] Method_3881(Class class_, Iterable iterable) {
        ArrayList arrayList = Lists.newArrayList();
        for (Object t : iterable) {
            arrayList.add(t);
        }
        return arrayList.toArray(Class_3878.Method_3884(class_, arrayList.size()));
    }

    public static Iterable Method_3882(Class class_, Iterable iterable) {
        return new Class_3886(class_, (Iterable[])Class_3878.Method_3881(Iterable.class, iterable), null);
    }

    public static Iterable Method_3883(Iterable iterable) {
        return Class_3878.Method_3879(Class_3878.Method_3882(Object.class, iterable));
    }

    private static Object[] Method_3884(Class class_, int n) {
        return (Object[])Array.newInstance(class_, n);
    }

    static Object[] Method_3885(Class class_, int n) {
        return Class_3878.Method_3884(class_, n);
    }
}

