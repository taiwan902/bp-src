/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.BufferUtils
 *  internal.org.lwjgl.util.vector.Matrix4f
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import internal.org.lwjgl.BufferUtils;
import internal.org.lwjgl.util.vector.Matrix4f;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_14316 {
    private boolean Field_14317;
    private final FloatBuffer Field_14318;
    private final int Field_14319;
    private final String Field_14320;
    private static final Logger Field_14321 = LogManager.getLogger();
    private final IntBuffer Field_14322;
    private final int Field_14323;
    private int Field_14324;
    private final Class_17924 Field_14325;

    public void Method_14326(float f, float f2) {
        this.Field_14318.position(0 & 8845);
        this.Field_14318.put(10281 & 210, f);
        this.Field_14318.put(20481 & -29539, f2);
        this.Method_14338();
    }

    public void Method_14327(float f, float f2, float f3, float f4) {
        this.Field_14318.position(16388 & 10304);
        this.Field_14318.put(f);
        this.Field_14318.put(f2);
        this.Field_14318.put(f3);
        this.Field_14318.put(f4);
        this.Field_14318.flip();
        this.Method_14338();
    }

    public void Method_14328() {
        if (!this.Field_14317) {
            // empty if block
        }
        this.Field_14317 = 8288 & -32768;
        if (this.Field_14323 <= (-32569 & 25603)) {
            this.Method_14339();
        } else if (this.Field_14323 <= (-12281 & 671)) {
            this.Method_14342();
        } else {
            if (this.Field_14323 > (14 & 17931)) {
                Field_14321.warn("Uniform.upload called, but type value (" + this.Field_14323 + ") is not a valid type. Ignoring.");
                return;
            }
            this.Method_14333();
        }
    }

    public Class_14316(String string, int n, int n2, Class_17924 class_17924) {
        this.Field_14320 = string;
        this.Field_14319 = n2;
        this.Field_14323 = n;
        this.Field_14325 = class_17924;
        if (n <= (4515 & 19031)) {
            this.Field_14322 = BufferUtils.createIntBuffer((int)n2);
            this.Field_14318 = null;
        } else {
            this.Field_14322 = null;
            this.Field_14318 = BufferUtils.createFloatBuffer((int)n2);
        }
        this.Field_14324 = -1 & -1;
        this.Method_14338();
    }

    public void Method_14329(float[] arrf) {
        if (arrf.length < this.Field_14319) {
            Field_14321.warn("Uniform.set called with a too-small value array (expected " + this.Field_14319 + ", got " + arrf.length + "). Ignoring.");
        } else {
            this.Field_14318.position(16 & -24319);
            this.Field_14318.put(arrf);
            this.Field_14318.position(-21173 & 4112);
            this.Method_14338();
        }
    }

    public void Method_14330(int n) {
        this.Field_14324 = n;
    }

    private void Method_14331() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_14332(float f, float f2, float f3, float f4) {
        this.Field_14318.position(80 & -19936);
        if (this.Field_14323 >= (2061 & 17558)) {
            this.Field_14318.put(28676 & 874, f);
        }
        if (this.Field_14323 >= (12805 & 135)) {
            this.Field_14318.put(8961 & 2107, f2);
        }
        if (this.Field_14323 >= (3158 & -16090)) {
            this.Field_14318.put(619 & 20482, f3);
        }
        if (this.Field_14323 >= (4135 & 599)) {
            this.Field_14318.put(20487 & 539, f4);
        }
        this.Method_14338();
    }

    private void Method_14333() {
        switch (this.Field_14323) {
            case 8: {
                Class_32876.Method_32944(this.Field_14324, (-24573 & 16749) != 0, this.Field_14318);
                break;
            }
            case 9: {
                Class_32876.Method_32940(this.Field_14324, (2051 & 5225) != 0, this.Field_14318);
                break;
            }
            case 10: {
                Class_32876.Method_32964(this.Field_14324, (16771 & -19951) != 0, this.Field_14318);
            }
        }
    }

    public void Method_14334(float f, float f2, float f3) {
        this.Field_14318.position(-16376 & 4004);
        this.Field_14318.put(22696 & -32256, f);
        this.Field_14318.put(1089 & 8255, f2);
        this.Field_14318.put(25026 & -32718, f3);
        this.Method_14338();
    }

    public String Method_14335() {
        return this.Field_14320;
    }

    public void Method_14336(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        this.Field_14318.position(2560 & 5120);
        this.Field_14318.put(2241 & 12320, f);
        this.Field_14318.put(401 & 29281, f2);
        this.Field_14318.put(16459 & -29434, f3);
        this.Field_14318.put(17091 & -27597, f4);
        this.Field_14318.put(54 & 1029, f5);
        this.Field_14318.put(16663 & 109, f6);
        this.Field_14318.put(-6858 & 710, f7);
        this.Field_14318.put(71 & -11609, f8);
        this.Field_14318.put(-32760 & 1034, f9);
        this.Field_14318.put(16393 & -31973, f10);
        this.Field_14318.put(24623 & 3226, f11);
        this.Field_14318.put(207 & 1323, f12);
        this.Field_14318.put(-32468 & 2572, f13);
        this.Field_14318.put(8271 & 2061, f14);
        this.Field_14318.put(1039 & 2190, f15);
        this.Field_14318.put(-24017 & 5471, f16);
        this.Method_14338();
    }

    public static int Method_14337(String string) {
        int n = -1 & -1;
        if (string.equals("int")) {
            n = 2627 & -14928;
        } else if (string.equals("float")) {
            n = 12804 & 260;
        } else if (string.startsWith("matrix")) {
            if (string.endsWith("2x2")) {
                n = 20746 & 25;
            } else if (string.endsWith("3x3")) {
                n = -26103 & 9263;
            } else if (string.endsWith("4x4")) {
                n = -23442 & 267;
            }
        }
        return n;
    }

    private void Method_14338() {
        this.Field_14317 = 81 & 19111;
        if (this.Field_14325 != null) {
            this.Field_14325.Method_17945();
        }
    }

    private void Method_14339() {
        switch (this.Field_14323) {
            case 0: {
                Class_32876.Method_32958(this.Field_14324, this.Field_14322);
                break;
            }
            case 1: {
                Class_32876.Method_32955(this.Field_14324, this.Field_14322);
                break;
            }
            case 2: {
                Class_32876.Method_32982(this.Field_14324, this.Field_14322);
                break;
            }
            case 3: {
                Class_32876.Method_32946(this.Field_14324, this.Field_14322);
                break;
            }
            default: {
                Field_14321.warn("Uniform.upload called, but count value (" + this.Field_14319 + ") is  not in the range of 1 to 4. Ignoring.");
            }
        }
    }

    public void Method_14340(Matrix4f matrix4f) {
        this.Method_14336(matrix4f.m00, matrix4f.m01, matrix4f.m02, matrix4f.m03, matrix4f.m10, matrix4f.m11, matrix4f.m12, matrix4f.m13, matrix4f.m20, matrix4f.m21, matrix4f.m22, matrix4f.m23, matrix4f.m30, matrix4f.m31, matrix4f.m32, matrix4f.m33);
    }

    public void Method_14341(float f) {
        this.Field_14318.position(-31664 & 26629);
        this.Field_14318.put(1546 & -28415, f);
        this.Method_14338();
    }

    private void Method_14342() {
        switch (this.Field_14323) {
            case 4: {
                Class_32876.Method_32972(this.Field_14324, this.Field_14318);
                break;
            }
            case 5: {
                Class_32876.Method_32962(this.Field_14324, this.Field_14318);
                break;
            }
            case 6: {
                Class_32876.Method_32974(this.Field_14324, this.Field_14318);
                break;
            }
            case 7: {
                Class_32876.Method_32975(this.Field_14324, this.Field_14318);
                break;
            }
            default: {
                Field_14321.warn("Uniform.upload called, but count value (" + this.Field_14319 + ") is not in the range of 1 to 4. Ignoring.");
            }
        }
    }

    public void Method_14343(int n, int n2, int n3, int n4) {
        this.Field_14322.position(-28543 & 68);
        if (this.Field_14323 >= 0) {
            this.Field_14322.put(16416 & -32745, n);
        }
        if (this.Field_14323 >= (21057 & 289)) {
            this.Field_14322.put(73 & -8191, n2);
        }
        if (this.Field_14323 >= (594 & 12294)) {
            this.Field_14322.put(182 & -31422, n3);
        }
        if (this.Field_14323 >= (16515 & 12391)) {
            this.Field_14322.put(19971 & 4387, n4);
        }
        this.Method_14338();
    }
}

