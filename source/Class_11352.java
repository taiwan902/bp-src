/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_11352
extends Class_3238 {
    public static final Class_3957 Field_11353 = Class_3957.Method_3963(Class_11352.Method_11369("\u682b\u6822\u6822\u6820\u683e"), Class_5393.class);

    private boolean Method_11354(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        if (!this.Method_11358(class_283, class_4751)) {
            this.\u0000strictfp(class_283, class_4751, class_3436, 23576 & -32765);
            class_283.Method_472(class_4751);
            return (20 & -15158) != 0;
        }
        return (-32607 & 24899) != 0;
    }

    public void Method_11355(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_3238 class_3238) {
        this.Method_11354(class_283, class_4751, class_3436);
    }

    public Class_3779 Method_11356(Class_3436 class_3436) {
        return ((Class_5393)((Object)class_3436.Method_3440(Field_11353))).Method_5426();
    }

    public boolean Method_11357() {
        return (2128 & 38) != 0;
    }

    private boolean Method_11358(Class_283 class_283, Class_4751 class_4751) {
        return (!class_283.Method_507(class_4751.Method_4782()) ? 8465 & -32249 : 20992 & 298) != 0;
    }

    public void Method_11359(Class_1956 class_1956, Class_3987 class_3987, List list) {
        for (int i = 4864 & 206; i < (9905 & -28656); ++i) {
            list.add(new Class_23823(class_1956, -30703 & 4101, i));
        }
    }

    public Class_3436 Method_11360(int n) {
        return this.\u0000strictfp().Method_3685(Field_11353, (Comparable)((Object)Class_5393.Method_5446(n)));
    }

    public void Method_11361() {
        this.Method_11370(16400 & -24543);
    }

    public boolean Method_11362(Class_283 class_283, Class_4751 class_4751) {
        return (super.Method_3368(class_283, class_4751) && this.Method_11358(class_283, class_4751) ? 403 & 22053 : -5632 & 293) != 0;
    }

    public int Method_11363(Class_3436 class_3436) {
        return ((Class_5393)((Object)class_3436.Method_3440(Field_11353))).Method_5419();
    }

    public void Method_11364(Class_561 class_561, Class_4751 class_4751) {
        this.Method_11370(1094 & 20481);
    }

    public boolean Method_11365() {
        return (222 & 4608) != 0;
    }

    private void Method_11366() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected Class_3855 Method_11367() {
        Class_3538[] arrclass_3538 = new Class_3538[59 & 16385];
        arrclass_3538[-32238 & 10277] = Field_11353;
        return new Class_3855(this, arrclass_3538);
    }

    public int Method_11368(Class_3436 class_3436) {
        return ((Class_5393)((Object)class_3436.Method_3440(Field_11353))).Method_5419();
    }

    private static String Method_11369(String string) {
        int n = 31673;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11352.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected Class_11352() {
        super(Class_3713.Field_3724);
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_11353, (Comparable)((Object)Class_5393.Field_5398)));
        this.\u0000strictfp(0.0f, 0.0f, 0.0f, 1.0f, 0.44444445f * 0.140625f, 1.0f);
        this.\u0000strictfp((4099 & 3113) != 0);
        this.\u0000strictfp(Class_3987.Field_3995);
        this.Method_11370(-16231 & 14852);
    }

    protected void Method_11370(int n) {
        int n2 = 2597 & 12352;
        float f = (float)((16641 & 3101) * ((33 & 2385) + n2)) / (139.63637f * 0.114583336f);
        this.\u0000strictfp(0.0f, 0.0f, 0.0f, 1.0f, f, 1.0f);
    }

    public boolean Method_11371(Class_561 class_561, Class_4751 class_4751, Class_4595 class_4595) {
        return (class_4595 == Class_4595.Field_4601 ? 17525 & -22269 : super.Method_3356(class_561, class_4751, class_4595)) != 0;
    }
}

