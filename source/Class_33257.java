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

public class Class_33257 {
    private Class_36146 Field_33258 = new Class_36146(65 & -32467);
    public static Class_33257 Field_33259 = new Class_33257();
    private Class_37700 Field_33260 = new Class_37700();
    private Class_39196 Field_33261 = new Class_39196();
    private Class_36146 Field_33262 = new Class_36146(3232 & -24564);
    private Class_39935 Field_33263 = new Class_39935();

    public void Method_33264(Class_23823 class_23823) {
        if (class_23823.Method_23844() == Class_10527.Field_10711) {
            this.Field_33263.Method_39954(class_23823);
            Class_26692.Field_26697.Method_26708(this.Field_33263, 0.0, 0.0, 0.0, 0.0f);
        } else if (class_23823.Method_23844() == Class_10527.Field_10702) {
            GameProfile gameProfile = null;
            if (class_23823.Method_23842()) {
                Class_1699 class_1699 = class_23823.Method_23845();
                if (class_1699.Method_1715("SkullOwner", 523 & 22762)) {
                    gameProfile = Class_25852.Method_25856(class_1699.Method_1703("SkullOwner"));
                } else if (class_1699.Method_1715("SkullOwner", 1322 & -32568) && class_1699.Method_1708("SkullOwner").length() > 0) {
                    gameProfile = new GameProfile((UUID)null, class_1699.Method_1708("SkullOwner"));
                    gameProfile = Class_37700.Method_37704(gameProfile);
                    class_1699.Method_1740("SkullOwner");
                    class_1699.Method_1744("SkullOwner", Class_25852.Method_25855(new Class_1699(), gameProfile));
                }
            }
            if (Class_23991.Field_23993 != null) {
                Class_16867.Method_16961();
                Class_16867.Method_16943(-0.3f * 1.6666666f, 0.0f, -0.041666668f * 12.0f);
                Class_16867.Method_16973(2.0f, 2.0f, 2.0f);
                Class_16867.Method_16969();
                Class_23991.Field_23993.Method_24005(0.0f, 0.0f, 0.0f, Class_4595.Field_4601, 0.0f, class_23823.Method_23843(), gameProfile, -1 & -1);
                Class_16867.Method_16979();
                Class_16867.Method_16945();
            }
        } else {
            Class_3238 class_3238 = Class_3238.Method_3345(class_23823.Method_23844());
            if (class_3238 == Class_9265.Field_9372) {
                Class_26692.Field_26697.Method_26708(this.Field_33261, 0.0, 0.0, 0.0, 0.0f);
            } else if (class_3238 == Class_9265.Field_9294) {
                Class_26692.Field_26697.Method_26708(this.Field_33258, 0.0, 0.0, 0.0, 0.0f);
            } else {
                Class_26692.Field_26697.Method_26708(this.Field_33262, 0.0, 0.0, 0.0, 0.0f);
            }
        }
    }

    private void Method_33265() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

