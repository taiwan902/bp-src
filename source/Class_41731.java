/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;

public class Class_41731
extends Class_40549
implements Class_33149 {
    private static final Class_6113 Field_41732 = Class_10201.Method_10203(Class_41731.class);
    private static final Class_20861 Field_41733;
    private static final Class_6113 Field_41734;
    private static final Class_26766 Field_41735;
    private short Field_41736;
    private Object Field_41737;
    private Class_14928 Field_41738;
    private final Class_37082 Field_41739;
    private Object Field_41740;
    private static final Class_20861 Field_41741;

    public Class_21065 Method_41742() {
        return this.Method_41780();
    }

    public boolean Method_41743() {
        return Class_41731.Method_41764(this.Field_41740);
    }

    static void Method_41744(Class_21065 class_21065, Class_18600 class_18600) {
        try {
            class_18600.Method_18601(class_21065);
        }
        catch (Throwable throwable) {
            if (Field_41732.Method_6119()) {
                Field_41732.Method_6127("An exception was thrown by " + class_18600.getClass().getName() + ".operationComplete()", throwable);
            }
            throwable.printStackTrace();
        }
    }

    /*
     * Exception decompiling
     */
    private boolean Method_41745(long var1_1, boolean var3_2) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [14[DOLOOP]], but top level block is 7[TRYBLOCK]
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:427)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:479)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:607)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:696)
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

    private boolean Method_41746() {
        return (this.Field_41736 > 0 ? 11267 & 521 : -31677 & 6200) != 0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private boolean Method_41747(Object object) {
        if (this.Method_41769()) {
            return (4436 & -30688) != 0;
        }
        Class_41731 class_41731 = this;
        synchronized (class_41731) {
            if (this.Method_41769()) {
                return (22848 & 9377) != 0;
            }
            this.Field_41740 = object == null ? Field_41741 : object;
            if (this.Method_41746()) {
                this.notifyAll();
            }
        }
        return (641 & 321) != 0;
    }

    protected void Method_41748() {
        Class_37082 class_37082 = this.Method_41762();
        if (class_37082 != null && class_37082.Method_37084()) {
            throw new Class_15279(this.Method_41784());
        }
    }

    static Class_14928 Method_41749(Class_41731 class_41731) {
        return class_41731.Field_41738;
    }

    private void Method_41750() {
        Throwable throwable = this.Method_41770();
        if (throwable == null) {
            return;
        }
        Class_7799.Method_7834(throwable);
    }

    private static String Method_41751(String string) {
        int n = 20570;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_41731.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_41752() {
        if (this.Field_41736 == (32767 & -1)) {
            throw new IllegalStateException("too many waiters: " + this);
        }
        this.Field_41736 = (short)(this.Field_41736 + (-24557 & 22401));
    }

    static Class_14928 Method_41753(Class_41731 class_41731, Class_14928 class_14928) {
        class_41731.Field_41738 = class_14928;
        return class_41731.Field_41738;
    }

    public Class_21065 Method_41754(Class_18600 class_18600) {
        return this.Method_41790(class_18600);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean Method_41755() {
        Object object = this.Field_41740;
        if (Class_41731.Method_41783(object)) {
            return (!Class_41731.Method_41764(object) ? 13891 & 16645 : -32502 & 26656) != 0;
        }
        Class_41731 class_41731 = this;
        synchronized (class_41731) {
            object = this.Field_41740;
            if (Class_41731.Method_41783(object)) {
                return (!Class_41731.Method_41764(object) ? 3 & 5665 : 4096 & 1035) != 0;
            }
            this.Field_41740 = Field_41733;
        }
        return (2373 & 4105) != 0;
    }

    public Class_33149 Method_41756(Class_18600 ... arrclass_18600) {
        Class_18600 class_18600;
        if (arrclass_18600 == null) {
            throw new NullPointerException("listeners");
        }
        Class_18600[] arrclass_186002 = arrclass_18600;
        int n = arrclass_186002.length;
        for (int i = 8224 & 16400; i < n && (class_18600 = arrclass_186002[i]) != null; ++i) {
            this.Method_41790(class_18600);
        }
        return this;
    }

    public Class_33149 Method_41757() {
        this.Method_41780();
        this.Method_41750();
        return this;
    }

    private void Method_41758() {
        this.Field_41736 = (short)(this.Field_41736 - (-3821 & 5));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean Method_41759(boolean bl) {
        Object object = this.Field_41740;
        if (Class_41731.Method_41783(object) || object == Field_41733) {
            return (24896 & 528) != 0;
        }
        Class_41731 class_41731 = this;
        synchronized (class_41731) {
            object = this.Field_41740;
            if (Class_41731.Method_41783(object) || object == Field_41733) {
                return (-32723 & 450) != 0;
            }
            this.Field_41740 = Field_41735;
            if (this.Method_41746()) {
                this.notifyAll();
            }
        }
        this.Method_41773();
        return (-32575 & 26891) != 0;
    }

    protected StringBuilder Method_41760() {
        StringBuilder stringBuilder = new StringBuilder(-13615 & 8300);
        stringBuilder.append(Class_22304.Method_22312(this));
        stringBuilder.append((char)(-30656 & 13520));
        stringBuilder.append(Integer.toHexString(this.hashCode()));
        Object object = this.Field_41740;
        if (object == Field_41741) {
            stringBuilder.append("(success)");
        } else if (object == Field_41733) {
            stringBuilder.append("(uncancellable)");
        } else if (object instanceof Class_26766) {
            stringBuilder.append("(failure(");
            stringBuilder.append(((Class_26766)object).Field_26767);
            stringBuilder.append((char)(4265 & 18985));
        } else {
            stringBuilder.append("(incomplete)");
        }
        return stringBuilder;
    }

    static Object Method_41761(Class_41731 class_41731) {
        return class_41731.Field_41737;
    }

    protected Class_37082 Method_41762() {
        return this.Field_41739;
    }

    public boolean Method_41763() {
        Object object = this.Field_41740;
        if (object == null || object == Field_41733) {
            return (13066 & -16255) != 0;
        }
        return (!(object instanceof Class_26766) ? 26811 & -28667 : 406 & 544) != 0;
    }

    private static boolean Method_41764(Object object) {
        return (object instanceof Class_26766 && ((Class_26766)object).Field_26767 instanceof CancellationException ? -31719 & 8193 : 1064 & -30460) != 0;
    }

    public Class_33149 Method_41765() {
        this.Method_41785();
        this.Method_41750();
        return this;
    }

    public Object Method_41766() {
        Object object = this.Field_41740;
        if (object instanceof Class_26766 || object == Field_41741) {
            return null;
        }
        return object;
    }

    public Class_33149 Method_41767(Throwable throwable) {
        if (this.Method_41771(throwable)) {
            this.Method_41773();
            return this;
        }
        throw new IllegalStateException("complete already: " + this, throwable);
    }

    public Class_41731(Class_37082 class_37082) {
        if (class_37082 == null) {
            throw new NullPointerException("executor");
        }
        this.Field_41739 = class_37082;
    }

    static void Method_41768(Class_37082 class_37082, Runnable runnable) {
        Class_41731.Method_41779(class_37082, runnable);
    }

    public boolean Method_41769() {
        return Class_41731.Method_41783(this.Field_41740);
    }

    public Throwable Method_41770() {
        Object object = this.Field_41740;
        if (object instanceof Class_26766) {
            return ((Class_26766)object).Field_26767;
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private boolean Method_41771(Throwable throwable) {
        if (throwable == null) {
            throw new NullPointerException("cause");
        }
        if (this.Method_41769()) {
            return (4320 & 16924) != 0;
        }
        Class_41731 class_41731 = this;
        synchronized (class_41731) {
            if (this.Method_41769()) {
                return (19872 & 582) != 0;
            }
            this.Field_41740 = new Class_26766(throwable);
            if (this.Method_41746()) {
                this.notifyAll();
            }
        }
        return (-30719 & 24611) != 0;
    }

    static void Method_41772(Class_21065 class_21065, Class_20343 class_20343) {
        Class_41731.Method_41778(class_21065, class_20343);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void Method_41773() {
        Object object;
        int n;
        Object object2 = this.Field_41737;
        if (object2 == null) {
            return;
        }
        Class_37082 class_37082 = this.Method_41762();
        if (class_37082.Method_37084() && (n = ((Class_32728)(object = Class_32728.Method_32743())).Method_32742()) < (136 & 794)) {
            ((Class_32728)object).Method_32734(n + (30729 & 759));
            try {
                if (object2 instanceof Class_20343) {
                    Class_41731.Method_41778(this, (Class_20343)object2);
                } else {
                    Class_18600 class_18600 = (Class_18600)object2;
                    Class_41731.Method_41744(this, class_18600);
                }
            }
            finally {
                this.Field_41737 = null;
                ((Class_32728)object).Method_32734(n);
            }
            return;
        }
        if (object2 instanceof Class_20343) {
            object = (Class_20343)object2;
            Class_41731.Method_41779(class_37082, new Class_31054(this, (Class_20343)object));
        } else {
            object = (Class_18600)object2;
            Class_41731.Method_41779(class_37082, new Class_5981(this, (Class_18600)object));
        }
    }

    public boolean Method_41774(long l, TimeUnit timeUnit) {
        return this.Method_41745(timeUnit.toNanos(l), (8403 & -27647) != 0);
    }

    private static String Method_41775(String string) {
        int n = 23795;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_41731.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_41776() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_33149 Method_41777(Object object) {
        if (this.Method_41747(object)) {
            this.Method_41773();
            return this;
        }
        throw new IllegalStateException("complete already: " + this);
    }

    private static void Method_41778(Class_21065 class_21065, Class_20343 class_20343) {
        Class_18600[] arrclass_18600 = class_20343.Method_20350();
        int n = class_20343.Method_20349();
        for (int i = -29056 & 24932; i < n; ++i) {
            Class_41731.Method_41744(class_21065, arrclass_18600[i]);
        }
    }

    private static void Method_41779(Class_37082 class_37082, Runnable runnable) {
        try {
            class_37082.execute(runnable);
        }
        catch (Throwable throwable) {
            Field_41734.Method_6121("Failed to submit a listener notification task. Event loop shut down?", throwable);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Class_33149 Method_41780() {
        if (this.Method_41769()) {
            return this;
        }
        if (Thread.interrupted()) {
            throw new InterruptedException(this.Method_41784());
        }
        Class_41731 class_41731 = this;
        synchronized (class_41731) {
            while (!this.Method_41769()) {
                this.Method_41748();
                this.Method_41752();
                try {
                    this.wait();
                }
                finally {
                    this.Method_41758();
                }
            }
        }
        return this;
    }

    static Object Method_41781(Class_41731 class_41731, Object object) {
        class_41731.Field_41737 = object;
        return class_41731.Field_41737;
    }

    public boolean Method_41782(Object object) {
        if (this.Method_41747(object)) {
            this.Method_41773();
            return (8469 & 2091) != 0;
        }
        return (4104 & 16704) != 0;
    }

    private static boolean Method_41783(Object object) {
        return (object != null && object != Field_41733 ? 5201 & -7903 : 1728 & -28379) != 0;
    }

    public String Method_41784() {
        return this.Method_41760().toString();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Class_33149 Method_41785() {
        if (this.Method_41769()) {
            return this;
        }
        int n = 1072 & 15236;
        Class_41731 class_41731 = this;
        synchronized (class_41731) {
            while (!this.Method_41769()) {
                this.Method_41748();
                this.Method_41752();
                try {
                    this.wait();
                }
                catch (InterruptedException interruptedException) {
                    n = 8449 & 18563;
                }
                finally {
                    this.Method_41758();
                }
            }
        }
        if (n != 0) {
            Thread.currentThread().interrupt();
        }
        return this;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void Method_41786(Class_18600 class_18600) {
        Class_37082 class_37082 = this.Method_41762();
        if (class_37082.Method_37084()) {
            if (this.Field_41737 == null && this.Field_41738 == null) {
                Class_32728 class_32728 = Class_32728.Method_32743();
                int n = class_32728.Method_32742();
                if (n < (25630 & 5000)) {
                    class_32728.Method_32734(n + (10913 & -32761));
                    try {
                        Class_41731.Method_41744(this, class_18600);
                    }
                    finally {
                        class_32728.Method_32734(n);
                    }
                    return;
                }
            } else {
                Class_14928 class_14928 = this.Field_41738;
                if (class_14928 == null) {
                    this.Field_41738 = class_14928 = new Class_14928(this);
                }
                class_14928.add(class_18600);
                Class_41731.Method_41779(class_37082, class_14928);
                return;
            }
        }
        Class_41731.Method_41779(class_37082, new Class_14063(this, class_18600));
    }

    static {
        Field_41734 = Class_10201.Method_10205(Class_41731.class.getName() + Class_41731.Method_41787("\u9400\u9400\u9400\u9402\u9402\u9400\u9400\u9400\u940a\u940a\u9408\u9408\u9408\u940a\u9408\u9408\u9400\u9400"));
        Field_41741 = Class_20861.Method_20865(Class_41731.class.getName() + Class_41731.Method_41775("\u0405\u0438\u043c\u0428\u0428\u042c\u0438\u0438"));
        Field_41733 = Class_20861.Method_20865(Class_41731.class.getName() + Class_41731.Method_41751("\u81e0\u8183\u8180\u8185\u8183\u8184\u8181\u8187\u8182\u8182\u8187\u8184\u8186\u8187"));
        Field_41735 = new Class_26766(new CancellationException());
        Class_41731.Field_41735.Field_26767.setStackTrace(Class_23808.Field_23809);
    }

    private static String Method_41787(String string) {
        int n = 20825;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_41731.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected Class_41731() {
        this.Field_41739 = null;
    }

    public boolean Method_41788(Throwable throwable) {
        if (this.Method_41771(throwable)) {
            this.Method_41773();
            return (2069 & 137) != 0;
        }
        return (17176 & 2272) != 0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected static void Method_41789(Class_37082 class_37082, Class_21065 class_21065, Class_18600 class_18600) {
        Class_32728 class_32728;
        int n;
        if (class_37082.Method_37084() && (n = (class_32728 = Class_32728.Method_32743()).Method_32742()) < (780 & -30693)) {
            class_32728.Method_32734(n + (-32537 & 3337));
            try {
                Class_41731.Method_41744(class_21065, class_18600);
            }
            finally {
                class_32728.Method_32734(n);
            }
            return;
        }
        Class_41731.Method_41779(class_37082, new Class_34652(class_21065, class_18600));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Class_33149 Method_41790(Class_18600 class_18600) {
        if (class_18600 == null) {
            throw new NullPointerException("listener");
        }
        if (this.Method_41769()) {
            this.Method_41786(class_18600);
            return this;
        }
        Class_41731 class_41731 = this;
        synchronized (class_41731) {
            if (!this.Method_41769()) {
                if (this.Field_41737 == null) {
                    this.Field_41737 = class_18600;
                } else if (this.Field_41737 instanceof Class_20343) {
                    ((Class_20343)this.Field_41737).Method_20348(class_18600);
                } else {
                    Class_18600 class_186002 = (Class_18600)this.Field_41737;
                    this.Field_41737 = new Class_20343(class_186002, class_18600);
                }
                return this;
            }
        }
        this.Method_41786(class_18600);
        return this;
    }
}

