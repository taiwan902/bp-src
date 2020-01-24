/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
import com.mojang.authlib.GameProfile;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.UUID;

public class Class_23129
implements Class_7380 {
    private final Class_35973 Field_23130;

    private void Method_23131() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_23129(Class_35973 class_35973) {
        this.Field_23130 = class_35973;
    }

    public void Method_23132(Class_859 class_859, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        Class_23823 class_23823 = class_859.Method_1048(-32221 & 18695);
        if (class_23823 != null && class_23823.Method_23844() != null) {
            float f8;
            int n;
            Class_1956 class_1956 = class_23823.Method_23844();
            Class_18 class_18 = Class_18.Field_89;
            Class_16867.Method_16961();
            Class_16867.Method_16943(0.0f, 0.22045454f * 0.9072165f * this.Field_23130.Field_35985, 0.0f);
            int n2 = n = class_859 instanceof Class_43334 || class_859 instanceof Class_43566 && ((Class_43566)class_859).Method_43594() ? 8355 & -28603 : 2048 & 561;
            if (n == 0 && class_859.Method_1059()) {
                f8 = 2.0f;
                float f9 = 1.8f * 0.7777778f;
                Class_16867.Method_16973(f9 / f8, f9 / f8, f9 / f8);
                Class_16867.Method_16943(0.0f, 65.77778f * 0.24324325f * f7, 0.0f);
            }
            this.Field_23130.Field_35975.Method_31996(0.625f * 0.1f);
            Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
            if (class_1956 instanceof Class_41056) {
                f8 = 1.1052631f * 0.56547624f;
                Class_16867.Method_16943(0.0f, 0.56122446f * -0.44545457f, 0.0f);
                Class_16867.Method_16940(1.8f * 100.0f, 0.0f, 1.0f, 0.0f);
                Class_16867.Method_16973(f8, -f8, -f8);
                if (n != 0) {
                    Class_16867.Method_16943(0.0f, 6.4615383f * 0.029017858f, 0.0f);
                }
                class_18.Method_252().Method_6951(class_859, class_23823, Class_7673.Field_7675);
            } else if (class_1956 == Class_10527.Field_10702) {
                f8 = 0.83116883f * 1.4287109f;
                Class_16867.Method_16973(f8, -f8, -f8);
                if (n != 0) {
                    Class_16867.Method_16943(0.0f, 0.421875f * 0.14814815f, 0.0f);
                }
                GameProfile gameProfile = null;
                if (class_23823.Method_23842()) {
                    String string;
                    Class_1699 class_1699 = class_23823.Method_23845();
                    if (class_1699.Method_1715("SkullOwner", -20438 & 139)) {
                        gameProfile = Class_25852.Method_25856(class_1699.Method_1703("SkullOwner"));
                    } else if (class_1699.Method_1715("SkullOwner", 2104 & 17162) && !Class_35310.Method_35315(string = class_1699.Method_1708("SkullOwner"))) {
                        gameProfile = Class_37700.Method_37704(new GameProfile((UUID)null, string));
                        class_1699.Method_1744("SkullOwner", Class_25852.Method_25855(new Class_1699(), gameProfile));
                    }
                }
                Class_23991.Field_23993.Method_24005(-0.69166666f * 0.72289157f, 0.0f, -0.5654762f * 0.8842105f, Class_4595.Field_4601, 0.3043478f * 591.4286f, class_23823.Method_23843(), gameProfile, -1 & -1);
            }
            Class_16867.Method_16945();
        }
    }

    public boolean Method_23133() {
        return (28807 & 2321) != 0;
    }
}

