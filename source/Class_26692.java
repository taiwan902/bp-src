/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.Map;

public class Class_26692 {
    public static double Field_26693;
    private Map Field_26694 = Maps.newHashMap();
    public float Field_26695;
    public double Field_26696;
    public static Class_26692 Field_26697;
    public Class_1061 Field_26698;
    public static double Field_26699;
    public double Field_26700;
    public Class_283 Field_26701;
    public float Field_26702;
    private Class_28636 Field_26703;
    public double Field_26704;
    public static double Field_26705;
    public Class_34695 Field_26706;

    public Class_11681 Method_26707(Class_4879 class_4879) {
        return class_4879 == null ? null : this.Method_26714(class_4879.getClass());
    }

    private Class_26692() {
        this.Field_26694.put(Class_33614.class, new Class_19388());
        this.Field_26694.put(Class_36325.class, new Class_12066());
        this.Field_26694.put(Class_5568.class, new Class_13984());
        this.Field_26694.put(Class_36146.class, new Class_29710());
        this.Field_26694.put(Class_39196.class, new Class_34465());
        this.Field_26694.put(Class_33962.class, new Class_23053());
        this.Field_26694.put(Class_38552.class, new Class_14041());
        this.Field_26694.put(Class_47216.class, new Class_22024());
        this.Field_26694.put(Class_37700.class, new Class_23991());
        this.Field_26694.put(Class_39935.class, new Class_13519());
        for (Class_11681 class_11681 : this.Field_26694.values()) {
            class_11681.Method_11697(this);
        }
    }

    public void Method_26708(Class_4879 class_4879, double d, double d2, double d3, float f) {
        this.Method_26711(class_4879, d, d2, d3, f, -1 & -1);
    }

    static {
        Field_26697 = new Class_26692();
    }

    private void Method_26709() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_26710(Class_283 class_283) {
        this.Field_26701 = class_283;
    }

    public void Method_26711(Class_4879 class_4879, double d, double d2, double d3, float f, int n) {
        Class_11681 class_11681 = this.Method_26707(class_4879);
        if (class_11681 != null) {
            try {
                class_11681.Method_11700(class_4879, d, d2, d3, f, n);
            }
            catch (Throwable throwable) {
                Class_13268 class_13268 = Class_13268.Method_13285(throwable, "Rendering Block Entity");
                Class_13220 class_13220 = class_13268.Method_13280("Block Entity Details");
                class_4879.Method_4932(class_13220);
                throw new Class_1809(class_13268);
            }
        }
    }

    public void Method_26712(Class_4879 class_4879, float f, int n) {
        if (class_4879.Method_4897(this.Field_26700, this.Field_26696, this.Field_26704) < class_4879.Method_4927()) {
            int n2 = this.Field_26701.Method_404(class_4879.Method_4903(), 8896 & 2050);
            int n3 = n2 % (5330070 & 53051432);
            int n4 = n2 / (-2075799997 & 1107894404);
            Class_32876.Method_32943(Class_32876.Field_32911, (float)n3 / 1.0f, (float)n4 / 1.0f);
            Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
            Class_4751 class_4751 = class_4879.Method_4903();
            this.Method_26711(class_4879, (double)class_4751.\u0000= final() - Field_26693, (double)class_4751.\u0000, `() - Field_26705, (double)class_4751.\u0000strictfp() - Field_26699, f, n);
        }
    }

    public Class_28636 Method_26713() {
        return this.Field_26703;
    }

    public Class_11681 Method_26714(Class class_) {
        Class_11681 class_11681 = (Class_11681)this.Field_26694.get(class_);
        if (class_11681 == null && class_ != Class_4879.class) {
            class_11681 = this.Method_26714(class_.getSuperclass());
            this.Field_26694.put(class_, class_11681);
        }
        return class_11681;
    }

    public void Method_26715(Class_283 class_283, Class_34695 class_34695, Class_28636 class_28636, Class_1061 class_1061, float f) {
        if (this.Field_26701 != class_283) {
            this.Method_26710(class_283);
        }
        this.Field_26706 = class_34695;
        this.Field_26698 = class_1061;
        this.Field_26703 = class_28636;
        this.Field_26695 = class_1061.Field_1145 + (class_1061.Field_1079 - class_1061.Field_1145) * f;
        this.Field_26702 = class_1061.Field_1078 + (class_1061.Field_1093 - class_1061.Field_1078) * f;
        this.Field_26700 = class_1061.Field_1126 + (class_1061.Field_1130 - class_1061.Field_1126) * (double)f;
        this.Field_26696 = class_1061.Field_1102 + (class_1061.Method_1324() - class_1061.Field_1102) * (double)f;
        this.Field_26704 = class_1061.Field_1125 + (class_1061.Field_1106 - class_1061.Field_1125) * (double)f;
    }
}

