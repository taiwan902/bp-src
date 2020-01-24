/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_17976
extends Enum {
    private static final Class_17976[] Field_17977;
    public static final /* enum */ Class_17976 Field_17978;
    public static final /* enum */ Class_17976 Field_17979;
    public static final /* enum */ Class_17976 Field_17980;

    static {
        Field_17979 = new Class_17976(Class_17976.Method_17985("\u00a8\u00a1\u00a2\u00a1"), 6928 & 8322);
        Field_17978 = new Class_17976(Class_17976.Method_17982("\u05a0\u05a1\u05b2"), -7709 & 1033);
        Field_17980 = new Class_17976(Class_17976.Method_17984("\u0220\u0229\u0228\u0221\u0224"), 18 & 10);
        Class_17976[] arrclass_17976 = new Class_17976[-22453 & 1923];
        arrclass_17976[320 & 3100] = Field_17979;
        arrclass_17976[3465 & 35] = Field_17978;
        arrclass_17976[26727 & -32230] = Field_17980;
        Field_17977 = arrclass_17976;
    }

    /*
     * Exception decompiling
     */
    private Class_17976() {
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

    public static Class_17976 Method_17981(String string) {
        Class_17976[] arrclass_17976 = Class_17976.Method_17988();
        for (int i = -20480 & 2836; i < arrclass_17976.length; ++i) {
            Class_17976 class_17976 = arrclass_17976[i];
            if (!class_17976.name().toLowerCase().equals(string)) continue;
            return class_17976;
        }
        return null;
    }

    private static String Method_17982(String string) {
        int n = 21177;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17976.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_7710 Method_17983(String string) {
        switch (Class_31080.Field_31081[this.ordinal()]) {
            case 1: {
                return new Class_27375(string);
            }
            case 2: {
                return new Class_27375(string);
            }
            case 3: {
                return new Class_25756(string);
            }
        }
        throw new RuntimeException("Unknown uniform type: " + (Object)((Object)this));
    }

    private static String Method_17984(String string) {
        int n = 7587;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17976.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_17985(String string) {
        int n = 2904;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17976.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_17986() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private void Method_17987(Class_36667 class_36667, Class_27375 class_27375) {
        int n = (int)class_36667.Method_36668();
        class_27375.Method_27377(n);
    }

    public static Class_17976[] Method_17988() {
        return (Class_17976[])Field_17977.clone();
    }

    public void Method_17989(Class_13745 class_13745, Class_7710 class_7710) {
        switch (Class_31080.Field_31081[this.ordinal()]) {
            case 1: {
                this.Method_17993((Class_22092)class_13745, (Class_27375)class_7710);
                return;
            }
            case 2: {
                this.Method_17987((Class_36667)class_13745, (Class_27375)class_7710);
                return;
            }
            case 3: {
                this.Method_17990((Class_36667)class_13745, (Class_25756)class_7710);
                return;
            }
        }
        throw new RuntimeException("Unknown uniform type: " + (Object)((Object)this));
    }

    private void Method_17990(Class_36667 class_36667, Class_25756 class_25756) {
        float f = class_36667.Method_36668();
        class_25756.Method_25759(f);
    }

    public static Class_17976 Method_17991(String string) {
        return Enum.valueOf(Class_17976.class, string);
    }

    public boolean Method_17992(Class_18434 class_18434) {
        switch (Class_31080.Field_31081[this.ordinal()]) {
            case 1: {
                return (class_18434 == Class_18434.Field_18436 ? -32525 & 28681 : 9317 & -14310) != 0;
            }
            case 2: {
                return (class_18434 == Class_18434.Field_18437 ? 13537 & 16391 : 16448 & 401) != 0;
            }
            case 3: {
                return (class_18434 == Class_18434.Field_18437 ? -18879 & 43 : 1040 & -28352) != 0;
            }
        }
        throw new RuntimeException("Unknown uniform type: " + (Object)((Object)this));
    }

    private void Method_17993(Class_22092 class_22092, Class_27375 class_27375) {
        boolean bl = class_22092.Method_22093();
        int n = bl ? 4301 & 18481 : 8 & 4;
        class_27375.Method_27377(n);
    }
}

