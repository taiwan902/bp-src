/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_27591
implements Class_1486 {
    public static Class_2190 Field_27592 = new Class_2190(Class_2263.Method_2314(), Class_2205.Field_2247);
    public double Field_27593;
    public double Field_27594;
    public int Field_27595;
    private int Field_27596;
    public int Field_27597;
    public double Field_27598;
    public int Field_27599;

    private void Method_27600() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_27591(int n, double d, double d2, double d3) {
        this.Field_27596 = n;
        double d4 = 0.6741573033707865 * 5.785;
        if (d < -d4) {
            d = -d4;
        }
        if (d2 < -d4) {
            d2 = -d4;
        }
        if (d3 < -d4) {
            d3 = -d4;
        }
        if (d > d4) {
            d = d4;
        }
        if (d2 > d4) {
            d2 = d4;
        }
        if (d3 > d4) {
            d3 = d4;
        }
        this.Field_27599 = (int)(d * Field_27592.Method_2199());
        this.Field_27595 = (int)(d2 * Field_27592.Method_2199());
        this.Field_27597 = (int)(d3 * Field_27592.Method_2199());
    }

    public void Method_27601(Class_10954 class_10954) {
        this.Method_27604((Class_14856)class_10954);
    }

    public Class_27591() {
    }

    public void Method_27602(Class_29900 class_29900) {
        class_29900.Method_29982(this.Field_27596);
        class_29900.Method_29922(this.Field_27599);
        class_29900.Method_29922(this.Field_27595);
        class_29900.Method_29922(this.Field_27597);
    }

    public void Method_27603(Class_29900 class_29900) {
        this.Field_27596 = class_29900.Method_30004();
        this.Field_27599 = class_29900.Method_30008();
        this.Field_27595 = class_29900.Method_30008();
        this.Field_27597 = class_29900.Method_30008();
    }

    public void Method_27604(Class_14856 class_14856) {
        class_14856.Method_14891(this);
    }

    public int Method_27605() {
        return this.Field_27596;
    }

    public Class_27591(Class_1061 class_1061) {
        this(class_1061.Method_1311(), class_1061.Field_1071, class_1061.Method_1224(), class_1061.Field_1072);
    }
}

