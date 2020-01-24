/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;

public class Class_28000
implements Class_14246 {
    public Class_33358 Field_28001;
    public Class_42376[] Field_28002;

    public Class_28000(Class_33358 class_33358, Class_11220 ... arrclass_11220) {
        this.Field_28002 = new Class_42376[arrclass_11220.length];
        for (int i = 4096 & 89; i < this.Field_28002.length; ++i) {
            this.Field_28002[i] = arrclass_11220[i].Method_11237();
        }
        this.Field_28001 = class_33358;
    }

    public boolean Method_28003(int n, int n2, int n3, int n4, int n5, int n6) {
        Class_42376[] arrclass_42376 = this.Field_28002;
        int n7 = arrclass_42376.length;
        for (int i = 16744 & 9872; i < n7; ++i) {
            Class_42376 class_42376 = arrclass_42376[i];
            if (!class_42376.Method_42404(this.Field_28001.\u0000strictfp, n2, n3)) continue;
            class_42376.Method_42402(this.Field_28001.\u0000strictfp.Method_245());
            Class_11220 class_11220 = (Class_11220)this.Field_28001.\u0000strictfp.Field_84.Field_39732.Field_8868.get(class_42376.Field_42392);
            if (class_11220 != null) {
                class_11220.Method_11234();
                this.Field_28001.Field_33367.Field_39732.Method_9085();
            }
            return (4137 & 17665) != 0;
        }
        return (8233 & -14448) != 0;
    }

    private static String Method_28004(String string) {
        int n = 20703;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_28000.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_28005(int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl) {
        if (n7 > this.Field_28001.Field_33362.\u0000= switch) {
            n7 = Integer.MAX_VALUE & Integer.MAX_VALUE;
        }
        int n8 = n4 / (this.Field_28002.length == 0 ? -31231 & 2313 : this.Field_28002.length);
        int n9 = -29248 & 8192;
        Class_42376[] arrclass_42376 = this.Field_28002;
        int n10 = arrclass_42376.length;
        for (int i = 25288 & 2081; i < n10; ++i) {
            Class_42376 class_42376 = arrclass_42376[i];
            class_42376.Field_42380 = n8;
            class_42376.Field_42389 = 4692 & 190;
            class_42376.Field_42391 = n2 + n4 * n9 / this.Field_28002.length;
            class_42376.Field_42390 = n3;
            class_42376.Method_42401(this.Field_28001.\u0000strictfp, n6, n7);
            ++n9;
        }
    }

    public void Method_28006(int n, int n2, int n3) {
    }

    public boolean Method_28007(int n, int n2, int n3, int n4, int n5, int n6) {
        Class_42376[] arrclass_42376 = this.Field_28002;
        int n7 = arrclass_42376.length;
        for (int i = 4352 & 641; i < n7; ++i) {
            Class_42376 class_42376 = arrclass_42376[i];
            if (!class_42376.Method_42404(this.Field_28001.\u0000strictfp, n2, n3)) continue;
            Class_11220 class_11220 = (Class_11220)this.Field_28001.\u0000strictfp.Field_84.Field_39732.Field_8868.get(class_42376.Field_42392);
            if (class_11220 != null && class_11220.Method_11236()) {
                class_42376.Method_42402(this.Field_28001.\u0000strictfp.Method_245());
                this.Field_28001.Field_33367.Field_39732.Method_9085();
                return (17409 & 8713) != 0;
            }
            return (70 & -19320) != 0;
        }
        return (-18398 & 528) != 0;
    }

    private void Method_28008() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_28000.Method_28004("\u2048\u2047\u204b\u2044\u204d\u2041\u2049\u204b\u2043\u204b\u204f\u204f\u204a\u2043"));
    }

    public void Method_28009(int n, int n2, int n3, int n4, int n5, int n6) {
        Class_42376[] arrclass_42376 = this.Field_28002;
        int n7 = arrclass_42376.length;
        for (int i = 4682 & 2209; i < n7; ++i) {
            Class_42376 class_42376 = arrclass_42376[i];
            class_42376.Method_42393(n2, n3);
        }
    }
}

