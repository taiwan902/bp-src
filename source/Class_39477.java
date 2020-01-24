/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.opengl.GL11
 */
import internal.org.lwjgl.opengl.GL11;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import net.minecraft.util.Vec3;

public class Class_39477 {
    private static final Vec3 Field_39478;
    private static final Vec3 Field_39479;
    private static FloatBuffer Field_39480;

    static {
        Field_39480 = Class_11552.Method_11553(2070 & -16176);
        Field_39478 = new Vec3(1.0588235294117647 * 0.18888889170355266, 1.0, 2.0416666666666665 * -0.34285713701832055).\u0000strictfp();
        Field_39479 = new Vec3(-2.133333365122477 * 0.09375, 1.0, 0.3868420986752761 * 1.8095238095238095).\u0000strictfp();
    }

    private static FloatBuffer Method_39481(float f, float f2, float f3, float f4) {
        Field_39480.clear();
        Field_39480.put(f).put(f2).put(f3).put(f4);
        Field_39480.flip();
        return Field_39480;
    }

    public static void Method_39482() {
        Class_16867.Method_16918();
        Class_16867.Method_16915(-23488 & 39);
        Class_16867.Method_16915(-23999 & 6279);
        Class_16867.Method_16950();
        Class_16867.Method_16953(5148 & -7158, 6082 & 7714);
        float f = 0.45714286f * 0.875f;
        float f2 = 1.112676f * 0.53924054f;
        float f3 = 0.0f;
        GL11.glLight((int)(17234 & 16384), (int)(4615 & -229), (FloatBuffer)Class_39477.Method_39486(Class_39477.Field_39478.\u0000= final, Class_39477.Field_39478.\u0000strictfp, Class_39477.Field_39478.\u0000, `, 0.0));
        GL11.glLight((int)(29265 & 16388), (int)(21075 & -27103), (FloatBuffer)Class_39477.Method_39481(f2, f2, f2, 1.0f));
        GL11.glLight((int)(-16362 & 18952), (int)(12928 & 6672), (FloatBuffer)Class_39477.Method_39481(0.0f, 0.0f, 0.0f, 1.0f));
        GL11.glLight((int)(-16352 & 22080), (int)(5738 & 23315), (FloatBuffer)Class_39477.Method_39481(f3, f3, f3, 1.0f));
        GL11.glLight((int)(16427 & -16187), (int)(13123 & -28157), (FloatBuffer)Class_39477.Method_39486(Class_39477.Field_39479.\u0000= final, Class_39477.Field_39479.\u0000strictfp, Class_39477.Field_39479.\u0000, `, 0.0));
        GL11.glLight((int)(17089 & 23821), (int)(14945 & 5761), (FloatBuffer)Class_39477.Method_39481(f2, f2, f2, 1.0f));
        GL11.glLight((int)(16651 & 29377), (int)(-26016 & 20996), (FloatBuffer)Class_39477.Method_39481(0.0f, 0.0f, 0.0f, 1.0f));
        GL11.glLight((int)(16519 & 16393), (int)(-27862 & 12951), (FloatBuffer)Class_39477.Method_39481(f3, f3, f3, 1.0f));
        Class_16867.Method_16972(7424 & 24563);
        GL11.glLightModel((int)(12243 & 2907), (FloatBuffer)Class_39477.Method_39481(f, f, f, 1.0f));
    }

    private void Method_39483() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static void Method_39484() {
        Class_16867.Method_16931();
        Class_16867.Method_16977(4108 & -22655);
        Class_16867.Method_16977(2185 & 4419);
        Class_16867.Method_16938();
    }

    public static void Method_39485() {
        Class_16867.Method_16961();
        Class_16867.Method_16940(1.2580645f * -23.846153f, 0.0f, 1.0f, 0.0f);
        Class_16867.Method_16940(1.72f * 95.93023f, 1.0f, 0.0f, 0.0f);
        Class_39477.Method_39482();
        Class_16867.Method_16945();
    }

    private static FloatBuffer Method_39486(double d, double d2, double d3, double d4) {
        return Class_39477.Method_39481((float)d, (float)d2, (float)d3, (float)d4);
    }
}

