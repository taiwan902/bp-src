/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_35650
extends Enum {
    public static final /* enum */ Class_35650 Field_35651;
    int Field_35652;
    public static final /* enum */ Class_35650 Field_35653;
    public static final /* enum */ Class_35650 Field_35654;
    public static final /* enum */ Class_35650 Field_35655;
    private static final Class_35650[] Field_35656;
    public static final /* enum */ Class_35650 Field_35657;
    String Field_35658;

    public static Class_35650 Method_35659(int n) {
        Class_35650[] arrclass_35650 = Class_35650.Method_35673();
        int n2 = arrclass_35650.length;
        for (int i = 112 & 1674; i < n2; ++i) {
            Class_35650 class_35650 = arrclass_35650[i];
            if (class_35650.Field_35652 != n) continue;
            return class_35650;
        }
        return Field_35653;
    }

    public int Method_35660() {
        return this.Field_35652;
    }

    static {
        Field_35655 = new Class_35650(Class_35650.Method_35671("\u0010\u0011\b\u0001\r\u001d\f"), 85 & 27554, -1 & -1, "");
        Field_35653 = new Class_35650(Class_35650.Method_35662("\u0123\u0124\u0122\u0127\u012d\u0123\u0125\u0129"), 677 & 20553, 4608 & 18444, Class_35650.Method_35667("\u0441\u0446\u0442\u0447\u0457\u0441\u0455\u0451"));
        Field_35657 = new Class_35650(Class_35650.Method_35663("\u8806\u8806\u8800\u8804\u8804\u8808\u8806\u8804"), 3659 & 24610, 2837 & 5161, Class_35650.Method_35669("\u2183\u2182\u2181\u2181\u2180\u2189\u2182\u2181"));
        Field_35651 = new Class_35650(Class_35650.Method_35675("\b\b\u0019\u000b\u0007\u001c\u001e\u001c\u0000"), 8323 & 19015, 5186 & 8227, Class_35650.Method_35668("\u0a04\u0a00\u0a01\u0a03\u0a03\u0a00\u0a02\u0a04\u0a00"));
        Field_35654 = new Class_35650(Class_35650.Method_35661("\u0863\u0861\u0873\u0870\u0860\u0870\u0862\u0870\u086a"), -32620 & 31524, 24835 & 2275, Class_35650.Method_35664("\u800b\u8009\u801f\u8018\u800c\u8018\u800e\u8014\u8002"));
        Class_35650[] arrclass_35650 = new Class_35650[-32635 & 24645];
        arrclass_35650[27398 & -32600] = Field_35655;
        arrclass_35650[7169 & -32745] = Field_35653;
        arrclass_35650[-10166 & 1154] = Field_35657;
        arrclass_35650[8267 & 531] = Field_35651;
        arrclass_35650[24838 & 2132] = Field_35654;
        Field_35656 = arrclass_35650;
    }

    private static String Method_35661(String string) {
        int n = 20022;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_35650.class, 8);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_35662(String string) {
        int n = 31086;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_35650.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_35663(String string) {
        int n = 23463;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_35650.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_35664(String string) {
        int n = 32411;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_35650.class, 9);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public boolean Method_35665() {
        return (this == Field_35657 ? 289 & 17 : 3081 & -15852) != 0;
    }

    private void Method_35666() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static String Method_35667(String string) {
        int n = 8633;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_35650.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_35668(String string) {
        int n = 11628;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_35650.class, 7);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_35669(String string) {
        int n = 30356;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_35650.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public boolean Method_35670() {
        return (this == Field_35651 || this == Field_35654 ? 5 & -30679 : 6145 & 17410) != 0;
    }

    private static String Method_35671(String string) {
        int n = 6717;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_35650.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static Class_35650 Method_35672(String string) {
        return Enum.valueOf(Class_35650.class, string);
    }

    public static Class_35650[] Method_35673() {
        return (Class_35650[])Field_35656.clone();
    }

    public static Class_35650 Method_35674(String string) {
        Class_35650[] arrclass_35650 = Class_35650.Method_35673();
        int n = arrclass_35650.length;
        for (int i = -30671 & 20480; i < n; ++i) {
            Class_35650 class_35650 = arrclass_35650[i];
            if (!class_35650.Field_35658.equals(string)) continue;
            return class_35650;
        }
        return Field_35653;
    }

    private static String Method_35675(String string) {
        int n = 30177;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_35650.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public boolean Method_35676() {
        return (this == Field_35653 || this == Field_35651 ? 8297 & 4099 : -32192 & 5138) != 0;
    }

    public String Method_35677() {
        return this.Field_35658;
    }

    /*
     * Exception decompiling
     */
    private Class_35650() {
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

    public void Method_35678(Class_18080 class_18080) {
        if (this == Field_35657) {
            class_18080.Method_18098((3113 & 8211) != 0);
            class_18080.Method_18099((-32631 & 18725) != 0);
            class_18080.Field_18085 = 1569 & -24431;
        } else if (this == Field_35654) {
            class_18080.Method_18098((-32181 & 17) != 0);
            class_18080.Method_18099((149 & 2592) != 0);
            class_18080.Field_18085 = 4369 & 1097;
            class_18080.Method_18102((4193 & 25731) != 0);
        } else {
            class_18080.Method_18098((-32352 & 21002) != 0);
            class_18080.Method_18099((2522 & -23036) != 0);
            class_18080.Field_18085 = 1568 & 26696;
            class_18080.Method_18102((-27503 & 10284) != 0);
        }
        class_18080.Field_18083 = !this.Method_35670() ? 4425 & -31227 : 8800 & -31488;
    }
}

