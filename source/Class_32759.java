/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_32759
extends Enum {
    public static final /* enum */ Class_32759 Field_32760;
    public static final /* enum */ Class_32759 Field_32761;
    public static final /* enum */ Class_32759 Field_32762;
    private static final Class_32759[] Field_32763;
    public static final /* enum */ Class_32759 Field_32764;
    public static final /* enum */ Class_32759 Field_32765;
    public static final /* enum */ Class_32759 Field_32766;
    public static final /* enum */ Class_32759 Field_32767;
    public static final /* enum */ Class_32759 Field_32768;
    public static final /* enum */ Class_32759 Field_32769;
    public static final /* enum */ Class_32759 Field_32770;
    public static final /* enum */ Class_32759 Field_32771;
    public static final /* enum */ Class_32759 Field_32772;
    public static final /* enum */ Class_32759 Field_32773;
    public static final /* enum */ Class_32759 Field_32774;

    /*
     * Exception decompiling
     */
    private Class_32759() {
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

    private static String Method_32775(String string) {
        int n = 16975;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_32759.class, 10);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_32776(String string) {
        int n = 25231;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_32759.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_32777(String string) {
        int n = 13367;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_32759.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_32778(String string) {
        int n = 31525;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_32759.class, 14);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_32779(String string) {
        int n = 23342;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_32759.class, 13);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_32780(String string) {
        int n = 16258;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_32759.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static Class_32759 Method_32781(String string) {
        return Enum.valueOf(Class_32759.class, string);
    }

    private static String Method_32782(String string) {
        int n = 4433;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_32759.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_32783(String string) {
        int n = 19296;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_32759.class, 7);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_32784(String string) {
        int n = 18305;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_32759.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static {
        Field_32765 = new Class_32759(Class_32759.Method_32782("\u2215\u2227\u2221\u2227\u2221\u2235\u2221\u2220\u2224\u2220\u2232\u2224\u2224"), 8524 & -10080);
        Field_32764 = new Class_32759(Class_32759.Method_32790("\u2aad\u2a88\u2a8f\u2a82\u2a8d\u2a85\u2a8a\u2a8f\u2a84\u2a89\u2a8a"), 21057 & -32767);
        Field_32762 = new Class_32759(Class_32759.Method_32776("\u8039\u8008\u8008\u8011\u801d\u8017\u800c\u8014\u801b\u8018\u8008\u8010\u8016\u801e"), 298 & 25218);
        Field_32767 = new Class_32759(Class_32759.Method_32780("\u93bf\u938b\u938a\u9396\u939b\u9390\u938a\u9397\u939d\u939f\u938a\u939b\u939a"), 12675 & 19579);
        Field_32774 = new Class_32759(Class_32759.Method_32777("\udb85\udb86\udb86\udb86\udb80\udb87\udb86\udb80\udb87"), 5718 & 389);
        Field_32761 = new Class_32759(Class_32759.Method_32784("\u2841\u2843\u284a\u284b\u284c\u284c\u2840\u2846"), 2581 & 5);
        Field_32770 = new Class_32759(Class_32759.Method_32783("\u0521\u0507\u0501\u0502\u0506\u0500\u0500\u0527\u0509\u0509\u050a\u051d\u051b\u053d\u050a\u051c\u0511\u0503\u0515"), 25350 & -32762);
        Field_32760 = new Class_32759(Class_32759.Method_32785("\u8020\u8001\u8002\u8003\u8004\u8005\u8006\u8007\u8020\u8001\u8002\u8003\u8004\u8005\u8026\u8007\u8000\u8001\u8002\u8003\u8004"), 167 & 25095);
        Field_32766 = new Class_32759(Class_32759.Method_32786("\u18d1\u18c0\u18c0\u18c1\u18d4\u18d5\u18c4\u18c5\u18d1\u18c0\u18c0\u18c1\u18c4\u18c4\u18d4\u18d5"), 4105 & 9784);
        Field_32773 = new Class_32759(Class_32759.Method_32775("\u200c\u202b\u203e\u202d\u202e\u2033\u2034\u203d"), 207 & 18473);
        Field_32769 = new Class_32759(Class_32759.Method_32791("\u05d8\u05c9\u05d6\u05db\u05dc\u05d9\u05da\u05cb\u05cc\u05d1\u05d6\u05df"), 1178 & 74);
        Field_32772 = new Class_32759(Class_32759.Method_32787("\u1440\u1445\u1444\u1441\u1444\u1445\u1440\u1441"), 6667 & -31477);
        Field_32771 = new Class_32759(Class_32759.Method_32779("\u4004\u4014\u4001\u4006\u4011\u4011"), 557 & 2510);
        Field_32768 = new Class_32759(Class_32759.Method_32778("\u0986\u0981\u0980\u0983\u0984\u0983\u0982\u0983\u0984\u0983\u0986\u0981\u0980"), 2383 & 12301);
        Class_32759[] arrclass_32759 = new Class_32759[9231 & 16526];
        arrclass_32759[16896 & 2273] = Field_32765;
        arrclass_32759[-32763 & 26881] = Field_32764;
        arrclass_32759[386 & 2082] = Field_32762;
        arrclass_32759[18595 & 275] = Field_32767;
        arrclass_32759[-27356 & 92] = Field_32774;
        arrclass_32759[263 & 1597] = Field_32761;
        arrclass_32759[406 & 4135] = Field_32770;
        arrclass_32759[14343 & 16967] = Field_32760;
        arrclass_32759[6153 & 298] = Field_32766;
        arrclass_32759[-27575 & 2205] = Field_32773;
        arrclass_32759[-31698 & 6347] = Field_32769;
        arrclass_32759[1051 & 10795] = Field_32772;
        arrclass_32759[1116 & -30707] = Field_32771;
        arrclass_32759[25229 & -32483] = Field_32768;
        Field_32763 = arrclass_32759;
    }

    private static String Method_32785(String string) {
        int n = 9530;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_32759.class, 8);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_32786(String string) {
        int n = 1132;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_32759.class, 9);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_32787(String string) {
        int n = 20779;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_32759.class, 12);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_32788() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static Class_32759[] Method_32789() {
        return (Class_32759[])Field_32763.clone();
    }

    private static String Method_32790(String string) {
        int n = 13037;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_32759.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_32791(String string) {
        int n = 25403;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_32759.class, 11);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

