/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_23562
extends Enum {
    private static final Class_23562[] Field_23563;
    public static final /* enum */ Class_23562 Field_23564;
    public static final /* enum */ Class_23562 Field_23565;
    public static final /* enum */ Class_23562 Field_23566;
    public static final /* enum */ Class_23562 Field_23567;
    public static final /* enum */ Class_23562 Field_23568;
    public static final /* enum */ Class_23562 Field_23569;
    private final Class_1782 Field_23570;
    public static final /* enum */ Class_23562 Field_23571;
    public static final /* enum */ Class_23562 Field_23572;
    public static final /* enum */ Class_23562 Field_23573;
    public static final /* enum */ Class_23562 Field_23574;
    public static final /* enum */ Class_23562 Field_23575;
    public static final /* enum */ Class_23562 Field_23576;
    private final Class_1782 Field_23577;

    private void Method_23578() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static String Method_23579(String string) {
        int n = 8305;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_23562.class, 20);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_23580(String string) {
        int n = 6949;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_23562.class, 7);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_23581(String string) {
        int n = 30872;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_23562.class, 10);
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
    private Class_23562() {
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

    private static String Method_23582(String string) {
        int n = 31197;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_23562.class, 9);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_23583(String string) {
        int n = 31474;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_23562.class, 17);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_23584(String string) {
        int n = 13082;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_23562.class, 23);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_23585(String string) {
        int n = 8891;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_23562.class, 19);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_23586(String string) {
        int n = 8025;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_23562.class, 31);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_23587(String string) {
        int n = 21165;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_23562.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_23588(String string) {
        int n = 18765;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_23562.class, 14);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static {
        Field_23567 = new Class_23562(Class_23562.Method_23600("\u80dd\u80dc\u80ce\u80d7\u80d1\u80dc"), 17829 & -19960, (Class_1782)new Class_2849(Class_23562.Method_23598("\u0ca0\u0ca3\u0ca0\u0cb3\u0cb6\u0cb7\u0cb4\u0ca7\u0cb8\u0cbb\u0ca8\u0cbb\u0cbe\u0cbf\u0cbe\u0cbd\u0cb2\u0cb3\u0cb0\u0cb1\u0cb4\u0c85\u0cb4\u0cb5\u0cb8"), new Object[16389 & 4416]));
        Field_23565 = new Class_23562(Class_23562.Method_23590("\u08a4\u08a1\u08a2\u08a2\u08a5\u08a4\u08a7\u08a3\u08a1\u08a0\u08a3\u08a2\u08a1\u08a1\u08a7\u08a7\u08b5\u08b1\u08b6\u08b3\u08b4"), -32447 & 20491, (Class_1782)new Class_2849(Class_23562.Method_23610("\u1011\u1017\u1012\u1004\u1003\u1006\u1006\u1014\u100c\u100a\u101e\u1008\u100b\u100f\u1009\u100b\u1016\u1016\u1016\u1015\u1013\u1011\u1002\u1010\u1008\u100a\u100f\u1018\u1008\u1018\u1018\u100e\u1027\u1022\u1033\u1024\u1023\u1037\u1023\u1021"), new Object[4608 & 147]));
        Field_23569 = new Class_23562(Class_23562.Method_23587("\u4001\u4005\u4005\u4004\u4000\u4000\u4000\u4005\u4009\u400d\u400c\u4008\u400c\u4008\u400c"), 8230 & -32686, (Class_1782)new Class_2849(Class_23562.Method_23603("\u60a0\u60a1\u60a1\u60a0\u60a4\u60a4\u60a5\u60a4\u60a9\u60a8\u60a9\u60a8\u60ac\u60ad\u60ac\u60ad\u60a1\u60a0\u60a1\u60a1\u60a4\u60a5\u60a5\u60a4\u60a9\u60a8\u6088\u60a9\u60ac\u60ac\u60ad\u60ac\u6081\u6080"), new Object[776 & -15359]), (Class_1782)new Class_2849(Class_23562.Method_23580("\u2441\u2447\u2442\u2444\u2443\u2446\u2406\u2444\u244c\u244a\u244e\u2448\u244b\u244f\u2449\u244b\u2456\u2456\u2416\u2453\u2457\u2453\u2457\u2453\u245e\u247c\u245c\u245e\u247d\u245e\u245f\u245b\u2443\u2445\u2447"), new Object[2963 & 1028]));
        Field_23564 = new Class_23562(Class_23562.Method_23609("\u9830\u982a\u9830\u9833\u9831\u9830\u9828\u9830\u9831\u9821\u9823\u9839\u982a\u9833\u9838\u9831\u9828\u982a\u9823\u9829\u9832\u9833"), 2051 & -15325, (Class_1782)new Class_2849(Class_23562.Method_23582("\u22e0\u22e5\u22e2\u22e7\u22e0\u22ed\u22ae\u22e7\u22ec\u22e1\u22e6\u22e3\u22e8\u22ed\u22e2\u22e3\u22ec\u22e5\u22ae\u22ef\u22ec\u22e5\u22ce\u22e3\u22e4\u22e1\u22e2\u22ef\u22e0\u22e5\u22e6\u22e7\u228c\u22c5\u22ca\u22cf\u22c4\u22cd\u22c6\u22c3"), new Object[512 & 2060]));
        Field_23574 = new Class_23562(Class_23562.Method_23581("\u1102\u1101\u1100\u1102\u1103\u1103\u1100\u1101\u1103\u1102\u1103\u1100\u1100\u1100\u1100\u1102\u1102\u1100"), 6182 & 26244, (Class_1782)new Class_2849(Class_23562.Method_23613("\u2380\u2383\u2380\u2383\u2386\u2387\u2384\u2387\u2380\u2383\u2380\u2383\u2386\u2387\u2386\u2385\u2392\u2393\u2390\u2391\u2394\u2397\u2394\u2395\u2392\u2393\u2392\u2391\u2394\u2397\u2396\u2397\u2380\u2383\u2382\u2381"), new Object[6 & 21617]), (Class_1782)new Class_2849(Class_23562.Method_23606("\u6118\u611c\u611b\u610f\u6108\u6105\u6107\u611f\u6105\u6109\u611f\u610b\u6100\u6104\u610a\u610a\u6105\u610d\u6107\u6106\u6104\u611c\u6116\u611b\u611c\u6118\u611b\u6107\u6119\u611c\u610e\u610e\u6125\u6125\u612a\u612b\u6125\u6125\u6122\u612b\u6130"), new Object[0 & -31983]));
        Field_23576 = new Class_23562(Class_23562.Method_23602("\u3428\u3431\u342e\u342b\u3428\u3429\u3436\u342b\u3428\u3439\u343a\u3423\u3434\u3429\u3426\u3437\u3438\u3425\u342a\u343f"), 4119 & 293, (Class_1782)new Class_2849(Class_23562.Method_23588("\u00a0\u00a1\u00a1\u00a0\u00a0\u00a0\u00e1\u00a0\u00a1\u00a0\u00a1\u00a0\u00a0\u00a1\u00a0\u00a1\u00a1\u00a0\u00e1\u00a1\u00a0\u00a1\u00a0\u00a0\u00a1\u00a1\u00a0\u00a1\u00a1\u00a0\u00a1\u00c1\u0081\u0081\u0081"), new Object[-32125 & 72]));
        Field_23568 = new Class_23562(Class_23562.Method_23591("\u14e1\u14e1\u14e1\u14e5\u14f1\u14e0\u14f0\u14f1\u14ec\u14ed\u14fc\u14fd\u14e9\u14ed\u14e9\u14fc\u14f1\u14e4\u14f5\u14f4"), 583 & -31466, (Class_1782)new Class_2849(Class_23562.Method_23608("\u1604\u1601\u1605\u1600\u1604\u1608\u1609\u1600\u1609\u1604\u1601\u1604\u160c\u1609\u1604\u1605\u1609\u1600\u1609\u1604\u1604\u1604\u1608\u1600\u1609\u1601\u1628\u1609\u1608\u1601\u1628\u1608\u160c\u1600\u1605\u1604\u1601\u1600\u1601"), new Object[12342 & 2689]), (Class_1782)new Class_2849(Class_23562.Method_23583("\u8084\u8083\u8086\u8081\u8086\u8083\u8082\u8081\u8088\u808f\u808a\u808d\u808e\u808b\u808c\u808f\u8082\u8083\u8082\u8085\u8084\u8085\u8082\u8081\u8088\u808b\u808a\u808b\u8088\u808b\u808a\u8089\u80a6\u80a1\u80a6\u80a5\u80a2\u80a3\u80a0\u80a3\u80a8\u80ad\u80ac\u80ad"), new Object[7205 & 24578]));
        Field_23573 = new Class_23562(Class_23562.Method_23605("\u0824\u0825\u0824\u0821\u0820\u0820\u0821\u0821\u0821\u0821\u0821\u0821\u0825\u0821\u0820\u0820\u0831"), 2583 & 16391, (Class_1782)new Class_2849(Class_23562.Method_23585("\u0304\u0300\u0307\u0303\u0304\u0309\u030b\u0303\u0301\u030d\u030b\u030f\u0304\u0300\u030e\u030e\u0309\u0301\u030b\u0307\u0304\u0305\u030a\u0303\u0301\u0308\u0302\u0302\u0300\u0308\u0302\u030e\u0328\u0321\u032b\u0322"), new Object[27919 & 688]), (Class_1782)new Class_2849(Class_23562.Method_23579("\u4224\u4222\u4227\u4231\u4236\u4233\u4233\u4221\u4239\u423f\u422b\u423d\u423e\u423a\u423c\u423e\u4223\u4223\u4223\u4225\u4224\u4225\u4222\u4231\u4229\u423a\u421a\u422a\u4228\u423a\u421a\u422e\u4210\u4203\u4213\u4210\u4211\u4211\u4216\u4215\u420e"), new Object[25090 & -28591]));
        Field_23575 = new Class_23562(Class_23562.Method_23607("\u91a5\u91a2\u91aa\u91af\u91a2\u91a3\u91a8\u91a3\u91ac\u91a2\u91af\u91a8\u91a7\u91a0\u91ae\u91aa\u91a7\u91ab"), 16809 & 6156, (Class_1782)new Class_2849(Class_23562.Method_23601("\u1820\u1821\u1823\u1822\u1820\u1820\u1863\u1822\u1821\u1820\u1823\u1822\u1820\u1821\u1822\u1823\u1831\u1830\u1873\u1833\u1830\u1830\u1833\u1832\u1831\u1810\u1832\u1832\u1831\u1831"), new Object[7208 & -24575]), (Class_1782)new Class_2849(Class_23562.Method_23584("\u4842\u4840\u4840\u4842\u4840\u4840\u4800\u4842\u484a\u4848\u4848\u484a\u4848\u4848\u484a\u4848\u4850\u4850\u4810\u4850\u4850\u4850\u4852\u4852\u4858\u485a\u485a\u485a\u4858\u4858\u4818\u4858\u4842\u4840\u4842"), new Object[-15127 & 8210]));
        Field_23572 = new Class_23562(Class_23562.Method_23592("\u0688\u0689\u0680\u0681\u068c\u068d\u0684\u068d\u0688\u0681\u0688\u0689\u0684\u0685\u068c\u068d\u0688\u0681\u0680\u0689\u068c\u068d\u0684\u068d"), 24665 & -32245, (Class_1782)new Class_2849(Class_23562.Method_23594("\u0828\u082c\u0828\u082c\u082c\u0820\u0820\u0828\u0824\u0828\u082c\u0828\u0824\u0820\u082c\u082c\u0834\u083c\u0834\u083c\u083c\u0834\u0830\u0838\u083c\u0814\u0838\u083c\u0838\u0834\u0810\u0838\u0808\u0808\u0804\u0808"), new Object[-16000 & 2052]));
        Field_23571 = new Class_23562(Class_23562.Method_23595("\u4104\u4101\u4106\u4113\u4100\u4101\u4106\u4103\u411c\u410d\u411a\u410f\u410c\u410d\u411e\u410f\u4104\u4105\u4102\u4113\u4110\u4105"), 10 & 1326, (Class_1782)new Class_2849(Class_23562.Method_23604("\ue12c\ue128\ue12e\ue12a\ue128\ue124\ue166\ue12e\ue128\ue124\ue122\ue126\ue128\ue12c\ue122\ue122\ue120\ue128\ue162\ue126\ue124\ue120\ue12e\ue122\ue124\ue128\ue12e\ue12e\ue120\ue124\ue12a\ue12e\ue100\ue120\ue10a\ue10e\ue100\ue104\ue10e\ue10a\ue100"), new Object[2060 & 12497]), (Class_1782)new Class_2849(Class_23562.Method_23596("\uc150\uc151\uc152\uc143\uc140\uc141\uc102\uc153\uc140\uc141\uc152\uc143\uc140\uc141\uc142\uc143\uc150\uc151\uc112\uc143\uc150\uc141\uc152\uc143\uc140\uc141\uc142\uc153\uc140\uc151\uc152\uc153\uc140\uc141\uc142"), new Object[2080 & -31346]));
        Field_23566 = new Class_23562(Class_23562.Method_23612("\u4214\u4205\u4202\u4207\u4204\u4215\u4206"), 12575 & 1611, (Class_1782)new Class_2849(Class_23562.Method_23597("\u0125\u0123\u0124\u0122\u0127\u0122\u0120\u0122\u0128\u012e\u0128\u012e\u012f\u012b\u012f\u012d\u0122\u0122\u0120\u0122\u0120\u0124\u0120\u0120\u0129\u0129"), new Object[17920 & 268]), (Class_1782)new Class_2849(Class_23562.Method_23586("\u7200\u7200\u7200\u7210\u7214\u7214\u7254\u7204\u7210\u7210\u7200\u7210\u7214\u7214\u7214\u7214\u7200\u7200\u7240\u7210\u7204\u7214\u7204\u7214\u7210\u7210\u7210\u7200\u7214\u7204\u7204\u7204\u7230\u7230\u7230"), new Object[4672 & 27048]));
        Class_23562[] arrclass_23562 = new Class_23562[9260 & 460];
        arrclass_23562[-13261 & 0] = Field_23567;
        arrclass_23562[4359 & -6111] = Field_23565;
        arrclass_23562[-25821 & 16606] = Field_23569;
        arrclass_23562[12295 & 3075] = Field_23564;
        arrclass_23562[30180 & 2070] = Field_23574;
        arrclass_23562[5 & -7115] = Field_23576;
        arrclass_23562[262 & 8231] = Field_23568;
        arrclass_23562[8199 & -14153] = Field_23573;
        arrclass_23562[-28374 & 16600] = Field_23575;
        arrclass_23562[16861 & 14857] = Field_23572;
        arrclass_23562[-32754 & 10570] = Field_23571;
        arrclass_23562[16971 & -18417] = Field_23566;
        Field_23563 = arrclass_23562;
    }

    public Class_1782 Method_23589() {
        return this.Field_23570;
    }

    private static String Method_23590(String string) {
        int n = 2198;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_23562.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_23591(String string) {
        int n = 17644;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_23562.class, 15);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_23592(String string) {
        int n = 22028;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_23562.class, 24);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static Class_23562 Method_23593(String string) {
        return Enum.valueOf(Class_23562.class, string);
    }

    private static String Method_23594(String string) {
        int n = 18983;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_23562.class, 25);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_23595(String string) {
        int n = 10806;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_23562.class, 26);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_23596(String string) {
        int n = 30620;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_23562.class, 28);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_23597(String string) {
        int n = 26306;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_23562.class, 30);
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
    private Class_23562() {
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

    private static String Method_23598(String string) {
        int n = 10996;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_23562.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_1782 Method_23599() {
        return this.Field_23577;
    }

    private static String Method_23600(String string) {
        int n = 28747;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_23562.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_23601(String string) {
        int n = 789;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_23562.class, 22);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_23602(String string) {
        int n = 30813;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_23562.class, 13);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_23603(String string) {
        int n = 17245;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_23562.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_23604(String string) {
        int n = 2785;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_23562.class, 27);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_23605(String string) {
        int n = 10969;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_23562.class, 18);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_23606(String string) {
        int n = 738;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_23562.class, 12);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_23607(String string) {
        int n = 4020;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_23562.class, 21);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_23608(String string) {
        int n = 17168;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_23562.class, 16);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_23609(String string) {
        int n = 10198;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_23562.class, 8);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_23610(String string) {
        int n = 15348;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_23562.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static Class_23562[] Method_23611() {
        return (Class_23562[])Field_23563.clone();
    }

    private static String Method_23612(String string) {
        int n = 869;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_23562.class, 29);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_23613(String string) {
        int n = 24613;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_23562.class, 11);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

