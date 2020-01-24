/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.opengl.ARBShaderObjects
 */
import internal.org.lwjgl.opengl.ARBShaderObjects;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_27375
extends Class_7710 {
    private int Field_27376 = -1 & -1;

    public void Method_27377(int n) {
        if (this.\u0000strictfp() >= 0 && this.Field_27376 != n) {
            ARBShaderObjects.glUniform1iARB((int)this.\u0000strictfp(), (int)n);
            Class_12440.Method_12988(this.\u0000strictfp());
            this.Field_27376 = n;
        }
    }

    private void Method_27378() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_27379() {
        this.Field_27376 = -1 & -1;
    }

    public Class_27375(String string) {
        super(string);
    }
}

