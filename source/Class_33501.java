/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.EnumSet;
import java.util.Set;

public final class Class_33501
extends Enum {
    private static final Class_33501[] Field_33502;
    public static final /* enum */ Class_33501 Field_33503;
    public static final /* enum */ Class_33501 Field_33504;
    public static final /* enum */ Class_33501 Field_33505;
    private int Field_33506;
    public static final /* enum */ Class_33501 Field_33507;
    public static final /* enum */ Class_33501 Field_33508;

    private static String Method_33509(String string) {
        int n = 20362;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_33501.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static Class_33501[] Method_33510() {
        return (Class_33501[])Field_33502.clone();
    }

    public static Set Method_33511(int n) {
        EnumSet<Class_33501> enumSet = EnumSet.noneOf(Class_33501.class);
        Class_33501[] arrclass_33501 = Class_33501.Method_33510();
        int n2 = arrclass_33501.length;
        for (int i = 5175 & -7672; i < n2; ++i) {
            Class_33501 class_33501 = arrclass_33501[i];
            if (!class_33501.Method_33515(n)) continue;
            enumSet.add(class_33501);
        }
        return enumSet;
    }

    private static String Method_33512(String string) {
        int n = 31100;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_33501.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static int Method_33513(Set set) {
        int n = 16905 & 64;
        for (Class_33501 class_33501 : set) {
            n |= class_33501.Method_33518();
        }
        return n;
    }

    private static String Method_33514(String string) {
        int n = 12675;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_33501.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private boolean Method_33515(int n) {
        return ((n & this.Method_33518()) == this.Method_33518() ? 16385 & -24515 : 258 & 21573) != 0;
    }

    private void Method_33516() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    static {
        Field_33503 = new Class_33501(Class_33501.Method_33517("\u8002"), 1024 & 25487, 258 & 21188);
        Field_33508 = new Class_33501(Class_33501.Method_33512("\u1400"), 18693 & -23551, 18441 & -23275);
        Field_33505 = new Class_33501(Class_33501.Method_33509("\u98c0"), 1162 & 8194, 1218 & -29917);
        Field_33507 = new Class_33501(Class_33501.Method_33514("\u4480\u4483\u4480\u4481\u4480"), -25077 & 135, 16467 & 519);
        Field_33504 = new Class_33501(Class_33501.Method_33520("\u10a9\u10ae\u10a1\u10bc\u10a5"), 44 & 24710, 2564 & 5428);
        Class_33501[] arrclass_33501 = new Class_33501[4253 & -20891];
        arrclass_33501[-23903 & 68] = Field_33503;
        arrclass_33501[16769 & 12833] = Field_33508;
        arrclass_33501[16386 & 819] = Field_33505;
        arrclass_33501[-19597 & 18563] = Field_33507;
        arrclass_33501[-24412 & 2630] = Field_33504;
        Field_33502 = arrclass_33501;
    }

    private static String Method_33517(String string) {
        int n = 30295;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_33501.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private int Method_33518() {
        return (-31993 & 28681) << this.Field_33506;
    }

    public static Class_33501 Method_33519(String string) {
        return Enum.valueOf(Class_33501.class, string);
    }

    /*
     * Exception decompiling
     */
    private Class_33501() {
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

    private static String Method_33520(String string) {
        int n = 19337;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_33501.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

