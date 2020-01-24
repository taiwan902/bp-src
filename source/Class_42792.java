/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_42792
implements Runnable {
    final Class_39158 Field_42793;
    final Class_47372 Field_42794;
    final Class_37748 Field_42795;

    public void Method_42796() {
        block2 : {
            Class_47372.Method_47426(this.Field_42794).closeOutbound();
            try {
                this.Field_42794.Method_47422(this.Field_42793, Class_16620.Field_16622, this.Field_42795);
                this.Field_42794.Method_47434(this.Field_42793);
            }
            catch (Exception exception) {
                if (this.Field_42795.tryFailure((Throwable)exception)) break block2;
                Class_47372.Method_47412().Method_6127("flush() raised a masked exception.", exception);
            }
        }
    }

    private void Method_42797() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

