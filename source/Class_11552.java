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
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

public class Class_11552 {
    public static FloatBuffer Method_11553(int n) {
        return Class_11552.Method_11556(n << (18630 & -23261)).asFloatBuffer();
    }

    public static synchronized int Method_11554(int n) {
        int n2 = GL11.glGenLists((int)n);
        if (n2 == 0) {
            int n3 = GL11.glGetError();
            String string = "No error code reported";
            if (n3 != 0) {
                string = GLU.gluErrorString((int)n3);
            }
            throw new IllegalStateException("glGenLists returned an ID of 0 for a count of " + n + ", GL error (" + n3 + "): " + string);
        }
        return n2;
    }

    public static synchronized void Method_11555(int n, int n2) {
        GL11.glDeleteLists((int)n, (int)n2);
    }

    public static synchronized ByteBuffer Method_11556(int n) {
        return ByteBuffer.allocateDirect(n).order(ByteOrder.nativeOrder());
    }

    public static synchronized void Method_11557(int n) {
        GL11.glDeleteLists((int)n, (int)(30339 & 2109));
    }

    public static IntBuffer Method_11558(int n) {
        return Class_11552.Method_11556(n << (27267 & 6)).asIntBuffer();
    }

    private void Method_11559() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

