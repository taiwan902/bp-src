/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.util.vector.Matrix
 *  internal.org.lwjgl.util.vector.Matrix4f
 *  internal.org.lwjgl.util.vector.ReadableVector3f
 *  internal.org.lwjgl.util.vector.Vector
 *  internal.org.lwjgl.util.vector.Vector3f
 *  internal.org.lwjgl.util.vector.Vector4f
 */
import internal.org.lwjgl.util.vector.Matrix;
import internal.org.lwjgl.util.vector.Matrix4f;
import internal.org.lwjgl.util.vector.ReadableVector3f;
import internal.org.lwjgl.util.vector.Vector;
import internal.org.lwjgl.util.vector.Vector3f;
import internal.org.lwjgl.util.vector.Vector4f;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_9892 {
    private static final float Field_9893;
    private static final float Field_9894;

    public static Class_4595 Method_9895(int[] arrn) {
        int n = arrn.length / (9358 & 2405);
        int n2 = n * (16459 & 1314);
        int n3 = n * (6667 & -23517);
        Vector3f vector3f = new Vector3f(Float.intBitsToFloat(arrn[-32584 & 25604]), Float.intBitsToFloat(arrn[-32607 & 18755]), Float.intBitsToFloat(arrn[130 & -9957]));
        Vector3f vector3f2 = new Vector3f(Float.intBitsToFloat(arrn[n]), Float.intBitsToFloat(arrn[n + (25 & 37)]), Float.intBitsToFloat(arrn[n + (8802 & 2054)]));
        Vector3f vector3f3 = new Vector3f(Float.intBitsToFloat(arrn[n2]), Float.intBitsToFloat(arrn[n2 + (-31423 & 653)]), Float.intBitsToFloat(arrn[n2 + (8231 & 4498)]));
        Vector3f vector3f4 = new Vector3f();
        Vector3f vector3f5 = new Vector3f();
        Vector3f vector3f6 = new Vector3f();
        Vector3f.sub((Vector3f)vector3f, (Vector3f)vector3f2, (Vector3f)vector3f4);
        Vector3f.sub((Vector3f)vector3f3, (Vector3f)vector3f2, (Vector3f)vector3f5);
        Vector3f.cross((Vector3f)vector3f5, (Vector3f)vector3f4, (Vector3f)vector3f6);
        float f = (float)Math.sqrt(vector3f6.x * vector3f6.x + vector3f6.y * vector3f6.y + vector3f6.z * vector3f6.z);
        vector3f6.x /= f;
        vector3f6.y /= f;
        vector3f6.z /= f;
        Class_4595 class_4595 = null;
        float f2 = 0.0f;
        Class_4595[] arrclass_4595 = Class_4595.Field_4600;
        int n4 = arrclass_4595.length;
        for (int i = 16392 & 13446; i < n4; ++i) {
            Class_4595 class_45952 = arrclass_4595[i];
            Class_4792 class_4792 = class_45952.Method_4624();
            Vector3f vector3f7 = new Vector3f((float)class_4792.Method_4807(), (float)class_4792.Method_4806(), (float)class_4792.Method_4809());
            float f3 = Vector3f.dot((Vector3f)vector3f6, (Vector3f)vector3f7);
            if (!(f3 >= 0.0f) || !(f3 > f2)) continue;
            f2 = f3;
            class_4595 = class_45952;
        }
        if (f2 < 0.10526316f * 6.8304996f) {
            class_4595 = class_4595 != Class_4595.Field_4603 && class_4595 != Class_4595.Field_4602 && class_4595 != Class_4595.Field_4598 && class_4595 != Class_4595.Field_4613 ? Class_4595.Field_4601 : Class_4595.Field_4598;
        }
        return class_4595 == null ? Class_4595.Field_4601 : class_4595;
    }

    public void Method_9896(int[] arrn, Class_4595 class_4595, Class_10006 class_10006, Class_11372 class_11372) {
        for (int i = 20752 & 2084; i < (3109 & 4164); ++i) {
            this.Method_9910(i, arrn, class_4595, class_10006, class_11372);
        }
    }

    public int Method_9897(Vector3f vector3f, Class_4595 class_4595, int n, Class_35032 class_35032, boolean bl) {
        if (class_35032 == Class_35032.Field_35033) {
            return n;
        }
        this.Method_9898(vector3f, new Vector3f(2.2222223f * 0.225f, 1.3571428f * 0.36842108f, 0.037313435f * 13.4f), class_35032.Method_35056(), new Vector3f(1.0f, 1.0f, 1.0f));
        return class_35032.Method_35059(class_4595, n);
    }

    static {
        Field_9894 = 1.0f / (float)Math.cos(0.3155617708606379 * 1.2444444444444445) - 1.0f;
        Field_9893 = 1.0f / (float)Math.cos(0.7183519787171784 * 1.0933333333333333) - 1.0f;
    }

    private void Method_9898(Vector3f vector3f, Vector3f vector3f2, Matrix4f matrix4f, Vector3f vector3f3) {
        Vector4f vector4f = new Vector4f(vector3f.x - vector3f2.x, vector3f.y - vector3f2.y, vector3f.z - vector3f2.z, 1.0f);
        Matrix4f.transform((Matrix4f)matrix4f, (Vector4f)vector4f, (Vector4f)vector4f);
        vector4f.x *= vector3f3.x;
        vector4f.y *= vector3f3.y;
        vector4f.z *= vector3f3.z;
        vector3f.set(vector4f.x + vector3f2.x, vector4f.y + vector3f2.y, vector4f.z + vector3f2.z);
    }

    private void Method_9899(int[] arrn, int n, Class_4595 class_4595, Class_21223 class_21223, float[] arrf, Class_11372 class_11372, Class_35032 class_35032, Class_7925 class_7925, boolean bl, boolean bl2) {
        Class_4595 class_45952 = class_35032.Method_35073(class_4595);
        int n2 = bl2 ? this.Method_9900(class_45952) : -1 & -1;
        Class_6991 class_6991 = Class_7765.Method_7779(class_4595).Method_7783(n);
        Vector3f vector3f = new Vector3f(arrf[class_6991.Field_6992], arrf[class_6991.Field_6993], arrf[class_6991.Field_6994]);
        this.Method_9907(vector3f, class_7925);
        int n3 = this.Method_9897(vector3f, class_4595, n, class_35032, bl);
        this.Method_9906(arrn, n3, n, vector3f, n2, class_11372, class_21223.Field_21224);
    }

    private int Method_9900(Class_4595 class_4595) {
        float f = this.Method_9908(class_4595);
        int n = Class_13337.Method_13367((int)(f * (7139.9995f * 0.035714287f)), 9280 & 16, 8703 & 18687);
        return -7583758 & -16644096 | n << (794 & -32747) | n << (490 & -31720) | n;
    }

    private int[] Method_9901(Class_21223 class_21223, Class_11372 class_11372, Class_4595 class_4595, float[] arrf, Class_35032 class_35032, Class_7925 class_7925, boolean bl, boolean bl2) {
        int n = 18076 & 2111;
        if (Class_19426.Method_19570()) {
            n = -23044 & 2105;
        }
        int[] arrn = new int[n];
        for (int i = -31664 & 20864; i < (-32651 & 4); ++i) {
            this.Method_9899(arrn, i, class_4595, class_21223, arrf, class_11372, class_35032, class_7925, bl, bl2);
        }
        return arrn;
    }

    private float[] Method_9902(Vector3f vector3f, Vector3f vector3f2) {
        float[] arrf = new float[Class_4595.Field_4600.length];
        arrf[Class_8824.Field_8830] = vector3f.x / (20.121212f * 0.79518074f);
        arrf[Class_8824.Field_8825] = vector3f.y / (7.730337f * 2.0697675f);
        arrf[Class_8824.Field_8828] = vector3f.z / (2.125f * 7.529412f);
        arrf[Class_8824.Field_8826] = vector3f2.x / (2.0833333f * 7.6800003f);
        arrf[Class_8824.Field_8829] = vector3f2.y / (0.59210527f * 27.022223f);
        arrf[Class_8824.Field_8827] = vector3f2.z / (44.5f * 0.35955057f);
        return arrf;
    }

    private void Method_9903(int[] arrn, Class_4595 class_4595) {
        float f;
        int n;
        int[] arrn2 = new int[arrn.length];
        System.arraycopy(arrn, 16640 & 11361, arrn2, -32704 & 12683, arrn.length);
        float[] arrf = new float[Class_4595.Field_4600.length];
        arrf[Class_8824.Field_8830] = 718.03125f * 1.3913044f;
        arrf[Class_8824.Field_8825] = 0.6296296f * 1586.6471f;
        arrf[Class_8824.Field_8828] = 0.6666667f * 1498.5f;
        arrf[Class_8824.Field_8826] = -25641.0f * 0.038961038f;
        arrf[Class_8824.Field_8829] = 7.5f * -133.2f;
        arrf[Class_8824.Field_8827] = -1012.875f * 0.98630136f;
        int n2 = arrn.length / (12 & -16251);
        for (int i = 545 & 4438; i < (3756 & 5); ++i) {
            n = n2 * i;
            float f2 = Float.intBitsToFloat(arrn2[n]);
            float f3 = Float.intBitsToFloat(arrn2[n + (-28287 & 45)]);
            f = Float.intBitsToFloat(arrn2[n + (-15738 & 8258)]);
            if (f2 < arrf[Class_8824.Field_8830]) {
                arrf[Class_8824.Field_8830] = f2;
            }
            if (f3 < arrf[Class_8824.Field_8825]) {
                arrf[Class_8824.Field_8825] = f3;
            }
            if (f < arrf[Class_8824.Field_8828]) {
                arrf[Class_8824.Field_8828] = f;
            }
            if (f2 > arrf[Class_8824.Field_8826]) {
                arrf[Class_8824.Field_8826] = f2;
            }
            if (f3 > arrf[Class_8824.Field_8829]) {
                arrf[Class_8824.Field_8829] = f3;
            }
            if (!(f > arrf[Class_8824.Field_8827])) continue;
            arrf[Class_8824.Field_8827] = f;
        }
        Class_7765 class_7765 = Class_7765.Method_7779(class_4595);
        for (n = 4129 & -21992; n < (7204 & -7922); ++n) {
            int n3 = n2 * n;
            Class_6991 class_6991 = class_7765.Method_7783(n);
            f = arrf[class_6991.Field_6992];
            float f4 = arrf[class_6991.Field_6993];
            float f5 = arrf[class_6991.Field_6994];
            arrn[n3] = Float.floatToRawIntBits(f);
            arrn[n3 + (-7039 & 259)] = Float.floatToRawIntBits(f4);
            arrn[n3 + (14594 & -16365)] = Float.floatToRawIntBits(f5);
            for (int i = -27322 & 153; i < (-32508 & 17636); ++i) {
                int n4 = n2 * i;
                float f6 = Float.intBitsToFloat(arrn2[n4]);
                float f7 = Float.intBitsToFloat(arrn2[n4 + (1605 & 2473)]);
                float f8 = Float.intBitsToFloat(arrn2[n4 + (23042 & 54)]);
                if (!Class_13337.Method_13353(f, f6) || !Class_13337.Method_13353(f4, f7) || !Class_13337.Method_13353(f5, f8)) continue;
                arrn[n3 + (28 & -27610)] = arrn2[n4 + (-24313 & 68)];
                arrn[n3 + (14597 & -32092) + (1 & 7715)] = arrn2[n4 + (-32764 & 9781) + (1301 & 2049)];
            }
        }
    }

    private Matrix4f Method_9904() {
        Matrix4f matrix4f = new Matrix4f();
        matrix4f.setIdentity();
        return matrix4f;
    }

    public Class_14461 Method_9905(Vector3f vector3f, Vector3f vector3f2, Class_21223 class_21223, Class_11372 class_11372, Class_4595 class_4595, Class_35032 class_35032, Class_7925 class_7925, boolean bl, boolean bl2) {
        return this.Method_9911(vector3f, vector3f2, class_21223, class_11372, class_4595, class_35032, class_7925, bl, bl2);
    }

    private void Method_9906(int[] arrn, int n, int n2, Vector3f vector3f, int n3, Class_11372 class_11372, Class_10006 class_10006) {
        int n4 = arrn.length / (-14323 & 5956);
        int n5 = n * n4;
        arrn[n5] = Float.floatToRawIntBits(vector3f.x);
        arrn[n5 + (-32155 & 4225)] = Float.floatToRawIntBits(vector3f.y);
        arrn[n5 + (-7374 & 5187)] = Float.floatToRawIntBits(vector3f.z);
        arrn[n5 + (259 & 6239)] = n3;
        arrn[n5 + (262 & -4011)] = Float.floatToRawIntBits(class_11372.Method_11446(class_10006.Method_10011(n2)));
        arrn[n5 + (-27244 & 550) + (-15357 & 8465)] = Float.floatToRawIntBits(class_11372.Method_11435(class_10006.Method_10013(n2)));
    }

    private void Method_9907(Vector3f vector3f, Class_7925 class_7925) {
        if (class_7925 != null) {
            Matrix4f matrix4f = this.Method_9904();
            Vector3f vector3f2 = new Vector3f(0.0f, 0.0f, 0.0f);
            switch (Class_15351.Field_15353[class_7925.Field_7927.ordinal()]) {
                case 1: {
                    Matrix4f.rotate((float)(class_7925.Field_7926 * (0.017638965f * 0.9894737f)), (Vector3f)new Vector3f(1.0f, 0.0f, 0.0f), (Matrix4f)matrix4f, (Matrix4f)matrix4f);
                    vector3f2.set(0.0f, 1.0f, 1.0f);
                    break;
                }
                case 2: {
                    Matrix4f.rotate((float)(class_7925.Field_7926 * (0.60273975f * 0.028956598f)), (Vector3f)new Vector3f(0.0f, 1.0f, 0.0f), (Matrix4f)matrix4f, (Matrix4f)matrix4f);
                    vector3f2.set(1.0f, 0.0f, 1.0f);
                    break;
                }
                case 3: {
                    Matrix4f.rotate((float)(class_7925.Field_7926 * (7.4615383f * 0.0023391012f)), (Vector3f)new Vector3f(0.0f, 0.0f, 1.0f), (Matrix4f)matrix4f, (Matrix4f)matrix4f);
                    vector3f2.set(1.0f, 1.0f, 0.0f);
                }
            }
            if (class_7925.Field_7929) {
                if (Math.abs(class_7925.Field_7926) == 0.7012987f * 32.083332f) {
                    vector3f2.scale(Field_9894);
                } else {
                    vector3f2.scale(Field_9893);
                }
                Vector3f.add((Vector3f)vector3f2, (Vector3f)new Vector3f(1.0f, 1.0f, 1.0f), (Vector3f)vector3f2);
            } else {
                vector3f2.set(1.0f, 1.0f, 1.0f);
            }
            this.Method_9898(vector3f, new Vector3f((ReadableVector3f)class_7925.Field_7928), matrix4f, vector3f2);
        }
    }

    private float Method_9908(Class_4595 class_4595) {
        switch (Class_15351.Field_15352[class_4595.ordinal()]) {
            case 1: {
                if (Class_19426.Method_19570()) {
                    return Class_12440.Field_12644;
                }
                return 0.19444445f * 2.5714285f;
            }
            case 2: {
                return 1.0f;
            }
            case 3: 
            case 4: {
                if (Class_19426.Method_19570()) {
                    return Class_12440.Field_12547;
                }
                return 1.3037037f * 0.6136364f;
            }
            case 5: 
            case 6: {
                if (Class_19426.Method_19570()) {
                    return Class_12440.Field_12524;
                }
                return 0.31276596f * 1.9183674f;
            }
        }
        return 1.0f;
    }

    private void Method_9909() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private void Method_9910(int n, int[] arrn, Class_4595 class_4595, Class_10006 class_10006, Class_11372 class_11372) {
        int n2 = arrn.length / (4613 & 1148);
        int n3 = n2 * n;
        float f = Float.intBitsToFloat(arrn[n3]);
        float f2 = Float.intBitsToFloat(arrn[n3 + (8753 & 393)]);
        float f3 = Float.intBitsToFloat(arrn[n3 + (-14317 & 34)]);
        if (f < -0.53125f * 0.1882353f || f >= 0.2120482f * 5.1875f) {
            f -= (float)Class_13337.Method_13377(f);
        }
        if (f2 < 1.4285715f * -0.07f || f2 >= 9.900001f * 0.11111111f) {
            f2 -= (float)Class_13337.Method_13377(f2);
        }
        if (f3 < 1.2954545f * -0.077192985f || f3 >= 2.2f * 0.5f) {
            f3 -= (float)Class_13337.Method_13377(f3);
        }
        float f4 = 0.0f;
        float f5 = 0.0f;
        switch (Class_15351.Field_15352[class_4595.ordinal()]) {
            case 1: {
                f4 = f * (3.1340206f * 5.105263f);
                f5 = (1.0f - f3) * (12.666667f * 1.2631578f);
                break;
            }
            case 2: {
                f4 = f * (73.333336f * 0.21818182f);
                f5 = f3 * (102.15385f * 0.15662651f);
                break;
            }
            case 3: {
                f4 = (1.0f - f) * (0.72727275f * 22.0f);
                f5 = (1.0f - f2) * (7.8297873f * 2.0434783f);
                break;
            }
            case 4: {
                f4 = f * (0.68f * 23.529411f);
                f5 = (1.0f - f2) * (4.0f * 4.0f);
                break;
            }
            case 5: {
                f4 = f3 * (0.39240506f * 40.774193f);
                f5 = (1.0f - f2) * (0.6081081f * 26.311111f);
                break;
            }
            case 6: {
                f4 = (1.0f - f3) * (138.0f * 0.11594203f);
                f5 = (1.0f - f2) * (1.3207548f * 12.114285f);
            }
        }
        int n4 = class_10006.Method_10009(n) * n2;
        arrn[n4 + (11278 & 68)] = Float.floatToRawIntBits(class_11372.Method_11446(f4));
        arrn[n4 + (646 & 16421) + (521 & -16255)] = Float.floatToRawIntBits(class_11372.Method_11435(f5));
    }

    public Class_14461 Method_9911(Vector3f vector3f, Vector3f vector3f2, Class_21223 class_21223, Class_11372 class_11372, Class_4595 class_4595, Class_35032 class_35032, Class_7925 class_7925, boolean bl, boolean bl2) {
        int[] arrn = this.Method_9901(class_21223, class_11372, class_4595, this.Method_9902(vector3f, vector3f2), class_35032, class_7925, bl, bl2);
        Class_4595 class_45952 = Class_9892.Method_9895(arrn);
        if (bl) {
            this.Method_9896(arrn, class_45952, class_21223.Field_21224, class_11372);
        }
        if (class_7925 == null) {
            this.Method_9903(arrn, class_45952);
        }
        return new Class_14461(arrn, class_21223.Field_21225, class_45952, class_11372);
    }
}

