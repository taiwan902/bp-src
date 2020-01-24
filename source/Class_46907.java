/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.input.Keyboard
 */
import internal.org.lwjgl.input.Keyboard;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_46907
extends Class_1906
implements Class_37497 {
    private Class_37781 Field_46908;
    private Class_38813 Field_46909;
    private static final Class_2080 Field_46910 = new Class_2080(Class_46907.Method_46917("\u1900\u1900\u1904\u1901\u1905\u1903\u1905\u1902\u1903\u1902\u1901\u1904\u1907\u1902\u1907\u1907\u1910\u1914\u1915\u1913\u1915\u1913\u1917\u1910\u1912\u1913\u1915\u1911\u1916\u1911\u1916\u1916"));
    private Class_9871 Field_46911;

    public void Method_46912() {
        super.Method_1946();
        Keyboard.enableRepeatEvents((-26299 & 521) != 0);
        int n = (this.\u0000= final - this.\u0000, for) / (2254 & 24578);
        int n2 = (this.\u0000, ` - this.\u0000= int) / (-18654 & 2050);
        this.Field_46909 = new Class_38813(2308 & 8728, this.\u0000strictfp, n + (-22466 & 4479), n2 + (89 & 18744), 2407 & -28425, 1804 & -8164);
        this.Field_46909.Method_38863(-1 & -1);
        this.Field_46909.Method_38842(-1 & -1);
        this.Field_46909.Method_38837((-32624 & 5122) != 0);
        this.Field_46909.Method_38859(-23970 & 2111);
        this.\u0000strictfp.Method_8316(this);
        this.\u0000strictfp.Method_8306(this);
    }

    public void Method_46913() {
        super.Method_1955();
        Keyboard.enableRepeatEvents((1330 & 5) != 0);
        this.\u0000strictfp.Method_8316(this);
    }

    public void Method_46914(int n, int n2, float f) {
        super.Method_1948(n, n2, f);
        Class_16867.Method_16931();
        Class_16867.Method_16952();
        this.Field_46909.Method_38849();
    }

    protected void Method_46915(char c, int n) {
        if (this.Field_46909.Method_38854(c, n)) {
            this.Method_46920();
        } else {
            super.Method_1939(c, n);
        }
    }

    private void Method_46916() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static String Method_46917(String string) {
        int n = 25136;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_46907.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected void Method_46918(float f, int n, int n2) {
        Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
        this.\u0000strictfp.Method_253().Method_34707(Field_46910);
        int n3 = (this.\u0000= final - this.\u0000, for) / (-20182 & 2179);
        int n4 = (this.\u0000, ` - this.\u0000= int) / (-28158 & 17426);
        this.\u0000strictfp(n3, n4, 1026 & 6597, 772 & 16450, this.\u0000, for, this.\u0000= int);
        this.\u0000strictfp(n3 + (2111 & 17723), n4 + (-32652 & 24599), 24 & 24576, this.\u0000= int + (this.Field_46911.\u0000strictfp(1045 & -30678).Method_26439() ? 2154 & -3452 : 785 & 122), 110 & 26222, 8596 & -32229);
        if ((this.Field_46911.\u0000strictfp(6170 & -31744).Method_26439() || this.Field_46911.\u0000strictfp(9171 & 1025).Method_26439()) && !this.Field_46911.\u0000strictfp(550 & 6154).Method_26439()) {
            this.\u0000strictfp(n3 + (5347 & -30621), n4 + (45 & 18799), this.\u0000, for, -16253 & 4416, 17694 & 10269, 13623 & 2069);
        }
    }

    public Class_46907(Class_37781 class_37781, Class_283 class_283) {
        super(new Class_9871(class_37781, class_283, Class_18.Field_89.Field_48));
        this.Field_46908 = class_37781;
        this.Field_46911 = (Class_9871)this.\u0000strictfp;
    }

    protected void Method_46919(int n, int n2) {
        Class_16867.Method_16931();
        Class_16867.Method_16952();
        this.\u0000strictfp.Method_28692(Class_9802.Method_9806("container.repair", new Object[-28637 & 1032]), 9470 & 2364, -18169 & 1030, 541414508 & -1925168686);
        if (this.Field_46911.Field_9879 > 0) {
            int n3 = 971570995 & -2138570976;
            int n4 = 1643 & 4485;
            Object[] arrobject = new Object[4101 & 17153];
            arrobject[2050 & 24744] = this.Field_46911.Field_9879;
            String string = Class_9802.Method_9806("container.repair.cost", arrobject);
            if (this.Field_46911.Field_9879 >= (-31896 & 44) && !this.\u0000strictfp.Field_48.\u0000strictfp.Method_18094()) {
                string = Class_9802.Method_9806("container.repair.expensive", new Object[4354 & -8064]);
                n3 = 67068256 & 83847280;
            } else if (!this.Field_46911.\u0000strictfp(8706 & 20618).Method_26439()) {
                n4 = 129 & 25108;
            } else if (!this.Field_46911.\u0000strictfp(16455 & 8114).Method_26440(this.Field_46908.Field_37786)) {
                n3 = 16736363 & 419424608;
            }
            if (n4 != 0) {
                int n5 = -12054480 & -14614526 | (n3 & (285015549 & 16776958)) >> (17250 & -31713) | n3 & (-8347319 & -16759792);
                int n6 = this.\u0000, for - (-27384 & 88) - this.\u0000strictfp.Method_28715(string);
                int n7 = 8259 & 2375;
                if (this.\u0000strictfp.Method_28716()) {
                    Class_46907.\u0000, `((int)(n6 - (-31733 & 6855)), (int)(n7 - (-8062 & 7178)), (int)(this.\u0000, for - (-24497 & 135)), (int)(n7 + (-28257 & 17930)), (int)(-13754048 & -16743260));
                    Class_46907.\u0000, `((int)(n6 - (13458 & 18754)), (int)(n7 - (39 & 9921)), (int)(this.\u0000, for - (72 & -32760)), (int)(n7 + (24635 & 6221)), (int)(-4244549 & -12895429));
                } else {
                    this.\u0000strictfp.Method_28692(string, n6, n7 + (21189 & -32735), n5);
                    this.\u0000strictfp.Method_28692(string, n6 + (16897 & -32479), n7, n5);
                    this.\u0000strictfp.Method_28692(string, n6 + (16553 & 12355), n7 + (-27775 & 2085), n5);
                }
                this.\u0000strictfp.Method_28692(string, n6, n7, n3);
            }
        }
        Class_16867.Method_16918();
    }

    private void Method_46920() {
        String string = this.Field_46909.Method_38848();
        Class_26421 class_26421 = this.Field_46911.\u0000strictfp(-29883 & 8242);
        if (class_26421 != null && class_26421.Method_26439() && !class_26421.Method_26430().Method_23851() && string.equals(class_26421.Method_26430().Method_23899())) {
            string = "";
        }
        this.Field_46911.Method_9885(string);
        this.\u0000strictfp.Field_48.Field_1390.Method_20245(new Class_28799("MC|ItemName", new Class_29900(Class_16620.Method_16633()).Method_29960(string)));
    }

    public void Method_46921(Class_8295 class_8295, int n, int n2) {
    }

    public void Method_46922(Class_8295 class_8295, Class_4961 class_4961) {
    }

    public void Method_46923(Class_8295 class_8295, List list) {
        this.Method_46924(class_8295, 13313 & 2642, class_8295.Method_8324(16872 & -20478).Method_26430());
    }

    public void Method_46924(Class_8295 class_8295, int n, Class_23823 class_23823) {
        if (n == 0) {
            this.Field_46909.Method_38853(class_23823 == null ? "" : class_23823.Method_23899());
            this.Field_46909.Method_38862((class_23823 != null ? -32631 & 16385 : -31712 & 2704) != 0);
            if (class_23823 != null) {
                this.Method_46920();
            }
        }
    }

    protected void Method_46925(int n, int n2, int n3) {
        super.Method_1952(n, n2, n3);
        this.Field_46909.Method_38855(n, n2, n3);
    }
}

