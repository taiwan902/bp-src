/*
 * Decompiled with CFR 0.145.
 */
import java.io.File;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_46960
extends Class_45196 {
    public Class_15769 Method_46961(Class_18343 class_18343) {
        File file = this.\u0000strictfp();
        if (class_18343 instanceof Class_19328) {
            File file2 = new File(file, "DIM-1");
            file2.mkdirs();
            return new Class_27702(file2);
        }
        if (class_18343 instanceof Class_19311) {
            File file3 = new File(file, "DIM1");
            file3.mkdirs();
            return new Class_27702(file3);
        }
        return new Class_27702(file);
    }

    private void Method_46962() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_46963() {
        try {
            Class_20117.Method_20123().Method_20124();
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        Class_27544.Method_27547();
    }

    public void Method_46964(Class_31717 class_31717, Class_1699 class_1699) {
        class_31717.Method_31760(-13635 & 27645);
        super.Method_45209(class_31717, class_1699);
    }

    public Class_46960(File file, String string, boolean bl) {
        super(file, string, bl);
    }
}

