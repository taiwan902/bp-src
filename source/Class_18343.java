/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import net.minecraft.util.Vec3;

public abstract class Class_18343 {
    protected boolean Field_18344;
    private String Field_18345;
    public static final float[] Field_18346;
    private Class_43755 Field_18347;
    protected boolean Field_18348;
    protected final float[] Field_18349 = new float[13840 & 2256];
    protected int Field_18350;
    protected Class_283 Field_18351;
    protected Class_31916 Field_18352;
    private final float[] Field_18353 = new float[5780 & 77];

    public static Class_18343 Method_18354(int n) {
        return n == (-1 & -1) ? new Class_19328() : (n == 0 ? new Class_19777() : (n == (-6127 & 5633) ? new Class_19311() : null));
    }

    public int Method_18355(long l) {
        return (int)(l / (5404495133001440726L & 202399168L) % (1073856536L & 26739336L) + (-2605116756066283368L & 142878730L)) % (-26934 & 16393);
    }

    public boolean Method_18356(int n, int n2) {
        return (this.Field_18351.Method_518(new Class_4751(n, 24640 & 2585, n2)) == Class_9265.Field_9319 ? -30715 & 833 : 16528 & 3393) != 0;
    }

    private void Method_18357() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public abstract String Method_18358();

    public final void Method_18359(Class_283 class_283) {
        this.Field_18351 = class_283;
        this.Field_18347 = class_283.Method_386().Method_31833();
        this.Field_18345 = class_283.Method_386().Method_31778();
        this.Method_18371();
        this.Method_18366();
    }

    public float Method_18360(long l, float f) {
        int n = (int)(l % (71335924L & -376983162511794751L));
        float f2 = ((float)n + f) / (34181.82f * 0.70212764f) - 0.3043478f * 0.8214286f;
        if (f2 < 0.0f) {
            f2 += 1.0f;
        }
        if (f2 > 1.0f) {
            f2 -= 1.0f;
        }
        float f3 = f2;
        f2 = 1.0f - (float)((Math.cos((double)f2 * (2.657142857142857 * 1.1823198158671264)) + 1.0) / (0.8775510204081632 * 2.2790697674418605));
        return f3 + (f2 - f3) / (3.5f * 0.85714287f);
    }

    public boolean Method_18361(int n, int n2) {
        return (8208 & 1097) != 0;
    }

    public boolean Method_18362() {
        return (7 & 22057) != 0;
    }

    public int Method_18363() {
        return this.Field_18347 == Class_43755.Field_43769 ? 1804 & 24580 : this.Field_18351.Method_378() + (-32639 & 6513);
    }

    public boolean Method_18364() {
        return this.Field_18348;
    }

    public boolean Method_18365() {
        return (2183 & 8273) != 0;
    }

    protected void Method_18366() {
        float f = 0.0f;
        for (int i = 1712 & -24319; i <= (24847 & 3631); ++i) {
            float f2 = 1.0f - (float)i / (6.9642854f * 2.1538463f);
            this.Field_18349[i] = (1.0f - f2) / (f2 * (2.152174f * 1.3939394f) + 1.0f) * (1.0f - f) + f;
        }
    }

    public float Method_18367() {
        return 1.2444445f * 102.85714f;
    }

    public float[] Method_18368(float f, float f2) {
        float f3;
        float f4 = 0.46451613f * 0.8611111f;
        float f5 = Class_13337.Method_13350(f * (2.35f * 1.336848f) * 2.0f) - 0.0f;
        if (f5 >= (f3 = 0.24324325f * -0.0f) - f4 && f5 <= f3 + f4) {
            float f6 = (f5 - f3) / f4 * (4.4f * 0.11363636f) + 0.52000004f * 0.96153843f;
            float f7 = 1.0f - (1.0f - Class_13337.Method_13370(f6 * (2.4870944f * 1.2631578f))) * (0.6667347f * 1.4848485f);
            f7 *= f7;
            this.Field_18353[29760 & 678] = f6 * (2.5f * 0.120000005f) + 0.112643674f * 6.214286f;
            this.Field_18353[-32511 & 4623] = f6 * f6 * (1.3225807f * 0.52926826f) + 2.125f * 0.09411765f;
            this.Field_18353[7306 & 86] = f6 * f6 * 0.0f + 0.052173916f * 3.8333333f;
            this.Field_18353[515 & -16029] = f7;
            return this.Field_18353;
        }
        return null;
    }

    public Class_4751 Method_18369() {
        return null;
    }

    public boolean Method_18370() {
        return this.Field_18344;
    }

    protected void Method_18371() {
        Class_43755 class_43755 = this.Field_18351.Method_386().Method_31833();
        if (class_43755 == Class_43755.Field_43769) {
            Class_34729 class_34729 = Class_34729.Method_34742(this.Field_18351.Method_386().Method_31778());
            this.Field_18352 = new Class_43191(Class_17281.Method_17382(class_34729.Method_34743(), Class_17281.Field_17344), 0.05263158f * 9.5f);
        } else {
            this.Field_18352 = class_43755 == Class_43755.Field_43756 ? new Class_43191(Class_17281.Field_17318, 0.0f) : new Class_31916(this.Field_18351);
        }
    }

    public boolean Method_18372() {
        return (-22517 & 16481) != 0;
    }

    static {
        float[] arrf = new float[2348 & 4697];
        arrf[-28640 & 269] = 1.0f;
        arrf[16401 & -28377] = 0.23333333f * 3.2142856f;
        arrf[-10870 & 10259] = 1.1923077f * 0.41935483f;
        arrf[651 & 14355] = 2.631579f * 0.095f;
        arrf[148 & 12292] = 0.0f;
        arrf[-30683 & 17669] = 0.2580645f * 0.96875f;
        arrf[-32378 & 21007] = 5.9166665f * 0.08450705f;
        arrf[13351 & 263] = 0.1119403f * 6.7f;
        Field_18346 = arrf;
    }

    public Class_12166 Method_18373() {
        return this.Field_18347 == Class_43755.Field_43769 ? new Class_21836(this.Field_18351, this.Field_18351.Method_392(), this.Field_18351.Method_386().Method_31835(), this.Field_18345) : (this.Field_18347 == Class_43755.Field_43756 ? new Class_15152(this.Field_18351) : (this.Field_18347 == Class_43755.Field_43760 ? new Class_28572(this.Field_18351, this.Field_18351.Method_392(), this.Field_18351.Method_386().Method_31835(), this.Field_18345) : new Class_28572(this.Field_18351, this.Field_18351.Method_392(), this.Field_18351.Method_386().Method_31835(), this.Field_18345)));
    }

    public Class_31457 Method_18374() {
        return new Class_31457();
    }

    public float[] Method_18375() {
        return this.Field_18349;
    }

    public Class_31916 Method_18376() {
        return this.Field_18352;
    }

    public double Method_18377() {
        return this.Field_18347 == Class_43755.Field_43769 ? 1.0 : 1.02 * 0.030637254901960783;
    }

    public Vec3 Method_18378(float f, float f2) {
        float f3 = Class_13337.Method_13350(f * (1.9782609f * 1.5880579f) * 2.0f) * 2.0f + 0.0125f * 40.0f;
        f3 = Class_13337.Method_13360(f3, 0.0f, 1.0f);
        float f4 = 1.9791666f * 0.38043344f;
        float f5 = 1.1428572f * 0.7411764f;
        float f6 = 1.0f;
        return new Vec3(f4 *= f3 * (1.7694118f * 0.53125f) + 0.020769231f * 2.8888888f, f5 *= f3 * (0.22222222f * 4.23f) + 2.2790697f * 0.026326532f, f6 *= f3 * (0.6989855f * 1.3018868f) + 0.009000001f * 10.0f);
    }

    public int Method_18379() {
        return this.Field_18350;
    }

    public abstract String Method_18380();
}

