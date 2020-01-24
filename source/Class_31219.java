/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.opengl.ARBShaderObjects
 */
import internal.org.lwjgl.opengl.ARBShaderObjects;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_31219
extends Class_7710 {
    private float[] Field_31220 = new float[-24356 & 1797];

    private void Method_31221() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_31219(String string) {
        super(string);
    }

    protected void Method_31222() {
        this.Field_31220[17222 & 3249] = 0.0f;
        this.Field_31220[16643 & 8313] = 0.0f;
        this.Field_31220[1126 & 12811] = 0.0f;
        this.Field_31220[27 & 22787] = 0.0f;
    }

    public void Method_31223(float f, float f2, float f3, float f4) {
        if (this.\u0000strictfp() >= 0 && (this.Field_31220[11720 & -32764] != f || this.Field_31220[4777 & -24511] != f2 || this.Field_31220[-32758 & 16450] != f3 || this.Field_31220[16483 & 4883] != f4)) {
            ARBShaderObjects.glUniform4fARB((int)this.\u0000strictfp(), (float)f, (float)f2, (float)f3, (float)f4);
            Class_12440.Method_12988(this.\u0000strictfp());
            this.Field_31220[-31647 & 20480] = f;
            this.Field_31220[3089 & -16351] = f2;
            this.Field_31220[20486 & 11514] = f3;
            this.Field_31220[931 & -10217] = f4;
        }
    }
}

