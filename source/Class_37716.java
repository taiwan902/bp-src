/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_37716
extends Class_1956 {
    public final int Field_37717;
    public final int Field_37718;
    private static final Class_5046 Field_37719;
    public final int Field_37720;
    public static final String[] Field_37721;
    private static final int[] Field_37722;
    private final Class_18620 Field_37723;

    private static String Method_37724(String string) {
        int n = 10178;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_37716.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_37725(Class_23823 class_23823) {
        Class_1699 class_1699;
        Class_1699 class_16992;
        if (this.Field_37723 == Class_18620.Field_18629 && (class_16992 = class_23823.Method_23845()) != null && (class_1699 = class_16992.Method_1703("display")).Method_1707("color")) {
            class_1699.Method_1740("color");
        }
    }

    public Class_18620 Method_37726() {
        return this.Field_37723;
    }

    private static String Method_37727(String string) {
        int n = 16166;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_37716.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public boolean Method_37728(Class_23823 class_23823, Class_23823 class_238232) {
        return (this.Field_37723.Method_18646() == class_238232.Method_23844() ? 16929 & -31603 : (int)(super.Method_1998(class_23823, class_238232) ? 1 : 0)) != 0;
    }

    public int Method_37729(Class_23823 class_23823) {
        Class_1699 class_1699;
        if (this.Field_37723 != Class_18620.Field_18629) {
            return -1 & -1;
        }
        Class_1699 class_16992 = class_23823.Method_23845();
        if (class_16992 != null && (class_1699 = class_16992.Method_1703("display")) != null && class_1699.Method_1715("color", 2055 & 4555)) {
            return class_1699.Method_1738("color");
        }
        return 1285582322 & -1600096440;
    }

    public void Method_37730(Class_23823 class_23823, int n) {
        if (this.Field_37723 != Class_18620.Field_18629) {
            throw new UnsupportedOperationException("Can't dye non-leather!");
        }
        Class_1699 class_1699 = class_23823.Method_23845();
        if (class_1699 == null) {
            class_1699 = new Class_1699();
            class_23823.Method_23869(class_1699);
        }
        Class_1699 class_16992 = class_1699.Method_1703("display");
        if (!class_1699.Method_1715("display", 75 & 2330)) {
            class_1699.Method_1744("display", class_16992);
        }
        class_16992.Method_1739("color", n);
    }

    private static String Method_37731(String string) {
        int n = 848;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_37716.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static int[] Method_37732() {
        return Field_37722;
    }

    static {
        int[] arrn = new int[11270 & 4333];
        arrn[162 & -14848] = -20789 & 16399;
        arrn[291 & 3201] = 112 & -9451;
        arrn[21506 & 10259] = -14033 & 15;
        arrn[16467 & -27997] = 2895 & 17597;
        Field_37722 = arrn;
        String[] arrstring = new String[-30633 & 4620];
        arrstring[4704 & 16386] = Class_37716.Method_37731("\u2413\u2417\u2412\u2411\u2411\u2400\u2411\u2416\u240a\u240c\u241d\u2408\u241f\u241f\u240b\u241f\u2413\u2413\u2404\u2400\u2403\u2405\u2411\u2402\u241b\u2419\u240e\u240b\u2409\u241e\u241f\u240c\u2401\u2416\u2411\u2410\u2417\u2417\u2404");
        arrstring[283 & 1] = Class_37716.Method_37724("\u4004\u4001\u4007\u4007\u4004\u4014\u4006\u4002\u4015\u4050\u4002\u4016\u4000\u4001\u4016\u4043\u4004\u4005\u4013\u4016\u4014\u4031\u4006\u4016\u4004\u4005\u4013\u4037\u4014\u4000\u4002\u4012\u4034\u4001\u4003\u4007\u4014\u4010\u4017\u4002\u4000\u4014\u4006");
        arrstring[2595 & 16470] = Class_37716.Method_37735("\u0923\u0922\u0920\u0922\u0921\u0921\u0923\u0921\u092a\u0969\u092b\u092b\u092b\u092a\u0929\u0968\u0933\u0932\u0932\u0933\u0933\u0910\u0933\u0931\u093b\u0938\u0938\u0918\u0939\u093b\u0939\u093b\u0921\u0903\u0903\u0900\u0901\u0902\u0900\u0900\u0909");
        arrstring[-24569 & 5235] = Class_37716.Method_37727("\u8470\u8470\u8470\u8470\u8470\u8460\u8470\u8470\u8468\u8428\u8478\u8468\u8478\u8478\u8468\u8438\u8460\u8460\u8470\u8470\u8470\u8450\u8460\u8470\u8468\u8468\u8478\u8458\u8478\u8468\u8468\u8478\u8460\u8450\u8450\u8450\u8440\u8440");
        Field_37721 = arrstring;
        Field_37719 = new Class_47719();
    }

    public Class_37716(Class_18620 class_18620, int n, int n2) {
        this.Field_37723 = class_18620;
        this.Field_37717 = n2;
        this.Field_37720 = n;
        this.Field_37718 = class_18620.Method_18648(n2);
        this.\u0000strictfp(class_18620.Method_18635(n2));
        this.\u0000strictfp = 10305 & 16417;
        this.\u0000strictfp(Class_3987.Field_4004);
        Class_4850.Field_4851.\u0000strictfp((Object)this, (Object)Field_37719);
    }

    public Class_23823 Method_37733(Class_23823 class_23823, Class_283 class_283, Class_626 class_626) {
        int n = Class_34093.Method_34150(class_23823) - (3 & 1037);
        Class_23823 class_238232 = class_626.Method_719(n);
        if (class_238232 == null) {
            class_626.Method_759(n, class_23823.Method_23850());
            class_23823.Field_23826 = -30536 & 16384;
        }
        return class_23823;
    }

    public boolean Method_37734(Class_23823 class_23823) {
        return (this.Field_37723 != Class_18620.Field_18629 ? 24 & 4737 : (!class_23823.Method_23842() ? 0 & 4800 : (!class_23823.Method_23845().Method_1715("display", 43 & -25766) ? -22528 & 5376 : (int)(class_23823.Method_23845().Method_1703("display").Method_1715("color", 2087 & -28413) ? 1 : 0)))) != 0;
    }

    private static String Method_37735(String string) {
        int n = 18568;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_37716.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public int Method_37736(Class_23823 class_23823, int n) {
        if (n > 0) {
            return 1358954495 & 33554431;
        }
        int n2 = this.Method_37729(class_23823);
        if (n2 < 0) {
            n2 = 167772159 & 83886079;
        }
        return n2;
    }

    public int Method_37737() {
        return this.Field_37723.Method_18640();
    }

    private void Method_37738() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

