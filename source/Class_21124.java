/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_21124 {
    private int[] Field_21125 = null;
    private Class_27481 Field_21126 = null;
    private Class_17281[] Field_21127 = null;
    public int[] Field_21128 = null;
    private int[] Field_21129 = null;
    private Class_2080 Field_21130 = null;
    private Class_2080[] Field_21131 = null;
    public int Field_21132 = 273 & -15865;

    public Class_21124(Class_2080 class_2080, int[] arrn, int[] arrn2, Class_17281[] arrclass_17281, Class_27481 class_27481) {
        this.Field_21130 = class_2080;
        this.Field_21125 = arrn;
        this.Field_21129 = arrn2;
        this.Field_21127 = arrclass_17281;
        this.Field_21126 = class_27481;
    }

    public Class_2080 Method_21133(Class_2080 class_2080, int n) {
        int n2 = 10272 & 18011;
        if (this.Field_21129 == null) {
            n2 = n % this.Field_21131.length;
        } else {
            int n3 = n % this.Field_21132;
            for (int i = 9345 & 21048; i < this.Field_21128.length; ++i) {
                if (this.Field_21128[i] <= n3) continue;
                n2 = i;
                break;
            }
        }
        return this.Field_21131[n2];
    }

    public boolean Method_21134(String string) {
        int n;
        int n2;
        this.Field_21131 = new Class_2080[this.Field_21125.length];
        Class_2080 class_2080 = Class_24158.Method_24172(this.Field_21130);
        if (class_2080 == null) {
            Class_19426.Method_19610("Invalid path: " + this.Field_21130.Method_2084());
            return (24704 & 4445) != 0;
        }
        for (n = 4 & 12968; n < this.Field_21131.length; ++n) {
            n2 = this.Field_21125[n];
            if (n2 <= (16485 & 2817)) {
                this.Field_21131[n] = this.Field_21130;
                continue;
            }
            Class_2080 class_20802 = Class_24158.Method_24185(class_2080, n2);
            if (class_20802 == null) {
                Class_19426.Method_19610("Invalid path: " + this.Field_21130.Method_2084());
                return (-27110 & 24928) != 0;
            }
            if (!Class_19426.Method_19594(class_20802)) {
                Class_19426.Method_19610("Texture not found: " + class_20802.Method_2084());
                return (256 & -11195) != 0;
            }
            this.Field_21131[n] = class_20802;
        }
        if (this.Field_21129 != null) {
            if (this.Field_21129.length > this.Field_21131.length) {
                Class_19426.Method_19610("More weights defined than skins, trimming weights: " + string);
                int[] arrn = new int[this.Field_21131.length];
                System.arraycopy(this.Field_21129, 4177 & -21498, arrn, 4353 & 1216, arrn.length);
                this.Field_21129 = arrn;
            }
            if (this.Field_21129.length < this.Field_21131.length) {
                Class_19426.Method_19610("Less weights defined than skins, expanding weights: " + string);
                int[] arrn = new int[this.Field_21131.length];
                System.arraycopy(this.Field_21129, 2258 & -16372, arrn, -32704 & 131, this.Field_21129.length);
                n2 = Class_6292.Method_6293(this.Field_21129);
                for (int i = this.Field_21129.length; i < arrn.length; ++i) {
                    arrn[i] = n2;
                }
                this.Field_21129 = arrn;
            }
            this.Field_21128 = new int[this.Field_21129.length];
            n = 8313 & 22530;
            for (n2 = 5128 & -32735; n2 < this.Field_21129.length; ++n2) {
                if (this.Field_21129[n2] < 0) {
                    Class_19426.Method_19610("Invalid weight: " + this.Field_21129[n2]);
                    return (-8192 & 744) != 0;
                }
                this.Field_21128[n2] = n += this.Field_21129[n2];
            }
            this.Field_21132 = n;
            if (this.Field_21132 <= 0) {
                Class_19426.Method_19610("Invalid sum of all weights: " + n);
                this.Field_21132 = 9617 & 22599;
            }
        }
        return (2145 & 21) != 0;
    }

    private void Method_21135() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_21136(Class_34093 class_34093) {
        if (this.Field_21127 != null) {
            Class_17281 class_17281 = class_34093.Field_34095;
            int n = -32758 & 17220;
            for (int i = 9476 & -16254; i < this.Field_21127.length; ++i) {
                Class_17281 class_172812 = this.Field_21127[i];
                if (class_172812 != class_17281) continue;
                n = 1539 & -14207;
                break;
            }
            if (n == 0) {
                return (-24301 & 236) != 0;
            }
        }
        return this.Field_21126 != null && class_34093.Field_34109 != null ? this.Field_21126.Method_27485(class_34093.Field_34109.\u0000, `()) : 8737 & 16407;
    }
}

