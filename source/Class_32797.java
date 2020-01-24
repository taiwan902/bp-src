/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_32797 {
    public static Class_32797 Field_32798;
    private boolean Field_32799;
    public static Class_32797 Field_32800;
    private boolean Field_32801;
    public static Class_32797 Field_32802;
    private boolean Field_32803;
    public static Class_32797 Field_32804;
    public String Field_32805;
    public static Class_32797 Field_32806;
    public static Class_32797 Field_32807;
    private float Field_32808 = 1.1388888f * 0.26341465f;
    public static Class_32797 Field_32809;
    public static Class_32797 Field_32810;
    private boolean Field_32811;
    public static Class_32797 Field_32812;
    public static Class_32797 Field_32813;
    private boolean Field_32814;
    public static Class_32797 Field_32815;
    private boolean Field_32816;
    public static Class_32797 Field_32817;
    public static Class_32797 Field_32818;
    private boolean Field_32819;
    private boolean Field_32820;
    public static Class_32797 Field_32821;
    public static Class_32797 Field_32822;

    public Class_1061 Method_32823() {
        return this.Method_32856();
    }

    private static String Method_32824(String string) {
        int n = 26288;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_32797.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static Class_32797 Method_32825(Class_41498 class_41498, Class_1061 class_1061) {
        return new Class_40103("arrow", class_41498, class_1061).\u0000= final();
    }

    public boolean Method_32826() {
        return this.Field_32811;
    }

    public static Class_32797 Method_32827(Class_1061 class_1061, Class_1061 class_10612) {
        return new Class_40103("thrown", class_1061, class_10612).\u0000= final();
    }

    public Class_32797 Method_32828() {
        this.Field_32816 = 7697 & 43;
        return this;
    }

    public boolean Method_32829() {
        return this.Field_32814;
    }

    private void Method_32830() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static String Method_32831(String string) {
        int n = 11205;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_32797.class, 13);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static {
        Field_32812 = new Class_32797(Class_32797.Method_32849("\u141c\u1419\u1410\u141d\u1400\u1415")).Method_32846();
        Field_32821 = new Class_32797(Class_32797.Method_32824("\u2880\u2885\u2880\u2885\u2894\u2885\u2880\u2885\u2880\u2885\u2880\u2881\u2894"));
        Field_32815 = new Class_32797(Class_32797.Method_32857("\u1704\u1705\u172e\u1703\u1708\u170d")).Method_32836().Method_32846();
        Field_32822 = new Class_32797(Class_32797.Method_32833("\uc200\uc200\uc200\uc200")).Method_32846();
        Field_32817 = new Class_32797(Class_32797.Method_32859("\u2992\u2991\u2980\u2993\u2996\u2997")).Method_32836();
        Field_32806 = new Class_32797(Class_32797.Method_32860("\u4500\u4504\u4502\u4502\u4504")).Method_32836();
        Field_32810 = new Class_32797(Class_32797.Method_32850("\u8006\u8000\u8004\u8006\u8006\u8004")).Method_32836().Method_32861();
        Field_32809 = new Class_32797(Class_32797.Method_32865("\u12e4\u12e5\u12e6\u12e3\u12e0\u12e5"));
        Field_32813 = new Class_32797(Class_32797.Method_32866("E@GG")).Method_32836();
        Field_32802 = new Class_32797(Class_32797.Method_32851("\u2900\u290b\u290b\u2901\u290d\u290d\u2904\u290c\u290b\u2902")).Method_32836().Method_32834();
        Field_32807 = new Class_32797(Class_32797.Method_32844("\u3a2e\u3a2c\u3a24\u3a2e\u3a3a\u3a20\u3a28")).Method_32836();
        Field_32804 = new Class_32797(Class_32797.Method_32848("\u1453\u145a\u145b\u1450\u1459")).Method_32836().Method_32840();
        Field_32800 = new Class_32797(Class_32797.Method_32831("\u0711\u0708\u0712\u070b\u0705\u0715")).Method_32836();
        Field_32798 = new Class_32797(Class_32797.Method_32839("\u2240\u2242\u2241\u2243\u2245"));
        Field_32818 = new Class_32797(Class_32797.Method_32835("\u08cc\u08cb\u08c4\u08c4\u08c3\u08c4\u08cf\u08ca\u08ce\u08cd\u08c3\u08cb"));
    }

    public boolean Method_32832() {
        return this.Field_32820;
    }

    private static String Method_32833(String string) {
        int n = 17280;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_32797.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected Class_32797 Method_32834() {
        this.Field_32799 = -26615 & 17765;
        return this;
    }

    private static String Method_32835(String string) {
        int n = 14579;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_32797.class, 15);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected Class_32797 Method_32836() {
        this.Field_32801 = -24031 & 17553;
        this.Field_32808 = 0.0f;
        return this;
    }

    public boolean Method_32837() {
        return this.Field_32819;
    }

    public static Class_32797 Method_32838(Class_25529 class_25529) {
        return class_25529 != null && class_25529.Method_25547() != null ? new Class_33140("explosion.player", class_25529.Method_25547()).\u0000, for().Method_32828() : new Class_32797("explosion").Method_32843().Method_32828();
    }

    private static String Method_32839(String string) {
        int n = 9755;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_32797.class, 14);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_32797 Method_32840() {
        this.Field_32803 = 273 & 4129;
        return this;
    }

    public static Class_32797 Method_32841(Class_626 class_626) {
        return new Class_33140("player", class_626);
    }

    public static Class_32797 Method_32842(Class_1061 class_1061, Class_1061 class_10612) {
        return new Class_40103("indirectMagic", class_1061, class_10612).\u0000, `().Method_32840();
    }

    public Class_32797 Method_32843() {
        this.Field_32814 = 29185 & 1025;
        return this;
    }

    private static String Method_32844(String string) {
        int n = 16978;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_32797.class, 11);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public String Method_32845() {
        return this.Field_32805;
    }

    protected Class_32797 Method_32846() {
        this.Field_32819 = -15805 & 8209;
        return this;
    }

    public Class_1782 Method_32847(Class_859 class_859) {
        Class_2849 class_2849;
        Class_859 class_8592 = class_859.Method_962();
        String string = "death.attack." + this.Field_32805;
        String string2 = string + ".player";
        if (class_8592 != null && Class_7594.Method_7599(string2)) {
            Object[] arrobject;
            class_2849 = new Class_2849(string2, arrobject);
            arrobject = new Object[4750 & -29678];
            arrobject[25606 & -32224] = class_859.\u0000strictfp();
            arrobject[18497 & 795] = class_8592.\u0000strictfp();
        } else {
            Object[] arrobject;
            class_2849 = new Class_2849(string, arrobject);
            arrobject = new Object[-24541 & 793];
            arrobject[-32687 & 25376] = class_859.\u0000strictfp();
        }
        return class_2849;
    }

    private static String Method_32848(String string) {
        int n = 28143;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_32797.class, 12);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_32849(String string) {
        int n = 27890;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_32797.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_32850(String string) {
        int n = 21892;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_32797.class, 7);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_32851(String string) {
        int n = 14309;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_32797.class, 10);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public boolean Method_32852() {
        return this.Field_32801;
    }

    public Class_32797 Method_32853() {
        this.Field_32820 = 8195 & 17289;
        return this;
    }

    public boolean Method_32854() {
        return this.Field_32816;
    }

    public float Method_32855() {
        return this.Field_32808;
    }

    protected Class_32797(String string) {
        this.Field_32805 = string;
    }

    public Class_1061 Method_32856() {
        return null;
    }

    private static String Method_32857(String string) {
        int n = 2942;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_32797.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static Class_32797 Method_32858(Class_1061 class_1061) {
        return new Class_33140("thorns", class_1061).Method_33144().\u0000strictfp();
    }

    private static String Method_32859(String string) {
        int n = 24859;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_32797.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_32860(String string) {
        int n = 13514;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_32797.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected Class_32797 Method_32861() {
        this.Field_32811 = 129 & 8215;
        this.Field_32808 = 0.0f;
        return this;
    }

    public boolean Method_32862() {
        return this.Field_32803;
    }

    public static Class_32797 Method_32863(Class_859 class_859) {
        return new Class_33140("mob", class_859);
    }

    public boolean Method_32864() {
        return this.Field_32799;
    }

    private static String Method_32865(String string) {
        int n = 30469;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_32797.class, 8);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_32866(String string) {
        int n = 5194;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_32797.class, 9);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public boolean Method_32867() {
        Class_1061 class_1061 = this.Method_32856();
        return (class_1061 instanceof Class_626 && ((Class_626)class_1061).Field_694.Method_18094() ? -32511 & 583 : 301 & 18448) != 0;
    }

    public static Class_32797 Method_32868(Class_26026 class_26026, Class_1061 class_1061) {
        return class_1061 == null ? new Class_40103("onFire", class_26026, class_26026).\u0000
        ().Method_32853() : new Class_40103("fireball", class_26026, class_1061).\u0000
        ().Method_32853();
    }
}

