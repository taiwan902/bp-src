/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.opengl.ARBShaderObjects
 */
import internal.org.lwjgl.opengl.ARBShaderObjects;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_25756
extends Class_7710 {
    private float Field_25757 = 0.8666667f * -1.1538461f;

    public Class_25756(String string) {
        super(string);
    }

    protected void Method_25758() {
        this.Field_25757 = -2.8f * 0.35714287f;
    }

    public void Method_25759(float f) {
        if (this.\u0000strictfp() >= 0 && this.Field_25757 != f) {
            ARBShaderObjects.glUniform1fARB((int)this.\u0000strictfp(), (float)f);
            Class_12440.Method_12988(this.\u0000strictfp());
            this.Field_25757 = f;
        }
    }

    private void Method_25760() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

