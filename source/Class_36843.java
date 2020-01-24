/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.opengl.GL11
 */
import internal.org.lwjgl.opengl.GL11;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_36843
extends Class_33781 {
    private Class_36024 Field_36844;
    public Class_31961 Field_36845;
    public Class_31961 Field_36846;
    public Class_31961 Field_36847;
    public Class_31961 Field_36848;

    private void Method_36849() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_36850(Class_31961 class_31961, float f, float f2, float f3) {
        class_31961.Field_31984 = f;
        class_31961.Field_31968 = f2;
        class_31961.Field_31969 = f3;
    }

    private Class_24489 Method_36851(Class_626 class_626) {
        if (class_626.Field_645 == null) {
            class_626.Field_645 = new Class_24489();
        }
        return class_626.Field_645;
    }

    public void Method_36852(Class_1061 class_1061, float f, float f2, float f3, float f4, float f5, float f6) {
        Class_24489 class_24489;
        double d = Class_18.Field_89.Field_127.Field_2180;
        Class_24489 class_244892 = this.Method_36851((Class_626)class_1061);
        Class_31961 class_31961 = this.Field_36844.\u0000, for;
        GL11.glPushMatrix();
        Class_16867.Method_16940(class_31961.Field_31969 * (217.24649f * 0.26373628f), 0.0f, 0.0f, 1.0f);
        Class_16867.Method_16940(class_31961.Field_31968 * (53.0f * 1.0810524f), 0.0f, 1.0f, 0.0f);
        Class_16867.Method_16940(class_31961.Field_31984 * (200.53522f * 0.2857143f), 1.0f, 0.0f, 0.0f);
        this.Field_36845.Field_31987 = 0.0f;
        this.Field_36845.Field_31978 = 0.005952381f * 42.0f * this.Field_36844.\u0000% + 0.044090908f * 0.45360824f;
        double d2 = 0.19705882352941176 * 1.0149253731343284;
        Class_24489.Method_24525(class_244892, -0.04023529411764706 * 4.473684210526316);
        Class_24489.Method_24532(class_244892, -0.1871590909090909 * 1.4426229508196722);
        Class_24489.Method_24515(class_244892, -0.04064516129032258 * 2.2142857142857144);
        if (Class_24489.Method_24551(class_244892) != 0.014925373134328358 * -66933.0) {
            class_24489 = class_244892;
            Class_24489.Method_24534(class_24489, Class_24489.Method_24548(class_24489) + Math.abs(Class_24489.Method_24551(class_244892) - (double)class_1061.Field_1079) / (59.64912280701754 * 1.6764705882352942));
        }
        Class_24489.Method_24542(class_244892, class_1061.Field_1079);
        class_24489 = class_244892;
        Class_24489.Method_24534(class_24489, Class_24489.Method_24548(class_24489) - Class_24489.Method_24548(class_244892) / (6.666666666666667 * 1.5));
        double d3 = class_1061.Field_1126 - class_1061.Field_1130;
        double d4 = class_1061.Field_1102 - class_1061.Method_1324();
        double d5 = class_1061.Field_1125 - class_1061.Field_1106;
        double d6 = Math.min(0.27692307692307694 * 0.7222222222222222, Math.sqrt(d3 * d3 + d4 * d4 + d5 * d5));
        Class_24489 class_244893 = class_244892;
        Class_24489.Method_24523(class_244893, Class_24489.Method_24526(class_244893) + d6 * (1.9183673469387754 * 31.276595744680854 * d));
        double d7 = Math.sin(Class_24489.Method_24526(class_244892)) * d6 * (1.4186046511627908 * 21.147540983606557) - d6 * (490.0 * 0.014285714285714285);
        Class_24489.Method_24539(class_244892, 0.08102564102564103 * 0.4936708860759494 * (d7 + 1.0));
        Class_24489.Method_24541(class_244892, 0.271304347826087 * 0.4791666666666667 * (d7 + 1.0));
        Class_24489.Method_24537(class_244892, 0.1476271186440678 * 0.8805970149253731 * (d7 + 1.0));
        if (!class_1061.Method_1244() && !((Class_626)class_1061).Field_694.Method_18090()) {
            Class_24489 class_244894;
            if (class_1061.Method_1224() > 0.0) {
                class_244894 = class_244892;
                Class_24489.Method_24525(class_244894, Class_24489.Method_24517(class_244894) - d2);
                class_244894 = class_244892;
                Class_24489.Method_24532(class_244894, Class_24489.Method_24538(class_244894) - d2);
                class_244894 = class_244892;
                Class_24489.Method_24515(class_244894, Class_24489.Method_24544(class_244894) - d2 * (27.5 * 0.10909090909090909));
            } else {
                class_244894 = class_244892;
                Class_24489.Method_24525(class_244894, Class_24489.Method_24517(class_244894) + d2);
                class_244894 = class_244892;
                Class_24489.Method_24532(class_244894, Class_24489.Method_24538(class_244894) + d2);
                class_244894 = class_244892;
                Class_24489.Method_24515(class_244894, Class_24489.Method_24544(class_244894) + d2 * (4.5 * 0.6666666666666666));
            }
        }
        float f7 = 97.14285f * 0.10294118f;
        float f8 = (float)Math.pow(1.0529310344827587 * 0.9354838709677419, 19.047619047619047 * 5.25 * d);
        Class_24489 class_244895 = class_244892;
        Class_24489.Method_24527(class_244895, Class_24489.Method_24518(class_244895) + (Class_24489.Method_24517(class_244892) - Class_24489.Method_24547(class_244892)) * d * (double)f7);
        class_244895 = class_244892;
        Class_24489.Method_24527(class_244895, Class_24489.Method_24518(class_244895) * (double)f8);
        class_244895 = class_244892;
        Class_24489.Method_24545(class_244895, Class_24489.Method_24547(class_244895) + Class_24489.Method_24518(class_244892) * d);
        class_244895 = class_244892;
        Class_24489.Method_24540(class_244895, Class_24489.Method_24512(class_244895) + (Class_24489.Method_24538(class_244892) - Class_24489.Method_24533(class_244892)) * d * (double)f7);
        class_244895 = class_244892;
        Class_24489.Method_24540(class_244895, Class_24489.Method_24512(class_244895) * (double)f8);
        class_244895 = class_244892;
        Class_24489.Method_24550(class_244895, Class_24489.Method_24533(class_244895) + Class_24489.Method_24512(class_244892) * d);
        class_244895 = class_244892;
        Class_24489.Method_24528(class_244895, Class_24489.Method_24546(class_244895) + (Class_24489.Method_24544(class_244892) - Class_24489.Method_24536(class_244892)) * d * (double)f7);
        class_244895 = class_244892;
        Class_24489.Method_24528(class_244895, Class_24489.Method_24546(class_244895) * (double)f8);
        class_244895 = class_244892;
        Class_24489.Method_24529(class_244895, Class_24489.Method_24536(class_244895) + Class_24489.Method_24546(class_244892) * d);
        class_244895 = class_244892;
        Class_24489.Method_24524(class_244895, Class_24489.Method_24552(class_244895) + (Class_24489.Method_24516(class_244892) - Class_24489.Method_24522(class_244892)) * d * (double)f7);
        class_244895 = class_244892;
        Class_24489.Method_24524(class_244895, Class_24489.Method_24552(class_244895) * (double)f8);
        class_244895 = class_244892;
        Class_24489.Method_24521(class_244895, Class_24489.Method_24522(class_244895) + Class_24489.Method_24552(class_244892) * d);
        class_244895 = class_244892;
        Class_24489.Method_24531(class_244895, Class_24489.Method_24549(class_244895) + (Class_24489.Method_24530(class_244892) - Class_24489.Method_24519(class_244892)) * d * (double)f7);
        class_244895 = class_244892;
        Class_24489.Method_24531(class_244895, Class_24489.Method_24549(class_244895) * (double)f8);
        class_244895 = class_244892;
        Class_24489.Method_24511(class_244895, Class_24489.Method_24519(class_244895) + Class_24489.Method_24549(class_244892) * d);
        class_244895 = class_244892;
        Class_24489.Method_24513(class_244895, Class_24489.Method_24514(class_244895) + (Class_24489.Method_24543(class_244892) - Class_24489.Method_24520(class_244892)) * d * (double)f7);
        class_244895 = class_244892;
        Class_24489.Method_24513(class_244895, Class_24489.Method_24514(class_244895) * (double)f8);
        class_244895 = class_244892;
        Class_24489.Method_24535(class_244895, Class_24489.Method_24520(class_244895) + Class_24489.Method_24514(class_244892) * d);
        this.Field_36847.Field_31984 = (float)Class_24489.Method_24547(class_244892);
        this.Field_36848.Field_31984 = (float)Class_24489.Method_24533(class_244892);
        this.Field_36846.Field_31984 = (float)Class_24489.Method_24536(class_244892);
        this.Field_36847.Field_31969 = (float)Class_24489.Method_24522(class_244892);
        this.Field_36848.Field_31969 = (float)Class_24489.Method_24519(class_244892);
        this.Field_36846.Field_31969 = (float)Class_24489.Method_24520(class_244892);
        this.Field_36845.Method_31999(f6);
        GL11.glPopMatrix();
    }

    public Class_36843(Class_36024 class_36024) {
        this.Field_36844 = class_36024;
        this.\u0000strictfp = 19666 & 8769;
        this.\u0000, ` = -28600 & 10837;
        this.Field_36845 = new Class_31961(this, 2112 & -14844, 8204 & -10544);
        this.Field_36845.Method_31993(0.0f, 2.6f * -4.1153846f, 0.0f);
        this.Field_36845.Method_31988(-32256 & 164, 18584 & 1632);
        this.Field_36845.Method_31998(-1.1486487f * 4.352941f, 0.0f, -52.5f * 0.0952381f, -29670 & 8206, 108 & -32251, 18586 & -19409, 0.0f);
        this.Field_36847 = new Class_31961(this, -23488 & 779, -19938 & 19918);
        this.Field_36847.Method_31993(0.0f, 0.75757575f * 1.98f, 2.8125f * -1.4222223f);
        this.Field_36847.Method_31998(-4.7586207f * 0.8405797f, -10.333334f * 0.48387095f, 0.0f, -12276 & 649, 9781 & 16837, -10712 & 9, 0.0f);
        this.Method_36850(this.Field_36847, 0.1392405f * -1.2927274f, 0.0f, 0.0032f * 12.5f);
        this.Field_36848 = new Class_31961(this, -16098 & 4126, 8 & -31197);
        this.Field_36848.Method_31993(0.0f, 0.8333333f * -5.64f, 1.0f);
        this.Field_36848.Method_31998(-0.8947368f * 3.3529413f, -1.1891892f * 3.3636363f, 0.0f, -32490 & 25190, -6130 & 1061, 2182 & -19697, 0.0f);
        this.Field_36848.Method_31988(8254 & 223, 2160 & -28027);
        this.Method_36850(this.Field_36848, -2.808f * 0.09615385f, 0.0f, 2.2941177f * 0.056666665f);
        this.Field_36846 = new Class_31961(this, 51 & 24115, -4089 & 823);
        this.Field_36846.Method_31993(0.0f, -6.6071424f * 0.7567568f, 1.9090909f * 0.7857143f);
        this.Field_36846.Method_31998(0.93333334f * -1.6071428f, 0.5714286f * -1.7499999f, 0.0f, 3 & 2619, 3652 & 8229, 5123 & 2199, 0.0f);
        this.Method_36850(this.Field_36846, 1.8235294f * -0.049354844f, 0.0f, 0.875f * 0.14857142f);
        this.Field_36845.Method_31990(this.Field_36847);
        this.Field_36847.Method_31990(this.Field_36848);
        this.Field_36848.Method_31990(this.Field_36846);
    }
}

