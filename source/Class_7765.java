/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_7765
extends Enum {
    private static final Class_7765[] Field_7766;
    private final Class_6991[] Field_7767;
    private static final Class_7765[] Field_7768;
    public static final /* enum */ Class_7765 Field_7769;
    public static final /* enum */ Class_7765 Field_7770;
    public static final /* enum */ Class_7765 Field_7771;
    public static final /* enum */ Class_7765 Field_7772;
    public static final /* enum */ Class_7765 Field_7773;
    public static final /* enum */ Class_7765 Field_7774;

    private void Method_7775() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static String Method_7776(String string) {
        int n = 475;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_7765.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_7777(String string) {
        int n = 28738;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_7765.class, 3);
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
    private Class_7765() {
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

    public static Class_7765[] Method_7778() {
        return (Class_7765[])Field_7768.clone();
    }

    public static Class_7765 Method_7779(Class_4595 class_4595) {
        return Field_7766[class_4595.Method_4648()];
    }

    public static Class_7765 Method_7780(String string) {
        return Enum.valueOf(Class_7765.class, string);
    }

    private static String Method_7781(String string) {
        int n = 31709;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_7765.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_7782(String string) {
        int n = 13900;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_7765.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static {
        Class_6991[] arrclass_6991 = new Class_6991[-20467 & 3094];
        arrclass_6991[-28672 & 16386] = new Class_6991(Class_8824.Field_8830, Class_8824.Field_8825, Class_8824.Field_8827, null);
        arrclass_6991[9221 & -12271] = new Class_6991(Class_8824.Field_8830, Class_8824.Field_8825, Class_8824.Field_8828, null);
        arrclass_6991[-24542 & 6235] = new Class_6991(Class_8824.Field_8826, Class_8824.Field_8825, Class_8824.Field_8828, null);
        arrclass_6991[5635 & -13913] = new Class_6991(Class_8824.Field_8826, Class_8824.Field_8825, Class_8824.Field_8827, null);
        Field_7769 = new Class_7765(Class_7765.Method_7781("\u1824\u1826\u1826\u1826"), 5120 & 586, arrclass_6991);
        Class_6991[] arrclass_69912 = new Class_6991[-16372 & 5221];
        arrclass_69912[16641 & 2688] = new Class_6991(Class_8824.Field_8830, Class_8824.Field_8829, Class_8824.Field_8828, null);
        arrclass_69912[9745 & 6473] = new Class_6991(Class_8824.Field_8830, Class_8824.Field_8829, Class_8824.Field_8827, null);
        arrclass_69912[1042 & -24030] = new Class_6991(Class_8824.Field_8826, Class_8824.Field_8829, Class_8824.Field_8827, null);
        arrclass_69912[-23933 & 16643] = new Class_6991(Class_8824.Field_8826, Class_8824.Field_8829, Class_8824.Field_8828, null);
        Field_7774 = new Class_7765(Class_7765.Method_7785("\u8204\u8200"), 2049 & 20481, arrclass_69912);
        Class_6991[] arrclass_69913 = new Class_6991[4 & 28813];
        arrclass_69913[-29134 & 8196] = new Class_6991(Class_8824.Field_8826, Class_8824.Field_8829, Class_8824.Field_8828, null);
        arrclass_69913[12417 & -16381] = new Class_6991(Class_8824.Field_8826, Class_8824.Field_8825, Class_8824.Field_8828, null);
        arrclass_69913[34 & -32742] = new Class_6991(Class_8824.Field_8830, Class_8824.Field_8825, Class_8824.Field_8828, null);
        arrclass_69913[-16373 & 11911] = new Class_6991(Class_8824.Field_8830, Class_8824.Field_8829, Class_8824.Field_8828, null);
        Field_7772 = new Class_7765(Class_7765.Method_7777("\u401c\u401c\u4002\u4006\u4018"), 11526 & 35, arrclass_69913);
        Class_6991[] arrclass_69914 = new Class_6991[325 & 5142];
        arrclass_69914[2096 & 16897] = new Class_6991(Class_8824.Field_8830, Class_8824.Field_8829, Class_8824.Field_8827, null);
        arrclass_69914[59 & 513] = new Class_6991(Class_8824.Field_8830, Class_8824.Field_8825, Class_8824.Field_8827, null);
        arrclass_69914[16430 & 1026] = new Class_6991(Class_8824.Field_8826, Class_8824.Field_8825, Class_8824.Field_8827, null);
        arrclass_69914[583 & 1163] = new Class_6991(Class_8824.Field_8826, Class_8824.Field_8829, Class_8824.Field_8827, null);
        Field_7770 = new Class_7765(Class_7765.Method_7784("\u4547\u455a\u4541\u4541\u4558"), 16515 & 7227, arrclass_69914);
        Class_6991[] arrclass_69915 = new Class_6991[1028 & 22671];
        arrclass_69915[720 & 4104] = new Class_6991(Class_8824.Field_8830, Class_8824.Field_8829, Class_8824.Field_8828, null);
        arrclass_69915[10369 & 17675] = new Class_6991(Class_8824.Field_8830, Class_8824.Field_8825, Class_8824.Field_8828, null);
        arrclass_69915[1082 & 25218] = new Class_6991(Class_8824.Field_8830, Class_8824.Field_8825, Class_8824.Field_8827, null);
        arrclass_69915[-26289 & 3] = new Class_6991(Class_8824.Field_8830, Class_8824.Field_8829, Class_8824.Field_8827, null);
        Field_7773 = new Class_7765(Class_7765.Method_7782("\u328f\u328d\u328b\u328c"), 6660 & -32684, arrclass_69915);
        Class_6991[] arrclass_69916 = new Class_6991[68 & 1077];
        arrclass_69916[2152 & 4613] = new Class_6991(Class_8824.Field_8826, Class_8824.Field_8829, Class_8824.Field_8827, null);
        arrclass_69916[257 & 5645] = new Class_6991(Class_8824.Field_8826, Class_8824.Field_8825, Class_8824.Field_8827, null);
        arrclass_69916[290 & -18430] = new Class_6991(Class_8824.Field_8826, Class_8824.Field_8825, Class_8824.Field_8828, null);
        arrclass_69916[2311 & -32621] = new Class_6991(Class_8824.Field_8826, Class_8824.Field_8829, Class_8824.Field_8828, null);
        Field_7771 = new Class_7765(Class_7765.Method_7776("\u51a1\u51a1\u51b3\u51b2"), 8741 & 2053, arrclass_69916);
        Class_7765[] arrclass_7765 = new Class_7765[39 & 1310];
        arrclass_7765[290 & 21700] = Field_7769;
        arrclass_7765[18817 & -32763] = Field_7774;
        arrclass_7765[2050 & 562] = Field_7772;
        arrclass_7765[103 & 15363] = Field_7770;
        arrclass_7765[-32699 & 29068] = Field_7773;
        arrclass_7765[-8187 & 7303] = Field_7771;
        Field_7768 = arrclass_7765;
        Field_7766 = new Class_7765[5127 & -21658];
        Class_7765.Field_7766[Class_8824.Field_8825] = Field_7769;
        Class_7765.Field_7766[Class_8824.Field_8829] = Field_7774;
        Class_7765.Field_7766[Class_8824.Field_8828] = Field_7772;
        Class_7765.Field_7766[Class_8824.Field_8827] = Field_7770;
        Class_7765.Field_7766[Class_8824.Field_8830] = Field_7773;
        Class_7765.Field_7766[Class_8824.Field_8826] = Field_7771;
    }

    public Class_6991 Method_7783(int n) {
        return this.Field_7767[n];
    }

    private static String Method_7784(String string) {
        int n = 2247;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_7765.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_7785(String string) {
        int n = 20454;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_7765.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

