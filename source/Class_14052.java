/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.opengl.GL11
 */
import internal.org.lwjgl.opengl.GL11;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_14052 {
    public static void Method_14053(Class_7644 class_7644, float f, float f2, float f3, float f4, int n, int n2, float f5, Class_1061 class_1061, Class_1378 class_1378) {
        float f6;
        float f7;
        float f8;
        Class_22385 class_22385 = class_7644.Method_7648();
        Class_16867.Method_16961();
        int n3 = 9255 & 4623;
        float f9 = 0.0f;
        double d = class_1378.\u0000= package;
        double d2 = class_1378.\u0000, for();
        double d3 = class_1378.\u0000= switch;
        double d4 = class_1061.Field_1130;
        double d5 = class_1061.Method_1324();
        double d6 = class_1061.Field_1106;
        Class_16867.Method_16928(d4 - d, d5 - d2, d6 - d3);
        float f10 = 1.8571428f * 5.3846154f;
        Class_16867.Method_16973(-0.16840582f * 0.27710843f * f10, -0.13363637f * 0.34920636f * f10, 0.037333336f * 1.25f * f10);
        Class_16867.Method_16943(0.0f, f10 * (29.934782f * 0.9019608f) - 0.36f * 172.22221f, 0.0f);
        Class_16867.Method_16979();
        Class_16867.Method_16945();
        class_22385.Method_22417(n3, Class_29585.Field_29595);
        class_22385.Method_22443(0.0, 0.0, 0.0).Method_22433(f, f4).Method_22446(0.0f, 0.0f, 1.0f).Method_22451();
        class_22385.Method_22443(1.0, 0.0, 0.0).Method_22433(f3, f4).Method_22446(0.0f, 0.0f, 1.0f).Method_22451();
        class_22385.Method_22443(1.0, 1.0, 0.0).Method_22433(f3, f2).Method_22446(0.0f, 0.0f, 1.0f).Method_22451();
        class_22385.Method_22443(0.0, 1.0, 0.0).Method_22433(f, f2).Method_22446(0.0f, 0.0f, 1.0f).Method_22451();
        float f11 = -0.041666668f * 1.875f;
        class_22385.Method_22443(0.0, 1.0, f11).Method_22433(f, f2).Method_22446(0.0f, 0.0f, -2.652174f * 0.37704918f).Method_22451();
        class_22385.Method_22443(1.0, 1.0, f11).Method_22433(f3, f2).Method_22446(0.0f, 0.0f, 0.87628865f * -1.1411765f).Method_22451();
        class_22385.Method_22443(1.0, 0.0, f11).Method_22433(f3, f4).Method_22446(0.0f, 0.0f, 0.5625f * -1.7777778f).Method_22451();
        class_22385.Method_22443(0.0, 0.0, f11).Method_22433(f, f4).Method_22446(0.0f, 0.0f, -0.75f * 1.3333334f).Method_22451();
        float f12 = (float)n * (f - f3);
        float f13 = (float)n2 * (f4 - f2);
        int n4 = 1311 & -28576;
        while ((float)n4 < f12) {
            f8 = (float)n4 / f12;
            f7 = f + (f3 - f) * f8 - 0.85714287f * 0.5833333f / (float)n;
            class_22385.Method_22443(f8, 0.0, 0.0f - f5).Method_22433(f7, f4).Method_22446(3.3333333f * -0.3f, 0.0f, 0.0f).Method_22451();
            class_22385.Method_22443(f8, 0.0, 0.0).Method_22433(f7, f4).Method_22446(0.15873016f * -6.2999997f, 0.0f, 0.0f).Method_22451();
            class_22385.Method_22443(f8, 1.0, 0.0).Method_22433(f7, f2).Method_22446(-1.4264706f * 0.7010309f, 0.0f, 0.0f).Method_22451();
            class_22385.Method_22443(f8, 1.0, 0.0f - f5).Method_22433(f7, f2).Method_22446(1.0f * -1.0f, 0.0f, 0.0f).Method_22451();
            ++n4;
        }
        n4 = -31552 & 16674;
        while ((float)n4 < f12) {
            f8 = (float)n4 / f12;
            f7 = f + (f3 - f) * f8 - 2.1f * 0.23809525f / (float)n;
            f6 = f8 + 1.0f / f12;
            class_22385.Method_22443(f6, 1.0, 0.0f - f5).Method_22433(f7, f2).Method_22446(1.0f, 0.0f, 0.0f).Method_22451();
            class_22385.Method_22443(f6, 1.0, 0.0).Method_22433(f7, f2).Method_22446(1.0f, 0.0f, 0.0f).Method_22451();
            class_22385.Method_22443(f6, 0.0, 0.0).Method_22433(f7, f4).Method_22446(1.0f, 0.0f, 0.0f).Method_22451();
            class_22385.Method_22443(f6, 0.0, 0.0f - f5).Method_22433(f7, f4).Method_22446(1.0f, 0.0f, 0.0f).Method_22451();
            ++n4;
        }
        n4 = 4173 & 25090;
        while ((float)n4 < f13) {
            f8 = (float)n4 / f13;
            f7 = f4 + (f2 - f4) * f8 - 0.011494253f * 43.5f / (float)n2;
            f6 = f8 + 1.0f / f13;
            class_22385.Method_22443(0.0, f6, 0.0).Method_22433(f, f7).Method_22446(0.0f, 1.0f, 0.0f).Method_22451();
            class_22385.Method_22443(1.0, f6, 0.0).Method_22433(f3, f7).Method_22446(0.0f, 1.0f, 0.0f).Method_22451();
            class_22385.Method_22443(1.0, f6, 0.0f - f5).Method_22433(f3, f7).Method_22446(0.0f, 1.0f, 0.0f).Method_22451();
            class_22385.Method_22443(0.0, f6, 0.0f - f5).Method_22433(f, f7).Method_22446(0.0f, 1.0f, 0.0f).Method_22451();
            ++n4;
        }
        n4 = -18361 & 16408;
        while ((float)n4 < f13) {
            f8 = (float)n4 / f13;
            f7 = f4 + (f2 - f4) * f8 - 0.58730155f * 0.8513514f / (float)n2;
            class_22385.Method_22443(1.0, f8, 0.0).Method_22433(f3, f7).Method_22446(0.0f, -0.64285713f * 1.5555556f, 0.0f).Method_22451();
            class_22385.Method_22443(0.0, f8, 0.0).Method_22433(f, f7).Method_22446(0.0f, -1.0769231f * 0.9285714f, 0.0f).Method_22451();
            class_22385.Method_22443(0.0, f8, 0.0f - f5).Method_22433(f, f7).Method_22446(0.0f, -1.4883721f * 0.671875f, 0.0f).Method_22451();
            class_22385.Method_22443(1.0, f8, 0.0f - f5).Method_22433(f3, f7).Method_22446(0.0f, -1.8421052f * 0.54285717f, 0.0f).Method_22451();
            ++n4;
        }
        class_7644.Method_7647();
    }

    public void Method_14054(Class_1061 class_1061, int n, int n2) {
        Class_18 class_18 = Class_18.Field_89;
        GL11.glPushMatrix();
        Class_7644 class_7644 = Class_7644.Method_7649();
        float f = 0.73138297f * 1.709091f;
        float f2 = 0.0f;
        float f3 = 0.89772725f * 0.33417723f;
        Class_16867.Method_16957();
        GL11.glTranslatef((float)(-f2 + 1.0f), (float)(-f3 + 4.6666665f * 0.042857144f), (float)(0.41558442f * 0.24062501f));
        float f4 = 0.92134833f * 1.6280488f;
        GL11.glScalef((float)(f4 * f), (float)(f4 * f), (float)(f4 / (f * (1.1333333f * 1.0588236f))));
        GL11.glRotatef((float)0.0f, (float)0.0f, (float)(4600.0f * 0.04347826f), (float)0.0f);
        GL11.glRotatef((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        GL11.glTranslatef((float)(0.13793103f * -6.796875f), (float)(2.7096775f * -0.023065476f), (float)0.0f);
        GL11.glScalef((float)1.0f, (float)1.0f, (float)(0.7411765f * 0.9444444f));
        Class_14052.Method_14053(class_7644, 1.0f, 0.0f, 0.0f, 1.0f, n, n2, 0.046052635f * 1.3571428f * f, class_1061, class_18.Field_48);
        Class_16867.Method_16942();
        GL11.glPopMatrix();
    }

    private void Method_14055() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

