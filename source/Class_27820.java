/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_27820
extends Class_3238 {
    public static final Class_4173 Field_27821;
    public static final Class_4173 Field_27822;
    public static final Class_4173 Field_27823;
    public static final Class_4173 Field_27824;

    public boolean Method_27825(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_626 class_626, Class_4595 class_4595, float f, float f2, float f3) {
        return (class_283.Field_306 ? 7 & 1185 : (int)(Class_30873.Method_30876(class_626, class_283, class_4751) ? 1 : 0)) != 0;
    }

    private void Method_27826() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_27827() {
        return (2112 & 17028) != 0;
    }

    public Class_3436 Method_27828(Class_3436 class_3436, Class_561 class_561, Class_4751 class_4751) {
        return class_3436.Method_3437(Field_27823, Boolean.valueOf(this.Method_27837(class_561, class_4751.Method_4778()))).Method_3437(Field_27821, Boolean.valueOf(this.Method_27837(class_561, class_4751.Method_4770()))).Method_3437(Field_27822, Boolean.valueOf(this.Method_27837(class_561, class_4751.Method_4784()))).Method_3437(Field_27824, Boolean.valueOf(this.Method_27837(class_561, class_4751.Method_4771())));
    }

    protected Class_3855 Method_27829() {
        Class_3538[] arrclass_3538 = new Class_3538[422 & 21020];
        arrclass_3538[24648 & 6176] = Field_27823;
        arrclass_3538[-3657 & 73] = Field_27821;
        arrclass_3538[-20413 & 16406] = Field_27824;
        arrclass_3538[5635 & 139] = Field_27822;
        return new Class_3855(this, arrclass_3538);
    }

    private static String Method_27830(String string) {
        int n = 21992;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_27820.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public boolean Method_27831(Class_561 class_561, Class_4751 class_4751) {
        return (16768 & -31228) != 0;
    }

    static {
        Field_27823 = Class_4173.Method_4177(Class_27820.Method_27836("\u6521\u6520\u6527\u6523\u6525"));
        Field_27821 = Class_4173.Method_4177(Class_27820.Method_27834("\u009c\u0099\u0088\u008f"));
        Field_27822 = Class_4173.Method_4177(Class_27820.Method_27838("\u8238\u8225\u823c\u823d\u8222"));
        Field_27824 = Class_4173.Method_4177(Class_27820.Method_27830("\u0c00\u0c12\u0c02\u0c00"));
    }

    public void Method_27832(Class_561 class_561, Class_4751 class_4751) {
        boolean bl = this.Method_27837(class_561, class_4751.Method_4778());
        boolean bl2 = this.Method_27837(class_561, class_4751.Method_4784());
        boolean bl3 = this.Method_27837(class_561, class_4751.Method_4771());
        boolean bl4 = this.Method_27837(class_561, class_4751.Method_4770());
        float f = 0.29032257f * 1.2916667f;
        float f2 = 1.1636363f * 0.5371094f;
        float f3 = 0.8918919f * 0.42045453f;
        float f4 = 0.15782829f * 3.96f;
        if (bl) {
            f3 = 0.0f;
        }
        if (bl2) {
            f4 = 1.0f;
        }
        if (bl3) {
            f = 0.0f;
        }
        if (bl4) {
            f2 = 1.0f;
        }
        this.\u0000strictfp(f, 0.0f, f3, f2, 1.0f, f4);
    }

    public int Method_27833(Class_3436 class_3436) {
        return 9232 & 68;
    }

    private static String Method_27834(String string) {
        int n = 15239;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_27820.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public boolean Method_27835(Class_561 class_561, Class_4751 class_4751, Class_4595 class_4595) {
        return (-32759 & 18951) != 0;
    }

    private static String Method_27836(String string) {
        int n = 18888;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_27820.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public boolean Method_27837(Class_561 class_561, Class_4751 class_4751) {
        Class_3238 class_3238 = class_561.Method_568(class_4751).Method_3442();
        return (class_3238 == Class_9265.Field_9412 ? -28111 & 8452 : (!(class_3238 instanceof Class_27820 && class_3238.Field_3240 == this.\u0000strictfp || class_3238 instanceof Class_20919) ? (class_3238.Field_3240.Method_3769() && class_3238.Method_3319() ? (class_3238.Field_3240 != Class_3713.Field_3733 ? 2113 & -24431 : 515 & -13272) : 64 & -13787) : 24947 & 7681)) != 0;
    }

    private static String Method_27838(String string) {
        int n = 29803;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_27820.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_27820(Class_3713 class_3713, Class_3779 class_3779) {
        super(class_3713, class_3779);
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_27823, Boolean.valueOf((-23037 & 148) != 0)).Method_3437(Field_27821, Boolean.valueOf((8456 & 4624) != 0)).Method_3437(Field_27822, Boolean.valueOf((9346 & 23060) != 0)).Method_3437(Field_27824, Boolean.valueOf((24704 & -30103) != 0)));
        this.\u0000strictfp(Class_3987.Field_3995);
    }

    public boolean Method_27839() {
        return (2057 & -31706) != 0;
    }

    public void Method_27840(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_10997 class_10997, List list, Class_1061 class_1061) {
        boolean bl = this.Method_27837(class_283, class_4751.Method_4778());
        boolean bl2 = this.Method_27837(class_283, class_4751.Method_4784());
        boolean bl3 = this.Method_27837(class_283, class_4751.Method_4771());
        boolean bl4 = this.Method_27837(class_283, class_4751.Method_4770());
        float f = 0.5555556f * 0.67499995f;
        float f2 = 0.17391305f * 3.59375f;
        float f3 = 0.33333334f * 1.125f;
        float f4 = 0.2247191f * 2.78125f;
        if (bl) {
            f3 = 0.0f;
        }
        if (bl2) {
            f4 = 1.0f;
        }
        if (bl || bl2) {
            this.\u0000strictfp(f, 0.0f, f3, f2, 4.265625f * 0.35164836f, f4);
            super.Method_3423(class_283, class_4751, class_3436, class_10997, list, class_1061);
        }
        f3 = 2.3181818f * 0.16176471f;
        f4 = 0.7291667f * 0.85714287f;
        if (bl3) {
            f = 0.0f;
        }
        if (bl4) {
            f2 = 1.0f;
        }
        if (bl3 || bl4 || !bl && !bl2) {
            this.\u0000strictfp(f, 0.0f, f3, f2, 2.451613f * 0.6118421f, f4);
            super.Method_3423(class_283, class_4751, class_3436, class_10997, list, class_1061);
        }
        if (bl) {
            f3 = 0.0f;
        }
        if (bl2) {
            f4 = 1.0f;
        }
        this.\u0000strictfp(f, 0.0f, f3, f2, 1.0f, f4);
    }
}

