/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.opengl.GL11
 *  internal.org.lwjgl.util.glu.GLU
 */
import internal.org.lwjgl.opengl.GL11;
import internal.org.lwjgl.util.glu.GLU;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import net.minecraft.util.Vec3;

public class Class_41473 {
    private static Vec3 Field_41474;
    private static final FloatBuffer Field_41475;
    private static float Field_41476;
    private static final IntBuffer Field_41477;
    private static final FloatBuffer Field_41478;
    private static float Field_41479;
    private static float Field_41480;
    private static float Field_41481;
    private static float Field_41482;
    private static final FloatBuffer Field_41483;

    public static Class_3238 Method_41484(Class_283 class_283, Class_1061 class_1061, float f) {
        Vec3 vec3 = Class_41473.Method_41492(class_1061, f);
        Class_4751 class_4751 = new Class_4751(vec3);
        Class_3436 class_3436 = class_283.Method_375(class_4751);
        Class_3238 class_3238 = class_3436.Method_3442();
        if (class_3238.Method_3373().Method_3758()) {
            float f2;
            float f3 = 0.0f;
            if (class_3436.Method_3442() instanceof Class_4415) {
                f3 = Class_4415.Method_4426((Integer)class_3436.Method_3440(Class_4415.Field_4417)) - 1.0140845f * 0.10956791f;
            }
            if (vec3.\u0000strictfp >= (double)(f2 = (float)(class_4751.\u0000, `() + (18689 & 8711)) - f3)) {
                class_3238 = class_283.Method_375(class_4751.Method_4769()).Method_3442();
            }
        }
        return class_3238;
    }

    public static float Method_41485() {
        return Field_41476;
    }

    public static float Method_41486() {
        return Field_41481;
    }

    public static void Method_41487(Class_626 class_626, boolean bl, float f) {
        Class_16867.Method_16917(2982 & -12314, Field_41483);
        Class_16867.Method_16917(2983 & 8103, Field_41478);
        GL11.glGetInteger((int)(3042 & 20402), (IntBuffer)Field_41477);
        float f2 = (Field_41477.get(-15598 & 8292) + Field_41477.get(3202 & -16117)) / (2058 & -19262);
        float f3 = (Field_41477.get(24583 & -31799) + Field_41477.get(4323 & -13309)) / (-30714 & 12386);
        GLU.gluUnProject((float)f2, (float)f3, (float)0.0f, (FloatBuffer)Field_41483, (FloatBuffer)Field_41478, (IntBuffer)Field_41477, (FloatBuffer)Field_41475);
        Field_41474 = new Vec3(Field_41475.get(2576 & 12650), Field_41475.get(8899 & 257), Field_41475.get(263 & -27574));
        int n = bl ? 8257 & 5303 : 128 & -32495;
        float f4 = class_626.\u0000, `(f);
        float f5 = class_626.\u0000= final(f);
        Field_41481 = Class_13337.Method_13350(f5 * (0.73919827f * 4.25f) / (0.71875f * 250.43478f)) * (float)((18317 & -18367) - n * (15534 & -16125));
        Field_41476 = Class_13337.Method_13370(f5 * (3.0434783f * 1.0322376f) / (501.42856f * 0.35897437f)) * (float)((-32507 & 11329) - n * (12291 & -15966));
        Field_41482 = -Field_41476 * Class_13337.Method_13370(f4 * (3.6402583f * 0.8630137f) / (257.14285f * 0.7f)) * (float)((8219 & -31327) - n * (12566 & -31709));
        Field_41479 = Field_41481 * Class_13337.Method_13370(f4 * (0.6494845f * 4.8370557f) / (708.74994f * 0.25396827f)) * (float)((8385 & 4097) - n * (-14285 & 12802));
        Field_41480 = Class_13337.Method_13350(f4 * (2.1612904f * 1.4535728f) / (57.857143f * 3.1111112f));
    }

    private void Method_41488() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static float Method_41489() {
        return Field_41480;
    }

    public static float Method_41490() {
        return Field_41479;
    }

    public static Vec3 Method_41491() {
        return Field_41474;
    }

    static {
        Field_41477 = Class_11552.Method_11558(-32496 & 2192);
        Field_41483 = Class_11552.Method_11553(4272 & 11025);
        Field_41478 = Class_11552.Method_11553(4753 & 16500);
        Field_41475 = Class_11552.Method_11553(28915 & -28925);
        Field_41474 = new Vec3(0.0, 0.0, 0.0);
    }

    public static Vec3 Method_41492(Class_1061 class_1061, double d) {
        double d2 = class_1061.Method_1255() + (class_1061.Field_1130 - class_1061.Method_1255()) * d;
        double d3 = class_1061.Method_1170() + (class_1061.Method_1324() - class_1061.Method_1170()) * d;
        double d4 = class_1061.Method_1271() + (class_1061.Field_1106 - class_1061.Method_1271()) * d;
        double d5 = d2 + Class_41473.Field_41474.\u0000= final;
        double d6 = d3 + Class_41473.Field_41474.\u0000strictfp;
        double d7 = d4 + Class_41473.Field_41474.\u0000, `;
        return new Vec3(d5, d6, d7);
    }

    public static float Method_41493() {
        return Field_41482;
    }
}

