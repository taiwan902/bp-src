/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_21029
implements Class_1486 {
    private int[] Field_21030;
    private float Field_21031;
    private float Field_21032;
    private int Field_21033;
    private boolean Field_21034;
    private float Field_21035;
    private float Field_21036;
    private float Field_21037;
    private float Field_21038;
    private Class_40274 Field_21039;
    private float Field_21040;

    private void Method_21041() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_21042(Class_14856 class_14856) {
        class_14856.Method_14901(this);
    }

    public double Method_21043() {
        return this.Field_21038;
    }

    public void Method_21044(Class_29900 class_29900) {
        this.Field_21039 = Class_40274.Method_40359(class_29900.Method_29914());
        if (this.Field_21039 == null) {
            this.Field_21039 = Class_40274.Field_40284;
        }
        this.Field_21034 = class_29900.Method_29962();
        this.Field_21040 = class_29900.Method_29966();
        this.Field_21036 = class_29900.Method_29966();
        this.Field_21038 = class_29900.Method_29966();
        this.Field_21035 = class_29900.Method_29966();
        this.Field_21032 = class_29900.Method_29966();
        this.Field_21037 = class_29900.Method_29966();
        this.Field_21031 = class_29900.Method_29966();
        this.Field_21033 = class_29900.Method_29914();
        int n = this.Field_21039.Method_40329();
        this.Field_21030 = new int[n];
        for (int i = -29672 & 68; i < n; ++i) {
            this.Field_21030[i] = class_29900.Method_30004();
        }
    }

    public void Method_21045(Class_29900 class_29900) {
        class_29900.Method_30010(this.Field_21039.Method_40336());
        class_29900.Method_29980(this.Field_21034);
        class_29900.Method_29939(this.Field_21040);
        class_29900.Method_29939(this.Field_21036);
        class_29900.Method_29939(this.Field_21038);
        class_29900.Method_29939(this.Field_21035);
        class_29900.Method_29939(this.Field_21032);
        class_29900.Method_29939(this.Field_21037);
        class_29900.Method_29939(this.Field_21031);
        class_29900.Method_30010(this.Field_21033);
        int n = this.Field_21039.Method_40329();
        for (int i = 537 & 28672; i < n; ++i) {
            class_29900.Method_29982(this.Field_21030[i]);
        }
    }

    public Class_21029() {
    }

    public float Method_21046() {
        return this.Field_21031;
    }

    public float Method_21047() {
        return this.Field_21037;
    }

    public float Method_21048() {
        return this.Field_21032;
    }

    public int Method_21049() {
        return this.Field_21033;
    }

    public void Method_21050(Class_10954 class_10954) {
        this.Method_21042((Class_14856)class_10954);
    }

    public Class_21029(Class_40274 class_40274, boolean bl, float f, float f2, float f3, float f4, float f5, float f6, float f7, int n, int ... arrn) {
        this.Field_21039 = class_40274;
        this.Field_21034 = bl;
        this.Field_21040 = f;
        this.Field_21036 = f2;
        this.Field_21038 = f3;
        this.Field_21035 = f4;
        this.Field_21032 = f5;
        this.Field_21037 = f6;
        this.Field_21031 = f7;
        this.Field_21033 = n;
        this.Field_21030 = arrn;
    }

    public boolean Method_21051() {
        return this.Field_21034;
    }

    public double Method_21052() {
        return this.Field_21036;
    }

    public int[] Method_21053() {
        return this.Field_21030;
    }

    public Class_40274 Method_21054() {
        return this.Field_21039;
    }

    public float Method_21055() {
        return this.Field_21035;
    }

    public double Method_21056() {
        return this.Field_21040;
    }
}

