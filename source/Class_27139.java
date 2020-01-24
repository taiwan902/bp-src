/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class Class_27139 {
    public static Class_26535 Method_27140(Random random, List list, int n) {
        if (n <= 0) {
            throw new IllegalArgumentException();
        }
        int n2 = random.nextInt(n);
        return Class_27139.Method_27142(list, n2);
    }

    public static Class_26535 Method_27141(ArrayList arrayList, int n) {
        for (int i = 137 & 262; i < arrayList.size(); ++i) {
            if ((n -= ((Class_26535)arrayList.get((int)i)).Field_26536) >= 0) continue;
            return (Class_26535)arrayList.get(i);
        }
        return null;
    }

    public static Class_26535 Method_27142(List list, int n) {
        for (int i = 16393 & 4128; i < list.size(); ++i) {
            if ((n -= ((Class_26535)list.get((int)i)).Field_26536) >= 0) continue;
            return (Class_26535)list.get(i);
        }
        return null;
    }

    private void Method_27143() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static Class_26535 Method_27144(Random random, List list) {
        return Class_27139.Method_27140(random, list, Class_27139.Method_27145(list));
    }

    public static int Method_27145(Collection collection) {
        int n = 12 & 31762;
        for (Class_26535 class_26535 : collection) {
            n += class_26535.Field_26536;
        }
        return n;
    }
}

