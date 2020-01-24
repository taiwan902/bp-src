/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.Random;
import net.minecraft.util.Vec3;

public class Class_14041
extends Class_11681 {
    private static final Class_2080 Field_14042 = new Class_2080(Class_14041.Method_14050("\u4006\u4016\u400a\u4006\u4002\u4004\u4012\u4004\u4014\u401e\u4014\u400c\u4016\u400c\u4010\u4010\u401e\u4016\u401c\u4006\u4018\u4012\u4018\u4012\u4004\u4008\u4010\u4002\u4010\u400e\u4010\u4018"));
    FloatBuffer Field_14043 = Class_11552.Method_11553(1616 & 2068);
    private static final Random Field_14044;
    private static final Class_2080 Field_14045;

    public void Method_14046(Class_4879 class_4879, double d, double d2, double d3, float f, int n) {
        this.Method_14049((Class_38552)class_4879, d, d2, d3, f, n);
    }

    private void Method_14047() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static String Method_14048(String string) {
        int n = 18968;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14041.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_14049(Class_38552 class_38552, double d, double d2, double d3, float f, int n) {
        if (!Class_19426.Method_19570() || !Class_25377.Method_25396(class_38552, d, d2, d3, f, n, 0.67857146f * 1.1052631f)) {
            float f2 = (float)this.\u0000strictfp.Field_26700;
            float f3 = (float)this.\u0000strictfp.Field_26696;
            float f4 = (float)this.\u0000strictfp.Field_26704;
            Class_16867.Method_16931();
            Field_14044.setSeed(827914620L & 294271L);
            float f5 = 0.38414636f * 1.9523809f;
            for (int i = 4912 & 24576; i < (-30704 & 9631); ++i) {
                Class_16867.Method_16961();
                float f6 = (17940 & -20264) - i;
                float f7 = 1.5531915f * 0.040239725f;
                float f8 = 1.0f / (f6 + 1.0f);
                if (i == 0) {
                    this.\u0000strictfp(Field_14042);
                    f8 = 1.0394737f * 0.09620254f;
                    f6 = 0.9459459f * 68.71429f;
                    f7 = 0.76785713f * 0.1627907f;
                    Class_16867.Method_16947();
                    Class_16867.Method_16951(-29933 & 10118, 5899 & 9043);
                }
                if (i >= (-28701 & 28685)) {
                    this.\u0000strictfp(Field_14045);
                }
                if (i == (14381 & 17667)) {
                    Class_16867.Method_16947();
                    Class_16867.Method_16951(515 & 6277, 17513 & 2183);
                    f7 = 8.666667f * 0.057692304f;
                }
                float f9 = (float)(-(d2 + (double)f5));
                float f10 = f9 + (float)Class_41473.Method_41491().\u0000strictfp;
                float f11 = f9 + f6 + (float)Class_41473.Method_41491().\u0000strictfp;
                float f12 = f10 / f11;
                f12 = (float)(d2 + (double)f5) + f12;
                Class_16867.Method_16943(f2, f12, f4);
                Class_16867.Method_16980(Class_8108.Field_8112, 25603 & 12033);
                Class_16867.Method_16980(Class_8108.Field_8114, 11275 & 9425);
                Class_16867.Method_16980(Class_8108.Field_8110, 25665 & 9629);
                Class_16867.Method_16980(Class_8108.Field_8113, 26120 & -19371);
                Class_16867.Method_16976(Class_8108.Field_8112, -23295 & 15835, this.Method_14051(1.0f, 0.0f, 0.0f, 0.0f));
                Class_16867.Method_16976(Class_8108.Field_8114, 15681 & 26517, this.Method_14051(0.0f, 0.0f, 1.0f, 0.0f));
                Class_16867.Method_16976(Class_8108.Field_8110, 25857 & 10077, this.Method_14051(0.0f, 0.0f, 0.0f, 1.0f));
                Class_16867.Method_16976(Class_8108.Field_8113, 9618 & 11558, this.Method_14051(0.0f, 1.0f, 0.0f, 0.0f));
                Class_16867.Method_16933(Class_8108.Field_8112);
                Class_16867.Method_16933(Class_8108.Field_8114);
                Class_16867.Method_16933(Class_8108.Field_8110);
                Class_16867.Method_16933(Class_8108.Field_8113);
                Class_16867.Method_16945();
                Class_16867.Method_16934(-229 & 5894);
                Class_16867.Method_16961();
                Class_16867.Method_16962();
                Class_16867.Method_16943(0.0f, (float)(Class_18.Method_207() % (1909498866689556080L & -1909498867959026069L)) / (1.5588236f * 449056.6f), 0.0f);
                Class_16867.Method_16973(f7, f7, f7);
                Class_16867.Method_16943(0.8913044f * 0.5609756f, 0.6075949f * 0.8229167f, 0.0f);
                Class_16867.Method_16940((float)(i * i * (-11543 & 4577) + i * (14505 & 857)) * 2.0f, 0.0f, 0.0f, 1.0f);
                Class_16867.Method_16943(-2.75f * 0.18181819f, 3.875f * -0.12903225f, 0.0f);
                Class_16867.Method_16943(-f2, -f4, -f3);
                f10 = f9 + (float)Class_41473.Method_41491().\u0000strictfp;
                Class_16867.Method_16943((float)Class_41473.Method_41491().\u0000= final * f6 / f10, (float)Class_41473.Method_41491().\u0000, ` * f6 / f10, -f3);
                Class_7644 class_7644 = Class_7644.Method_7649();
                Class_22385 class_22385 = class_7644.Method_7648();
                class_22385.Method_22417(-31513 & 8727, Class_29585.Field_29601);
                float f13 = (Field_14044.nextFloat() * (1.3571428f * 0.36842108f) + 0.0055555557f * 18.0f) * f8;
                float f14 = (Field_14044.nextFloat() * (2.0f * 0.25f) + 0.060606062f * 6.6f) * f8;
                float f15 = (Field_14044.nextFloat() * (3.7619047f * 0.1329114f) + 0.020408163f * 24.5f) * f8;
                if (i == 0) {
                    f14 = f15 = 1.0f * f8;
                    f13 = f15;
                }
                class_22385.Method_22443(d, d2 + (double)f5, d3).Method_22427(f13, f14, f15, 1.0f).Method_22451();
                class_22385.Method_22443(d, d2 + (double)f5, d3 + 1.0).Method_22427(f13, f14, f15, 1.0f).Method_22451();
                class_22385.Method_22443(d + 1.0, d2 + (double)f5, d3 + 1.0).Method_22427(f13, f14, f15, 1.0f).Method_22451();
                class_22385.Method_22443(d + 1.0, d2 + (double)f5, d3).Method_22427(f13, f14, f15, 1.0f).Method_22451();
                class_7644.Method_7647();
                Class_16867.Method_16945();
                Class_16867.Method_16934(-26864 & 5953);
                this.\u0000strictfp(Field_14042);
            }
            Class_16867.Method_16952();
            Class_16867.Method_16941(Class_8108.Field_8112);
            Class_16867.Method_16941(Class_8108.Field_8114);
            Class_16867.Method_16941(Class_8108.Field_8110);
            Class_16867.Method_16941(Class_8108.Field_8113);
            Class_16867.Method_16918();
        }
    }

    static {
        Field_14045 = new Class_2080(Class_14041.Method_14048("\u21a0\u21a1\u21a8\u21a1\u21a0\u21a3\u21a0\u21a3\u21e2\u21a9\u21a2\u21a9\u21a0\u21a9\u21a0\u21e3\u21b0\u21bb\u21b0\u219b\u21b0\u21bb\u21b2\u21b1\u21b8\u21b1\u21f2\u21b9\u21b2\u21bb"));
        Field_14044 = new Random(7994261488196255102L & -7994261488907814020L);
    }

    private static String Method_14050(String string) {
        int n = 11811;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14041.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private FloatBuffer Method_14051(float f, float f2, float f3, float f4) {
        this.Field_14043.clear();
        this.Field_14043.put(f).put(f2).put(f3).put(f4);
        this.Field_14043.flip();
        return this.Field_14043;
    }
}

