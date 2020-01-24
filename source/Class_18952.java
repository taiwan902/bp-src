/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;

public class Class_18952 {
    public static ArrayList Field_18953 = new ArrayList();

    private void Method_18954() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static ArrayList Method_18955(Class_570 class_570, double d, Class_1061 class_1061, int n, Class_13180 class_13180) {
        float f = Class_12440.Method_12955();
        ArrayList arrayList = Field_18953;
        arrayList.clear();
        if (f > 0.0f && f < (float)((n - (65 & 16573)) * (4112 & 2490))) {
            int n2 = Class_13337.Method_13362(f / (18.095238f * 0.8842105f)) + (129 & -29119);
            float f2 = class_570.\u0000%((float)d);
            float f3 = Class_12440.Field_12487 * (0.5833333f * 0.029919932f);
            float f4 = f2 > 3.909091f * 0.40183163f && f2 < 3.427192f * 1.375f ? f2 + 15.707964f * 0.2f : f2;
            float f5 = -Class_13337.Method_13370(f4);
            float f6 = Class_13337.Method_13350(f4) * Class_13337.Method_13350(f3);
            float f7 = -Class_13337.Method_13350(f4) * Class_13337.Method_13370(f3);
            Class_4751 class_4751 = new Class_4751(Class_13337.Method_13371(class_1061.Field_1130) >> (9348 & 20526), Class_13337.Method_13371(class_1061.Method_1324()) >> (390 & 16980), Class_13337.Method_13371(class_1061.Field_1106) >> (5133 & 8356));
            Class_4751 class_47512 = class_4751.Method_4774(-f5 * (float)n2, -f6 * (float)n2, -f7 * (float)n2);
            Class_4751 class_47513 = class_4751.Method_4774(f5 * (float)n, f6 * (float)n, f7 * (float)n);
            Class_16680 class_16680 = new Class_16680(class_13180, class_47512, class_47513, n2, n2);
            while (class_16680.Method_16686()) {
                arrayList.add(class_16680.Method_16685());
            }
        } else {
            Class_6176[] arrclass_6176 = class_13180.Field_13185;
            int n3 = arrclass_6176.length;
            for (int i = 19721 & 8192; i < n3; ++i) {
                Class_6176 class_6176 = arrclass_6176[i];
                arrayList.add(class_6176);
            }
        }
        return Field_18953;
    }
}

