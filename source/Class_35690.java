/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.util.vector.Vector3f
 */
import internal.org.lwjgl.util.vector.Vector3f;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_35690
extends Class_27380 {
    boolean Field_35691 = 256 & -32245;
    private Random Field_35692 = new Random();
    private final Class_44252 Field_35693;

    public void Method_35694(Class_1061 class_1061, double d, double d2, double d3, float f, float f2) {
        this.Method_35695((Class_3443)class_1061, d, d2, d3, f, f2);
    }

    public void Method_35695(Class_3443 class_3443, double d, double d2, double d3, float f, float f2) {
        Class_23823 class_23823 = class_3443.Method_3478();
        this.Field_35692.setSeed(8585919L & -8233295847987297029L);
        int n = -31160 & 28709;
        if (this.\u0000, `((Class_1061)class_3443)) {
            this.\u0000strictfp.Field_8506.Method_34709(this.Method_35697(class_3443)).Method_2065((12296 & 898) != 0, (17825 & 2056) != 0);
            n = -24511 & 513;
        }
        Class_16867.Method_16957();
        Class_16867.Method_16967(-21884 & 17220, 0.10350877f * 0.9661017f);
        Class_16867.Method_16947();
        Class_16867.Method_16984(3971 & -23790, -15541 & 6035, 13833 & -16175, 16480 & 14733);
        Class_16867.Method_16961();
        Class_31211 class_31211 = this.Field_35693.Method_44283().Method_24024(class_23823);
        int n2 = this.Method_35700(class_3443, d, d2, d3, f2, class_31211);
        if (this.Field_35691) {
            Class_16867.Method_16940(152.7907f * 1.1780822f - this.\u0000strictfp.Field_8492, 0.0f, 1.0f, 0.0f);
            Class_16867.Method_16973(1.0f, 1.0f, 0.04761905f * 0.021f);
        }
        for (int i = -31306 & 16384; i < n2; ++i) {
            float f3;
            float f4;
            float f5;
            if (class_31211.Method_31212()) {
                Class_16867.Method_16961();
                if (i > 0) {
                    f5 = (this.Field_35692.nextFloat() * 2.0f - 1.0f) * (0.15f * 1.0f);
                    f4 = (this.Field_35692.nextFloat() * 2.0f - 1.0f) * (0.024f * 6.25f);
                    f3 = (this.Field_35692.nextFloat() * 2.0f - 1.0f) * (0.08225807f * 1.8235294f);
                    Class_16867.Method_16943(f5, f4, f3);
                }
                Class_16867.Method_16973(6.6666665f * 0.075f, 0.7894737f * 0.6333333f, 0.6603774f * 0.75714284f);
                class_31211.Method_31215().Method_15872(Class_7673.Field_7676);
                this.Field_35693.Method_44262(class_23823, class_31211);
                Class_16867.Method_16945();
                continue;
            }
            Class_16867.Method_16961();
            class_31211.Method_31215().Method_15872(Class_7673.Field_7676);
            this.Field_35693.Method_44262(class_23823, class_31211);
            Class_16867.Method_16945();
            f5 = class_31211.Method_31215().Field_15865.Field_12059.x;
            f4 = class_31211.Method_31215().Field_15865.Field_12059.y;
            f3 = class_31211.Method_31215().Field_15865.Field_12059.z;
            if (!this.Field_35691) {
                Class_16867.Method_16943(0.0f * f5, 0.0f * f4, 0.1978022f * 0.23697916f * f3);
                continue;
            }
            Class_16867.Method_16928(1.2857143f * -0.03888889f * f5, 0.6125f * 0.08163265f * f4, -0.11960784313725491 * 0.8360655737704918 * (double)f3);
        }
        Class_16867.Method_16945();
        Class_16867.Method_16942();
        Class_16867.Method_16952();
        this.\u0000, `((Class_1061)class_3443);
        if (n != 0) {
            this.\u0000strictfp.Field_8506.Method_34709(this.Method_35697(class_3443)).Method_2067();
        }
        super.Method_27403(class_3443, d, d2, d3, f, f2);
    }

    protected Class_2080 Method_35696(Class_1061 class_1061) {
        return this.Method_35697((Class_3443)class_1061);
    }

    public Class_35690(Class_8491 class_8491, Class_44252 class_44252) {
        super(class_8491);
        this.Field_35693 = class_44252;
        this.\u0000, ` = 0.15f * 1.0f;
        this.\u0000strictfp = 0.43396226f * 1.7282609f;
    }

    protected Class_2080 Method_35697(Class_3443 class_3443) {
        return Class_24069.Field_24084;
    }

    private int Method_35698(Class_23823 class_23823) {
        int n = 5637 & 8475;
        if (class_23823.Field_23826 > (21554 & 308)) {
            n = 6725 & 1287;
        } else if (class_23823.Field_23826 > (8308 & 16808)) {
            n = 18501 & -32756;
        } else if (class_23823.Field_23826 > (2320 & 29819)) {
            n = -11773 & 11611;
        } else if (class_23823.Field_23826 > (57 & -31231)) {
            n = 451 & -31734;
        }
        return n;
    }

    private void Method_35699() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private int Method_35700(Class_3443 class_3443, double d, double d2, double d3, float f, Class_31211 class_31211) {
        float f2;
        Class_23823 class_23823 = class_3443.Method_3478();
        Class_1956 class_1956 = class_23823.Method_23844();
        if (class_1956 == null) {
            return 12384 & -32743;
        }
        boolean bl = class_31211.Method_31212();
        int n = this.Method_35698(class_23823);
        float f3 = 0.3423077f * 0.7303371f;
        float f4 = Class_13337.Method_13370(((float)class_3443.Method_3477() + f) / (108.33333f * 0.092307694f) + class_3443.Field_3448) * (0.017857144f * 5.6f) + 0.4074074f * 0.24545455f;
        float f5 = class_31211.Method_31215().Method_15870((Class_7673)Class_7673.Field_7676).Field_12059.y;
        Class_16867.Method_16943((float)d, (float)d2 + f4 + 0.2734375f * 0.9142857f * f5, (float)d3);
        if (!(bl || this.\u0000strictfp.Field_8501 != null && this.\u0000strictfp.Field_8501.Field_39788)) {
            this.Field_35691 = 12321 & -13311;
        } else {
            f2 = (((float)class_3443.Method_3477() + f) / (0.44444445f * 45.0f) + class_3443.Field_3448) * (32.320694f * 1.7727273f);
            Class_16867.Method_16940(f2, 0.0f, 1.0f, 0.0f);
            this.Field_35691 = 10291 & 256;
        }
        this.Field_35691 = 6306 & 1024;
        if (!bl) {
            f2 = 53.0f * -0.0f * (float)(n - (3137 & 16785)) * (0.6458333f * 0.7741936f);
            float f6 = -0.0f * 45.5f * (float)(n - (-32189 & 18457)) * (0.37234044f * 1.3428571f);
            float f7 = 7.5f * -0.00625f * (float)(n - (2121 & 51)) * (0.05670103f * 8.818182f);
            Class_16867.Method_16943(f2, f6, f7);
        }
        Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
        return n;
    }
}

