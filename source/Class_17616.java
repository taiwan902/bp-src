/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.input.Keyboard
 */
import internal.org.lwjgl.input.Keyboard;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;

public class Class_17616
extends Class_1490 {
    public Class_15195 Field_17617 = null;
    private String Field_17618 = Class_17616.Method_17645("\u8855\u8870\u8860\u8865\u8870\u8831\u8871\u8870\u8875\u8875\u8860\u8864");
    public Class_38813 Field_17619;
    public Class_39702 Field_17620;
    public Class_1490 Field_17621;
    public Class_31683 Field_17622;
    private Class_42376 Field_17623;
    private String Field_17624 = "";

    private static String Method_17625(String string) {
        int n = 6009;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17616.class, 7);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_17626() {
        super.Method_1544();
        this.Field_17622.\u0000, for();
    }

    public void Method_17627() {
        super.Method_1533();
        this.Field_17620.Field_39732.Method_9085();
        this.Field_17620.Field_39732.Field_8865.Method_13740();
        Class_8264.Method_8281();
    }

    protected void Method_17628(int n, int n2, int n3) {
        if (n3 != 0 || !this.Field_17622.\u0000strictfp(n, n2, n3)) {
            super.Method_1518(n, n2, n3);
        }
    }

    private static String Method_17629(String string) {
        int n = 5308;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17616.class, 10);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_17630() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_17616.Method_17636("\u40b0\u40b3\u4082\u40b1\u4090\u4091\u4080\u4093\u4092\u4093\u40a2\u4093\u4092\u4093"));
    }

    private static String Method_17631(String string) {
        int n = 7627;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17616.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_17632(String string) {
        int n = 20161;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17616.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_17616(Class_1490 class_1490, Class_39702 class_39702) {
        this.Field_17621 = class_1490;
        this.Field_17620 = class_39702;
    }

    protected void Method_17633(char c, int n) {
        if (this.Field_17617 != null) {
            if (n == (2123 & 289)) {
                this.Field_17617.Method_15218(192 & 2050);
            } else if (n != 0) {
                this.Field_17617.Method_15218(n);
            } else if (c > '\u0000') {
                this.Field_17617.Method_15218(c + (-29872 & 1410));
            }
            this.Field_17617 = null;
            this.Field_17620.Field_39732.Field_8865.Method_13740();
            this.Field_17620.Field_39732.Method_9085();
            return;
        }
        super.Method_1525(c, n);
        if (this.Field_17619 == null) {
            return;
        }
        this.Field_17619.Method_38854(c, n);
        String string = this.Field_17619.Method_38848();
        if (string.isEmpty() || Class_14775.Field_14780.Method_14787(string)) {
            this.Field_17619.Method_38863(14737888 & 350286560);
        } else {
            this.Field_17619.Method_38863(-2046856336 & 50328696);
        }
        for (int i = -20159 & 3712; i < this.Field_17622.Field_31684.size(); ++i) {
            if (((Class_15195)this.Field_17622.Field_31684.get((int)i)).Field_15199 != this.Field_17619) continue;
            ArrayList arrayList = (ArrayList)this.Field_17620.Field_39732.Field_8851.Method_11230();
            arrayList.set(i * (17490 & 38), string);
            this.Field_17620.Field_39732.Field_8851.Method_11246(arrayList);
            return;
        }
    }

    public void Method_17634() {
        if (this.Field_17619 != null) {
            this.Field_17619.Method_38858((8193 & 36) != 0);
            this.Field_17619.Method_38870();
            this.Field_17619 = null;
            Keyboard.enableRepeatEvents((632 & -31609) != 0);
        }
    }

    private static String Method_17635(String string) {
        int n = 5291;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17616.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_17636(String string) {
        int n = 21973;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17616.class, 12);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_17637(String string) {
        int n = 4552;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17616.class, 8);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_17638(String string) {
        int n = 28044;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17616.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_17639() {
        this.Field_17622 = new Class_31683(this, this.\u0000strictfp);
        this.\u0000strictfp.clear();
        this.\u0000strictfp.add(new Class_42376(-16125 & 49, this.\u0000= final / (2066 & -16378) - (15795 & -15814), this.\u0000, ` - (1789 & 28703), -29084 & 228, 9140 & 1046, Class_9802.Method_9806(Class_17616.Method_17631("\u4c49\u4c4b\u4c41\u4c02\u4c4e\u4c45\u4c46\u4c4d"), new Object[11298 & 4104])));
        this.Field_17623 = new Class_42376(16478 & 8450, this.\u0000= final / (1099 & 12470) + (2060 & -15066) + (-32710 & 14451), this.\u0000, ` - (703 & 26909), 12654 & 16613, 276 & -28644, Class_17616.Method_17632("\u04a1\u0480\u0480\u0480\u0485"));
        this.\u0000strictfp.add(this.Field_17623);
        boolean bl = Class_17616.Method_17635("\u3998\u3980\u3993\u399a\u3980").equals(Class_9802.Method_9806(Class_17616.Method_17641("\u7642\u7647\u7640\u7641\u7643\u7647\u7641\u7643\u7608\u764d\u7649\u764a\u764b"), new Object[20996 & 1024]));
        this.Field_17618 = bl ? Class_17616.Method_17638("\u34f2\u34d7\u34c7\u34c0\u34d3\u3492\u34d2\u34d1\u34d8\u34da\u344f\u34cb") : Class_17616.Method_17642("\u0821\u0801\u0803\u0802\u0810\u0840\u0803\u0803\u0818\u0818");
        this.Field_17624 = bl ? Class_17616.Method_17625("\u1b20\u1b18\u1b06\u1b12\u1b14\u1b0c\u1b0e\u1a66\u1b48\u1b08\u1b12\u1b0a\u1b00\u1b04\u1b06\u1b02\u1a64\u1b40\u1b1a\u1b02\u1b18\u1b0c\u1b02\u1b02\u1b10\u1b04\u1b06\u1b0e\u1b48\u1b18\u1a6e\u1b4a\u1b0c\u1b08\u1b06\u1b06\u1b0c\u1b18\u1b16\u1b0e\u1b04\u1b04\u1b06\u1b0e\u1b48\u1b08\u1b02\u1b06\u1b04\u1b18\u1b42\u1b12\u1b10\u1b18\u1b06\u1b1a\u1b48\u1b08\u1b02\u1b1e\u1b1c\u1b08\u1b06\u1b06\u1b58\u1b00\u1b52\u1b46\u1b50\u1b54\u1b46\u1b52\u1b08\u1b48\u1a2e\u1b4e\u1a50\u1b08\u1b4e\u1b46\u1b4c\u1b58\u1a7a\u1b4e\u1b4c\u1b44\u1b02\u1b56\u1b58\u1b5c\u1b4a\u1b5e\u1b40\u1b4c\u1b46\u1b42\u1b40") : Class_17616.Method_17637("\u1c00\u1c21\u1c21\u1c20\u1c20\u1c20\u1c21\u1c61\u1c29\u1c28\u1c29\u1c29\u1c38\u1c69\u1c28\u1c39\u1c20\u1c61\u1c20\u1c20\u1c31\u1c20\u1c20\u1c21\u1c69\u1c28\u1c29\u1c69\u1c39\u1c28\u1c29\u1c69\u1c21\u1c30\u1c61\u1c31\u1c21\u1c20\u1c61\u1c20\u1c38\u1c39\u1c39\u1c28\u1c29\u1c39\u1c69\u1c38\u1c20\u1c31\u1c31\u1c20\u1c31\u1c61\u1c20\u1c31\u1c69\u1c29\u1c28\u1c29\u1c28\u1c38\u1c29\u1c39\u1c61\u1c30\u1c20\u1c31\u1c31\u1c20\u1c21\u1c20\u1c38");
        this.\u0000strictfp.add(new Class_42376(-3709 & 3, this.\u0000= final / (8706 & -30678) - (29086 & -31590), this.\u0000, ` - (24607 & 29), 5870 & -32667, 28852 & 1885, bl ? Class_17616.Method_17647("\ua102\ua100\ua102\ua102\ua100") : Class_17616.Method_17629("\u2109\u2109\u210a")));
        Keyboard.enableRepeatEvents((5129 & 625) != 0);
    }

    protected void Method_17640(int n, int n2, int n3) {
        if (this.Field_17617 != null) {
            this.Field_17617.Method_15218((-66 & -99) + n3);
            this.Field_17617 = null;
            this.Field_17620.Field_39732.Method_9085();
            Class_8264.Method_8281();
        } else {
            boolean bl = this.Field_17622.\u0000, `(n, n2, n3);
            if (n3 != 0 || !bl) {
                super.Method_1537(n, n2, n3);
            }
        }
    }

    private static String Method_17641(String string) {
        int n = 12214;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17616.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_17642(String string) {
        int n = 30998;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17616.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_17643() {
        if (this.Field_17619 != null) {
            this.Field_17619.Method_38847();
        }
    }

    public void Method_17644(int n, int n2, float f) {
        this.\u0000, 2();
        this.Field_17622.Method_31686(n, n2, f);
        this.\u0000strictfp(this.\u0000strictfp, this.Field_17618, this.\u0000= final / (2570 & -16382), 1625 & -30448, 50331647 & -721420289);
        this.\u0000strictfp(this.\u0000strictfp, this.Field_17624, this.\u0000= final / (18626 & 12299), 8217 & 345, 16777215 & 1224736767);
        this.Field_17623.Field_42388 = !((ArrayList)this.Field_17620.Field_39732.Field_8851.Method_11230()).isEmpty() ? 8305 & 1419 : 1914 & 4;
        super.Method_1545(n, n2, f);
    }

    private static String Method_17645(String string) {
        int n = 13647;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17616.class, 11);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected void Method_17646(Class_42376 class_42376) {
        if (class_42376.Field_42392 == (4913 & 24579)) {
            this.Method_17634();
            this.\u0000strictfp.Method_218(this.Field_17621);
        } else if (class_42376.Field_42392 == (1027 & 10659)) {
            this.Method_17634();
            ArrayList arrayList = (ArrayList)this.Field_17620.Field_39732.Field_8851.Method_11230();
            arrayList.add("");
            arrayList.add("");
            this.Field_17620.Field_39732.Field_8851.Method_11246(arrayList);
            this.Field_17622.Field_31685.Field_17620.Field_39732.Field_8865.Method_13740();
            this.Field_17622.Field_31684.add(new Class_15195(this.\u0000strictfp, this.Field_17622, this.Field_17622.Field_31684.size()));
        } else if (class_42376.Field_42392 == (3 & 29106)) {
            this.Method_17634();
            this.Field_17622.Field_31684.clear();
            this.Field_17620.Field_39732.Field_8851.Method_11243();
            this.Field_17622.Field_31685.Field_17620.Field_39732.Field_8865.Method_13740();
        }
    }

    private static String Method_17647(String string) {
        int n = 119;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17616.class, 9);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

