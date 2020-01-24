/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_13693
extends Enum {
    public static final /* enum */ Class_13693 Field_13694;
    private final Class Field_13695;
    public static final /* enum */ Class_13693 Field_13696;
    public static final /* enum */ Class_13693 Field_13697;
    private final Class_3713 Field_13698;
    private final boolean Field_13699;
    private static final Class_13693[] Field_13700;
    public static final /* enum */ Class_13693 Field_13701;
    private final boolean Field_13702;
    private final int Field_13703;

    /*
     * Exception decompiling
     */
    private Class_13693(Class_3713 var3_1, boolean var4_2, boolean var5_3) {
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

    public int Method_13704() {
        return this.Field_13703;
    }

    private static String Method_13705(String string) {
        int n = 28793;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_13693.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_13706(String string) {
        int n = 7900;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_13693.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_13707() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    static {
        Field_13697 = new Class_13693(Class_13693.Method_13706("\u0c10\u0c12\u0c10\u0c04\u0c04\u0c14\u0c00"), 257 & 18624, Class_32423.class, 17606 & 14406, Class_3713.Field_3718, (-24571 & 2306) != 0, (1096 & 8320) != 0);
        Field_13694 = new Class_13693(Class_13693.Method_13705("\u0388\u0389\u038a\u038a\u038f\u038e\u038d\u038e"), 1027 & -32255, Class_43406.class, -23510 & 4110, Class_3713.Field_3718, (10561 & 45) != 0, (2325 & 8201) != 0);
        Field_13701 = new Class_13693(Class_13693.Method_13711("\ua514\ua510\ua516\ua514\ua510\ua512\ua500"), -27110 & 134, Class_40109.class, 8479 & 5295, Class_3713.Field_3718, (20513 & 83) != 0, (32 & 17859) != 0);
        Field_13696 = new Class_13693(Class_13693.Method_13710("\u240c\u2408\u240c\u240c\u2408\u2404\u2408\u2408\u240c\u2408\u240c\u240c\u2408\u240c"), 1323 & 16899, Class_38054.class, 37 & -7675, Class_3713.Field_3734, (51 & 16641) != 0, (-32768 & 1156) != 0);
        Class_13693[] arrclass_13693 = new Class_13693[-24178 & 20997];
        arrclass_13693[1026 & 21128] = Field_13697;
        arrclass_13693[547 & 4249] = Field_13694;
        arrclass_13693[8195 & 16582] = Field_13701;
        arrclass_13693[13583 & 563] = Field_13696;
        Field_13700 = arrclass_13693;
    }

    public static Class_13693[] Method_13708() {
        return (Class_13693[])Field_13700.clone();
    }

    public Class Method_13709() {
        return this.Field_13695;
    }

    private static String Method_13710(String string) {
        int n = 3098;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_13693.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_13711(String string) {
        int n = 7054;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_13693.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public boolean Method_13712() {
        return this.Field_13702;
    }

    public boolean Method_13713() {
        return this.Field_13699;
    }

    public static Class_13693 Method_13714(String string) {
        return Enum.valueOf(Class_13693.class, string);
    }
}

