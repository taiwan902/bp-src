/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_26824
extends Class_26421 {
    final Class_13528 Field_26825;
    final int Field_26826;

    private void Method_26827() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_26828(Class_23823 class_23823) {
        return (class_23823 == null ? 24900 & -31606 : (class_23823.Method_23844() instanceof Class_37716 ? (((Class_37716)class_23823.Method_23844()).Field_37717 == this.Field_26826 ? 97 & -25077 : 2624 & 16421) : (class_23823.Method_23844() != Class_1956.Method_1981(Class_9265.Field_9337) && class_23823.Method_23844() != Class_10527.Field_10702 ? 3194 & -15871 : (this.Field_26826 == 0 ? 7113 & 1031 : 4133 & 9354)))) != 0;
    }

    public String Method_26829() {
        return Class_37716.Field_37721[this.Field_26826];
    }

    public int Method_26830() {
        return 14851 & 17477;
    }

    Class_26824(Class_13528 class_13528, Class_4961 class_4961, int n, int n2, int n3, int n4) {
        this.Field_26825 = class_13528;
        this.Field_26826 = n4;
        super(class_4961, n, n2, n3);
    }
}

