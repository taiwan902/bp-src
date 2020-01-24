/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.opengl.ARBShaderObjects
 */
import internal.org.lwjgl.opengl.ARBShaderObjects;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public abstract class Class_7710 {
    private String Field_7711;
    private int Field_7712 = -1 & -1;
    private int Field_7713 = -1 & -1;

    public Class_7710(String string) {
        this.Field_7711 = string;
    }

    public String Method_7714() {
        return this.Field_7711;
    }

    public int Method_7715() {
        return this.Field_7712;
    }

    public boolean Method_7716() {
        return (this.Field_7712 >= 0 ? -21127 & 5 : 3204 & -15768) != 0;
    }

    protected abstract void Method_7717();

    private void Method_7718() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_7719(int n) {
        if (this.Field_7713 != n) {
            this.Field_7713 = n;
            this.Field_7712 = ARBShaderObjects.glGetUniformLocationARB((int)n, (CharSequence)this.Field_7711);
            this.Method_7717();
        }
    }
}

