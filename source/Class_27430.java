/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_27430
extends Class_4475 {
    public static final Class_5011 Field_27431 = Class_5011.Method_5012(Class_27430.Method_27434("\u0460\u0460\u0462\u0462\u0464\u0464"), Class_4662.Field_4663);
    public static final Class_4394 Field_27432 = Class_4394.Method_4401(Class_27430.Method_27442("\u1453\u1453\u1450\u1451\u1450\u1453"), 25136 & -32510, 16562 & 3074);

    private void Method_27433() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static String Method_27434(String string) {
        int n = 2330;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_27430.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public int Method_27435(Class_3436 class_3436) {
        int n = -31736 & 11142;
        n |= ((Class_4595)((Object)class_3436.Method_3440(Field_27431))).Method_4619();
        return n |= (Integer)class_3436.Method_3440(Field_27432) << (18562 & 1607);
    }

    public Class_3436 Method_27436(Class_283 class_283, Class_4751 class_4751, Class_4595 class_4595, float f, float f2, float f3, int n, Class_859 class_859) {
        Class_4595 class_45952 = class_859.\u0000, `().Method_4620();
        return super.\u0000strictfp(class_283, class_4751, class_4595, f, f2, f3, n, class_859).Method_3437(Field_27431, (Comparable)((Object)class_45952)).Method_3437(Field_27432, Integer.valueOf(n >> (10 & 962)));
    }

    public boolean Method_27437() {
        return (6340 & -31214) != 0;
    }

    public int Method_27438(Class_3436 class_3436) {
        return (Integer)class_3436.Method_3440(Field_27432);
    }

    public void Method_27439(Class_283 class_283, Class_4751 class_4751) {
        class_283.Method_502(1022 & 31743, class_4751, -19455 & 16998);
    }

    public boolean Method_27440(Class_561 class_561, Class_4751 class_4751, Class_4595 class_4595) {
        return (8673 & 1) != 0;
    }

    public void Method_27441(Class_561 class_561, Class_4751 class_4751) {
        Class_4595 class_4595 = (Class_4595)((Object)class_561.Method_568(class_4751).Method_3440(Field_27431));
        if (class_4595.Method_4640() == Class_4565.Field_4566) {
            this.\u0000strictfp(0.0f, 0.0f, 0.0425f * 2.9411764f, 1.0f, 1.0f, 6.78125f * 0.12903225f);
        } else {
            this.\u0000strictfp(0.64705884f * 0.19318181f, 0.0f, 0.0f, 0.5448113f * 1.6060606f, 1.0f, 1.0f);
        }
    }

    private static String Method_27442(String string) {
        int n = 21112;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_27430.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public boolean Method_27443(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_626 class_626, Class_4595 class_4595, float f, float f2, float f3) {
        if (!class_283.Field_306) {
            class_626.Method_815(new Class_22196(class_283, class_4751));
        }
        return (1569 & 16385) != 0;
    }

    protected Class_3855 Method_27444() {
        Class_3538[] arrclass_3538 = new Class_3538[194 & 28731];
        arrclass_3538[8 & 2323] = Field_27431;
        arrclass_3538[-10157 & 1161] = Field_27432;
        return new Class_3855(this, arrclass_3538);
    }

    public void Method_27445(Class_1956 class_1956, Class_3987 class_3987, List list) {
        list.add(new Class_23823(class_1956, 527 & 1121, 4112 & -14592));
        list.add(new Class_23823(class_1956, 1165 & -11503, 2049 & 9));
        list.add(new Class_23823(class_1956, 12809 & -32351, 9350 & -31878));
    }

    public Class_3436 Method_27446(int n) {
        return this.\u0000strictfp().Method_3685(Field_27431, (Comparable)((Object)Class_4595.Method_4628(n & (31235 & 291)))).Method_3437(Field_27432, Integer.valueOf((n & (10511 & 4111)) >> (34 & 2178)));
    }

    public Class_3436 Method_27447(Class_3436 class_3436) {
        return this.\u0000strictfp().Method_3685(Field_27431, (Comparable)((Object)Class_4595.Field_4613));
    }

    public boolean Method_27448() {
        return (6148 & -16328) != 0;
    }

    protected Class_27430() {
        super(Class_3713.Field_3714);
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_27431, (Comparable)((Object)Class_4595.Field_4598)).Method_3437(Field_27432, Integer.valueOf(1164 & -8190)));
        this.\u0000strictfp(2368 & 28709);
        this.\u0000strictfp(Class_3987.Field_3995);
    }

    protected void Method_27449(Class_4486 class_4486) {
        class_4486.Method_4498((9233 & 4425) != 0);
    }
}

