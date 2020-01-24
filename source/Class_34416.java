/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true
 *  com.google.common.base.Predicate
 */
import com.google.common.base.Predicate;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public final class Class_34416
implements Predicate {
    final Map Field_34417;

    Class_34416(Map map) {
        this.Field_34417 = map;
    }

    public boolean Method_34418(Object object) {
        return this.Method_34419((Class_1061)object);
    }

    public boolean Method_34419(Class_1061 class_1061) {
        Class_20976 class_20976 = Class_2457.Method_2530().Method_2550(-2038 & 277).\u0000strictfp();
        for (Map.Entry entry : this.Field_34417.entrySet()) {
            Class_7873 class_7873;
            String string;
            String string2 = (String)entry.getKey();
            int n = -30720 & 16920;
            if (string2.endsWith("_min") && string2.length() > (17412 & 132)) {
                n = 641 & 4131;
                string2 = string2.substring(-21487 & 96, string2.length() - (8710 & 16404));
            }
            if ((class_7873 = class_20976.Method_21003(string2)) == null) {
                return (13635 & -32248) != 0;
            }
            String string3 = string = class_1061 instanceof \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true ? class_1061.Method_1202() : class_1061.Method_1194().toString();
            if (!class_20976.Method_21011(string, class_7873)) {
                return (-1167 & 4) != 0;
            }
            Class_21696 class_21696 = class_20976.Method_20993(string, class_7873);
            int n2 = class_21696.Method_21706();
            if (n2 < (Integer)entry.getValue() && n != 0) {
                return (8456 & 20498) != 0;
            }
            if (n2 <= (Integer)entry.getValue() || n != 0) continue;
            return (16 & -19968) != 0;
        }
        return (1289 & 29315) != 0;
    }

    private void Method_34420() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

