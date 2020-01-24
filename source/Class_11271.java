/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.BiMap
 *  com.google.common.collect.HashBiMap
 *  com.google.common.collect.Maps
 *  org.apache.logging.log4j.LogManager
 */
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.LogManager;

public class Class_11271
extends Enum {
    public static final /* enum */ Class_11271 Field_11272 = new Class_17529(-1 & -1);
    public static final /* enum */ Class_11271 Field_11273;
    public static final /* enum */ Class_11271 Field_11274;
    public static final /* enum */ Class_11271 Field_11275;
    private static final Class_11271[] Field_11276;
    private static final Class_11271[] Field_11277;
    private final Map Field_11278;
    private static int Field_11279;
    private static int Field_11280;
    private static final Map Field_11281;
    public static final /* enum */ Class_11271 Field_11282;
    private final int Field_11283;

    public Integer Method_11284(Class_31224 class_31224, Class_1486 class_1486) {
        return (Integer)((BiMap)this.Field_11278.get((Object)class_31224)).inverse().get(class_1486.getClass());
    }

    public static Class_11271 Method_11285(Class_1486 class_1486) {
        return (Class_11271)((Object)Field_11281.get(class_1486.getClass()));
    }

    private static String Method_11286(String string) {
        int n = 24341;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11271.class, 11);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_11287(String string) {
        int n = 29223;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11271.class, 9);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static Class_11271[] Method_11288() {
        return (Class_11271[])Field_11277.clone();
    }

    public Class_1486 Method_11289(Class_31224 class_31224, int n) {
        Class class_ = (Class)((BiMap)this.Field_11278.get((Object)class_31224)).get((Object)n);
        return class_ == null ? null : (Class_1486)class_.newInstance();
    }

    public static Class_11271 Method_11290(String string) {
        return Enum.valueOf(Class_11271.class, string);
    }

    private static String Method_11291(String string) {
        int n = 3486;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11271.class, 7);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public int Method_11292() {
        return this.Field_11283;
    }

    private static String Method_11293(String string) {
        int n = 20053;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11271.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_11294(String string) {
        int n = 29276;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11271.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_11295() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static String Method_11296(String string) {
        int n = 24459;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11271.class, 8);
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
    Class_11271() {
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

    private static String Method_11297(String string) {
        int n = 21431;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11271.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_11298(String string) {
        int n = 7686;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11271.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected Class_11271 Method_11299(Class_31224 class_31224, Class class_) {
        BiMap biMap = (BiMap)this.Field_11278.get((Object)class_31224);
        if (biMap == null) {
            biMap = HashBiMap.create();
            this.Field_11278.put(class_31224, biMap);
        }
        if (biMap.containsValue((Object)class_)) {
            String string = (Object)((Object)class_31224) + " packet " + class_ + " is already known to ID " + biMap.inverse().get((Object)class_);
            LogManager.getLogger().fatal(string);
            throw new IllegalArgumentException(string);
        }
        biMap.put((Object)biMap.size(), (Object)class_);
        return this;
    }

    public static Class_11271 Method_11300(int n) {
        return n >= Field_11280 && n <= Field_11279 ? Field_11276[n - Field_11280] : null;
    }

    private static String Method_11301(String string) {
        int n = 7072;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11271.class, 10);
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
    private Class_11271() {
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

    private static String Method_11302(String string) {
        int n = 18606;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11271.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_11303(String string) {
        int n = 22489;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11271.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static {
        Field_11274 = new Class_15409(-8176 & 1184);
        Field_11275 = new Class_16845(25741 & 6913);
        Field_11282 = new Class_15931(27650 & 39);
        Field_11273 = new Class_33545(5379 & 8215);
        Class_11271[] arrclass_11271 = new Class_11271[-30419 & 21077];
        arrclass_11271[0 & 2056] = Field_11272;
        arrclass_11271[8261 & 1] = Field_11274;
        arrclass_11271[4098 & -16366] = Field_11275;
        arrclass_11271[-22905 & 51] = Field_11282;
        arrclass_11271[2062 & 8468] = Field_11273;
        Field_11277 = arrclass_11271;
        Field_11280 = -1 & -1;
        Field_11279 = -20473 & 403;
        Field_11276 = new Class_11271[Field_11279 - Field_11280 + (24889 & -32057)];
        Field_11281 = Maps.newHashMap();
        Class_11271[] arrclass_112712 = Class_11271.Method_11288();
        int n = arrclass_112712.length;
        for (int i = 20808 & -22398; i < n; ++i) {
            Class_11271 class_11271 = arrclass_112712[i];
            int n2 = class_11271.Method_11292();
            if (n2 < Field_11280 || n2 > Field_11279) {
                throw new Error(Class_11271.Method_11303("\u0085\u00a2\u00a2\u00a5\u00a4\u00a1\u00a4\u00a0\u00a4\u00a6\u00a3\u00a0\u00a7\u00a3\u00a7\u00a4\u00b4\u0095\u0090\u00b4") + Integer.toString(n2));
            }
            Class_11271.Field_11276[n2 - Class_11271.Field_11280] = class_11271;
            for (Class_31224 class_31224 : class_11271.Field_11278.keySet()) {
                for (Class class_ : ((BiMap)class_11271.Field_11278.get((Object)class_31224)).values()) {
                    if (Field_11281.containsKey(class_) && Field_11281.get(class_) != class_11271) {
                        throw new Error(Class_11271.Method_11291("\u3022\u3002\u3003\u3002\u3003\u3003\u3004") + class_ + Class_11271.Method_11296("\u1045\u1005\u1004\u1046\u1000\u1004\u1001\u1007\u100c\u1008\u100e\u104e\u1008\u100b\u1008\u100b\u1002\u1002\u1002\u1002\u1041\u1004\u1004\u1042\u100d\u100e\u1008\u100a\u100e\u100b\u100c\u100e\u1065") + Field_11281.get(class_) + Class_11271.Method_11287("\u0622\u0622\u0620\u0622\u0626\u0624\u0626\u0624\u062a\u0628\u0628\u0628\u062c\u062c\u062c\u062e\u0630\u0632\u0630\u0632\u0636") + (Object)((Object)class_11271));
                    }
                    try {
                        class_.newInstance();
                    }
                    catch (Throwable throwable) {
                        throwable.printStackTrace();
                        throw new Error(Class_11271.Method_11301("\u0004%''! $") + class_ + Class_11271.Method_11286("\u5254\u5211\u5215\u5214\u5210\u5204\u5254\u5214\u5210\u5204\u5200\u5214\u5210\u5201\u5215\u5214\u5200\u5214\u5211\u5211\u5254\u5214\u5214\u5210\u5215\u5214\u5205\u5254\u5254") + class_);
                    }
                    Field_11281.put(class_, class_11271);
                }
            }
        }
    }
}

