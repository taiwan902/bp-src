/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.opengl.GL11
 */
import internal.org.lwjgl.opengl.GL11;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_23033 {
    public boolean Field_23034 = 3 & 20513;
    private boolean Field_23035 = 4096 & 546;
    public int Field_23036 = -28031 & 2929;
    public Class_8128 Field_23037 = new Class_8128(this.Field_23038.Method_14769());
    private Class_14759 Field_23038 = new Class_14759(Class_2263.Method_2329(), Class_2205.Field_2235);

    private Class_23033() {
    }

    private void Method_23039() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_23033(Class_11560 class_11560) {
        this();
    }

    public void Method_23040() {
        if (this.Field_23035) {
            this.Field_23035 = -14252 & 5155;
            GL11.glDisable((int)this.Field_23038.Method_14769());
        }
    }

    public void Method_23041() {
        if (this.Field_23035) {
            return;
        }
        this.Field_23035 = -4047 & 2177;
        GL11.glEnable((int)this.Field_23038.Method_14769());
    }
}

