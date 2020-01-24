/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.opengl.GL11
 */
import internal.org.lwjgl.opengl.GL11;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;

public class Class_15400
extends Class_15030 {
    private void Method_15401() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_15402(Class_17531 class_17531) {
        if (this.\u0000strictfp) {
            if (this.\u0000strictfp.size() == 0) {
                return;
            }
            for (Class_6176 class_6176 : this.\u0000strictfp) {
                Class_15337 class_15337 = (Class_15337)class_6176;
                Class_16867.Method_16961();
                this.\u0000strictfp(class_6176);
                GL11.glCallList((int)class_15337.Method_15341(class_17531, class_15337.\u0000strictfp()));
                Class_16867.Method_16945();
            }
            if (Class_19426.Method_19579()) {
                Class_16867.Method_16975();
            }
            Class_16867.Method_16932();
            this.\u0000strictfp.clear();
        }
    }
}

