/*
 * Decompiled with CFR 0.145.
 */
import java.awt.geom.Point2D;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Class_33358
extends Class_1490 {
    private int Field_33359 = 17152 & 12530;
    public Class_18129 Field_33360;
    private Class_42376 Field_33361;
    public Class_37997 Field_33362;
    private long Field_33363 = 559989000L & 7548059211616620052L;
    public Class_1490 Field_33364;
    public String Field_33365 = Class_33358.Method_33371("\u0802\u0801\u0803\u0801\u0805\u0807\u0805\u0807\u0809\u080a\u0809\u080b\u080f\u080d\u080e\u080e\u0813\u0813\u0811");
    private int Field_33366 = 17413 & 8232;
    public Class_39702 Field_33367;
    private Class_42376 Field_33368 = null;

    private Class_42376 Method_33369() {
        Class_14246[] arrclass_14246 = this.Field_33362.Field_37999;
        int n = arrclass_14246.length;
        for (int i = 131 & 284; i < n; ++i) {
            Class_14246 class_14246 = arrclass_14246[i];
            if (!(class_14246 instanceof Class_28000)) continue;
            Class_42376[] arrclass_42376 = ((Class_28000)class_14246).Field_28002;
            int n2 = arrclass_42376.length;
            for (int j = -20460 & 832; j < n2; ++j) {
                Class_42376 class_42376 = arrclass_42376[j];
                if (!class_42376.Method_42405()) continue;
                return class_42376;
            }
        }
        return null;
    }

    public void Method_33370() {
        this.Field_33362 = new Class_37997(this, this.\u0000strictfp);
        this.Field_33365 = Class_9802.Method_9806(Class_33358.Method_33372("\ue445\ue453\ue454\ue440\ue441\ue441\ue457\ue403\ue448\ue44f\ue449\ue45b\ue44f\ue449\ue44b\ue45d\ue453\ue450\ue453\ue445\ue457\ue443\ue450\ue450"), new Object[15370 & 768]);
        this.\u0000strictfp.clear();
        this.\u0000strictfp.add(new Class_42376(2284 & -14888, this.\u0000= final / (-32742 & 1030) - (-12901 & 223), this.\u0000, ` - (10269 & -32737), 158 & -15978, 1085 & 21012, Class_9802.Method_9806(Class_33358.Method_33377("\u0828\u0828\u0820\u0820\u082c\u0824\u0824\u082c"), new Object[16384 & 1540])));
        this.Field_33361 = new Class_42376(27595 & 233, this.\u0000= final / (-7902 & 159) - (-16193 & 6363) + (16547 & 7588), this.\u0000, ` - (16799 & 11357), 17118 & -28490, 4374 & 1044, Class_33358.Method_33380("Sdpfu"));
        this.\u0000strictfp.add(this.Field_33361);
        this.Field_33367.Field_39732.Field_8849.Method_11237().Field_42388 = this.\u0000strictfp.Field_72 != null ? 27865 & 5 : 10421 & 1024;
        this.Field_33367.Field_39732.Method_9215();
    }

    private static String Method_33371(String string) {
        int n = 25547;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_33358.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_33372(String string) {
        int n = 17991;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_33358.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_33373() {
        super.Method_1544();
        this.Field_33362.\u0000, for();
    }

    public void Method_33374(int n, int n2, float f) {
        this.\u0000, 2();
        this.Field_33362.Method_38022(n, n2, f);
        this.\u0000strictfp(this.\u0000strictfp, this.Field_33365, this.\u0000= final / (-32590 & 259), -32364 & 25137, 50331647 & -2063597569);
        this.Field_33361.Field_42388 = !this.Field_33367.Field_39732.Field_8873 ? 17473 & 14595 : -32726 & 16660;
        super.Method_1545(n, n2, f);
        if (this.Field_33368 != null && this.Field_33368 == this.Method_33369() && Math.abs(n - this.Field_33359) <= (-16123 & 4135) && Math.abs(n2 - this.Field_33366) <= (4373 & -32755)) {
            Class_11220 class_11220;
            if (System.currentTimeMillis() >= this.Field_33363 + (954219196L & 1073939133L) && (class_11220 = (Class_11220)this.Field_33367.Field_39732.Field_8868.get(this.Field_33368.Field_42392)) != null && class_11220.Field_11221 != null) {
                reference var10_10;
                int n3;
                int n4 = this.\u0000= final / (4099 & 78) - (10647 & 20630);
                int n5 = this.\u0000, ` / (4134 & 19398) - (16485 & 8837);
                if (n2 <= n5 + (4194 & 16502)) {
                    n5 += 105;
                }
                int n6 = n4 + (25758 & -32521) + (1271 & 29590);
                int n7 = 8706 & 4124;
                for (n3 = -3768 & 3127; n3 < class_11220.Field_11221.length; ++n3) {
                    var10_10 = class_11220.Field_11221[n3];
                    List list = this.\u0000strictfp.Method_28733(var10_10, n6 - n4 - (31754 & 587));
                    for (Object object : list) {
                        n7 += 11;
                    }
                    n7 += 13;
                }
                n3 = n5 + n7;
                if (n3 > this.\u0000, `) {
                    int n8 = n3 - this.\u0000, `;
                    n5 -= n8;
                    n5 = Math.max(22538 & 164, n5);
                    n3 = n5 + n7;
                }
                this.\u0000, `(n4, n5, n6, n3, -29073403 & -536804784, -343400416 & -197017470);
                var10_10 = (reference)(16385 & -28150);
                for (int i = 26721 & 12; i < class_11220.Field_11221.length; ++i) {
                    Object object;
                    String string = class_11220.Field_11221[i];
                    object = this.\u0000strictfp.Method_28733(string, n6 - n4 - (20522 & -23281));
                    Iterator iterator = object.iterator();
                    while (iterator.hasNext()) {
                        String string2 = (String)iterator.next();
                        this.\u0000strictfp.Method_28729(string2, n4 + (517 & 27781), n5 + (26901 & 1125) + var10_10, 903732703 & -1025646627);
                        var10_10 += 11;
                    }
                    var10_10 += 13;
                }
            }
        } else {
            this.Field_33359 = n;
            this.Field_33366 = n2;
            this.Field_33368 = this.Method_33369();
            this.Field_33363 = System.currentTimeMillis();
        }
    }

    public Class_33358(Class_1490 class_1490, Class_39702 class_39702) {
        this.Field_33364 = class_1490;
        this.Field_33367 = class_39702;
    }

    private static String Method_33375(String string) {
        int n = 11130;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_33358.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected void Method_33376(int n, int n2, int n3) {
        if (this.Field_33360 != null) {
            this.Field_33360.Method_18139((-100 & -3) + n3);
            this.Field_33360 = null;
            this.Field_33367.Field_39732.Method_9085();
        } else if (n3 != 0) {
            if (!this.Field_33362.Method_38020(n, n2, n3)) {
                super.Method_1537(n, n2, n3);
            }
        } else if (!this.Field_33362.\u0000, `(n, n2, n3)) {
            super.Method_1537(n, n2, n3);
        }
    }

    private static String Method_33377(String string) {
        int n = 12675;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_33358.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_33378() {
        super.Method_1533();
        this.Field_33367.Field_39732.Method_9085();
    }

    protected void Method_33379(char c, int n) {
        if (this.Field_33360 != null) {
            if (n == (17155 & -31679)) {
                this.Field_33360.Method_18139(268 & -32576);
            } else if (n != 0) {
                this.Field_33360.Method_18139(n);
            } else if (c > '\u0000') {
                this.Field_33360.Method_18139(c + (16834 & -19196));
            }
            this.Field_33360 = null;
            this.Field_33367.Field_39732.Method_9085();
        } else {
            super.Method_1525(c, n);
        }
    }

    private static String Method_33380(String string) {
        int n = 6574;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_33358.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_33381() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_33358.Method_33375("\ue084\ue089\ue094\ue089\ue084\ue089\ue090\ue081\ue084\ue08d\ue098\ue089\ue088\ue081"));
    }

    protected void Method_33382(Class_42376 class_42376) {
        if (class_42376.Field_42392 == (733 & -20246)) {
            this.\u0000strictfp.Method_218(this.Field_33364);
        } else if (class_42376.Field_42392 == (8395 & 4297)) {
            for (Class_11220 object : this.Field_33367.Field_39732.Field_8868) {
                if (object.Method_11245()) continue;
                object.Method_11243();
            }
            for (Map.Entry entry : ((HashMap)this.Field_33367.Field_39732.Field_8849.Method_11230()).entrySet()) {
                try {
                    Class_37430 class_37430 = (Class_37430)Class_18.Field_89.Field_105.Field_45431.Field_19622.get(entry.getKey());
                    class_37430.Method_37447(((Point2D.Double)entry.getValue()).x, ((Point2D.Double)entry.getValue()).y);
                }
                catch (Exception exception) {}
            }
            this.Field_33367.Field_39732.Field_8873 = -16383 & 933;
            this.Field_33367.Field_39732.Method_9085();
        } else {
            this.Field_33362.\u0000strictfp(class_42376);
        }
    }

    protected void Method_33383(int n, int n2, int n3) {
        if (n3 != 0 || !this.Field_33362.\u0000strictfp(n, n2, n3)) {
            super.Method_1518(n, n2, n3);
        }
    }
}

