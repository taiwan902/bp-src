/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.input.Keyboard
 */
import internal.org.lwjgl.input.Keyboard;
import java.io.File;
import java.io.PrintWriter;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Scanner;

public final class Class_34481
extends Enum {
    public static final /* enum */ Class_34481 Field_34482;
    boolean Field_34483;
    public static final /* enum */ Class_34481 Field_34484;
    public static final /* enum */ Class_34481 Field_34485;
    boolean Field_34486;
    public static final /* enum */ Class_34481 Field_34487;
    private static File Field_34488;
    public static final /* enum */ Class_34481 Field_34489;
    int Field_34490;
    private String Field_34491;
    private final int Field_34492;
    public static final /* enum */ Class_34481 Field_34493;
    private static final Class_34481[] Field_34494;
    public static final /* enum */ Class_34481 Field_34495;
    public static final /* enum */ Class_34481 Field_34496;
    public static final /* enum */ Class_34481 Field_34497;
    public static final /* enum */ Class_34481 Field_34498;
    public static final /* enum */ Class_34481 Field_34499;
    public static final /* enum */ Class_34481 Field_34500;
    public static final /* enum */ Class_34481 Field_34501;
    public static final /* enum */ Class_34481 Field_34502;

    public String Method_34503() {
        String string;
        String string2 = Keyboard.getKeyName((int)this.Field_34490);
        if (string2 == null) {
            Object[] arrobject = new Object[35 & -22131];
            arrobject[-30971 & 10266] = this.Field_34490;
            string = String.format("#%02X", arrobject);
        } else {
            string = Class_38196.Method_38388(string2);
        }
        return string;
    }

    /*
     * Exception decompiling
     */
    private Class_34481() {
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

    private void Method_34504() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_34505() {
        return Class_38196.Method_38388(this.name()) + ": " + this.Method_34503();
    }

    private static String Method_34506(String string) {
        int n = 16606;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_34481.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static {
        Field_34485 = new Class_34481(Class_34481.Method_34533("\u0102\u0103\u0100\u0103\u0100\u0105\u0102\u0107"), 24640 & 2308, -19141 & 242);
        Field_34496 = new Class_34481(Class_34481.Method_34507("\u0918\u0902\u090a\u090a\u0900\u0908\u0912\u0908\u0902\u0908\u090a\u0900\u0908"), 13 & -26717, 25604 & 2448);
        Field_34493 = new Class_34481(Class_34481.Method_34520("\u0818\u0800\u080a\u080a\u0800\u0808\u0812\u081e\u0800\u0808\u0802\u0802\u0814\u0818\u0812\u081e\u081c\u0808"), 3106 & -32062, 384 & 4641);
        Field_34498 = new Class_34481(Class_34481.Method_34506("\u420e\u4215\u421f\u421f\u4216\u421f\u4207\u4202\u421d\u421d\u421d"), 8715 & -16233, 125 & -17364);
        Field_34484 = new Class_34481(Class_34481.Method_34523("\u4400\u4418\u4410\u4410\u441c\u4414\u440c\u441c\u4410\u4400\u4410\u4410\u440c\u441c\u4414\u4404"), 12996 & -31721, -32595 & 2669);
        Field_34489 = new Class_34481(Class_34481.Method_34522("\u5044\u504e\u5045\u5044\u5048\u5040\u5049\u504b\u5049\u504b\u504d\u504e\u5043\u5040\u504f\u504f\u505f\u505d\u5053\u5051\u5051\u5059"), 24591 & 8117, 534 & -12160);
        Field_34487 = new Class_34481(Class_34481.Method_34530("\u2014\u2004\u2004\u2004\u2000\u2000\u2010\u2010\u2008\u2018\u2018\u200c\u200c\u2008\u2018\u201c\u2004\u2004\u2010\u2000\u2014\u2014\u2010\u2010"), 70 & -28250, 16929 & 12500);
        Field_34497 = new Class_34481(Class_34481.Method_34509("\u0800\u0802\u0801\u0800\u0804\u0804\u0805\u0804\u0809\u0808\u080a\u0808\u080d\u080f\u080e\u080c\u0813\u0810\u0813\u0811\u0817\u0814\u0814"), -32241 & 8551, 317 & 16896);
        Field_34482 = new Class_34481(Class_34481.Method_34525("\uc04e\uc044\uc04e\uc04e\uc042\uc04a\uc042\uc04a\uc042\uc04a\uc040\uc04e\uc04e\uc048\uc040\uc046\uc044\uc04e\uc040\uc044\uc04a\uc040\uc04e\uc044\uc04c\uc04c"), 8 & 18732, 4737 & 25632);
        Field_34495 = new Class_34481(Class_34481.Method_34526("\u2105\u210c\u2106\u2106\u210d\u2104\u210e\u2106\u2105\u210d\u2102\u210f\u2100\u210c\u210a\u2106\u2101\u2100\u2107\u2102\u2101"), 8217 & 3721, 8212 & 6402);
        Field_34499 = new Class_34481(Class_34481.Method_34510("\u0444\u0440\u0442\u0442\u0444\u0440\u0442\u0442\u0448\u044c\u044a\u044a"), 8395 & -14322, -32018 & 46);
        Field_34500 = new Class_34481(Class_34481.Method_34516("\u02bb\u02ad\u02b7\u02be\u02a3\u02a5\u02a0\u02ba\u02b3\u02a0\u02a7\u02bd\u02b8"), 267 & 3099, -27648 & 24583);
        Field_34501 = new Class_34481(Class_34481.Method_34514("\u31a8\u31b9\u31bb\u31bb\u31a9\u31b9\u31ba"), -32244 & 1084, -21805 & 4593);
        Field_34502 = new Class_34481(Class_34481.Method_34532("\ua000\ua011\ua010\ua013\ua000\ua011\ua002\ua003"), 1357 & 12813, 6619 & 17609);
        Class_34481[] arrclass_34481 = new Class_34481[6158 & 8910];
        arrclass_34481[-27328 & 2564] = Field_34485;
        arrclass_34481[-23423 & 22593] = Field_34496;
        arrclass_34481[18082 & 4362] = Field_34493;
        arrclass_34481[-32233 & 3083] = Field_34498;
        arrclass_34481[10277 & -26938] = Field_34484;
        arrclass_34481[-14843 & 2141] = Field_34489;
        arrclass_34481[6 & 4766] = Field_34487;
        arrclass_34481[295 & -24441] = Field_34497;
        arrclass_34481[-32712 & 6280] = Field_34482;
        arrclass_34481[8569 & 3087] = Field_34495;
        arrclass_34481[8202 & 4762] = Field_34499;
        arrclass_34481[2187 & -19121] = Field_34500;
        arrclass_34481[8413 & 16942] = Field_34501;
        arrclass_34481[24591 & 861] = Field_34502;
        Field_34494 = arrclass_34481;
        Field_34488 = new File(Class_38196.Field_38346, Class_34481.Method_34517("\u41e8\u41e1\u41ea\u41e3\u41e8\u41e9\u41e2\u41e3\u41a8\u41e1\u41e2\u41e3"));
        Class_34481.Method_34508();
        Class_34481.Method_34511();
    }

    private static String Method_34507(String string) {
        int n = 3520;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_34481.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static void Method_34508() {
        try (Scanner scanner = null;){
            scanner = new Scanner(Field_34488);
            while (scanner.hasNextLine()) {
                try {
                    String[] arrstring = scanner.nextLine().split(":");
                    Class_34481.Method_34527(Class_38196.Method_38414(arrstring[-32228 & 12418].trim())).Method_34529(Class_38196.Method_38414(arrstring[4645 & 8195].trim()));
                }
                catch (Exception exception) {}
            }
        }
    }

    private static String Method_34509(String string) {
        int n = 4904;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_34481.class, 8);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_34510(String string) {
        int n = 28108;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_34481.class, 11);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean Method_34511() {
        boolean bl;
        PrintWriter printWriter = null;
        try {
            int n;
            printWriter = new PrintWriter(Field_34488);
            Class_34481[] arrclass_34481 = Class_34481.Method_34512();
            int n2 = arrclass_34481.length;
            for (n = 212 & -32477; n < n2; ++n) {
                Class_34481 class_34481 = arrclass_34481[n];
                printWriter.println(class_34481.Method_34505());
            }
            n = 177 & -23035;
            return n != 0;
        }
        catch (Exception exception) {
            bl = -24047 & 196;
        }
        finally {
            if (printWriter != null) {
                printWriter.flush();
                printWriter.close();
            }
        }
        return bl;
    }

    public static Class_34481[] Method_34512() {
        return (Class_34481[])Field_34494.clone();
    }

    public static void Method_34513() {
        Class_34481[] arrclass_34481 = Class_34481.Method_34512();
        int n = arrclass_34481.length;
        for (int i = 328 & 642; i < n; ++i) {
            Class_34481 class_34481 = arrclass_34481[i];
            class_34481.Field_34486 = class_34481.Field_34483;
            class_34481.Field_34483 = class_34481.Field_34490 != 0 && Keyboard.isKeyDown((int)class_34481.Field_34490) ? -19673 & 1033 : -31740 & 4115;
        }
    }

    private static String Method_34514(String string) {
        int n = 24451;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_34481.class, 13);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public boolean Method_34515() {
        return (this.Field_34490 == this.Field_34492 ? 12657 & 2189 : 17569 & 2066) != 0;
    }

    private static String Method_34516(String string) {
        int n = 22500;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_34481.class, 12);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_34517(String string) {
        int n = 8197;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_34481.class, 15);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public boolean Method_34518() {
        return (!this.Field_34483 && this.Field_34486 ? 1177 & 4611 : 76 & 9729) != 0;
    }

    public void Method_34519() {
        this.Field_34490 = this.Field_34492;
    }

    private static String Method_34520(String string) {
        int n = 24764;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_34481.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public boolean Method_34521() {
        return (this.Field_34483 && !this.Field_34486 ? -30711 & 4625 : 656 & 20516) != 0;
    }

    private static String Method_34522(String string) {
        int n = 29693;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_34481.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_34523(String string) {
        int n = 18070;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_34481.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public String Method_34524() {
        return this.Field_34491;
    }

    private static String Method_34525(String string) {
        int n = 15675;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_34481.class, 9);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_34526(String string) {
        int n = 5646;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_34481.class, 10);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static Class_34481 Method_34527(String string) {
        return Enum.valueOf(Class_34481.class, string);
    }

    public void Method_34528(int n) {
        if (n == (-27055 & 26753)) {
            n = 1 & 20864;
        }
        if (n != 0 || this != Field_34485) {
            if (n != 0) {
                Class_34481[] arrclass_34481 = Class_34481.Method_34512();
                int n2 = arrclass_34481.length;
                for (int i = 1537 & -24524; i < n2; ++i) {
                    Class_34481 class_34481 = arrclass_34481[i];
                    if (class_34481.Field_34490 != n) continue;
                    if (class_34481 == Field_34485 && this.Field_34490 == 0) {
                        return;
                    }
                    class_34481.Field_34490 = this.Field_34490;
                    class_34481.Field_34483 = -32764 & 176;
                    class_34481.Field_34486 = 7861 & -16056;
                    break;
                }
            }
            this.Field_34490 = n;
            this.Field_34483 = 2 & 552;
            this.Field_34486 = 9216 & 16898;
        }
    }

    public void Method_34529(String string) {
        int n = Keyboard.getKeyIndex((String)string);
        if (string.startsWith("#")) {
            try {
                n = Integer.parseInt(string.substring(2305 & 12417), 408 & -30668);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        this.Method_34528(n);
    }

    private static String Method_34530(String string) {
        int n = 32423;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_34481.class, 7);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public int Method_34531() {
        return this.Field_34490;
    }

    private static String Method_34532(String string) {
        int n = 6238;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_34481.class, 14);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_34533(String string) {
        int n = 3298;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_34481.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

