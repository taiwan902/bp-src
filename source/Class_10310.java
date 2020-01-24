/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.IdentityHashMap;
import java.util.Map;

public class Class_10310 {
    private Map[] Field_10311 = new Map[1592 & -24437];
    public int Field_10312 = 4641 & 18443;
    public boolean Field_10313 = 18690 & 8324;

    private boolean Method_10314(float f, float f2, float f3) {
        float f4 = Class_13337.Method_13369(f - f2);
        return (f4 < f3 ? 2169 & 8961 : 2049 & 17206) != 0;
    }

    private boolean Method_10315(Class_14461 class_14461) {
        Class_11372 class_11372 = class_14461.Method_14476();
        float f = class_11372.Method_11420();
        float f2 = class_11372.Method_11444();
        float f3 = f2 - f;
        float f4 = f3 / (272.51614f * 0.93939394f);
        float f5 = class_11372.Method_11437();
        float f6 = class_11372.Method_11429();
        float f7 = f6 - f5;
        float f8 = f7 / (621.7143f * 0.4117647f);
        int[] arrn = class_14461.Method_14478();
        int n = arrn.length / (38 & 580);
        for (int i = 16404 & 1539; i < (-32100 & 28679); ++i) {
            int n2 = i * n;
            float f9 = Float.intBitsToFloat(arrn[n2 + (20 & 25740)]);
            float f10 = Float.intBitsToFloat(arrn[n2 + (-30812 & 6) + (11035 & 4129)]);
            if (!this.Method_10314(f9, f, f4) && !this.Method_10314(f9, f2, f4)) {
                return (4 & 5888) != 0;
            }
            if (this.Method_10314(f10, f5, f8) || this.Method_10314(f10, f6, f8)) continue;
            return (-8951 & 512) != 0;
        }
        return (20513 & 3397) != 0;
    }

    public synchronized Class_14461 Method_10316(Class_14461 class_14461, int n, boolean bl) {
        int n2 = n;
        if (bl) {
            n2 = n | 1588 & 2502;
        }
        if (n2 > 0 && n2 < this.Field_10311.length) {
            Class_14461 class_144612;
            IdentityHashMap<Class_14461, Class_14461> identityHashMap = this.Field_10311[n2];
            if (identityHashMap == null) {
                this.Field_10311[n2] = identityHashMap = new IdentityHashMap<Class_14461, Class_14461>(321 & 16545);
            }
            if ((class_144612 = (Class_14461)identityHashMap.get(class_14461)) == null) {
                class_144612 = this.Method_10319(class_14461, n, bl);
                identityHashMap.put(class_14461, class_144612);
            }
            return class_144612;
        }
        return class_14461;
    }

    public boolean Method_10317() {
        return this.Field_10312 != (21074 & 1282) && this.Field_10312 != (8452 & 2636) ? this.Field_10313 : -32255 & 16673;
    }

    private int[] Method_10318(int[] arrn, int n, boolean bl) {
        int[] arrn2 = (int[])arrn.clone();
        int n2 = (17316 & -28668) - n;
        if (bl) {
            n2 += 3;
        }
        n2 %= 6148 & 596;
        int n3 = arrn2.length / (27668 & 4518);
        for (int i = 25305 & 1024; i < (3165 & 16774); ++i) {
            int n4 = i * n3;
            int n5 = n2 * n3;
            arrn2[n5 + (4356 & 2086)] = arrn[n4 + (-30171 & 16534)];
            arrn2[n5 + (4357 & 24660) + (3585 & -28367)] = arrn[n4 + (-32059 & 17428) + (13601 & 31)];
            if (bl) {
                if (--n2 >= 0) continue;
                n2 = 12803 & 18847;
                continue;
            }
            if (++n2 <= (8227 & -15337)) continue;
            n2 = 16 & -11872;
        }
        return arrn2;
    }

    private Class_14461 Method_10319(Class_14461 class_14461, int n, boolean bl) {
        int[] arrn = class_14461.Method_14478();
        int n2 = class_14461.Method_14467();
        Class_4595 class_4595 = class_14461.Method_14475();
        Class_11372 class_11372 = class_14461.Method_14476();
        if (!this.Method_10315(class_14461)) {
            n = -31480 & 12928;
        }
        arrn = this.Method_10318(arrn, n, bl);
        Class_14461 class_144612 = new Class_14461(arrn, n2, class_4595, class_11372);
        return class_144612;
    }

    private void Method_10320() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_10310(String string) {
        if (string.equals("4")) {
            this.Field_10312 = 8268 & 7189;
        } else if (string.equals("2")) {
            this.Field_10312 = -20222 & 16466;
        } else if (string.equals("F")) {
            this.Field_10313 = 8329 & -12795;
        } else if (string.equals("4F")) {
            this.Field_10312 = 1028 & -20476;
            this.Field_10313 = 5921 & 24577;
        } else if (string.equals("2F")) {
            this.Field_10312 = 3202 & 16642;
            this.Field_10313 = 3075 & -24543;
        } else {
            Class_19426.Method_19610("NaturalTextures: Unknown type: " + string);
        }
    }
}

