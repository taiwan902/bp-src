/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_34956
extends Enum
implements Class_3955 {
    private static final Class_34956[] Field_34957;
    private final Class_3779 Field_34958;
    private final int Field_34959;
    public static final /* enum */ Class_34956 Field_34960;
    private final String Field_34961;
    private static final Class_34956[] Field_34962;

    public String Method_34963() {
        return this.Field_34961;
    }

    /*
     * Exception decompiling
     */
    private Class_34956(Class_3779 var3_1) {
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

    public static Class_34956 Method_34964(String string) {
        return Enum.valueOf(Class_34956.class, string);
    }

    static {
        Field_34960 = new Class_34956(Class_34956.Method_34973("{hkpzhakrqhi`"), 272 & -9661, 2832 & 17537, Class_34956.Method_34967("\u0910\u0904\u0906\u0916\u0915\u0904\u0902\u0903\u0919\u091d\u090f\u090f\u0909"), Class_4508.Field_4512.Method_4523());
        Class_34956[] arrclass_34956 = new Class_34956[-27475 & 513];
        arrclass_34956[-30235 & 28690] = Field_34960;
        Field_34957 = arrclass_34956;
        Field_34962 = new Class_34956[Class_34956.Method_34970().length];
        Class_34956[] arrclass_349562 = Class_34956.Method_34970();
        int n = arrclass_349562.length;
        for (int i = 8448 & -30714; i < n; ++i) {
            Class_34956 class_34956;
            Class_34956.Field_34962[class_34956.Method_34972()] = class_34956 = arrclass_349562[i];
        }
    }

    public String Method_34965() {
        return this.Field_34961;
    }

    public Class_3779 Method_34966() {
        return this.Field_34958;
    }

    private static String Method_34967(String string) {
        int n = 2138;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_34956.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static Class_34956 Method_34968(int n) {
        if (n < 0 || n >= Field_34962.length) {
            n = 568 & -18428;
        }
        return Field_34962[n];
    }

    public String Method_34969() {
        return this.Field_34961;
    }

    public static Class_34956[] Method_34970() {
        return (Class_34956[])Field_34957.clone();
    }

    private void Method_34971() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_34972() {
        return this.Field_34959;
    }

    private static String Method_34973(String string) {
        int n = 26991;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_34956.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

