/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Map;

public class Class_43794
extends Class_41947 {
    final Class_42827 Field_43795;
    final Class_18163 Field_43796;
    final Map.Entry[] Field_43797;
    final Class_31885 Field_43798;
    final Map.Entry[] Field_43799;

    Class_43794(Class_42827 class_42827, Class_18163 class_18163, Class_31885 class_31885, Map.Entry[] arrentry, Map.Entry[] arrentry2) {
        this.Field_43795 = class_42827;
        this.Field_43796 = class_18163;
        this.Field_43798 = class_31885;
        this.Field_43799 = arrentry;
        this.Field_43797 = arrentry2;
    }

    public void Method_43800(Class_26095 class_26095) {
        Class_31885[] arrclass_31885 = new Class_31885[11319 & 16449];
        arrclass_31885[25647 & -32256] = new Class_46378(this.Field_43796, this.Field_43798, this.Field_43799, this.Field_43797);
        class_26095.Method_26106().Method_6275(arrclass_31885);
    }

    private void Method_43801() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

