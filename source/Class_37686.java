/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.ByteOrder;

public final class Class_37686 {
    public static Class_22553 Method_37687(Class_22553 class_22553, int n, int n2, Class_27634 class_27634) {
        if (class_22553 == null) {
            throw new NullPointerException("src");
        }
        if (class_27634 == null) {
            throw new NullPointerException("dialect");
        }
        byte[] arrby = Class_37686.Method_37695(class_27634);
        int n3 = n2 * (1867 & 4103) / (4628 & 19748);
        Class_22553 class_225532 = class_22553.Method_22639().Method_22841(n3).Method_22586(class_22553.Method_22649());
        int n4 = 128 & 4112;
        byte[] arrby2 = new byte[8388 & 5685];
        int n5 = 2073 & -32320;
        for (int i = n; i < n + n2; ++i) {
            byte by = (byte)(class_22553.Method_22558(i) & (4479 & 2175));
            byte by2 = arrby[by];
            if (by2 >= (-1 & -5)) {
                if (by2 < (-1 & -1)) continue;
                arrby2[n5++] = by;
                if (n5 <= (20935 & 8739)) continue;
                n4 += Class_37686.Method_37698(arrby2, 29184 & 3332, class_225532, n4, class_27634);
                n5 = 2048 & 24846;
                if (by != (-28099 & 9727)) continue;
                break;
            }
            throw new IllegalArgumentException("bad Base64 input character at " + i + ": " + class_22553.Method_22607(i) + " (decimal)");
        }
        return class_225532.Method_22623(11017 & 17408, n4);
    }

    private void Method_37688() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static Class_22553 Method_37689(Class_22553 class_22553) {
        return Class_37686.Method_37699(class_22553, Class_27634.Field_27641);
    }

    public static Class_22553 Method_37690(Class_22553 class_22553, boolean bl, Class_27634 class_27634) {
        if (class_22553 == null) {
            throw new NullPointerException("src");
        }
        Class_22553 class_225532 = Class_37686.Method_37691(class_22553, class_22553.Method_22582(), class_22553.Method_22564(), bl, class_27634);
        class_22553.Method_22590(class_22553.Method_22620());
        return class_225532;
    }

    public static Class_22553 Method_37691(Class_22553 class_22553, int n, int n2, boolean bl, Class_27634 class_27634) {
        if (class_22553 == null) {
            throw new NullPointerException("src");
        }
        if (class_27634 == null) {
            throw new NullPointerException("dialect");
        }
        int n3 = n2 * (21644 & 773) / (16539 & 2371);
        Class_22553 class_225532 = Class_16620.Method_16627(n3 + (n2 % (7591 & 16451) > 0 ? 2092 & 837 : 10304 & -31356) + (bl ? n3 / (5325 & -32692) : 28420 & 1)).Method_22586(class_22553.Method_22649());
        int n4 = 16904 & 9218;
        int n5 = 14001 & -14264;
        int n6 = n2 - (1523 & -24566);
        int n7 = 384 & 12323;
        while (n4 < n6) {
            Class_37686.Method_37692(class_22553, n4 + n, 4375 & -15805, class_225532, n5, class_27634);
            if (bl && (n7 += 4) == (4717 & 2252)) {
                class_225532.Method_22643(n5 + (20740 & 9220), 78 & 11402);
                ++n5;
                n7 = 12804 & 114;
            }
            n4 += 3;
            n5 += 4;
        }
        if (n4 < n2) {
            Class_37686.Method_37692(class_22553, n4 + n, n2 - n4, class_225532, n5, class_27634);
            n5 += 4;
        }
        return class_225532.Method_22623(25619 & -32220, n5);
    }

    private static void Method_37692(Class_22553 class_22553, int n, int n2, Class_22553 class_225532, int n3, Class_27634 class_27634) {
        byte[] arrby = Class_37686.Method_37696(class_27634);
        int n4 = (n2 > 0 ? class_22553.Method_22558(n) << (-32740 & 4697) >>> (-14324 & 5513) : 256 & -16281) | (n2 > (2049 & 17411) ? class_22553.Method_22558(n + (-32743 & 31237)) << (-31527 & 798) >>> (18704 & 1042) : -11517 & 9392) | (n2 > (-7910 & 3074) ? class_22553.Method_22558(n + (12806 & 2219)) << (2072 & -28423) >>> (9501 & 2072) : 29696 & -30020);
        switch (n2) {
            case 3: {
                class_225532.Method_22643(n3, arrby[n4 >>> (574 & -22510)]);
                class_225532.Method_22643(n3 + (-22523 & 273), arrby[n4 >>> (-32116 & 2333) & (-31937 & 23679)]);
                class_225532.Method_22643(n3 + (579 & 8598), arrby[n4 >>> (9478 & 2103) & (-32193 & 1087)]);
                class_225532.Method_22643(n3 + (5275 & 291), arrby[n4 & (8255 & 18559)]);
                break;
            }
            case 2: {
                class_225532.Method_22643(n3, arrby[n4 >>> (8474 & -16234)]);
                class_225532.Method_22643(n3 + (545 & 18433), arrby[n4 >>> (3420 & 4108) & (24639 & 127)]);
                class_225532.Method_22643(n3 + (27650 & -28638), arrby[n4 >>> (5766 & 24919) & (447 & 9279)]);
                class_225532.Method_22643(n3 + (8607 & -29693), 703 & -6083);
                break;
            }
            case 1: {
                class_225532.Method_22643(n3, arrby[n4 >>> (21618 & -30062)]);
                class_225532.Method_22643(n3 + (77 & -11133), arrby[n4 >>> (-16306 & 2189) & (2111 & 8831)]);
                class_225532.Method_22643(n3 + (17418 & -32478), 17789 & -30531);
                class_225532.Method_22643(n3 + (4611 & 11363), 5181 & -5443);
            }
        }
    }

    public static Class_22553 Method_37693(Class_22553 class_22553) {
        return Class_37686.Method_37694(class_22553, Class_27634.Field_27641);
    }

    public static Class_22553 Method_37694(Class_22553 class_22553, Class_27634 class_27634) {
        if (class_22553 == null) {
            throw new NullPointerException("src");
        }
        Class_22553 class_225532 = Class_37686.Method_37687(class_22553, class_22553.Method_22582(), class_22553.Method_22564(), class_27634);
        class_22553.Method_22590(class_22553.Method_22620());
        return class_225532;
    }

    private static byte[] Method_37695(Class_27634 class_27634) {
        if (class_27634 == null) {
            throw new NullPointerException("dialect");
        }
        return class_27634.Field_27636;
    }

    private static byte[] Method_37696(Class_27634 class_27634) {
        if (class_27634 == null) {
            throw new NullPointerException("dialect");
        }
        return class_27634.Field_27635;
    }

    private static boolean Method_37697(Class_27634 class_27634) {
        if (class_27634 == null) {
            throw new NullPointerException("dialect");
        }
        return class_27634.Field_27640;
    }

    private static int Method_37698(byte[] arrby, int n, Class_22553 class_22553, int n2, Class_27634 class_27634) {
        int n3;
        byte[] arrby2 = Class_37686.Method_37695(class_27634);
        if (arrby[n + (8259 & 3378)] == (-28545 & 8253)) {
            int n4 = (arrby2[arrby[n]] & (7679 & -32001)) << (31122 & 542) | (arrby2[arrby[n + (13321 & 515)]] & (-20993 & 4351)) << (-30900 & 10252);
            class_22553.Method_22643(n2, (byte)(n4 >>> (8473 & -31664)));
            return 16393 & 33;
        }
        if (arrby[n + (-30525 & 4099)] == (24703 & 6589)) {
            int n5 = (arrby2[arrby[n]] & (10495 & 17151)) << (12338 & -32161) | (arrby2[arrby[n + (2561 & 13507)]] & (-29185 & 29439)) << (-32754 & 3244) | (arrby2[arrby[n + (16530 & -31486)]] & (11263 & -32513)) << (16390 & 183);
            class_22553.Method_22643(n2, (byte)(n5 >>> (-16111 & 6300)));
            class_22553.Method_22643(n2 + (1187 & -32507), (byte)(n5 >>> (-32056 & 4107)));
            return 162 & 4162;
        }
        try {
            n3 = (arrby2[arrby[n]] & (767 & 16895)) << (-31598 & 18) | (arrby2[arrby[n + (18217 & 2049)]] & (255 & 7167)) << (-27252 & 8237) | (arrby2[arrby[n + (2 & -12157)]] & (255 & 511)) << (8294 & -30713) | arrby2[arrby[n + (99 & 22035)]] & (5375 & 25087);
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw new IllegalArgumentException("not encoded in Base64");
        }
        class_22553.Method_22643(n2, (byte)(n3 >> (404 & 29754)));
        class_22553.Method_22643(n2 + (16401 & -20215), (byte)(n3 >> (522 & -28455)));
        class_22553.Method_22643(n2 + (3594 & -8157), (byte)n3);
        return 16643 & 12831;
    }

    public static Class_22553 Method_37699(Class_22553 class_22553, Class_27634 class_27634) {
        return Class_37686.Method_37690(class_22553, Class_37686.Method_37697(class_27634), class_27634);
    }
}

