/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_44516
extends Class_41056 {
    public String Method_44517(Class_23823 class_23823) {
        String string = "item.banner.";
        Class_5393 class_5393 = this.Method_44522(class_23823);
        string = string + class_5393.Method_5462() + ".name";
        return Class_7594.Method_7602(string);
    }

    public void Method_44518(Class_1956 class_1956, Class_3987 class_3987, List list) {
        Class_5393[] arrclass_5393 = Class_5393.Method_5464();
        int n = arrclass_5393.length;
        for (int i = 8221 & -9214; i < n; ++i) {
            Class_5393 class_5393 = arrclass_5393[i];
            Class_1699 class_1699 = new Class_1699();
            Class_39935.Method_39956(class_1699, class_5393.Method_5436(), null);
            Class_1699 class_16992 = new Class_1699();
            class_16992.Method_1744("BlockEntityTag", class_1699);
            Class_23823 class_23823 = new Class_23823(class_1956, -18589 & 16537, class_5393.Method_5436());
            class_23823.Method_23869(class_16992);
            list.add(class_23823);
        }
    }

    public Class_3987 Method_44519() {
        return Class_3987.Field_3995;
    }

    private void Method_44520() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_44521(Class_23823 class_23823, int n) {
        if (n == 0) {
            return 620756991 & -2097152001;
        }
        Class_5393 class_5393 = this.Method_44522(class_23823);
        return class_5393.Method_5426().Field_3812;
    }

    private Class_5393 Method_44522(Class_23823 class_23823) {
        Class_1699 class_1699 = class_23823.Method_23854("BlockEntityTag", (8192 & 1061) != 0);
        Class_5393 class_5393 = null;
        class_5393 = class_1699 != null && class_1699.Method_1707("Base") ? Class_5393.Method_5448(class_1699.Method_1738("Base")) : Class_5393.Method_5448(class_23823.Method_23843());
        return class_5393;
    }

    public Class_44516() {
        super(Class_9265.Field_9409);
        this.\u0000strictfp = 4112 & -24048;
        this.\u0000strictfp(Class_3987.Field_3995);
        this.\u0000strictfp((289 & -1915) != 0);
        this.\u0000strictfp(76 & 8322);
    }

    public boolean Method_44523(Class_23823 class_23823, Class_626 class_626, Class_283 class_283, Class_4751 class_4751, Class_4595 class_4595, float f, float f2, float f3) {
        if (class_4595 == Class_4595.Field_4615) {
            return (17540 & 114) != 0;
        }
        if (!class_283.Method_375(class_4751).Method_3442().Method_3373().Method_3762()) {
            return (256 & -30189) != 0;
        }
        if (!class_626.Method_794(class_4751 = class_4751.Method_4765(class_4595), class_4595, class_23823)) {
            return (-31680 & 2072) != 0;
        }
        if (!Class_9265.Field_9409.Method_3368(class_283, class_4751)) {
            return (24625 & -32568) != 0;
        }
        if (class_283.Field_306) {
            return (3157 & 8481) != 0;
        }
        if (class_4595 == Class_4595.Field_4601) {
            int n = Class_13337.Method_13371((double)((class_626.\u0000= ? + 1.5128205f * 118.983055f) * (0.75f * 21.333334f) / (1.0535715f * 341.69492f)) + 3.625 * 0.13793103448275862) & (15 & 30271);
            class_283.Method_462(class_4751, Class_9265.Field_9409.Method_3293().Method_3685(Class_18194.Field_18195, Integer.valueOf(n)), 8667 & -28669);
        } else {
            class_283.Method_462(class_4751, Class_9265.Field_9328.Method_3293().Method_3685(Class_30196.Field_30197, (Comparable)((Object)class_4595)), 16839 & 1539);
        }
        class_23823.Field_23826 -= 16455 & 15105;
        Class_4879 class_4879 = class_283.Method_429(class_4751);
        if (class_4879 instanceof Class_39935) {
            ((Class_39935)class_4879).Method_39954(class_23823);
        }
        return (1057 & 4225) != 0;
    }

    public void Method_44524(Class_23823 class_23823, Class_626 class_626, List list, boolean bl) {
        Class_1699 class_1699 = class_23823.Method_23854("BlockEntityTag", (-14510 & 4096) != 0);
        if (class_1699 != null && class_1699.Method_1707("Patterns")) {
            Class_1758 class_1758 = class_1699.Method_1735("Patterns", 13391 & 2202);
            for (int i = 23056 & 107; i < class_1758.Method_1772() && i < (21895 & -32682); ++i) {
                Class_1699 class_16992 = class_1758.Method_1768(i);
                Class_5393 class_5393 = Class_5393.Method_5448(class_16992.Method_1738("Color"));
                Class_29153 class_29153 = Class_29153.Method_29293(class_16992.Method_1708("Pattern"));
                if (class_29153 == null) continue;
                list.add(Class_7594.Method_7602("item.banner." + class_29153.Method_29226() + "." + class_5393.Method_5462()));
            }
        }
    }
}

