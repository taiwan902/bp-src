/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_30038
extends Class_1490 {
    private void Method_30039() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_30040(int n, int n2, int n3) {
        Class_42376 class_42376;
        super.Method_1537(n, n2, n3);
        if (n3 == (8741 & 16513) && (class_42376 = Class_30038.Method_30041(n, n2, this.\u0000strictfp)) != null && class_42376.Field_42388) {
            class_42376.Method_42402(this.\u0000strictfp.Method_245());
            this.Method_30042(class_42376);
        }
    }

    public static Class_42376 Method_30041(int n, int n2, List list) {
        for (int i = 24581 & 5384; i < list.size(); ++i) {
            Class_42376 class_42376 = (Class_42376)list.get(i);
            if (!class_42376.Field_42378) continue;
            int n3 = Class_28242.Method_28252(class_42376);
            int n4 = Class_28242.Method_28255(class_42376);
            if (n < class_42376.Field_42391 || n2 < class_42376.Field_42390 || n >= class_42376.Field_42391 + n3 || n2 >= class_42376.Field_42390 + n4) continue;
            return class_42376;
        }
        return null;
    }

    protected void Method_30042(Class_42376 class_42376) {
    }
}

