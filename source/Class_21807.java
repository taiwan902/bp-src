/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.Random;

public class Class_21807
extends Class_3238 {
    public static final Class_4394 Field_21808 = Class_4394.Method_4401(Class_21807.Method_21822("\uc030\uc035\uc034"), 16768 & 574, 16415 & 143);

    public void Method_21809(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_1061 class_1061) {
        class_1061.Method_1340(Class_32797.Field_32809, 1.0f);
    }

    public boolean Method_21810() {
        return (2 & 36) != 0;
    }

    public void Method_21811(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_3238 class_3238) {
        if (!this.Method_21813(class_283, class_4751)) {
            class_283.Method_541(class_4751, (-31663 & 2081) != 0);
        }
    }

    public Class_10997 Method_21812(Class_283 class_283, Class_4751 class_4751) {
        float f = 2.2413793f * 0.027884616f;
        return new Class_10997((float)class_4751.\u0000= final() + f, class_4751.\u0000, `(), (float)class_4751.\u0000strictfp() + f, (float)(class_4751.\u0000= final() + (8449 & 4097)) - f, class_4751.\u0000, `() + (-28497 & 24577), (float)(class_4751.\u0000strictfp() + (2025 & -16383)) - f);
    }

    public boolean Method_21813(Class_283 class_283, Class_4751 class_4751) {
        Object object = Class_4662.Field_4663.Method_4672();
        while (object.hasNext()) {
            Object e = object.next();
            Class_4595 class_4595 = (Class_4595)e;
            if (!class_283.Method_375(class_4751.Method_4765(class_4595)).Method_3442().Method_3373().Method_3762()) continue;
            return (1216 & 12320) != 0;
        }
        object = class_283.Method_375(class_4751.Method_4782()).Method_3442();
        return (object == Class_9265.Field_9405 || object == Class_9265.Field_9394 ? -15871 & 1033 : -32559 & 16932) != 0;
    }

    public Class_17531 Method_21814() {
        return Class_17531.Field_17538;
    }

    public Class_10997 Method_21815(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        float f = 1.1090909f * 0.05635246f;
        return new Class_10997((float)class_4751.\u0000= final() + f, class_4751.\u0000, `(), (float)class_4751.\u0000strictfp() + f, (float)(class_4751.\u0000= final() + (18465 & -32243)) - f, (float)(class_4751.\u0000, `() + (16785 & 1025)) - f, (float)(class_4751.\u0000strictfp() + (12453 & 2057)) - f);
    }

    protected Class_3855 Method_21816() {
        Class_3538[] arrclass_3538 = new Class_3538[2375 & 33];
        arrclass_3538[30785 & -31488] = Field_21808;
        return new Class_3855(this, arrclass_3538);
    }

    public int Method_21817(Class_3436 class_3436) {
        return (Integer)class_3436.Method_3440(Field_21808);
    }

    public boolean Method_21818(Class_283 class_283, Class_4751 class_4751) {
        return (super.Method_3368(class_283, class_4751) ? (int)(this.Method_21813(class_283, class_4751) ? 1 : 0) : 21 & -27134) != 0;
    }

    public Class_3436 Method_21819(int n) {
        return this.\u0000strictfp().Method_3685(Field_21808, Integer.valueOf(n));
    }

    private void Method_21820() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_21821(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Random random) {
        Class_4751 class_47512 = class_4751.Method_4769();
        if (class_283.Method_507(class_47512)) {
            int n = 1301 & 18467;
            while (class_283.Method_375(class_4751.Method_4768(n)).Method_3442() == this) {
                ++n;
            }
            if (n < (139 & -10189)) {
                int n2 = (Integer)class_3436.Method_3440(Field_21808);
                if (n2 == (-32753 & 143)) {
                    class_283.Method_435(class_47512, this.\u0000strictfp());
                    Class_3436 class_34362 = class_3436.Method_3437(Field_21808, Integer.valueOf(-22492 & 16));
                    class_283.Method_462(class_4751, class_34362, 6308 & 25364);
                    this.Method_21811(class_283, class_47512, class_34362, this);
                } else {
                    class_283.Method_462(class_4751, class_3436.Method_3437(Field_21808, Integer.valueOf(n2 + (6409 & 17541))), 518 & -29652);
                }
            }
        }
    }

    private static String Method_21822(String string) {
        int n = 27493;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_21807.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected Class_21807() {
        super(Class_3713.Field_3741);
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_21808, Integer.valueOf(4144 & 136)));
        this.\u0000strictfp((4615 & 2409) != 0);
        this.\u0000strictfp(Class_3987.Field_3995);
    }

    public boolean Method_21823() {
        return (4548 & -24014) != 0;
    }
}

