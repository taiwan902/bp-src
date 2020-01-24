/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_18620
extends Enum {
    private static final Class_18620[] Field_18621;
    private final int Field_18622;
    public static final /* enum */ Class_18620 Field_18623;
    public static final /* enum */ Class_18620 Field_18624;
    public static final /* enum */ Class_18620 Field_18625;
    private final int[] Field_18626;
    private final String Field_18627;
    private final int Field_18628;
    public static final /* enum */ Class_18620 Field_18629;
    public static final /* enum */ Class_18620 Field_18630;

    private static String Method_18631(String string) {
        int n = 6770;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_18620.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_18632(String string) {
        int n = 20033;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_18620.class, 7);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_18633(String string) {
        int n = 18890;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_18620.class, 10);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_18634() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_18635(int n) {
        return Class_37716.Method_37732()[n] * this.Field_18628;
    }

    private static String Method_18636(String string) {
        int n = 10361;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_18620.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_18637(String string) {
        int n = 31147;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_18620.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static Class_18620 Method_18638(String string) {
        return Enum.valueOf(Class_18620.class, string);
    }

    private static String Method_18639(String string) {
        int n = 6449;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_18620.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public int Method_18640() {
        return this.Field_18622;
    }

    public static Class_18620[] Method_18641() {
        return (Class_18620[])Field_18621.clone();
    }

    private static String Method_18642(String string) {
        int n = 22555;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_18620.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_18643(String string) {
        int n = 10514;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_18620.class, 8);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_18644(String string) {
        int n = 19386;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_18620.class, 9);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public String Method_18645() {
        return this.Field_18627;
    }

    static {
        int[] arrn = new int[17925 & 6566];
        arrn[-23527 & 6912] = -16237 & 9217;
        arrn[5 & 17409] = 35 & -11001;
        arrn[4454 & 3] = 8322 & 2566;
        arrn[2283 & 18199] = 25601 & -32311;
        Field_18629 = new Class_18620(Class_18620.Method_18639("\u0225\u022c\u0228\u023d\u0221\u022c\u0239"), 269 & -32768, Class_18620.Method_18636("\u53c0\u53c1\u53c0\u53c1\u53c4\u53c5\u53c6"), 16901 & 77, arrn, 24847 & 1055);
        int[] arrn2 = new int[133 & 8734];
        arrn2[24836 & -31560] = 26627 & 5398;
        arrn2[-32507 & 19009] = -32419 & 167;
        arrn2[-4990 & 58] = 7180 & -32764;
        arrn2[3455 & -24573] = 2219 & 17429;
        Field_18625 = new Class_18620(Class_18620.Method_18647("\u8852\u8850\u8852\u8852\u8852"), -27613 & 18441, Class_18620.Method_18637("\u0460\u0461\u0460\u0460\u0461\u0460\u0460\u0460\u0469"), -24497 & 4255, arrn2, 8269 & -30708);
        int[] arrn3 = new int[28 & 12548];
        arrn3[1366 & 33] = 16395 & -32698;
        arrn3[41 & 9921] = -14330 & 8750;
        arrn3[8974 & 18435] = 26757 & -32235;
        arrn3[2371 & 27] = 4506 & 2;
        Field_18623 = new Class_18620(Class_18620.Method_18631("\u4001\u4001\u4001\u4001"), -27434 & 2091, Class_18620.Method_18642("\u0ea0\u0ea1\u0ea0\u0ea1"), 20767 & 655, arrn3, 8267 & 281);
        int[] arrn4 = new int[2276 & 8708];
        arrn4[13899 & 4] = 2 & 13958;
        arrn4[-27641 & 8193] = 93 & 5;
        arrn4[1058 & 16450] = 11 & 887;
        arrn4[6419 & -32125] = -32767 & 14863;
        Field_18624 = new Class_18620(Class_18620.Method_18632("\u8908\u8900\u8902\u890a"), 35 & 12439, Class_18620.Method_18643("\u8240\u8240\u8241\u8241"), -32761 & 14863, arrn4, 313 & 18463);
        int[] arrn5 = new int[-23033 & 4];
        arrn5[161 & -24064] = -14117 & 259;
        arrn5[10499 & -32743] = -28408 & 8425;
        arrn5[14 & 9554] = 2671 & 22;
        arrn5[-23805 & 2115] = -29685 & 9187;
        Field_18630 = new Class_18620(Class_18620.Method_18644("\u808a\u8087\u808e\u8083\u8084\u8085\u808e"), 19060 & 132, Class_18620.Method_18633("\u0403\u0406\u0406\u0402\u0400\u0401\u0403"), 2085 & 1185, arrn5, 3098 & 4874);
        Class_18620[] arrclass_18620 = new Class_18620[135 & 5245];
        arrclass_18620[4104 & -22751] = Field_18629;
        arrclass_18620[-19967 & 65] = Field_18625;
        arrclass_18620[26634 & 1687] = Field_18623;
        arrclass_18620[2563 & -28413] = Field_18624;
        arrclass_18620[12292 & -32722] = Field_18630;
        Field_18621 = arrclass_18620;
    }

    public Class_1956 Method_18646() {
        return this == Field_18629 ? Class_10527.Field_10620 : (this == Field_18625 ? Class_10527.Field_10565 : (this == Field_18624 ? Class_10527.Field_10705 : (this == Field_18623 ? Class_10527.Field_10565 : (this == Field_18630 ? Class_10527.Field_10673 : null))));
    }

    private static String Method_18647(String string) {
        int n = 15720;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_18620.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public int Method_18648(int n) {
        return this.Field_18626[n];
    }

    /*
     * Exception decompiling
     */
    private Class_18620(int[] var3_1, int var4_2) {
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
}

