/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_37026
extends Class_1551
implements Class_37045 {
    private final Class_18 Field_37027;
    private long Field_37028;
    private static final Class_2080 Field_37029 = new Class_2080(Class_37026.Method_37042("\u0642\u0653\u0646\u0642\u0643\u0644\u0653\u0645\u0619\u0659\u064b\u065f\u0619\u0649\u065f\u065a\u0651\u0653\u0642\u0645\u0610\u0646\u0650\u0651"));
    public static final Class_2080 Field_37030 = new Class_2080(Class_37026.Method_37039("\u0a18\u0a08\u0a14\u0a19\u0a19\u0a1f\u0a09\u0a1e\u0a03\u0a0a\u0a19\u0a04\u0a03\u0a1e\u0a1c\u0a08\u0a0f\u0a19\u0a0d\u0a19\u0a03\u0a1f\u0a13\u0a1a\u0a05\u0a09\u0a0b\u0a08\u0a18\u0a1e\u0a02\u0a1d\u0a22\u0a2a"));
    private Class_10233 Field_37031;

    protected void Method_37032(Class_31566 class_31566, float f, int n, float f2, Class_10422 class_10422) {
        Class_16867.Method_16957();
        Class_16867.Method_16947();
        Class_16867.Method_16984(898 & 18242, -31981 & 8999, -29695 & 16533, 4115 & -31712);
        Class_16867.Method_16924(1.0f, 1.0f, 1.0f, f);
        this.Field_37027.Method_253().Method_34707(Field_37029);
        this.\u0000strictfp((float)(n - (-12193 & 3035)), f2, 130 & 19521, 4096 & -32762, -12106 & 702, 4886 & 26750);
        if (class_10422.Method_10426() >= 0) {
            this.\u0000strictfp((float)(n - (8411 & -27557) - (-23547 & 20681) + class_10422.Method_10426() * (828 & 1109)), f2 - 1.0f, -24320 & 16409, 2238 & -20202, 11288 & 21016, -32098 & 278);
        }
        Class_39477.Method_39485();
        for (int i = 8832 & 3141; i < (-24487 & 21291); ++i) {
            this.Method_37036(i, class_31566.Method_31574() / (-24573 & 23250) - (-10790 & 126) + i * (11324 & 16407) + (16962 & 147), f2 + 1.46875f * 2.0425532f, f, class_10422.Method_10427(i));
        }
        Class_39477.Method_39484();
        Class_16867.Method_16942();
        Class_16867.Method_16952();
    }

    public boolean Method_37033() {
        return (this.Field_37031 != null ? 25501 & 3139 : -30880 & 20624) != 0;
    }

    public Class_37026(Class_18 class_18) {
        this.Field_37027 = class_18;
    }

    public void Method_37034(int n) {
        int n2;
        for (n2 = this.Field_37031.Method_10248() + n; !(n2 < 0 || n2 > (-31207 & 2254) || this.Field_37031.Method_10254(n2) != Class_10233.Field_10240 && this.Field_37031.Method_10254(n2).Method_14684()); n2 += n) {
        }
        if (n2 >= 0 && n2 <= (-23413 & 2380)) {
            this.Field_37031.Method_10249(n2);
            this.Field_37028 = Class_18.Method_207();
        }
    }

    public void Method_37035() {
        this.Field_37028 = Class_18.Method_207();
        if (this.Method_37033()) {
            int n = this.Field_37031.Method_10248();
            if (n != (-1 & -1)) {
                this.Field_37031.Method_10249(n);
            }
        } else {
            this.Field_37031 = new Class_10233(this);
        }
    }

    private void Method_37036(int n, int n2, float f, float f2, Class_14683 class_14683) {
        this.Field_37027.Method_253().Method_34707(Field_37030);
        if (class_14683 != Class_10233.Field_10240) {
            int n3 = (int)(f2 * (69.21429f * 3.6842105f));
            Class_16867.Method_16961();
            Class_16867.Method_16943(n2, f, 0.0f);
            float f3 = class_14683.Method_14684() ? 1.0f : 0.03082192f * 8.111111f;
            Class_16867.Method_16924(f3, f3, f3, f2);
            class_14683.Method_14685(f3, n3);
            Class_16867.Method_16945();
            String string = String.valueOf(Class_39702.Method_39914(this.Field_37027.Field_84.Field_39705[n].Method_8274()));
            if (n3 > (707 & -28381) && class_14683.Method_14684()) {
                this.Field_37027.Field_27.Method_28729(string, n2 + (2231 & -11493) - (14338 & 94) - this.Field_37027.Field_27.Method_28715(string), f + 6.0f * 1.0f + 19.8f * 0.15151516f, (1627389951 & 16777215) + (n3 << (-30182 & 8349)));
            }
        }
    }

    private float Method_37037() {
        long l = this.Field_37028 - Class_18.Method_207() + (1937629849675519882L & 203756492L);
        return Class_13337.Method_13360((float)l / (1.8478261f * 1082.3529f), 0.0f, 1.0f);
    }

    public void Method_37038(int n) {
        this.Field_37028 = Class_18.Method_207();
        if (this.Field_37031 != null) {
            this.Field_37031.Method_10249(n);
        } else {
            this.Field_37031 = new Class_10233(this);
        }
    }

    private static String Method_37039(String string) {
        int n = 11055;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_37026.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_37040(Class_31566 class_31566, float f) {
        if (this.Field_37031 != null) {
            float f2 = this.Method_37037();
            if (f2 <= 0.0f) {
                this.Field_37031.Method_10245();
            } else {
                int n = class_31566.Method_31574() / (162 & -8101);
                float f3 = this.\u0000strictfp;
                this.\u0000strictfp = 1.4117647f * -63.75f;
                float f4 = (float)class_31566.Method_31575() - 0.875f * 25.142857f * f2;
                Class_10422 class_10422 = this.Field_37031.Method_10253();
                this.Method_37032(class_31566, f2, n, f4, class_10422);
                this.\u0000strictfp = f3;
            }
        }
    }

    public void Method_37041(Class_31566 class_31566) {
        int n = (int)(this.Method_37037() * (1.2962962f * 196.7143f));
        if (n > (16899 & 12295) && this.Field_37031 != null) {
            String string;
            Class_14683 class_14683 = this.Field_37031.Method_10247();
            String string2 = string = class_14683 != Class_10233.Field_10240 ? class_14683.Method_14687().Method_1783() : this.Field_37031.Method_10250().Method_40186().Method_1783();
            if (string != null) {
                int n2 = (class_31566.Method_31574() - this.Field_37027.Field_27.Method_28715(string)) / (1194 & 786);
                int n3 = class_31566.Method_31575() - (26659 & -32709);
                Class_16867.Method_16961();
                Class_16867.Method_16947();
                Class_16867.Method_16984(846 & 22306, 17155 & 9191, 4177 & 2471, 4098 & 18352);
                this.Field_37027.Field_27.Method_28729(string, n2, n3, (83886079 & -1006632961) + (n << (16410 & 5180)));
                Class_16867.Method_16952();
                Class_16867.Method_16945();
            }
        }
    }

    private static String Method_37042(String string) {
        int n = 3379;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_37026.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_37043() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_37044(Class_10233 class_10233) {
        this.Field_37031 = null;
        this.Field_37028 = 1656752580L & 7462130895874887730L;
    }
}

