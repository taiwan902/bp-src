/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.opengl.GL11
 */
import internal.org.lwjgl.opengl.GL11;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_8128 {
    private boolean Field_8129 = 27418 & 69;
    private final int Field_8130;

    public void Method_8131() {
        this.Method_8134((291 & 21505) != 0);
    }

    private void Method_8132() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_8133() {
        this.Method_8134((-32696 & 11446) != 0);
    }

    public Class_8128(int n) {
        this.Field_8130 = n;
    }

    public void Method_8134(boolean bl) {
        if (bl != this.Field_8129) {
            this.Field_8129 = bl;
            if (bl) {
                GL11.nglEnable((int)this.Field_8130, (long)Class_16867.Field_16893);
            } else {
                GL11.nglDisable((int)this.Field_8130, (long)Class_16867.Field_16871);
            }
        }
    }
}

