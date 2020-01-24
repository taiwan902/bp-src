/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_2168 {
    private double Field_2169;
    public float Field_2170;
    private long Field_2171;
    public double Field_2172;
    public float Field_2173 = 1.0f;
    float Field_2174;
    private long Field_2175;
    public static Class_2190 Field_2176;
    private long Field_2177;
    public int Field_2178;
    public long Field_2179;
    public double Field_2180;
    public float Field_2181;
    public static Class_2190 Field_2182;

    private void Method_2183() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static double Method_2184() {
        return Double.parseDouble(Class_2168.Method_2185("\u4a14\u4a15\u4a14\u4a15\u4a08\u4a15"));
    }

    private static String Method_2185(String string) {
        int n = 8956;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2168.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_2186(String string) {
        int n = 350;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2168.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_2187() {
        long l = Class_18.Method_207();
        long l2 = System.currentTimeMillis();
        this.Method_2188(l2);
        long l3 = l - this.Field_2177;
        double d = (double)l2 / Field_2176.Method_2199();
        if (l3 <= (7514609063773849597L & -7514609064874079254L) && l3 >= (1805402555845544387L & 35660300L)) {
            this.Field_2171 += l3;
            if (this.Field_2171 > (-3804591702583766035L & 3804591701444592632L)) {
                long l4 = l2 - this.Field_2175;
                double d2 = (double)this.Field_2171 / (double)l4;
                Field_2182.Method_2202(Field_2182.Method_2199() + (d2 - Field_2182.Method_2199()) * (0.36862745647336925 * 0.5425531914893617));
                this.Field_2175 = l2;
                this.Field_2171 = 1363684428198449438L & -1363684429273235360L;
            }
            if (this.Field_2171 < (335611156L & -7560667534953267199L)) {
                this.Field_2175 = l2;
            }
        } else {
            this.Field_2169 = d;
        }
        this.Field_2177 = l;
        double d3 = (d - this.Field_2169) * Field_2182.Method_2199();
        this.Field_2169 = d;
        d3 = Class_13337.Method_13385(d3, 0.0, 1.0);
        this.Field_2172 = d3 * (double)this.Field_2173 * (double)this.Field_2174;
        this.Field_2181 = (float)((double)this.Field_2181 + this.Field_2172);
        this.Field_2178 = (int)this.Field_2181;
        this.Field_2181 -= (float)this.Field_2178;
        if (this.Field_2178 > (6671 & 1034)) {
            this.Field_2178 = 20766 & -32757;
        }
        this.Field_2170 = this.Field_2181;
    }

    private void Method_2188(long l) {
        this.Field_2180 = (double)(l - this.Field_2179) / (0.48148148148148145 * 2076.923076923077);
        this.Field_2179 = l;
    }

    public static double Method_2189() {
        return Double.parseDouble(Class_2168.Method_2186("\u0142\u0140\u0142"));
    }

    public Class_2168(float f) {
        this.Field_2174 = f;
        this.Field_2177 = Class_18.Method_207();
        this.Field_2175 = System.currentTimeMillis();
    }

    static {
        Field_2182 = new Class_2190(Class_2168.Method_2189(), Class_2205.Field_2243);
        Field_2176 = new Class_2190(Class_2168.Method_2184(), Class_2205.Field_2215);
    }
}

