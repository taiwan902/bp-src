/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
import com.google.common.base.Predicate;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;

public class Class_5230
extends Class_5164 {
    public static final Class_3957 Field_5231 = Class_3957.Method_3962(Class_5230.Method_5241("\u6264\u626c\u6264\u6264\u6260"), Class_5183.class, new Class_5253());
    public static final Class_4173 Field_5232 = Class_4173.Method_4177(Class_5230.Method_5244("\uc090\uc081\uc092\uc083\uc094\uc085\uc086"));

    public boolean Method_5233() {
        return (8257 & -31217) != 0;
    }

    public int Method_5234(Class_3436 class_3436) {
        int n = 21589 & 162;
        n |= ((Class_5183)((Object)class_3436.Method_3440(Field_5231))).Method_5215();
        if (((Boolean)class_3436.Method_3440(Field_5232)).booleanValue()) {
            n |= 1577 & -16312;
        }
        return n;
    }

    public Class_5230() {
        super((16547 & 17) != 0);
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_5232, Boolean.valueOf((2185 & -12268) != 0)).Method_3437(Field_5231, (Comparable)((Object)Class_5183.Field_5185)));
        this.\u0000strictfp((-32255 & 7) != 0);
    }

    public int Method_5235(Class_283 class_283, Class_4751 class_4751) {
        if (((Boolean)class_283.Method_375(class_4751).Method_3440(Field_5232)).booleanValue()) {
            List list = this.Method_5247(class_283, class_4751, Class_21091.class, new Predicate[4229 & 80]);
            if (!list.isEmpty()) {
                return ((Class_21091)list.get(-23756 & 6145)).Method_21103().Method_35886();
            }
            Predicate[] arrpredicate = new Predicate[16689 & 3];
            arrpredicate[-20285 & 2084] = Class_28857.Field_28861;
            List list2 = this.Method_5247(class_283, class_4751, Class_15933.class, arrpredicate);
            if (!list2.isEmpty()) {
                return Class_8295.Method_8337((Class_4961)list2.get(16960 & 1419));
            }
        }
        return 5760 & -32662;
    }

    private Class_10997 Method_5236(Class_4751 class_4751) {
        float f = 0.25555557f * 0.7826087f;
        return new Class_10997((float)class_4751.\u0000= final() + 1.8333334f * 0.10909091f, class_4751.\u0000, `(), (float)class_4751.\u0000strictfp() + 0.875f * 0.22857143f, (float)(class_4751.\u0000= final() + (2049 & -24571)) - 1.4313725f * 0.13972603f, (float)(class_4751.\u0000, `() + (-15359 & 4809)) - 0.90625f * 0.22068965f, (float)(class_4751.\u0000strictfp() + (773 & -25591)) - 3.857143f * 0.05185185f);
    }

    public void Method_5237(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        super.Method_5167(class_283, class_4751, class_3436);
        this.Method_5249(class_283, class_4751, class_3436);
    }

    public int Method_5238(Class_561 class_561, Class_4751 class_4751, Class_3436 class_3436, Class_4595 class_4595) {
        return (Boolean)class_3436.Method_3440(Field_5232) == false ? -21368 & 4357 : (class_4595 == Class_4595.Field_4601 ? -30513 & 303 : 4387 & 1536);
    }

    public void Method_5239(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Random random) {
    }

    public boolean Method_5240() {
        return (-20255 & 259) != 0;
    }

    private static String Method_5241(String string) {
        int n = 2824;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5230.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_3436 Method_5242(int n) {
        return this.\u0000strictfp().Method_3685(Field_5231, (Comparable)((Object)Class_5183.Method_5210(n & (18567 & -31713)))).Method_3437(Field_5232, Boolean.valueOf(((n & (8745 & -14326)) > 0 ? -31991 & 24691 : 4384 & -15231) != 0));
    }

    public void Method_5243(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Random random) {
        if (!class_283.Field_306 && ((Boolean)class_3436.Method_3440(Field_5232)).booleanValue()) {
            this.Method_5249(class_283, class_4751, class_3436);
        }
    }

    private static String Method_5244(String string) {
        int n = 19023;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5230.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public int Method_5245(Class_561 class_561, Class_4751 class_4751, Class_3436 class_3436, Class_4595 class_4595) {
        return (Boolean)class_3436.Method_3440(Field_5232) != false ? 2111 & 1039 : 9794 & 4124;
    }

    public int Method_5246(Class_283 class_283) {
        return 16501 & 540;
    }

    protected List Method_5247(Class_283 class_283, Class_4751 class_4751, Class class_, Predicate ... arrpredicate) {
        Class_10997 class_10997 = this.Method_5236(class_4751);
        return arrpredicate.length != (16617 & 8721) ? class_283.Method_488(class_, class_10997) : class_283.Method_395(class_, class_10997, arrpredicate[-32764 & 30890]);
    }

    protected Class_3855 Method_5248() {
        Class_3538[] arrclass_3538 = new Class_3538[6 & 1098];
        arrclass_3538[-6143 & 148] = Field_5231;
        arrclass_3538[67 & 12057] = Field_5232;
        return new Class_3855(this, arrclass_3538);
    }

    private void Method_5249(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        boolean bl = (Boolean)class_3436.Method_3440(Field_5232);
        int n = 8579 & -32248;
        List list = this.Method_5247(class_283, class_4751, Class_15933.class, new Predicate[-12078 & 8192]);
        if (!list.isEmpty()) {
            n = 87 & -9983;
        }
        if (n != 0 && !bl) {
            class_283.Method_462(class_4751, class_3436.Method_3437(Field_5232, Boolean.valueOf((8913 & -16115) != 0)), 27 & 12803);
            class_283.Method_525(class_4751, this);
            class_283.Method_525(class_4751.Method_4782(), this);
            class_283.Method_481(class_4751, class_4751);
        }
        if (n == 0 && bl) {
            class_283.Method_462(class_4751, class_3436.Method_3437(Field_5232, Boolean.valueOf((13449 & 2116) != 0)), 18439 & 1163);
            class_283.Method_525(class_4751, this);
            class_283.Method_525(class_4751.Method_4782(), this);
            class_283.Method_481(class_4751, class_4751);
        }
        if (n != 0) {
            class_283.Method_441(class_4751, this, this.Method_5246(class_283));
        }
        class_283.Method_520(class_4751, this);
    }

    private void Method_5250() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_5251(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_1061 class_1061) {
        if (!class_283.Field_306 && !((Boolean)class_3436.Method_3440(Field_5232)).booleanValue()) {
            this.Method_5249(class_283, new Class_4751(class_4751), class_3436);
        }
    }

    public Class_3538 Method_5252() {
        return Field_5231;
    }
}

