/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  internal.org.lwjgl.input.Keyboard
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import internal.org.lwjgl.input.Keyboard;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Class_18965
extends Class_1490 {
    private Class_42376 Field_18966;
    private String Field_18967;
    private String Field_18968;
    private final Class_27720 Field_18969;
    private Class_16713 Field_18970;
    private Class_38813 Field_18971;
    private String Field_18972;
    private static final List Field_18973 = Lists.newArrayList();

    private static String Method_18974(String string) {
        int n = 11395;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_18965.class, 17);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_18975(String string) {
        int n = 7018;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_18965.class, 9);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_18976() {
        this.Field_18971.Method_38847();
        super.Method_1517();
    }

    static List Method_18977() {
        return Field_18973;
    }

    private static String Method_18978(String string) {
        int n = 5240;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_18965.class, 27);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static void Method_18979(String string, Class_1956 class_1956, Class_17281 class_17281, List list, Class_33007 ... arrclass_33007) {
        Class_18965.Method_18988(string, class_1956, 10518 & -27000, class_17281, list, arrclass_33007);
    }

    private static String Method_18980(String string) {
        int n = 21944;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_18965.class, 12);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected void Method_18981(Class_42376 class_42376) {
        if (class_42376.Field_42392 == 0 && this.Method_19013()) {
            this.Field_18969.Method_27735(this.Field_18971.Method_38848());
            this.\u0000strictfp.Method_218(this.Field_18969);
        } else if (class_42376.Field_42392 == (-32755 & 2417)) {
            this.\u0000strictfp.Method_218(this.Field_18969);
        }
    }

    private static String Method_18982(String string) {
        int n = 19537;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_18965.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_18983(String string) {
        int n = 2972;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_18965.class, 30);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_18984(String string) {
        int n = 1585;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_18965.class, 34);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_18985(String string) {
        int n = 22666;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_18965.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_18986() {
        this.\u0000strictfp.clear();
        Keyboard.enableRepeatEvents((-11967 & 8857) != 0);
        this.Field_18968 = Class_9802.Method_9806("createWorld.customize.presets.title", new Object[7204 & -32253]);
        this.Field_18967 = Class_9802.Method_9806("createWorld.customize.presets.share", new Object[8970 & 2048]);
        this.Field_18972 = Class_9802.Method_9806("createWorld.customize.presets.list", new Object[290 & 27648]);
        this.Field_18971 = new Class_38813(-12282 & 611, this.\u0000strictfp, 1843 & -32650, 20521 & 10220, this.\u0000= final - (-6682 & 101), -22476 & 21534);
        this.Field_18970 = new Class_16713(this);
        this.Field_18971.Method_38859(3790 & -18962);
        this.Field_18971.Method_38853(this.Field_18969.Method_27736());
        this.Field_18966 = new Class_42376(548 & 5187, this.\u0000= final / (20518 & -23277) - (-11809 & 3739), this.\u0000, ` - (8924 & 284), 215 & -32618, 148 & -22700, Class_9802.Method_9806("createWorld.customize.presets.select", new Object[5194 & -32463]));
        this.\u0000strictfp.add(this.Field_18966);
        this.\u0000strictfp.add(new Class_42376(-32607 & 30281, this.\u0000= final / (-11198 & 146) + (4519 & 5), this.\u0000, ` - (9246 & 2268), -30058 & 214, 8564 & 18453, Class_9802.Method_9806("gui.cancel", new Object[-24568 & 193])));
        this.Method_18999();
    }

    private static String Method_18987(String string) {
        int n = 13081;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_18965.class, 14);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static void Method_18988(String string, Class_1956 class_1956, int n, Class_17281 class_17281, List list, Class_33007 ... arrclass_33007) {
        Class_34729 class_34729 = new Class_34729();
        for (int i = arrclass_33007.length - (14979 & -16343); i >= 0; --i) {
            class_34729.Method_34737().add(arrclass_33007[i]);
        }
        class_34729.Method_34736(class_17281.Field_17343);
        class_34729.Method_34741();
        if (list != null) {
            for (String string2 : list) {
                class_34729.Method_34734().put(string2, Maps.newHashMap());
            }
        }
        Field_18973.add(new Class_11323(class_1956, n, string, class_34729.Method_34739()));
    }

    private static String Method_18989(String string) {
        int n = 27691;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_18965.class, 22);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_18990(String string) {
        int n = 17476;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_18965.class, 8);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_18991(String string) {
        int n = 30695;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_18965.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_18992(String string) {
        int n = 23506;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_18965.class, 13);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_18993(String string) {
        int n = 12631;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_18965.class, 32);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_18994() {
        super.Method_1544();
        this.Field_18970.\u0000, for();
    }

    private static String Method_18995(String string) {
        int n = 16003;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_18965.class, 21);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_18996(String string) {
        int n = 22684;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_18965.class, 24);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_18997(String string) {
        int n = 24919;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_18965.class, 23);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_18998() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_18999() {
        boolean bl;
        this.Field_18966.Field_42388 = bl = this.Method_19013();
    }

    private static String Method_19000(String string) {
        int n = 15448;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_18965.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19001(String string) {
        int n = 32439;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_18965.class, 10);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19002(String string) {
        int n = 28929;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_18965.class, 25);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected void Method_19003(char c, int n) {
        if (!this.Field_18971.Method_38854(c, n)) {
            super.Method_1525(c, n);
        }
    }

    protected void Method_19004(int n, int n2, int n3) {
        this.Field_18971.Method_38855(n, n2, n3);
        super.Method_1537(n, n2, n3);
    }

    public void Method_19005() {
        Keyboard.enableRepeatEvents((1664 & -2012) != 0);
    }

    private static String Method_19006(String string) {
        int n = 12913;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_18965.class, 16);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static Class_16713 Method_19007(Class_18965 class_18965) {
        return class_18965.Field_18970;
    }

    private static String Method_19008(String string) {
        int n = 25955;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_18965.class, 33);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19009(String string) {
        int n = 3167;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_18965.class, 31);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19010(String string) {
        int n = 22278;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_18965.class, 15);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19011(String string) {
        int n = 7519;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_18965.class, 18);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19012(String string) {
        int n = 7845;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_18965.class, 7);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private boolean Method_19013() {
        return (this.Field_18970.Field_16714 > (-1 & -1) && this.Field_18970.Field_16714 < Field_18973.size() || this.Field_18971.Method_38848().length() > (1281 & 16545) ? 67 & 4105 : 7180 & 515) != 0;
    }

    private static String Method_19014(String string) {
        int n = 2930;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_18965.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static Class_38813 Method_19015(Class_18965 class_18965) {
        return class_18965.Field_18971;
    }

    public void Method_19016(int n, int n2, float f) {
        this.\u0000, 2();
        this.Field_18970.\u0000strictfp(n, n2, f);
        this.\u0000strictfp(this.\u0000strictfp, this.Field_18968, this.\u0000= final / (2051 & 25038), 4360 & -16214, -1845493761 & 117440511);
        this.\u0000, `(this.\u0000strictfp, this.Field_18967, -32198 & 307, 639 & 22814, 16055480 & 782410720);
        this.\u0000, `(this.\u0000strictfp, this.Field_18972, 2227 & 1906, 8262 & -32434, 467773601 & 1152033248);
        this.Field_18971.Method_38849();
        super.Method_1545(n, n2, f);
    }

    private static String Method_19017(String string) {
        int n = 12740;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_18965.class, 20);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19018(String string) {
        int n = 9620;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_18965.class, 19);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19019(String string) {
        int n = 15607;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_18965.class, 28);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static void Method_19020(String string, Class_1956 class_1956, Class_17281 class_17281, Class_33007 ... arrclass_33007) {
        Class_18965.Method_18988(string, class_1956, 19041 & 4248, class_17281, null, arrclass_33007);
    }

    public Class_18965(Class_27720 class_27720) {
        this.Field_18969 = class_27720;
    }

    private static String Method_19021(String string) {
        int n = 27743;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_18965.class, 26);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19022(String string) {
        int n = 3094;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_18965.class, 11);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19023(String string) {
        int n = 2762;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_18965.class, 29);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19024(String string) {
        int n = 2130;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_18965.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static {
        String[] arrstring = new String[12353 & 19465];
        arrstring[-23936 & 4106] = Class_18965.Method_18991("\u8408\u8404\u8402\u8403\u8409\u840c\u840f");
        Class_33007[] arrclass_33007 = new Class_33007[4355 & 25259];
        arrclass_33007[-30139 & 8224] = new Class_33007(-22389 & 529, Class_9265.Field_9319);
        arrclass_33007[26757 & 585] = new Class_33007(10242 & 20482, Class_9265.Field_9272);
        arrclass_33007[403 & -20414] = new Class_33007(261 & 233, Class_9265.Field_9414);
        Class_18965.Method_18979(Class_18965.Method_19000("\u56c5\u56c8\u56c5\u56c5\u56c5\u56cd\u56c5\u5684\u56c0\u56c8\u56c5\u56c0"), Class_1956.Method_1981(Class_9265.Field_9319), Class_17281.Field_17318, Arrays.asList(arrstring), arrclass_33007);
        String[] arrstring2 = new String[13909 & 173];
        arrstring2[10752 & -32320] = Class_18965.Method_18982("\u0087\u0084\u0082\u0084\u00a6\u0082");
        arrstring2[6401 & -16335] = Class_18965.Method_18985("\u2010\u2001\u201a\u2013\u2010\u201b\u201a");
        arrstring2[12318 & 3394] = Class_18965.Method_19024("\u9e04\u9e04\u9e01\u9e0c\u9e02\u9e00\u9e06\u9e0a\u9e0f\u9e0f");
        arrstring2[18435 & -27233] = Class_18965.Method_19012("\u0289\u0288\u028a\u0283\u0284\u028d\u0286\u0287\u0280\u0288");
        arrstring2[26917 & -32252] = Class_18965.Method_18990("\ua5b4\ua5b0\ua5b7\ua5b4\ua5a2\ua5b1\ua5b0\ua5b7\ua5ad");
        Class_33007[] arrclass_330072 = new Class_33007[-28666 & 1797];
        arrclass_330072[144 & 7265] = new Class_33007(17 & 97, Class_9265.Field_9319);
        arrclass_330072[20481 & 361] = new Class_33007(2325 & -32091, Class_9265.Field_9272);
        arrclass_330072[4162 & 18995] = new Class_33007(230 & -15122, Class_9265.Field_9446);
        arrclass_330072[1027 & -13821] = new Class_33007(8329 & 97, Class_9265.Field_9414);
        Class_18965.Method_18979(Class_18965.Method_19014("\u4001\u4000\u4001\u4001\u4000\u4001\u4000\u4001\u4000\u4000\u4001\u4001\u4001\u4000\u4000\u4000"), Class_1956.Method_1981(Class_9265.Field_9446), Class_17281.Field_17299, Arrays.asList(arrstring2), arrclass_330072);
        String[] arrstring3 = new String[3 & 10530];
        arrstring3[316 & -22910] = Class_18965.Method_19001("\u9870\u9878\u9878\u9878\u9874\u984c\u9824");
        arrstring3[3337 & 547] = Class_18965.Method_19022("\u8028\u8025\u8020\u8025\u802d\u802f\u802e\u802e\u802a\u8023\u8028\u8022\u802f");
        Class_33007[] arrclass_330073 = new Class_33007[1317 & 6157];
        arrclass_330073[-31935 & 25632] = new Class_33007(122 & -30114, Class_9265.Field_9286);
        arrclass_330073[16901 & 4233] = new Class_33007(-15739 & 293, Class_9265.Field_9394);
        arrclass_330073[322 & -31102] = new Class_33007(30725 & 1285, Class_9265.Field_9272);
        arrclass_330073[4747 & -5037] = new Class_33007(8261 & 19485, Class_9265.Field_9446);
        arrclass_330073[18564 & 13318] = new Class_33007(-16249 & 15649, Class_9265.Field_9414);
        Class_18965.Method_18979(Class_18965.Method_18975("DQGWE\u0014BSI\\_"), Class_10527.Field_10695, Class_17281.Field_17338, Arrays.asList(arrstring3), arrclass_330073);
        String[] arrstring4 = new String[1803 & -2040];
        arrstring4[545 & 28682] = Class_18965.Method_18992("\u8860\u8861\u8860\u8861\u8860\u8861\u8860");
        arrstring4[265 & 4177] = Class_18965.Method_18987("\ud041\ud049\ud048\ud049\ud040\ud049\ud000");
        arrstring4[4622 & 17507] = Class_18965.Method_19010("\u8022\u8023\u8026\u8023\u8020\u8023\u8024\u8021\u8028\u8029");
        arrstring4[16867 & 8195] = Class_18965.Method_19006("\u0010\u0015\u0010\u0005\u0000\u0001\u0004\u0001\f\r");
        arrstring4[13452 & 4] = Class_18965.Method_18974("\u2408\u2408\u2408\u2400\u2410\u2408\u2400\u2400\u2410");
        arrstring4[14581 & 1285] = Class_18965.Method_19011("\u3502\u3502\u3508\u3500\u3502\u3508\u3508");
        arrstring4[-11514 & 151] = Class_18965.Method_19018("\u0400\u0408\u0402\u040a");
        arrstring4[20639 & 1351] = Class_18965.Method_19017("\u0081\u0084\u0081\u0084\u00a0\u0081\u0084\u0084\u0088");
        Class_33007[] arrclass_330074 = new Class_33007[-7164 & 4132];
        arrclass_330074[4612 & -22496] = new Class_33007(4357 & 3075, Class_9265.Field_9319);
        arrclass_330074[7937 & 16429] = new Class_33007(23 & 25667, Class_9265.Field_9272);
        arrclass_330074[530 & 34] = new Class_33007(571 & 507, Class_9265.Field_9446);
        arrclass_330074[12611 & 2051] = new Class_33007(25859 & -30699, Class_9265.Field_9414);
        Class_18965.Method_18988(Class_18965.Method_18980("\u3245\u3245\u3247\u3243\u3245\u3244\u3242\u3247\u3244"), Class_1956.Method_1981(Class_9265.Field_9278), Class_5341.Field_5345.Method_5356(), Class_17281.Field_17318, Arrays.asList(arrstring4), arrclass_330074);
        String[] arrstring5 = new String[1102 & 24851];
        arrstring5[8226 & -15359] = Class_18965.Method_18989("\u9a09\u9a01\u9a03\u9a02\u9a0c\u9a0d\u9a0e");
        arrstring5[12293 & 2697] = Class_18965.Method_18997("\u2271\u2270\u2270\u2270\u2274\u2244\u2224");
        Class_33007[] arrclass_330075 = new Class_33007[1197 & 14343];
        arrclass_330075[-28528 & 776] = new Class_33007(-29535 & 597, Class_9265.Field_9458);
        arrclass_330075[517 & 21513] = new Class_33007(289 & 12421, Class_9265.Field_9319);
        arrclass_330075[2067 & 24610] = new Class_33007(18883 & 9235, Class_9265.Field_9272);
        arrclass_330075[8227 & 4739] = new Class_33007(-32709 & 16699, Class_9265.Field_9446);
        arrclass_330075[2124 & 16677] = new Class_33007(-22495 & 16769, Class_9265.Field_9414);
        Class_18965.Method_18979(Class_18965.Method_18995(":\u0006\u0004\u001c\u0014\f$\u0006\u0006\u000e\u000e\u0004\u0000"), Class_1956.Method_1981(Class_9265.Field_9458), Class_17281.Field_17308, Arrays.asList(arrstring5), arrclass_330075);
        String[] arrstring6 = new String[8194 & -32510];
        arrstring6[2080 & -3304] = Class_18965.Method_19002("\u9814\u9800\u9804\u9805\u9805\u9800\u9801");
        arrstring6[10369 & 1071] = Class_18965.Method_19021("!! ! \u0001 ");
        Class_33007[] arrclass_330076 = new Class_33007[87 & 1795];
        arrclass_330076[-30632 & 1314] = new Class_33007(2049 & 24885, Class_9265.Field_9319);
        arrclass_330076[5633 & 16547] = new Class_33007(-15213 & 10543, Class_9265.Field_9272);
        arrclass_330076[17235 & 6154] = new Class_33007(16430 & 7043, Class_9265.Field_9373);
        Class_18965.Method_18979(Class_18965.Method_18996("\u0005\b\u0003\u0003\b\b\u000b\u0002\f\f\u000f\u000f\u0004\t"), Class_10527.Field_10658, Class_17281.Field_17318, Arrays.asList(arrstring6), arrclass_330076);
        String[] arrstring7 = new String[4622 & 16662];
        arrstring7[2181 & 560] = Class_18965.Method_19019("\ua009\ua006\ua001\ua001\ua00e\ua008\ua008");
        arrstring7[13353 & 16901] = Class_18965.Method_19023("\u4310\u4311\u4312\u4313\u4314\u4305\u4306");
        arrstring7[6346 & 9010] = Class_18965.Method_18983("\u3200\u3201\u3200\u3201\u3204\u3205\u3204\u3205\u3208\u3209");
        arrstring7[-24105 & 4099] = Class_18965.Method_19009("\ud680\ud683\ud683\ud68a\ud68d\ud684\ud68d\ud68e\ud68b\ud683");
        arrstring7[-29396 & 20484] = Class_18965.Method_18993("\u81aa\u81ae\u81a9\u81a2\u81a0\u81ab\u81a2\u81a5\u81ab");
        arrstring7[-16379 & 4901] = Class_18965.Method_19008("\u6034\u6024\u6036\u6036\u6035\u6036\u6036");
        Class_33007[] arrclass_330077 = new Class_33007[2311 & 9268];
        arrclass_330077[8260 & -29669] = new Class_33007(5260 & -6072, Class_9265.Field_9394);
        arrclass_330077[19973 & 211] = new Class_33007(-16588 & 55, Class_9265.Field_9366);
        arrclass_330077[-32558 & 17955] = new Class_33007(2371 & -23877, Class_9265.Field_9446);
        arrclass_330077[8203 & 22675] = new Class_33007(19521 & 12549, Class_9265.Field_9414);
        Class_18965.Method_18979(Class_18965.Method_18978("\uc181\uc1a0\uc1a2\uc1a2\uc1a1\uc1a1"), Class_1956.Method_1981(Class_9265.Field_9394), Class_17281.Field_17321, Arrays.asList(arrstring7), arrclass_330077);
        Class_33007[] arrclass_330078 = new Class_33007[8275 & 4747];
        arrclass_330078[21632 & 2312] = new Class_33007(14388 & -31691, Class_9265.Field_9366);
        arrclass_330078[-30071 & 8481] = new Class_33007(-22141 & 4611, Class_9265.Field_9446);
        arrclass_330078[4102 & 1554] = new Class_33007(259 & -21503, Class_9265.Field_9414);
        Class_18965.Method_19020(Class_18965.Method_18984("\u0122\u0114\u0114\u0102\u0100\u0112\u0112\u0110\u0118\u012b\u011d\u0118\u0118\u010c"), Class_10527.Field_10564, Class_17281.Field_17321, arrclass_330078);
    }
}

