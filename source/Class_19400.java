/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.opengl.GL11
 */
import internal.org.lwjgl.opengl.GL11;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_19400 {
    int Field_19401;
    private int Field_19402 = -1 & -1;
    private boolean Field_19403 = 17154 & 8332;
    private double Field_19404 = 0.0;
    private double Field_19405 = 0.0;
    private boolean Field_19406 = 1448 & -15856;
    private Class_18 Field_19407;
    private int Field_19408 = 4228 & 3330;
    private double Field_19409 = 0.0;
    float Field_19410;

    public void Method_19411() {
        this.Field_19403 = -16384 & 4493;
    }

    public Class_19400(Class_18 class_18) {
        this.Field_19407 = class_18;
        this.Field_19402 = Class_11552.Method_11554(17561 & 2049);
    }

    private void Method_19412() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_19413(boolean bl, int n, float f) {
        if (this.Field_19406 != bl) {
            this.Field_19403 = -31734 & 27136;
        }
        this.Field_19406 = bl;
        this.Field_19401 = n;
        this.Field_19410 = f;
    }

    public void Method_19414() {
        GL11.glEndList();
        this.Field_19408 = this.Field_19401;
        this.Field_19404 = this.Field_19407.Method_246().Method_1255();
        this.Field_19405 = this.Field_19407.Method_246().Method_1170();
        this.Field_19409 = this.Field_19407.Method_246().Method_1271();
        this.Field_19403 = 1229 & 10259;
        Class_16867.Method_16932();
    }

    public void Method_19415() {
        GL11.glNewList((int)this.Field_19402, (int)(4864 & 7042));
    }

    public void Method_19416() {
        Class_1061 class_1061 = this.Field_19407.Method_246();
        double d = class_1061.Method_1255() + (class_1061.Field_1130 - class_1061.Method_1255()) * (double)this.Field_19410;
        double d2 = class_1061.Method_1170() + (class_1061.Method_1324() - class_1061.Method_1170()) * (double)this.Field_19410;
        double d3 = class_1061.Method_1271() + (class_1061.Field_1106 - class_1061.Method_1271()) * (double)this.Field_19410;
        double d4 = (float)(this.Field_19401 - this.Field_19408) + this.Field_19410;
        float f = (float)(d - this.Field_19404 + d4 * (0.00923076923076923 * 3.25));
        float f2 = (float)(d2 - this.Field_19405);
        float f3 = (float)(d3 - this.Field_19409);
        Class_16867.Method_16961();
        if (this.Field_19406) {
            Class_16867.Method_16943(-f / (7.0f * 1.7142857f), -f2, -f3 / (10.153847f * 1.1818181f));
        } else {
            Class_16867.Method_16943(-f, -f2, -f3);
        }
        Class_16867.Method_16929(this.Field_19402);
        Class_16867.Method_16945();
        Class_16867.Method_16932();
    }

    public boolean Method_19417() {
        if (!this.Field_19403) {
            return (8305 & 4231) != 0;
        }
        if (this.Field_19401 >= this.Field_19408 + (16916 & 9684)) {
            return (-31357 & 1) != 0;
        }
        Class_1061 class_1061 = this.Field_19407.Method_246();
        int n = this.Field_19405 + (double)class_1061.Method_1357() < 272.0 * 0.47058823529411764 + (double)(this.Field_19407.Field_84.Field_39730 * (0.56578946f * 226.23256f)) ? 2209 & -7673 : 9290 & -26620;
        int n2 = class_1061.Method_1170() + (double)class_1061.Method_1357() < 1.6666666666666667 * 76.8 + (double)(this.Field_19407.Field_84.Field_39730 * (45.714287f * 2.8f)) ? 3637 & 16521 : 18444 & -23552;
        return (n2 != n ? -24573 & 521 : -16184 & 10245) != 0;
    }
}

