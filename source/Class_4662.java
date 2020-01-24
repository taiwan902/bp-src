/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.collect.Iterators
 */
import com.google.common.base.Predicate;
import com.google.common.collect.Iterators;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.Random;

public final class Class_4662
extends Enum
implements Predicate,
Iterable {
    public static final /* enum */ Class_4662 Field_4663 = new Class_4662(Class_4662.Method_4669("\u3440\u3440\u3450\u3440\u3454\u3444\u3444\u3454\u3448\u3448"), -28598 & 9264, Class_4662.Method_4673("\u0450\u0451\u044a\u0453\u0440\u0451\u0452\u044b\u0458\u0451"), 10273 & 4180);
    private static final Class_4662[] Field_4664;
    public static final /* enum */ Class_4662 Field_4665;
    private static final Class_4662[] Field_4666;

    public static Class_4662 Method_4667(String string) {
        return Enum.valueOf(Class_4662.class, string);
    }

    public Class_4595 Method_4668(Random random) {
        Class_4595[] arrclass_4595 = this.Method_4675();
        return arrclass_4595[random.nextInt(arrclass_4595.length)];
    }

    private static String Method_4669(String string) {
        int n = 3392;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4662.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_4670(String string) {
        int n = 26578;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4662.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_4671() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Iterator Method_4672() {
        return Iterators.forArray((Object[])this.Method_4675());
    }

    private static String Method_4673(String string) {
        int n = 5521;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4662.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_4674(String string) {
        int n = 8495;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4662.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static {
        Field_4665 = new Class_4662(Class_4662.Method_4670("\u0980\u0981\u0982\u0983\u0984\u0985\u0986\u0987"), 389 & 16385, Class_4662.Method_4674("\u400a\u4019\u4008\u400a\u4015\u401f\u401f\u4016"), 27 & -24031);
        Class_4662[] arrclass_4662 = new Class_4662[1042 & -24369];
        arrclass_4662[-26488 & 580] = Field_4663;
        arrclass_4662[18689 & 9219] = Field_4665;
        Field_4666 = arrclass_4662;
        Class_4662[] arrclass_46622 = new Class_4662[14562 & 259];
        arrclass_46622[2330 & 1664] = Field_4663;
        arrclass_46622[4105 & -30187] = Field_4665;
        Field_4664 = arrclass_46622;
    }

    public Class_4595[] Method_4675() {
        switch (Class_47083.Field_47085[this.ordinal()]) {
            case 1: {
                Class_4595[] arrclass_4595 = new Class_4595[16836 & 4116];
                arrclass_4595[-12271 & 9452] = Class_4595.Field_4598;
                arrclass_4595[4113 & -32121] = Class_4595.Field_4603;
                arrclass_4595[-24526 & 4614] = Class_4595.Field_4613;
                arrclass_4595[2051 & -31929] = Class_4595.Field_4602;
                return arrclass_4595;
            }
            case 2: {
                Class_4595[] arrclass_4595 = new Class_4595[-14822 & 10502];
                arrclass_4595[-16256 & 8770] = Class_4595.Field_4601;
                arrclass_4595[1849 & 16581] = Class_4595.Field_4615;
                return arrclass_4595;
            }
        }
        throw new Error("Someone's been tampering with the universe!");
    }

    public static Class_4662[] Method_4676() {
        return (Class_4662[])Field_4666.clone();
    }

    public boolean Method_4677(Class_4595 class_4595) {
        return (class_4595 != null && class_4595.Method_4640().Method_4585() == this ? 18977 & -23287 : 4140 & 26881) != 0;
    }

    public boolean Method_4678(Object object) {
        return this.Method_4677((Class_4595)object);
    }
}

