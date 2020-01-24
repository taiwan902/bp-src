/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_16800
extends Enum {
    public static final /* enum */ Class_16800 Field_16801;
    private final float Field_16802;
    private final float Field_16803;
    public static final /* enum */ Class_16800 Field_16804;
    public static final /* enum */ Class_16800 Field_16805;
    public static final /* enum */ Class_16800 Field_16806;
    public static final /* enum */ Class_16800 Field_16807;
    private final int Field_16808;
    private static final Class_16800[] Field_16809;
    private final int Field_16810;
    private final int Field_16811;

    public Class_1956 Method_16812() {
        return this == Field_16806 ? Class_1956.Method_1981(Class_9265.Field_9379) : (this == Field_16804 ? Class_1956.Method_1981(Class_9265.Field_9373) : (this == Field_16801 ? Class_10527.Field_10705 : (this == Field_16807 ? Class_10527.Field_10565 : (this == Field_16805 ? Class_10527.Field_10673 : null))));
    }

    private static String Method_16813(String string) {
        int n = 32507;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16800.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public int Method_16814() {
        return this.Field_16808;
    }

    static {
        Field_16806 = new Class_16800(Class_16800.Method_16815("\u0140\u0141\u0142\u0143"), 8196 & -28383, -32574 & 28704, -30149 & 1343, 2.0f, 0.0f, -5105 & 4591);
        Field_16804 = new Class_16800(Class_16800.Method_16819("\u3400\u3401\u3418\u3419\u3410"), 193 & -31191, 24661 & 2465, 1247 & 20867, 1.106383f * 3.6153846f, 1.0f, 28189 & 133);
        Field_16807 = new Class_16800(Class_16800.Method_16825("\u49a5\u49a4\u49a3\u49a2"), -26361 & 8258, 4187 & -15838, -23298 & 506, 1.9793814f * 3.03125f, 2.0f, 17678 & 14);
        Field_16805 = new Class_16800(Class_16800.Method_16820("\u6101\u6100\u6103\u6113\u6101\u6101\u6102"), -27625 & 27011, 20499 & 327, 1785 & 17945, 5.375f * 1.4883721f, 2.0238094f * 1.482353f, 17550 & -24469);
        Field_16801 = new Class_16800(Class_16800.Method_16813("\u23ca\u23c2\u23c1\u23c9"), -15354 & 8860, 4224 & 3453, -31710 & 18988, 9.6f * 1.25f, 0.0f, 4118 & 11319);
        Class_16800[] arrclass_16800 = new Class_16800[-32571 & 519];
        arrclass_16800[-32748 & 546] = Field_16806;
        arrclass_16800[2185 & 12289] = Field_16804;
        arrclass_16800[3523 & 50] = Field_16807;
        arrclass_16800[1283 & 25091] = Field_16805;
        arrclass_16800[-25452 & 24677] = Field_16801;
        Field_16809 = arrclass_16800;
    }

    private static String Method_16815(String string) {
        int n = 11748;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16800.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public float Method_16816() {
        return this.Field_16802;
    }

    private void Method_16817() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_16818() {
        return this.Field_16811;
    }

    private static String Method_16819(String string) {
        int n = 12330;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16800.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_16820(String string) {
        int n = 5895;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16800.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    /*
     * Exception decompiling
     */
    private Class_16800(float var3_1, float var4_2, int var5_3) {
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

    public static Class_16800[] Method_16821() {
        return (Class_16800[])Field_16809.clone();
    }

    public int Method_16822() {
        return this.Field_16810;
    }

    public static Class_16800 Method_16823(String string) {
        return Enum.valueOf(Class_16800.class, string);
    }

    public float Method_16824() {
        return this.Field_16803;
    }

    private static String Method_16825(String string) {
        int n = 18682;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16800.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

