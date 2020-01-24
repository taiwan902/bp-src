/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_33586
implements Class_1486 {
    private Class_1782[] Field_33587;
    private Class_4751 Field_33588;

    public Class_4751 Method_33589() {
        return this.Field_33588;
    }

    public void Method_33590(Class_10930 class_10930) {
        class_10930.Method_10941(this);
    }

    public Class_1782[] Method_33591() {
        return this.Field_33587;
    }

    public void Method_33592(Class_29900 class_29900) {
        this.Field_33588 = class_29900.Method_29910();
        this.Field_33587 = new Class_1782[541 & -18236];
        for (int i = 0 & 17483; i < (8740 & 18445); ++i) {
            Class_1782 class_1782;
            String string = class_29900.Method_29991(-31294 & 2972);
            this.Field_33587[i] = class_1782 = Class_2814.Method_2819(string);
        }
    }

    public void Method_33593(Class_29900 class_29900) {
        class_29900.Method_29996(this.Field_33588);
        for (int i = 9984 & 16392; i < (5 & 14932); ++i) {
            Class_1782 class_1782 = this.Field_33587[i];
            String string = Class_2814.Method_2821(class_1782);
            class_29900.Method_29960(string);
        }
    }

    public void Method_33594(Class_10954 class_10954) {
        this.Method_33590((Class_10930)class_10954);
    }

    public Class_33586() {
    }

    public Class_33586(Class_4751 class_4751, Class_1782[] arrclass_1782) {
        this.Field_33588 = class_4751;
        Class_1782[] arrclass_17822 = new Class_1782[8453 & -26546];
        arrclass_17822[16640 & 68] = arrclass_1782[-28160 & 17425];
        arrclass_17822[-15229 & 4625] = arrclass_1782[21513 & 149];
        arrclass_17822[4358 & 27667] = arrclass_1782[147 & -28658];
        arrclass_17822[22931 & -24057] = arrclass_1782[24199 & 75];
        this.Field_33587 = arrclass_17822;
    }

    private void Method_33595() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

