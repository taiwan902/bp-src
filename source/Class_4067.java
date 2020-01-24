/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_4067
extends Enum {
    public static final /* enum */ Class_4067 Field_4068;
    public static final /* enum */ Class_4067 Field_4069;
    public static final /* enum */ Class_4067 Field_4070;
    public static final /* enum */ Class_4067 Field_4071;
    public static final /* enum */ Class_4067 Field_4072;
    public static final /* enum */ Class_4067 Field_4073;
    public static final /* enum */ Class_4067 Field_4074;
    private static final Class_4067[] Field_4075;
    public static final /* enum */ Class_4067 Field_4076;
    public static final /* enum */ Class_4067 Field_4077;
    public static final /* enum */ Class_4067 Field_4078;
    public static final /* enum */ Class_4067 Field_4079;

    private static String Method_4080(String string) {
        int n = 27755;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4067.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_4081() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static String Method_4082(String string) {
        int n = 12449;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4067.class, 1);
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
    private Class_4067() {
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

    public boolean Method_4083(Class_1956 class_1956) {
        if (this == Field_4077) {
            return (1065 & 2069) != 0;
        }
        if (this == Field_4071 && class_1956.Method_1984()) {
            return (513 & -24479) != 0;
        }
        if (class_1956 instanceof Class_37716) {
            if (this == Field_4076) {
                return (24321 & 8327) != 0;
            }
            Class_37716 class_37716 = (Class_37716)class_1956;
            return (class_37716.Field_37717 == 0 ? (this == Field_4073 ? 4269 & -16319 : 9476 & -30661) : (class_37716.Field_37717 == (-11422 & 1043) ? (this == Field_4068 ? 579 & -18031 : 4096 & -32761) : (class_37716.Field_37717 == (1 & -32487) ? (this == Field_4072 ? 16665 & -22457 : 1301 & 64) : (class_37716.Field_37717 == (12587 & -14781) ? (this == Field_4074 ? 65 & -32383 : 4234 & -23008) : -27990 & 1092)))) != 0;
        }
        return (class_1956 instanceof Class_20825 ? (this == Field_4079 ? 321 & 24577 : 1568 & 20613) : (class_1956 instanceof Class_37919 ? (this == Field_4069 ? 28803 & 2065 : -31480 & 21026) : (class_1956 instanceof Class_31111 ? (this == Field_4078 ? -4603 & 4105 : 6201 & -32764) : (class_1956 instanceof Class_20480 ? (this == Field_4070 ? -23805 & 2097 : -31608 & 10759) : 66 & 5025)))) != 0;
    }

    private static String Method_4084(String string) {
        int n = 15945;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4067.class, 11);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_4085(String string) {
        int n = 2911;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4067.class, 7);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static Class_4067 Method_4086(String string) {
        return Enum.valueOf(Class_4067.class, string);
    }

    private static String Method_4087(String string) {
        int n = 24014;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4067.class, 10);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_4088(String string) {
        int n = 29137;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4067.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_4089(String string) {
        int n = 15508;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4067.class, 9);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_4090(String string) {
        int n = 32531;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4067.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_4091(String string) {
        int n = 6111;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4067.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static Class_4067[] Method_4092() {
        return (Class_4067[])Field_4075.clone();
    }

    private static String Method_4093(String string) {
        int n = 4513;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4067.class, 8);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_4094(String string) {
        int n = 8304;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4067.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static {
        Field_4077 = new Class_4067(Class_4067.Method_4082("\ud020\ud020\ud023"), 17 & 3758);
        Field_4076 = new Class_4067(Class_4067.Method_4080("\u8018\u8008\u8014\u8015\u8009"), 16771 & 1);
        Field_4074 = new Class_4067(Class_4067.Method_4088("\u8811\u8801\u8811\u8810\u8800\u8800\u8810\u8810\u8819\u8809"), 18082 & 8258);
        Field_4068 = new Class_4067(Class_4067.Method_4091("\u2004\u2015\u2008\u2009\u2014\u2019\u2008\u2001\u2008\u201d"), 16519 & 9251);
        Field_4072 = new Class_4067(Class_4067.Method_4090("\u3064\u3066\u3062\u3060\u3062\u3066\u3066\u3064\u3066\u3066\u3060"), 1935 & 4212);
        Field_4073 = new Class_4067(Class_4067.Method_4094("\u2144\u2155\u214a\u214a\u2151\u215c\u214b\u2146\u214c\u2149"), -16251 & 12549);
        Field_4079 = new Class_4067(Class_4067.Method_4085("\u9090\u9083\u9082\u9093\u908c\u908d"), 5255 & -32434);
        Field_4069 = new Class_4067(Class_4067.Method_4093("\u822d\u8221\u822c\u822d\u822c\u8238"), -31049 & 22535);
        Field_4070 = new Class_4067(Class_4067.Method_4089("\u04c8\u04c7\u04ce\u04c5\u04c2\u04c5\u04ce\u04c7\u04cc\u04c1\u04c8"), 18456 & -32184);
        Field_4071 = new Class_4067(Class_4067.Method_4087("\u5000\u5000\u5000\u5000\u5004\u5004\u5004\u5004\u5000"), 6265 & -32629);
        Field_4078 = new Class_4067(Class_4067.Method_4084("\u02cc\u02c1\u02d8"), 9626 & 16398);
        Class_4067[] arrclass_4067 = new Class_4067[63 & 8715];
        arrclass_4067[25268 & 0] = Field_4077;
        arrclass_4067[20497 & -30717] = Field_4076;
        arrclass_4067[-30717 & 21638] = Field_4074;
        arrclass_4067[27 & 8519] = Field_4068;
        arrclass_4067[-13884 & 4631] = Field_4072;
        arrclass_4067[24733 & -28409] = Field_4073;
        arrclass_4067[6 & 26631] = Field_4079;
        arrclass_4067[3095 & -32529] = Field_4069;
        arrclass_4067[-30676 & 20617] = Field_4070;
        arrclass_4067[27657 & 333] = Field_4071;
        arrclass_4067[2059 & 154] = Field_4078;
        Field_4075 = arrclass_4067;
    }
}

