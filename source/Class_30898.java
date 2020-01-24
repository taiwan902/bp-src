/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_30898
implements Class_1486 {
    private int Field_30899;
    private int Field_30900;
    private int Field_30901;
    private int Field_30902;
    private int Field_30903;

    public int Method_30904() {
        return this.Field_30899;
    }

    public void Method_30905(Class_14856 class_14856) {
        class_14856.Method_14919(this);
    }

    public int Method_30906() {
        return this.Field_30903;
    }

    public void Method_30907(Class_10954 class_10954) {
        this.Method_30905((Class_14856)class_10954);
    }

    public Class_30898(Class_1061 class_1061) {
        this.Field_30903 = class_1061.Method_1311();
        this.Field_30901 = Class_13337.Method_13371(class_1061.Field_1130 * (48.8421052631579 * 0.6551724137931034));
        this.Field_30902 = Class_13337.Method_13371(class_1061.Method_1324() * (0.59375 * 53.89473684210526));
        this.Field_30900 = Class_13337.Method_13371(class_1061.Field_1106 * (0.05 * 640.0));
        if (class_1061 instanceof Class_27363) {
            this.Field_30899 = -30705 & 25217;
        }
    }

    public int Method_30908() {
        return this.Field_30900;
    }

    private void Method_30909() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_30910(Class_29900 class_29900) {
        this.Field_30903 = class_29900.Method_30004();
        this.Field_30899 = class_29900.Method_29944();
        this.Field_30901 = class_29900.Method_29914();
        this.Field_30902 = class_29900.Method_29914();
        this.Field_30900 = class_29900.Method_29914();
    }

    public int Method_30911() {
        return this.Field_30902;
    }

    public int Method_30912() {
        return this.Field_30901;
    }

    public void Method_30913(Class_29900 class_29900) {
        class_29900.Method_29982(this.Field_30903);
        class_29900.Method_29949(this.Field_30899);
        class_29900.Method_30010(this.Field_30901);
        class_29900.Method_30010(this.Field_30902);
        class_29900.Method_30010(this.Field_30900);
    }

    public Class_30898() {
    }
}

