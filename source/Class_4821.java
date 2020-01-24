/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Class_4821
extends Class_3238 {
    public static final Class_4173 Field_4822 = Class_4173.Method_4177(Class_4821.Method_4828("\u2090\u2080\u2093"));

    protected Class_3855 Method_4823() {
        Class_3538[] arrclass_3538 = new Class_3538[28705 & -31271];
        arrclass_3538[-31484 & 2770] = Field_4822;
        return new Class_3855(this, arrclass_3538);
    }

    protected Class_4821() {
        super(Class_3713.Field_3743);
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_4822, Boolean.valueOf((6387 & 260) != 0)));
        this.\u0000strictfp(Class_3987.Field_3993);
    }

    public void Method_4824(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        this.Method_4826(class_283, class_4751, class_3436);
    }

    private void Method_4825() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_4826(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        if (!((Boolean)class_3436.Method_3440(Field_4822)).booleanValue() && this.Method_4829(class_283, class_4751)) {
            class_283.Method_462(class_4751, class_3436.Method_3437(Field_4822, Boolean.valueOf((1113 & 25095) != 0)), 11 & 8306);
            class_283.Method_502(-30735 & 10197, class_4751, Class_3238.Method_3435(Class_9265.Field_9286));
        }
    }

    public int Method_4827(Class_3436 class_3436) {
        return (Boolean)class_3436.Method_3440(Field_4822) != false ? 21 & 8193 : 100 & -31743;
    }

    private static String Method_4828(String string) {
        int n = 19426;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4821.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private boolean Method_4829(Class_283 class_283, Class_4751 class_4751) {
        LinkedList linkedList = Lists.newLinkedList();
        ArrayList arrayList = Lists.newArrayList();
        linkedList.add(new Class_28619(class_4751, -32766 & 8512));
        int n = -31232 & 6150;
        while (!linkedList.isEmpty()) {
            Class_28619 class_28619 = (Class_28619)linkedList.poll();
            Class_4751 class_47512 = (Class_4751)class_28619.Method_28622();
            int n2 = (Integer)class_28619.Method_28624();
            Class_4595[] arrclass_4595 = Class_4595.Method_4630();
            int n3 = arrclass_4595.length;
            for (int i = 259 & 4736; i < n3; ++i) {
                Class_4595 class_4595 = arrclass_4595[i];
                Class_4751 class_47513 = class_47512.Method_4765(class_4595);
                if (class_283.Method_375(class_47513).Method_3442().Method_3373() != Class_3713.Field_3734) continue;
                class_283.Method_462(class_47513, Class_9265.Field_9351.Method_3293(), 1058 & -32298);
                arrayList.add(class_47513);
                ++n;
                if (n2 >= (-8113 & 6934)) continue;
                linkedList.add(new Class_28619(class_47513, n2 + (-10095 & 779)));
            }
            if (n <= (80 & 8390)) continue;
            break;
        }
        for (Class_4751 class_47512 : arrayList) {
            class_283.Method_525(class_47512, Class_9265.Field_9351);
        }
        return (n > 0 ? 913 & -20415 : 2048 & 8236) != 0;
    }

    public String Method_4830() {
        return Class_7594.Method_7602(this.\u0000strictfp() + ".dry.name");
    }

    public Class_3436 Method_4831(int n) {
        return this.\u0000strictfp().Method_3685(Field_4822, Boolean.valueOf(((n & (-30703 & 4097)) == (4259 & -5631) ? 27201 & 4371 : -32694 & 26625) != 0));
    }

    public void Method_4832(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Random random) {
        Class_4595 class_4595;
        if (((Boolean)class_3436.Method_3440(Field_4822)).booleanValue() && (class_4595 = Class_4595.Method_4642(random)) != Class_4595.Field_4601 && !Class_283.Method_538(class_283, class_4751.Method_4765(class_4595))) {
            double d = class_4751.\u0000= final();
            double d2 = class_4751.\u0000, `();
            double d3 = class_4751.\u0000strictfp();
            if (class_4595 == Class_4595.Field_4615) {
                d2 -= 0.15294117647058825 * 0.3269230769230769;
                d += random.nextDouble();
                d3 += random.nextDouble();
            } else {
                d2 += random.nextDouble() * (2.3333333333333335 * 0.34285714285714286);
                if (class_4595.Method_4640() == Class_4565.Field_4566) {
                    d3 += random.nextDouble();
                    d = class_4595 == Class_4595.Field_4603 ? (d += 1.0) : (d += 0.47619047619047616 * 0.10500000000000001);
                } else {
                    d += random.nextDouble();
                    d3 = class_4595 == Class_4595.Field_4613 ? (d3 += 1.0) : (d3 += 0.22535211267605634 * 0.22187500000000002);
                }
            }
            class_283.Method_407(Class_40274.Field_40322, d, d2, d3, 0.0, 0.0, 0.0, new int[16403 & 512]);
        }
    }

    public int Method_4833(Class_3436 class_3436) {
        return (Boolean)class_3436.Method_3440(Field_4822) != false ? -7619 & 1283 : -13824 & 1248;
    }

    public void Method_4834(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_3238 class_3238) {
        this.Method_4826(class_283, class_4751, class_3436);
        super.Method_3336(class_283, class_4751, class_3436, class_3238);
    }

    public void Method_4835(Class_1956 class_1956, Class_3987 class_3987, List list) {
        list.add(new Class_23823(class_1956, 4357 & -14271, -31616 & 15104));
        list.add(new Class_23823(class_1956, 8233 & 6787, 1413 & 3));
    }
}

