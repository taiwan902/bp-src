/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public abstract class Class_5596
extends Class_3598 {
    protected Class_3957 Field_5597;

    public Class_16702 Method_5598() {
        return Class_16702.Field_16704;
    }

    public void Method_5599(Class_1956 class_1956, Class_3987 class_3987, List list) {
        Class_5607[] arrclass_5607 = Class_5607.Method_5636(this.Method_5605());
        int n = arrclass_5607.length;
        for (int i = 27172 & -28416; i < n; ++i) {
            Class_5607 class_5607 = arrclass_5607[i];
            list.add(new Class_23823(class_1956, 1537 & -12287, class_5607.Method_5652()));
        }
    }

    private void Method_5600() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_3436 Method_5601(int n) {
        return this.\u0000strictfp().Method_3685(this.Method_5603(), (Comparable)((Object)Class_5607.Method_5642(this.Method_5605(), n)));
    }

    protected Class_3855 Method_5602() {
        Class_3538[] arrclass_3538 = new Class_3538[17505 & 4115];
        arrclass_3538[152 & 15365] = this.Method_5603();
        return new Class_3855(this, arrclass_3538);
    }

    public Class_3538 Method_5603() {
        if (this.Field_5597 == null) {
            this.Field_5597 = Class_3957.Method_3962("type", Class_5607.class, new Class_5660(this));
        }
        return this.Field_5597;
    }

    public int Method_5604(Class_3436 class_3436) {
        return ((Class_5607)((Object)class_3436.Method_3440(this.Method_5603()))).Method_5652();
    }

    public abstract Class_5665 Method_5605();

    public int Method_5606(Class_3436 class_3436) {
        return ((Class_5607)((Object)class_3436.Method_3440(this.Method_5603()))).Method_5652();
    }

    protected Class_5596() {
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(this.Method_5603(), (Comparable)((Object)(this.Method_5605() == Class_5665.Field_5666 ? Class_5607.Field_5613 : Class_5607.Field_5615))));
    }
}

