/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  internal.org.lwjgl.util.vector.Matrix4f
 */
import com.google.common.collect.Maps;
import internal.org.lwjgl.util.vector.Matrix4f;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Map;

public final class Class_35032
extends Enum {
    public static final /* enum */ Class_35032 Field_35033 = new Class_35032(Class_35032.Method_35062("\u80c0\u8089\u80c2\u80c1\u8088"), 4352 & -16140, 4129 & 144, 256 & -18424);
    public static final /* enum */ Class_35032 Field_35034;
    private static final Map Field_35035;
    private final Matrix4f Field_35036;
    public static final /* enum */ Class_35032 Field_35037;
    public static final /* enum */ Class_35032 Field_35038;
    public static final /* enum */ Class_35032 Field_35039;
    private final int Field_35040;
    public static final /* enum */ Class_35032 Field_35041;
    public static final /* enum */ Class_35032 Field_35042;
    private static final Class_35032[] Field_35043;
    public static final /* enum */ Class_35032 Field_35044;
    public static final /* enum */ Class_35032 Field_35045;
    private final int Field_35046;
    public static final /* enum */ Class_35032 Field_35047;
    private final int Field_35048;
    public static final /* enum */ Class_35032 Field_35049;
    public static final /* enum */ Class_35032 Field_35050;
    public static final /* enum */ Class_35032 Field_35051;
    public static final /* enum */ Class_35032 Field_35052;
    public static final /* enum */ Class_35032 Field_35053;
    public static final /* enum */ Class_35032 Field_35054;

    private static String Method_35055(String string) {
        int n = 3289;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_35032.class, 15);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Matrix4f Method_35056() {
        return this.Field_35036;
    }

    private static String Method_35057(String string) {
        int n = 25599;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_35032.class, 14);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_35058(String string) {
        int n = 27799;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_35032.class, 9);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static {
        Field_35039 = new Class_35032(Class_35032.Method_35076("\u8004\u8004\u8002\u8006\u8000\u8000"), -12287 & 371, 8320 & -26304, 20574 & -32165);
        Field_35050 = new Class_35032(Class_35032.Method_35071("\u4100\u4101\u4107\u4102\u4105\u4105\u4106"), 162 & 17674, -32691 & 6160, 8381 & -12106);
        Field_35045 = new Class_35032(Class_35032.Method_35077("\u4090\u4091\u4090\u4091\u4090\u4091\u4090"), 10499 & 631, 902 & 4120, 4398 & 2399);
        Field_35034 = new Class_35032(Class_35032.Method_35067("\u0108\u0129\u0122\u010b\u0108\u0121"), 16662 & 5, 16734 & -32550, 17030 & -24464);
        Field_35047 = new Class_35032(Class_35032.Method_35060("\u1402\u1442\u1440\u1406\u1406\u1446\u1444"), 12423 & -31707, 5243 & -32422, -15010 & 219);
        Field_35037 = new Class_35032(Class_35032.Method_35078("\u3008\u3028\u3020\u300c\u3008\u3020\u3028\u3020"), 30 & 2439, 8282 & -8870, -24396 & 4278);
        Field_35053 = new Class_35032(Class_35032.Method_35075("\u1408\u1408\u1400\u140c\u1408\u1400\u1404\u1400"), 8487 & -31225, 5338 & 16987, 16799 & -31474);
        Field_35049 = new Class_35032(Class_35032.Method_35058("\u0011XQY\u0014\u0014]"), -24565 & 19016, 246 & 7860, 10880 & 5396);
        Field_35051 = new Class_35032(Class_35032.Method_35072("\u400a\u4002\u4008\u4000\u4008\u400a\u4008\u4000"), 2713 & 16395, 16575 & 244, 90 & -14370);
        Field_35041 = new Class_35032(Class_35032.Method_35069("\u0842\u080a\u0800\u0809\u0845\u0846\u080d\u0805\u080a"), 270 & 16458, 2228 & -24324, -24396 & 3061);
        Field_35038 = new Class_35032(Class_35032.Method_35068("\u0902\u096a\u0962\u096a\u0904\u0906\u096c\u096c\u0962"), 8235 & 4699, 437 & 244, -32498 & 6031);
        Field_35054 = new Class_35032(Class_35032.Method_35066("\u3885\u38e5\u38e0\u38e5\u3884\u3880\u38e1"), -26482 & 8285, -15474 & 3359, 20520 & 513);
        Field_35052 = new Class_35032(Class_35032.Method_35057("\u20a2\u2081\u2086\u2081\u20a0\u20a7\u2084\u2085"), 17741 & 8717, 782 & 8526, -32546 & 3419);
        Field_35042 = new Class_35032(Class_35032.Method_35055("F\u0005\u0003\u0005EB\u0001\u0001\u0006"), 20750 & -32738, -31921 & 20766, -31562 & 2292);
        Field_35044 = new Class_35032(Class_35032.Method_35063("\u080a\u0841\u0842\u0841\u0808\u080b\u0842\u0843\u084a"), 255 & -7153, 798 & -14930, 8558 & 1295);
        Class_35032[] arrclass_35032 = new Class_35032[24664 & 6165];
        arrclass_35032[-31342 & 8292] = Field_35033;
        arrclass_35032[-32111 & 5455] = Field_35039;
        arrclass_35032[-16254 & 554] = Field_35050;
        arrclass_35032[4227 & 1903] = Field_35045;
        arrclass_35032[8214 & -31316] = Field_35034;
        arrclass_35032[-32361 & 8293] = Field_35047;
        arrclass_35032[12294 & -12986] = Field_35037;
        arrclass_35032[1031 & 12303] = Field_35053;
        arrclass_35032[8296 & -15604] = Field_35049;
        arrclass_35032[21643 & -32151] = Field_35051;
        arrclass_35032[282 & -27638] = Field_35041;
        arrclass_35032[8399 & 267] = Field_35038;
        arrclass_35032[8878 & 16460] = Field_35054;
        arrclass_35032[17485 & -24513] = Field_35052;
        arrclass_35032[1102 & 8510] = Field_35042;
        arrclass_35032[4783 & -16113] = Field_35044;
        Field_35043 = arrclass_35032;
        Field_35035 = Maps.newHashMap();
        Class_35032[] arrclass_350322 = Class_35032.Method_35074();
        int n = arrclass_350322.length;
        for (int i = 4166 & -32104; i < n; ++i) {
            Class_35032 class_35032 = arrclass_350322[i];
            Field_35035.put(class_35032.Field_35040, class_35032);
        }
    }

    public int Method_35059(Class_4595 class_4595, int n) {
        int n2 = n;
        if (class_4595.Method_4640() == Class_4565.Field_4566) {
            n2 = (n + this.Field_35048) % (1356 & -12284);
        }
        Class_4595 class_45952 = class_4595;
        for (int i = 640 & 7234; i < this.Field_35048; ++i) {
            class_45952 = class_45952.Method_4635(Class_4565.Field_4566);
        }
        if (class_45952.Method_4640() == Class_4565.Field_4569) {
            n2 = (n2 + this.Field_35046) % (27158 & 268);
        }
        return n2;
    }

    private static String Method_35060(String string) {
        int n = 4171;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_35032.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static int Method_35061(int n, int n2) {
        return n * (495 & 1384) + n2;
    }

    /*
     * Exception decompiling
     */
    private Class_35032() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // java.lang.IllegalStateException
        // org.benf.cfr.reader.bytecode.analysis.variables.VariableFactory.localVariable(VariableFactory.java:53)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.mkRetrieve(Op02WithProcessedDataAndRefs.java:931)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.createStatement(Op02WithProcessedDataAndRefs.java:979)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.access$100(Op02WithProcessedDataAndRefs.java:56)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs$11.call(Op02WithProcessedDataAndRefs.java:2060)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs$11.call(Op02WithProcessedDataAndRefs.java:2057)
        // org.benf.cfr.reader.util.graph.AbstractGraphVisitorFI.process(AbstractGraphVisitorFI.java:60)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.convertToOp03List(Op02WithProcessedDataAndRefs.java:2069)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:342)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:184)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:129)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:397)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:906)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:797)
        // org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:225)
        // org.benf.cfr.reader.Driver.doJar(Driver.java:109)
        // org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:65)
        // org.benf.cfr.reader.Main.main(Main.java:48)
        throw new IllegalStateException("Decompilation failed");
    }

    private static String Method_35062(String string) {
        int n = 29974;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_35032.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_35063(String string) {
        int n = 19596;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_35032.class, 16);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_35064() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static Class_35032 Method_35065(String string) {
        return Enum.valueOf(Class_35032.class, string);
    }

    private static String Method_35066(String string) {
        int n = 17526;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_35032.class, 13);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_35067(String string) {
        int n = 3055;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_35032.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_35068(String string) {
        int n = 9779;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_35032.class, 12);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_35069(String string) {
        int n = 1405;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_35032.class, 11);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static Class_35032 Method_35070(int n, int n2) {
        return (Class_35032)((Object)Field_35035.get(Class_35032.Method_35061(Class_13337.Method_13374(n, 6520 & -31381), Class_13337.Method_13374(n2, 8554 & 18281))));
    }

    private static String Method_35071(String string) {
        int n = 26101;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_35032.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_35072(String string) {
        int n = 30466;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_35032.class, 10);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_4595 Method_35073(Class_4595 class_4595) {
        int n;
        Class_4595 class_45952 = class_4595;
        for (n = 8193 & 17972; n < this.Field_35048; ++n) {
            class_45952 = class_45952.Method_4635(Class_4565.Field_4566);
        }
        if (class_45952.Method_4640() != Class_4565.Field_4569) {
            for (n = 3 & 2308; n < this.Field_35046; ++n) {
                class_45952 = class_45952.Method_4635(Class_4565.Field_4569);
            }
        }
        return class_45952;
    }

    public static Class_35032[] Method_35074() {
        return (Class_35032[])Field_35043.clone();
    }

    private static String Method_35075(String string) {
        int n = 20828;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_35032.class, 8);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_35076(String string) {
        int n = 26722;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_35032.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_35077(String string) {
        int n = 23204;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_35032.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_35078(String string) {
        int n = 20732;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_35032.class, 7);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

