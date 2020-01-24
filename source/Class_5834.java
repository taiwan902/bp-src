/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;
import net.minecraft.util.Vec3;

public class Class_5834
extends Class_3238 {
    public static final Class_5011 Field_5835 = Class_5011.Method_5012(Class_5834.Method_5844("\u0105\u0100\u0102\u0102\u0101\u0100"), new Class_5855());

    public int Method_5836(Class_3436 class_3436) {
        int n = -19960 & 16416;
        switch (Class_18602.Field_18603[((Class_4595)((Object)class_3436.Method_3440(Field_5835))).ordinal()]) {
            case 1: {
                n |= 1095 & 129;
                break;
            }
            case 2: {
                n |= -19454 & 18450;
                break;
            }
            case 3: {
                n |= -28669 & 2567;
                break;
            }
            case 4: {
                n |= -32764 & 4238;
                break;
            }
            default: {
                n |= 2325 & 69;
            }
        }
        return n;
    }

    public boolean Method_5837() {
        return (20576 & 2) != 0;
    }

    public void Method_5838(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        this.Method_5850(class_283, class_4751, class_3436);
    }

    public boolean Method_5839() {
        return (12416 & 16501) != 0;
    }

    protected boolean Method_5840(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        if (!this.Method_5850(class_283, class_4751, class_3436)) {
            return (-32491 & 31297) != 0;
        }
        Class_4595 class_4595 = (Class_4595)((Object)class_3436.Method_3440(Field_5835));
        Class_4565 class_4565 = class_4595.Method_4640();
        Class_4595 class_45952 = class_4595.Method_4660();
        int n = 0 & 4;
        if (class_4565.Method_4581() && !class_283.Method_388(class_4751.Method_4765(class_45952), (1025 & 2855) != 0)) {
            n = 533 & 2441;
        } else if (class_4565.Method_4589() && !this.Method_5841(class_283, class_4751.Method_4765(class_45952))) {
            n = -15735 & 4353;
        }
        if (n != 0) {
            this.\u0000strictfp(class_283, class_4751, class_3436, 7432 & -8122);
            class_283.Method_472(class_4751);
            return (24705 & -32767) != 0;
        }
        return (-31568 & 12806) != 0;
    }

    private boolean Method_5841(Class_283 class_283, Class_4751 class_4751) {
        if (Class_283.Method_538(class_283, class_4751)) {
            return (10345 & 5889) != 0;
        }
        Class_3238 class_3238 = class_283.Method_375(class_4751).Method_3442();
        return (class_3238 instanceof Class_27820 || class_3238 == Class_9265.Field_9345 || class_3238 == Class_9265.Field_9320 || class_3238 == Class_9265.Field_9344 ? -28669 & 8573 : 16642 & -32683) != 0;
    }

    public Class_17531 Method_5842() {
        return Class_17531.Field_17538;
    }

    public void Method_5843(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Random random) {
        Class_4595 class_4595 = (Class_4595)((Object)class_3436.Method_3440(Field_5835));
        double d = (double)class_4751.\u0000= final() + 0.5 * 1.0;
        double d2 = (double)class_4751.\u0000, `() + 0.10632911392405063 * 6.583333333333333;
        double d3 = (double)class_4751.\u0000strictfp() + 1.0727272727272728 * 0.4661016949152542;
        double d4 = 0.7373737373737373 * 0.29835616438356166;
        double d5 = 0.3375 * 0.8;
        if (class_4595.Method_4640().Method_4581()) {
            Class_4595 class_45952 = class_4595.Method_4660();
            class_283.Method_407(Class_40274.Field_40283, d + d5 * (double)class_45952.Method_4654(), d2 + d4, d3 + d5 * (double)class_45952.Method_4656(), 0.0, 0.0, 0.0, new int[-32607 & 282]);
            class_283.Method_407(Class_40274.Field_40318, d + d5 * (double)class_45952.Method_4654(), d2 + d4, d3 + d5 * (double)class_45952.Method_4656(), 0.0, 0.0, 0.0, new int[-31406 & 20521]);
        } else {
            class_283.Method_407(Class_40274.Field_40283, d, d2, d3, 0.0, 0.0, 0.0, new int[1025 & 0]);
            class_283.Method_407(Class_40274.Field_40318, d, d2, d3, 0.0, 0.0, 0.0, new int[8208 & 1290]);
        }
    }

    protected Class_5834() {
        super(Class_3713.Field_3751);
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_5835, (Comparable)((Object)Class_4595.Field_4601)));
        this.\u0000strictfp((16485 & 2179) != 0);
        this.\u0000strictfp(Class_3987.Field_3995);
    }

    private static String Method_5844(String string) {
        int n = 13942;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5834.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected Class_3855 Method_5845() {
        Class_3538[] arrclass_3538 = new Class_3538[7 & 18193];
        arrclass_3538[-3584 & 66] = Field_5835;
        return new Class_3855(this, arrclass_3538);
    }

    private void Method_5846() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_3436 Method_5847(Class_283 class_283, Class_4751 class_4751, Class_4595 class_4595, float f, float f2, float f3, int n, Class_859 class_859) {
        if (this.Method_5851(class_283, class_4751, class_4595)) {
            return this.\u0000strictfp().Method_3685(Field_5835, (Comparable)((Object)class_4595));
        }
        Iterator iterator = Class_4662.Field_4663.Method_4672();
        while (iterator.hasNext()) {
            Object e = iterator.next();
            Class_4595 class_45952 = (Class_4595)e;
            if (!class_283.Method_388(class_4751.Method_4765(class_45952.Method_4660()), (8465 & 1) != 0)) continue;
            return this.\u0000strictfp().Method_3685(Field_5835, (Comparable)((Object)class_45952));
        }
        return this.\u0000strictfp();
    }

    public Class_10997 Method_5848(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        return null;
    }

    public void Method_5849(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_3238 class_3238) {
        this.Method_5840(class_283, class_4751, class_3436);
    }

    protected boolean Method_5850(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        if (class_3436.Method_3442() == this && this.Method_5851(class_283, class_4751, (Class_4595)((Object)class_3436.Method_3440(Field_5835)))) {
            return (2113 & 405) != 0;
        }
        if (class_283.Method_375(class_4751).Method_3442() == this) {
            this.\u0000strictfp(class_283, class_4751, class_3436, 8353 & 6164);
            class_283.Method_472(class_4751);
        }
        return (1 & -10110) != 0;
    }

    private boolean Method_5851(Class_283 class_283, Class_4751 class_4751, Class_4595 class_4595) {
        Class_4751 class_47512 = class_4751.Method_4765(class_4595.Method_4660());
        boolean bl = class_4595.Method_4640().Method_4581();
        return (bl && class_283.Method_388(class_47512, (-32759 & 8577) != 0) || class_4595.equals(Class_4595.Field_4601) && this.Method_5841(class_283, class_47512) ? 9589 & -12285 : 12812 & -32703) != 0;
    }

    public Class_3436 Method_5852(int n) {
        Class_3436 class_3436 = this.\u0000strictfp();
        switch (n) {
            case 1: {
                class_3436 = class_3436.Method_3437(Field_5835, (Comparable)((Object)Class_4595.Field_4603));
                break;
            }
            case 2: {
                class_3436 = class_3436.Method_3437(Field_5835, (Comparable)((Object)Class_4595.Field_4602));
                break;
            }
            case 3: {
                class_3436 = class_3436.Method_3437(Field_5835, (Comparable)((Object)Class_4595.Field_4613));
                break;
            }
            case 4: {
                class_3436 = class_3436.Method_3437(Field_5835, (Comparable)((Object)Class_4595.Field_4598));
                break;
            }
            default: {
                class_3436 = class_3436.Method_3437(Field_5835, (Comparable)((Object)Class_4595.Field_4601));
            }
        }
        return class_3436;
    }

    public Class_37110 Method_5853(Class_283 class_283, Class_4751 class_4751, Vec3 vec3, Vec3 vec32) {
        Class_4595 class_4595 = (Class_4595)((Object)class_283.Method_375(class_4751).Method_3440(Field_5835));
        float f = 0.6214286f * 0.2413793f;
        if (class_4595 == Class_4595.Field_4603) {
            this.\u0000strictfp(0.0f, 0.04390244f * 4.5555553f, 0.6875f * 0.72727275f - f, f * 2.0f, 7.52f * 0.10638298f, 0.059523813f * 8.4f + f);
        } else if (class_4595 == Class_4595.Field_4602) {
            this.\u0000strictfp(1.0f - f * 2.0f, 0.007894737f * 25.333334f, 0.5813953f * 0.86f - f, 1.0f, 0.7205882f * 1.1102041f, 0.14673913f * 3.4074075f + f);
        } else if (class_4595 == Class_4595.Field_4613) {
            this.\u0000strictfp(2.1666667f * 0.23076923f - f, 0.21052632f * 0.95f, 0.0f, 1.4333334f * 0.3488372f + f, 0.70303035f * 1.137931f, f * 2.0f);
        } else if (class_4595 == Class_4595.Field_4598) {
            this.\u0000strictfp(4.25f * 0.11764706f - f, 0.74444443f * 0.26865673f, 1.0f - f * 2.0f, 0.3f * 1.6666666f + f, 0.9081082f * 0.88095236f, 1.0f);
        } else {
            f = 0.20555556f * 0.4864865f;
            this.\u0000strictfp(2.4285715f * 0.20588236f - f, 0.0f, 0.15517241f * 3.2222223f - f, 0.3244681f * 1.5409836f + f, 0.6911393f * 0.8681319f, 0.5520833f * 0.9056604f + f);
        }
        return super.Method_3372(class_283, class_4751, vec3, vec32);
    }

    public boolean Method_5854(Class_283 class_283, Class_4751 class_4751) {
        for (Class_4595 class_4595 : Field_5835.\u0000strictfp()) {
            if (!this.Method_5851(class_283, class_4751, class_4595)) continue;
            return (-9855 & 1) != 0;
        }
        return (16524 & 2368) != 0;
    }
}

