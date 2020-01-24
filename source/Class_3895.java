/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

public class Class_3895 {
    public static Map Method_3896(Iterable iterable, Iterable iterable2) {
        return Class_3895.Method_3897(iterable, iterable2, Maps.newLinkedHashMap());
    }

    public static Map Method_3897(Iterable iterable, Iterable iterable2, Map map) {
        Iterator iterator = iterable2.iterator();
        for (Object t : iterable) {
            map.put(t, iterator.next());
        }
        if (iterator.hasNext()) {
            throw new NoSuchElementException();
        }
        return map;
    }

    private void Method_3898() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

