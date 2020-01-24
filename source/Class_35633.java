/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Map;

public class Class_35633
extends Class_32090 {
    protected void Method_35634(Class_859 class_859, float f, float f2) {
        if (class_859 instanceof Class_1456) {
            Class_1456 class_1456 = (Class_1456)class_859;
            Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
            Class_16867.Method_16942();
            Class_35973 class_35973 = (Class_35973)this.\u0000strictfp;
            Class_20842.Method_20844(class_35973, class_1456, f, f2);
        }
    }

    private static Map Method_35635(Class_8491 class_8491) {
        return class_8491.Field_8511;
    }

    private void Method_35636() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_35637(Class_859 class_859, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.Method_35638((Class_1456)class_859, f, f2, f3, f4, f5, f6, f7);
    }

    protected void Method_35638(Class_1456 class_1456, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        super.\u0000strictfp((Class_859)class_1456, f, f2, f3, f4, f5, f6, f7);
        this.Method_35634(class_1456, f7, f3);
    }

    public Class_35633(Class_8491 class_8491, boolean bl) {
        super(class_8491, bl);
    }

    public static void Method_35639() {
        Class_8491 class_8491 = Class_19426.Method_19519().Method_266();
        Map map = Class_35633.Method_35635(class_8491);
        if (map == null) {
            Class_19426.Method_19610("RenderPlayerOF init() failed: RenderManager.MapRenderTypes not found");
        } else {
            map.put("default", new Class_35633(class_8491, (-31722 & 8776) != 0));
            map.put("slim", new Class_35633(class_8491, (2353 & 7) != 0));
        }
    }
}

