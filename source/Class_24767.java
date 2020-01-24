/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_24767 {
    final int Field_24768;
    Class_26851[] Field_24769;
    int Field_24770;
    Class_26851 Field_24771;
    int Field_24772;
    int Field_24773;

    private void Method_24774() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_24767(Class_26851[] arrclass_26851, int n, int n2, int n3) {
        this.Field_24769 = arrclass_26851;
        this.Field_24768 = n;
        this.Field_24773 = this.Field_24770 = n2;
        this.Field_24772 = n3;
        this.Field_24771 = null;
    }

    final Class_26851 Method_24775() {
        Class_26851 class_26851 = this.Field_24771;
        if (class_26851 != null) {
            class_26851 = class_26851.Field_26854;
        }
        do {
            Class_26851[] arrclass_26851;
            int n;
            int n2;
            if (class_26851 != null) {
                this.Field_24771 = class_26851;
                return this.Field_24771;
            }
            if (this.Field_24773 >= this.Field_24772 || (arrclass_26851 = this.Field_24769) == null || (n2 = arrclass_26851.length) <= (n = this.Field_24770) || n < 0) {
                this.Field_24771 = null;
                return null;
            }
            class_26851 = Class_21500.Method_21573(arrclass_26851, this.Field_24770);
            if (class_26851 != null && class_26851.Field_26852 < 0) {
                if (class_26851 instanceof Class_44580) {
                    this.Field_24769 = ((Class_44580)class_26851).Field_44581;
                    class_26851 = null;
                    continue;
                }
                class_26851 = class_26851 instanceof Class_29689 ? ((Class_29689)class_26851).Field_29691 : null;
            }
            if ((this.Field_24770 += this.Field_24768) < n2) continue;
            this.Field_24770 = this.Field_24773 += 5391 & 26833;
        } while (true);
    }
}

