/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_1551 {
    public static final Class_2080 Field_1552;
    static Class_22385 Field_1553;
    public static final Class_2080 Field_1554;
    public static final Class_2080 Field_1555;
    protected float Field_1556;
    public static final Class_2080 Field_1557;

    public static void Method_1558(int n, int n2, int n3, int n4, int n5) {
        int n6;
        if (n < n3) {
            n6 = n;
            n = n3;
            n3 = n6;
        }
        if (n2 < n4) {
            n6 = n2;
            n2 = n4;
            n4 = n6;
        }
        float f = (float)(n5 >> (92 & 4665) & (9727 & -28417)) / (0.25581396f * 996.8182f);
        float f2 = (float)(n5 >> (3216 & 4888) & (5375 & 2303)) / (368.3333f * 0.6923077f);
        float f3 = (float)(n5 >> (-32628 & 265) & (-15105 & 767)) / (943.50006f * 0.27027026f);
        float f4 = (float)(n5 & (-28417 & 18687)) / (13.709677f * 18.6f);
        Class_7644 class_7644 = Class_7644.Method_7649();
        Class_22385 class_22385 = class_7644.Method_7648();
        Class_16867.Method_16947();
        Class_16867.Method_16922();
        Class_16867.Method_16984(8994 & 790, -3317 & 3863, -24301 & 20481, 516 & -24144);
        Class_16867.Method_16924(f2, f3, f4, f);
        class_22385.Method_22417(21711 & -24569, Class_29585.Field_29602);
        class_22385.Method_22443(n, n4, 0.0).Method_22451();
        class_22385.Method_22443(n3, n4, 0.0).Method_22451();
        class_22385.Method_22443(n3, n2, 0.0).Method_22451();
        class_22385.Method_22443(n, n2, 0.0).Method_22451();
        class_7644.Method_7647();
        Class_16867.Method_16965();
        Class_16867.Method_16952();
    }

    public void Method_1559(Class_28636 class_28636, String string, int n, int n2, int n3) {
        Class_16867.Method_16975();
        class_28636.Method_28729(string, n, n2, n3);
    }

    public static void Method_1560(int n, int n2, float f, float f2, int n3, int n4, int n5, int n6, float f3, float f4) {
        float f5 = 1.0f / f3;
        float f6 = 1.0f / f4;
        Class_7644 class_7644 = Class_7644.Method_7649();
        Class_22385 class_22385 = class_7644.Method_7648();
        class_22385.Method_22417(1703 & 14599, Class_29585.Field_29598);
        class_22385.Method_22443(n, n2 + n6, 0.0).Method_22433(f * f5, (f2 + (float)n4) * f6).Method_22451();
        class_22385.Method_22443(n + n5, n2 + n6, 0.0).Method_22433((f + (float)n3) * f5, (f2 + (float)n4) * f6).Method_22451();
        class_22385.Method_22443(n + n5, n2, 0.0).Method_22433((f + (float)n3) * f5, f2 * f6).Method_22451();
        class_22385.Method_22443(n, n2, 0.0).Method_22433(f * f5, f2 * f6).Method_22451();
        class_7644.Method_7647();
    }

    private static String Method_1561(String string) {
        int n = 12148;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_1551.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static void Method_1562() {
        Class_22385 class_22385 = Field_1553;
        class_22385.Method_22417(-27897 & 16527, Class_29585.Field_29602);
    }

    public void Method_1563(Class_28636 class_28636, String string, int n, int n2, int n3) {
        Class_16867.Method_16975();
        class_28636.Method_28729(string, n - class_28636.Method_28715(string) / (8706 & 4362), n2, n3);
    }

    public void Method_1564(float f, float f2, int n, int n2, int n3, int n4) {
        float f3 = 2.6041668E-4f * 15.0f;
        float f4 = 0.0028360446f * 1.3773584f;
        Class_7644 class_7644 = Class_7644.Method_7649();
        Class_22385 class_22385 = class_7644.Method_7648();
        class_22385.Method_22417(-15345 & 4183, Class_29585.Field_29598);
        class_22385.Method_22443(f + 0.0f, f2 + (float)n4, this.Field_1556).Method_22433((float)(n + (570 & -12284)) * f3, (float)(n2 + n4) * f4).Method_22451();
        class_22385.Method_22443(f + (float)n3, f2 + (float)n4, this.Field_1556).Method_22433((float)(n + n3) * f3, (float)(n2 + n4) * f4).Method_22451();
        class_22385.Method_22443(f + (float)n3, f2 + 0.0f, this.Field_1556).Method_22433((float)(n + n3) * f3, (float)(n2 + (146 & 2624)) * f4).Method_22451();
        class_22385.Method_22443(f + 0.0f, f2 + 0.0f, this.Field_1556).Method_22433((float)(n + (1840 & -8115)) * f3, (float)(n2 + (-14244 & 8193)) * f4).Method_22451();
        class_7644.Method_7647();
    }

    public void Method_1565(int n, int n2, Class_11372 class_11372, int n3, int n4) {
        Class_7644 class_7644 = Class_7644.Method_7649();
        Class_22385 class_22385 = class_7644.Method_7648();
        class_22385.Method_22417(4119 & -32537, Class_29585.Field_29598);
        class_22385.Method_22443(n + (56 & 3329), n2 + n4, this.Field_1556).Method_22433(class_11372.Method_11420(), class_11372.Method_11429()).Method_22451();
        class_22385.Method_22443(n + n3, n2 + n4, this.Field_1556).Method_22433(class_11372.Method_11444(), class_11372.Method_11429()).Method_22451();
        class_22385.Method_22443(n + n3, n2 + (352 & -24440), this.Field_1556).Method_22433(class_11372.Method_11444(), class_11372.Method_11437()).Method_22451();
        class_22385.Method_22443(n + (13916 & 16640), n2 + (8 & -30428), this.Field_1556).Method_22433(class_11372.Method_11420(), class_11372.Method_11437()).Method_22451();
        class_7644.Method_7647();
    }

    public static void Method_1566(int n, int n2, float f, float f2, int n3, int n4, float f3, float f4) {
        float f5 = 1.0f / f3;
        float f6 = 1.0f / f4;
        Class_7644 class_7644 = Class_7644.Method_7649();
        Class_22385 class_22385 = class_7644.Method_7648();
        class_22385.Method_22417(9287 & -15977, Class_29585.Field_29598);
        class_22385.Method_22443(n, n2 + n4, 0.0).Method_22433(f * f5, (f2 + (float)n4) * f6).Method_22451();
        class_22385.Method_22443(n + n3, n2 + n4, 0.0).Method_22433((f + (float)n3) * f5, (f2 + (float)n4) * f6).Method_22451();
        class_22385.Method_22443(n + n3, n2, 0.0).Method_22433((f + (float)n3) * f5, f2 * f6).Method_22451();
        class_22385.Method_22443(n, n2, 0.0).Method_22433(f * f5, f2 * f6).Method_22451();
        class_7644.Method_7647();
    }

    public static void Method_1567() {
        Class_16867.Method_16947();
        Class_16867.Method_16922();
        Class_16867.Method_16984(19242 & 1862, 1987 & -11517, 1033 & 17169, -31730 & 16913);
        Field_1553.Method_22419();
        Class_24679.Method_24681(Field_1553);
        Class_16867.Method_16965();
        Class_16867.Method_16952();
    }

    protected void Method_1568(int n, int n2, int n3, int n4) {
        if (n3 < n2) {
            int n5 = n2;
            n2 = n3;
            n3 = n5;
        }
        Class_1551.Method_1558(n, n2 + (4675 & -22495), n + (2053 & -28533), n3, n4);
    }

    public static void Method_1569(int n, int n2, int n3, int n4, int n5) {
        int n6;
        if (n < n3) {
            n6 = n;
            n = n3;
            n3 = n6;
        }
        if (n2 < n4) {
            n6 = n2;
            n2 = n4;
            n4 = n6;
        }
        float f = (float)(n5 >> (-7944 & 6168) & (-29953 & 8703)) / (20.666666f * 12.33871f);
        float f2 = (float)(n5 >> (-29935 & 4118) & (1791 & 10495)) / (4.6f * 55.434784f);
        float f3 = (float)(n5 >> (264 & 24602) & (9471 & -16129)) / (0.030612245f * 8330.0f);
        float f4 = (float)(n5 & (17151 & -30465)) / (530.4f * 0.48076922f);
        Class_16867.Method_16924(f2, f3, f4, f);
        Class_22385 class_22385 = Field_1553;
        class_22385.Method_22443(n, n4, 0.0).Method_22451();
        class_22385.Method_22443(n3, n4, 0.0).Method_22451();
        class_22385.Method_22443(n3, n2, 0.0).Method_22451();
        class_22385.Method_22443(n, n2, 0.0).Method_22451();
    }

    static {
        Field_1557 = new Class_2080(Class_1551.Method_1574("\u1050\u1041\u1052\u1053\u1054\u1057\u1046\u1055\u1002\u1043\u1042\u1043\u1056\u1045\u1044\u1045\u1050\u1041\u1040\u1041\u1006\u1047\u1046\u1045\u1042\u1043\u1050\u1041\u1054\u1047\u1046\u1005\u1050\u1043\u1040"));
        Field_1554 = new Class_2080(Class_1551.Method_1561("\u9021\u9021\u9029\u9020\u9020\u9020\u9020\u9021\u9020\u9029\u9028\u9021\u9020\u9021\u9029\u9028\u9028\u9029\u9029\u9021\u9008\u9020\u9020\u9021\u9020\u9029\u9029\u9021\u9028\u9020\u9029\u9020\u9021\u9028\u9020"));
        Field_1552 = new Class_2080(Class_1551.Method_1576("\u4920\u4920\u492a\u4922\u4924\u4924\u4926\u4926\u4968\u4920\u4922\u492a\u496c\u4924\u492e\u492e\u4930\u4930\u493a\u493a\u4934\u4934\u497e\u4936\u4930\u4930\u4932\u4932\u491c\u493c\u4936\u493e\u4928\u4920\u496a\u4922\u492c\u4924"));
        Field_1555 = new Class_2080(Class_1551.Method_1571("\u400c\u400c\u4002\u400e\u400c\u4008\u400e\u400a\u4004\u400c\u400e\u4002\u4004\u4000\u400a\u4006\u4014\u4018\u4016\u401a\u4014\u401c"));
        Field_1553 = new Class_22385(1227830550 & 1212544);
    }

    public void Method_1570(int n, int n2, int n3, int n4, int n5, int n6) {
        float f = 0.0043845666f * 0.8909091f;
        float f2 = 0.008300781f * 0.47058824f;
        Class_7644 class_7644 = Class_7644.Method_7649();
        Class_22385 class_22385 = class_7644.Method_7648();
        class_22385.Method_22417(-28665 & 8231, Class_29585.Field_29598);
        class_22385.Method_22443(n + (1154 & 96), n2 + n6, this.Field_1556).Method_22433((float)(n3 + (2434 & -24047)) * f, (float)(n4 + n6) * f2).Method_22451();
        class_22385.Method_22443(n + n5, n2 + n6, this.Field_1556).Method_22433((float)(n3 + n5) * f, (float)(n4 + n6) * f2).Method_22451();
        class_22385.Method_22443(n + n5, n2 + (128 & -24530), this.Field_1556).Method_22433((float)(n3 + n5) * f, (float)(n4 + (673 & 16652)) * f2).Method_22451();
        class_22385.Method_22443(n + (1800 & 8386), n2 + (19012 & -24430), this.Field_1556).Method_22433((float)(n3 + (7553 & 17012)) * f, (float)(n4 + (-26168 & 8738)) * f2).Method_22451();
        class_7644.Method_7647();
    }

    private static String Method_1571(String string) {
        int n = 17488;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_1551.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_1572() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_1573(int n, int n2, int n3, int n4, int n5, int n6) {
        float f = (float)(n5 >> (541 & 4122) & (17919 & 10495)) / (143.21918f * 1.7804878f);
        float f2 = (float)(n5 >> (280 & 2160) & (2303 & 25087)) / (189.19354f * 1.3478261f);
        float f3 = (float)(n5 >> (16685 & 8328) & (19711 & 4351)) / (8160.0f * 0.03125f);
        float f4 = (float)(n5 & (511 & 8447)) / (124.53488f * 2.047619f);
        float f5 = (float)(n6 >> (11834 & 16664) & (-30721 & 4351)) / (7649.9995f * 0.033333335f);
        float f6 = (float)(n6 >> (-27592 & 339) & (-32513 & 1791)) / (409.8214f * 0.62222224f);
        float f7 = (float)(n6 >> (204 & 57) & (-19969 & 20223)) / (0.35714287f * 714.0f);
        float f8 = (float)(n6 & (255 & 28927)) / (0.1904762f * 1338.75f);
        Class_16867.Method_16922();
        Class_16867.Method_16947();
        Class_16867.Method_16985();
        Class_16867.Method_16984(22275 & 9158, -31905 & 17283, -32135 & 16385, 72 & 177);
        Class_16867.Method_16972(16133 & -25343);
        Class_7644 class_7644 = Class_7644.Method_7649();
        Class_22385 class_22385 = class_7644.Method_7648();
        class_22385.Method_22417(4111 & 967, Class_29585.Field_29601);
        class_22385.Method_22443(n3, n2, this.Field_1556).Method_22427(f2, f3, f4, f).Method_22451();
        class_22385.Method_22443(n, n2, this.Field_1556).Method_22427(f2, f3, f4, f).Method_22451();
        class_22385.Method_22443(n, n4, this.Field_1556).Method_22427(f6, f7, f8, f5).Method_22451();
        class_22385.Method_22443(n3, n4, this.Field_1556).Method_22427(f6, f7, f8, f5).Method_22451();
        class_7644.Method_7647();
        Class_16867.Method_16972(7492 & 7424);
        Class_16867.Method_16952();
        Class_16867.Method_16913();
        Class_16867.Method_16965();
    }

    private static String Method_1574(String string) {
        int n = 19433;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_1551.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static void Method_1575(double d, double d2, double d3, double d4, int n) {
        double d5;
        if (d < d3) {
            d5 = d;
            d = d3;
            d3 = d5;
        }
        if (d2 < d4) {
            d5 = d2;
            d2 = d4;
            d4 = d5;
        }
        float f = (float)(n >> (18488 & 12317) & (5119 & 2303)) / (170.93407f * 1.4918033f);
        float f2 = (float)(n >> (20496 & -30672) & (-15105 & 255)) / (956.24994f * 0.26666668f);
        float f3 = (float)(n >> (1032 & 298) & (-3329 & 255)) / (0.16666667f * 1530.0f);
        float f4 = (float)(n & (16895 & 767)) / (0.40789473f * 625.1613f);
        Class_7644 class_7644 = Class_7644.Method_7649();
        Class_22385 class_22385 = class_7644.Method_7648();
        Class_16867.Method_16947();
        Class_16867.Method_16922();
        Class_16867.Method_16984(2898 & -6366, 843 & 9015, 4129 & -16363, 128 & 16902);
        Class_16867.Method_16924(f2, f3, f4, f);
        class_22385.Method_22417(-31705 & 9039, Class_29585.Field_29602);
        class_22385.Method_22443(d, d4, 0.0).Method_22451();
        class_22385.Method_22443(d3, d4, 0.0).Method_22451();
        class_22385.Method_22443(d3, d2, 0.0).Method_22451();
        class_22385.Method_22443(d, d2, 0.0).Method_22451();
        class_7644.Method_7647();
        Class_16867.Method_16965();
        Class_16867.Method_16952();
    }

    private static String Method_1576(String string) {
        int n = 12178;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_1551.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_1577(int n, int n2, int n3, int n4) {
        if (n2 < n) {
            int n5 = n;
            n = n2;
            n2 = n5;
        }
        Class_1551.Method_1558(n, n3, n2 + (5193 & 11015), n3 + (-31655 & 14339), n4);
    }
}

