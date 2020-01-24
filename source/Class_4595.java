/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public final class Class_4595
extends Enum
implements Class_3955 {
    private static final Class_4595[] Field_4596;
    private final String Field_4597;
    public static final /* enum */ Class_4595 Field_4598;
    private final int Field_4599;
    public static final Class_4595[] Field_4600;
    public static final /* enum */ Class_4595 Field_4601;
    public static final /* enum */ Class_4595 Field_4602;
    public static final /* enum */ Class_4595 Field_4603;
    private final Class_4565 Field_4604;
    private final int Field_4605;
    private final Class_4792 Field_4606;
    private final int Field_4607;
    private final int Field_4608;
    private static final Class_4595[] Field_4609;
    private final Class_5016 Field_4610;
    private static final Class_4595[] Field_4611;
    private static final Map Field_4612;
    public static final /* enum */ Class_4595 Field_4613;
    private final int Field_4614;
    public static final /* enum */ Class_4595 Field_4615;
    private final int Field_4616;

    public Class_4595 Method_4617() {
        switch (Class_47083.Field_47086[this.ordinal()]) {
            case 1: {
                return Field_4602;
            }
            case 2: {
                return Field_4598;
            }
            case 3: {
                return Field_4603;
            }
            case 4: {
                return Field_4613;
            }
        }
        throw new IllegalStateException("Unable to get CCW facing of " + this);
    }

    public static Class_4595 Method_4618(double d) {
        return Class_4595.Method_4628(Class_13337.Method_13371(d / (0.3333333333333333 * 270.0) + 1.653061224489796 * 0.30246913580246915) & (67 & 5147));
    }

    public int Method_4619() {
        return this.Field_4599;
    }

    public Class_4595 Method_4620() {
        switch (Class_47083.Field_47086[this.ordinal()]) {
            case 1: {
                return Field_4603;
            }
            case 2: {
                return Field_4613;
            }
            case 3: {
                return Field_4602;
            }
            case 4: {
                return Field_4598;
            }
        }
        throw new IllegalStateException("Unable to get Y-rotated facing of " + this);
    }

    public String Method_4621() {
        return this.Field_4597;
    }

    private static String Method_4622(String string) {
        int n = 19668;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4595.class, 16);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_4623() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_4792 Method_4624() {
        return this.Field_4606;
    }

    private static String Method_4625(String string) {
        int n = 1841;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4595.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_4626(String string) {
        int n = 1140;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4595.class, 14);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_4627(String string) {
        int n = 2474;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4595.class, 10);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static Class_4595 Method_4628(int n) {
        return Field_4611[Class_13337.Method_13382(n % Field_4611.length)];
    }

    private static String Method_4629(String string) {
        int n = 8394;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4595.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static Class_4595[] Method_4630() {
        return (Class_4595[])Field_4609.clone();
    }

    private static String Method_4631(String string) {
        int n = 23610;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4595.class, 18);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public String Method_4632() {
        return this.Field_4597;
    }

    public int Method_4633() {
        return this.Field_4607;
    }

    /*
     * Exception decompiling
     */
    private Class_4595(int var3_1, int var4_2, int var5_3, String var6_4, Class_5016 var7_5, Class_4565 var8_6, Class_4792 var9_7) {
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

    private static String Method_4634(String string) {
        int n = 2917;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4595.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_4595 Method_4635(Class_4565 class_4565) {
        switch (Class_47083.Field_47084[class_4565.ordinal()]) {
            case 1: {
                if (this != Field_4602 && this != Field_4603) {
                    return this.Method_4646();
                }
                return this;
            }
            case 2: {
                if (this != Field_4601 && this != Field_4615) {
                    return this.Method_4620();
                }
                return this;
            }
            case 3: {
                if (this != Field_4598 && this != Field_4613) {
                    return this.Method_4652();
                }
                return this;
            }
        }
        throw new IllegalStateException("Unable to get CW facing for axis " + class_4565);
    }

    private static String Method_4636(String string) {
        int n = 23648;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4595.class, 15);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static Class_4595 Method_4637(int n) {
        return Field_4600[Class_13337.Method_13382(n % Field_4600.length)];
    }

    static {
        Field_4615 = new Class_4595(Class_4595.Method_4643("\u74d1\u74da\u74c0\u74d9"), 5140 & 296, Class_4595.Method_4634("\u0108\u0100\u011a\u0102"), 6154 & -24304, 13632 & 33, 5639 & 2329, -1 & -1, Class_4595.Method_4638("\u4910\u4910\u4902\u4912"), Class_5016.Field_5020, Class_4565.Field_4569, new Class_4792(-28222 & 1032, -1 & -1, 8576 & 17966));
        Field_4601 = new Class_4595(Class_4595.Method_4625("\u828c\u8289"), -31487 & 22613, Class_4595.Method_4661("\u1401\u1401"), 25235 & 2053, 24649 & 1, -32246 & 32, -1 & -1, Class_4595.Method_4629("\u5812\u5812"), Class_5016.Field_5018, Class_4565.Field_4569, new Class_4792(20900 & -32743, -24189 & 19049, 18539 & 0));
        Field_4598 = new Class_4595(Class_4595.Method_4644("\u0820\u0820\u0830\u0831\u0820"), -24566 & 18, Class_4595.Method_4650("\u0000\u0001\u0018\u0019\u0000"), 8210 & 2187, 5395 & 2058, 7307 & -32765, 2050 & -28134, Class_4595.Method_4655("\u1010\u1010\u1002\u1002\u1010"), Class_5016.Field_5020, Class_4565.Field_4570, new Class_4792(2432 & -31656, 28997 & 512, -1 & -1));
        Field_4613 = new Class_4595(Class_4595.Method_4627("\u8c10\u8c00\u8c10\u8c10\u8c06"), 17027 & -29693, Class_4595.Method_4645("\u0003\u0002\u0003\u0003\u0000"), 8235 & 5251, 4891 & 18439, 18 & 12291, -32112 & 13313, Class_4595.Method_4651("FKBCL"), Class_5016.Field_5018, Class_4565.Field_4570, new Class_4792(8386 & -31215, -23800 & 5218, 18951 & 8281));
        Field_4602 = new Class_4595(Class_4595.Method_4653("\u0545\u0546\u0541\u0547"), 4244 & 2116, Class_4595.Method_4626("\u8800\u8802\u8802\u8800"), -32227 & 3270, 68 & 23589, 26959 & 133, 113 & 21769, Class_4595.Method_4636("\u9980\u9983\u9984\u9983"), Class_5016.Field_5020, Class_4565.Field_4566, new Class_4792(-1 & -1, 3 & 18432, 24864 & 2184));
        Field_4603 = new Class_4595(Class_4595.Method_4622("\u108a\u108e\u108c\u108b"), 13749 & 2639, Class_4595.Method_4641("\u00a8\u00a9\u00aa\u00a9"), 14599 & 1157, 653 & 4421, 12421 & 17462, 10483 & 5639, Class_4595.Method_4631("\u013c\u0138\u012a\u012e"), Class_5016.Field_5018, Class_4565.Field_4566, new Class_4792(13845 & 18601, 24708 & 2384, 2563 & 384));
        Class_4595[] arrclass_4595 = new Class_4595[16863 & -24538];
        arrclass_4595[40 & -30656] = Field_4615;
        arrclass_4595[8205 & 4401] = Field_4601;
        arrclass_4595[-32733 & 1038] = Field_4598;
        arrclass_4595[-31129 & 16667] = Field_4613;
        arrclass_4595[-8140 & 4549] = Field_4602;
        arrclass_4595[4293 & -30915] = Field_4603;
        Field_4609 = arrclass_4595;
        Field_4600 = new Class_4595[7 & 18438];
        Field_4611 = new Class_4595[8492 & 21];
        Field_4612 = new HashMap();
        Class_4595[] arrclass_45952 = new Class_4595[4262 & -15802];
        arrclass_45952[8328 & 2050] = Field_4615;
        arrclass_45952[11265 & -32263] = Field_4601;
        arrclass_45952[-30145 & 16450] = Field_4598;
        arrclass_45952[-24569 & 22595] = Field_4613;
        arrclass_45952[-32764 & 14613] = Field_4602;
        arrclass_45952[16549 & 789] = Field_4603;
        Field_4596 = arrclass_45952;
        Class_4595[] arrclass_45953 = Class_4595.Method_4630();
        int n = arrclass_45953.length;
        for (int i = 16483 & -19968; i < n; ++i) {
            Class_4595 class_4595;
            Class_4595.Field_4600[class_4595.Field_4614] = class_4595 = arrclass_45953[i];
            if (class_4595.Method_4640().Method_4581()) {
                Class_4595.Field_4611[class_4595.Field_4599] = class_4595;
            }
            Field_4612.put(class_4595.Method_4632().toLowerCase(), class_4595);
        }
    }

    private static String Method_4638(String string) {
        int n = 30978;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4595.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public String Method_4639() {
        return this.Field_4597;
    }

    public Class_4565 Method_4640() {
        return this.Field_4604;
    }

    private static String Method_4641(String string) {
        int n = 4121;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4595.class, 17);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static Class_4595 Method_4642(Random random) {
        return Class_4595.Method_4630()[random.nextInt(Class_4595.Method_4630().length)];
    }

    private static String Method_4643(String string) {
        int n = 16576;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4595.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_4644(String string) {
        int n = 24263;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4595.class, 7);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_4645(String string) {
        int n = 12203;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4595.class, 11);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private Class_4595 Method_4646() {
        switch (Class_47083.Field_47086[this.ordinal()]) {
            case 1: {
                return Field_4615;
            }
            default: {
                throw new IllegalStateException("Unable to get X-rotated facing of " + this);
            }
            case 3: {
                return Field_4601;
            }
            case 5: {
                return Field_4598;
            }
            case 6: 
        }
        return Field_4613;
    }

    public Class_5016 Method_4647() {
        return this.Field_4610;
    }

    public final int Method_4648() {
        return this.Field_4614;
    }

    public static Class_4595 Method_4649(Class_5016 class_5016, Class_4565 class_4565) {
        Class_4595[] arrclass_4595 = Class_4595.Method_4630();
        int n = arrclass_4595.length;
        for (int i = 336 & -15348; i < n; ++i) {
            Class_4595 class_4595 = arrclass_4595[i];
            if (class_4595.Method_4647() != class_5016 || class_4595.Method_4640() != class_4565) continue;
            return class_4595;
        }
        throw new IllegalArgumentException("No such direction: " + (Object)((Object)class_5016) + " " + class_4565);
    }

    private static String Method_4650(String string) {
        int n = 15272;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4595.class, 8);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_4651(String string) {
        int n = 27144;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4595.class, 12);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private Class_4595 Method_4652() {
        switch (Class_47083.Field_47086[this.ordinal()]) {
            case 2: {
                return Field_4615;
            }
            default: {
                throw new IllegalStateException("Unable to get Z-rotated facing of " + this);
            }
            case 4: {
                return Field_4601;
            }
            case 5: {
                return Field_4603;
            }
            case 6: 
        }
        return Field_4602;
    }

    private static String Method_4653(String string) {
        int n = 15310;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4595.class, 13);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public int Method_4654() {
        return this.Field_4616;
    }

    private static String Method_4655(String string) {
        int n = 13391;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4595.class, 9);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public int Method_4656() {
        return this.Field_4605;
    }

    public static Class_4595 Method_4657(String string) {
        return string == null ? null : (Class_4595)Field_4612.get(string.toLowerCase());
    }

    public static Class_4595 Method_4658(float f, float f2, float f3) {
        Class_4595 class_4595 = Field_4598;
        float f4 = Float.MIN_VALUE * 0.8780488f;
        Class_4595[] arrclass_4595 = Class_4595.Method_4630();
        int n = arrclass_4595.length;
        for (int i = 16915 & 7208; i < n; ++i) {
            Class_4595 class_45952 = arrclass_4595[i];
            float f5 = f * (float)class_45952.Field_4606.Method_4807() + f2 * (float)class_45952.Field_4606.Method_4806() + f3 * (float)class_45952.Field_4606.Method_4809();
            if (!(f5 > f4)) continue;
            f4 = f5;
            class_4595 = class_45952;
        }
        return class_4595;
    }

    public static Class_4595 Method_4659(String string) {
        return Enum.valueOf(Class_4595.class, string);
    }

    public final Class_4595 Method_4660() {
        return Field_4600[this.Field_4608];
    }

    private static String Method_4661(String string) {
        int n = 3916;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4595.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

