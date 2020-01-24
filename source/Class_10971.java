/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.List;

public class Class_10971 {
    private static List Field_10972;
    private static List Field_10973;
    private static List Field_10974;
    private static List Field_10975;
    private static int Field_10976;

    static {
        Field_10976 = -29375 & 4396;
        Field_10973 = Lists.newArrayList();
        Field_10972 = Lists.newArrayList();
        Field_10975 = Lists.newArrayList();
        Field_10974 = Lists.newArrayList();
    }

    private void Method_10977() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static synchronized String Method_10978() {
        return "cache: " + Field_10975.size() + ", tcache: " + Field_10973.size() + ", allocated: " + Field_10974.size() + ", tallocated: " + Field_10972.size();
    }

    public static synchronized void Method_10979() {
        if (!Field_10975.isEmpty()) {
            Field_10975.remove(Field_10975.size() - (4369 & 11777));
        }
        if (!Field_10973.isEmpty()) {
            Field_10973.remove(Field_10973.size() - (16513 & 4353));
        }
        Field_10975.addAll(Field_10974);
        Field_10973.addAll(Field_10972);
        Field_10974.clear();
        Field_10972.clear();
    }

    public static synchronized int[] Method_10980(int n) {
        if (n <= (1289 & -12028)) {
            if (Field_10973.isEmpty()) {
                int[] arrn = new int[17178 & 8452];
                Field_10972.add(arrn);
                return arrn;
            }
            int[] arrn = (int[])Field_10973.remove(Field_10973.size() - (5185 & 261));
            Field_10972.add(arrn);
            return arrn;
        }
        if (n > Field_10976) {
            Field_10976 = n;
            Field_10975.clear();
            Field_10974.clear();
            int[] arrn = new int[Field_10976];
            Field_10974.add(arrn);
            return arrn;
        }
        if (Field_10975.isEmpty()) {
            int[] arrn = new int[Field_10976];
            Field_10974.add(arrn);
            return arrn;
        }
        int[] arrn = (int[])Field_10975.remove(Field_10975.size() - (16897 & 1243));
        Field_10974.add(arrn);
        return arrn;
    }
}

