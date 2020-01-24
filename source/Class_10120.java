/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.opengl.GL11
 */
import internal.org.lwjgl.opengl.GL11;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_10120
implements Callable {
    final Class_18 Field_10121;

    public Object Method_10122() {
        return this.Method_10123();
    }

    public String Method_10123() {
        return GL11.glGetString((int)(7937 & 7983)) + " GL version " + GL11.glGetString((int)(-24638 & 24323)) + ", " + GL11.glGetString((int)(-16400 & 7948));
    }

    private void Method_10124() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_10120(Class_18 class_18) {
        this.Field_10121 = class_18;
    }
}

