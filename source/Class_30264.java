/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;

public class Class_30264
extends Class_4844 {
    public static final Class_3957 Field_30265 = Class_3957.Method_3963(Class_30264.Method_30275("\u08c3\u08c7\u08c6\u08c5\u08c6"), Class_5393.class);

    protected Class_3855 Method_30266() {
        Class_3538[] arrclass_3538 = new Class_3538[-26095 & 1061];
        arrclass_3538[16992 & -23418] = Field_30265;
        return new Class_3855(this, arrclass_3538);
    }

    public int Method_30267(int n) {
        int n2 = 23175 & 418;
        switch (n) {
            case 0: {
                return Class_30264.Method_30280(n2, -13569 & 255, 767 & 511, -28417 & 8447);
            }
            case 1: {
                return Class_30264.Method_30280(n2, -24359 & 216, 17535 & 8447, 19251 & 1211);
            }
            case 2: {
                return Class_30264.Method_30280(n2, 755 & 16570, 16716 & -20275, 216 & 472);
            }
            case 3: {
                return Class_30264.Method_30280(n2, 11366 & 4214, 2269 & 411, 1246 & 11000);
            }
            case 4: {
                return Class_30264.Method_30280(n2, -2331 & 229, 16629 & 2285, 8255 & -26381);
            }
            case 5: {
                return Class_30264.Method_30280(n2, 4991 & -30593, 973 & -32564, 2077 & 505);
            }
            case 6: {
                return Class_30264.Method_30280(n2, 242 & -21773, 1151 & -1409, 1703 & 165);
            }
            case 7: {
                return Class_30264.Method_30280(n2, 1102 & 8268, 76 & -19220, 8268 & 18540);
            }
            case 8: {
                return Class_30264.Method_30280(n2, 6299 & 8665, -31015 & 8345, 19355 & -32615);
            }
            case 9: {
                return Class_30264.Method_30280(n2, -7092 & 76, -31489 & 4223, 2265 & -24423);
            }
            case 10: {
                return Class_30264.Method_30280(n2, -32129 & 17663, 9280 & 4578, 8371 & -12046);
            }
            case 11: {
                return Class_30264.Method_30280(n2, 55 & 3643, 16476 & 2255, 29362 & 3250);
            }
            case 12: {
                return Class_30264.Method_30280(n2, 126 & 103, 4174 & -29492, 19071 & 51);
            }
            case 13: {
                return Class_30264.Method_30280(n2, 6374 & -23450, 639 & 4223, 26935 & 755);
            }
            case 14: {
                return Class_30264.Method_30280(n2, 6811 & 16537, 9843 & 315, 1083 & 8755);
            }
            case 15: {
                return Class_30264.Method_30280(n2, 8601 & 16445, 18585 & -28391, 2107 & 5337);
            }
        }
        return -12239 & 8704;
    }

    public Class_3779 Method_30268(Class_3436 class_3436) {
        return ((Class_5393)((Object)class_3436.Method_3440(Field_30265))).Method_5426();
    }

    public boolean Method_30269() {
        return (-32435 & 4274) != 0;
    }

    public void Method_30270(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        if (!class_283.Field_306) {
            Class_36217.Method_36224(class_283, class_4751);
        }
    }

    public void Method_30271(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        if (!class_283.Field_306) {
            Class_36217.Method_36224(class_283, class_4751);
        }
    }

    public int Method_30272(Random random) {
        return -28607 & 912;
    }

    public Class_17531 Method_30273() {
        return Class_17531.Field_17537;
    }

    public Class_30264(Class_3713 class_3713) {
        super(class_3713, (2113 & 9892) != 0);
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_30265, (Comparable)((Object)Class_5393.Field_5398)));
        this.\u0000strictfp(Class_3987.Field_3993);
    }

    private void Method_30274() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static String Method_30275(String string) {
        int n = 32059;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_30264.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public int Method_30276(Class_3436 class_3436) {
        return ((Class_5393)((Object)class_3436.Method_3440(Field_30265))).Method_5419();
    }

    protected boolean Method_30277() {
        return (3243 & 20497) != 0;
    }

    public Class_3436 Method_30278(int n) {
        return this.\u0000strictfp().Method_3685(Field_30265, (Comparable)((Object)Class_5393.Method_5446(n)));
    }

    public int Method_30279(Class_3436 class_3436) {
        return ((Class_5393)((Object)class_3436.Method_3440(Field_30265))).Method_5419();
    }

    public static int Method_30280(int n, int n2, int n3, int n4) {
        return (n & (255 & 8959)) << (12318 & 18584) | (n2 & (18687 & 13311)) << (11577 & -12272) | (n3 & (18687 & 8447)) << (-28664 & 268) | n4 & (-22273 & 17663);
    }

    public void Method_30281(Class_1956 class_1956, Class_3987 class_3987, List list) {
        Class_5393[] arrclass_5393 = Class_5393.Method_5464();
        int n = arrclass_5393.length;
        for (int i = 28720 & 192; i < n; ++i) {
            Class_5393 class_5393 = arrclass_5393[i];
            list.add(new Class_23823(class_1956, -32767 & 22033, class_5393.Method_5419()));
        }
    }
}

