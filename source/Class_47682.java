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

public final class Class_47682
extends Class_5038 {
    private boolean Field_47683 = 21507 & 73;

    Class_47682() {
    }

    protected void Method_47684(Class_5001 class_5001) {
        if (this.Field_47683) {
            class_5001.\u0000strictfp().Method_502(13292 & -12312, class_5001.Method_5003(), -32256 & 16826);
        } else {
            class_5001.\u0000strictfp().Method_502(17389 & 9211, class_5001.Method_5003(), -31664 & 4610);
        }
    }

    protected Class_23823 Method_47685(Class_5001 class_5001, Class_23823 class_23823) {
        Class_283 class_283 = class_5001.\u0000strictfp();
        Class_4595 class_4595 = Class_4850.Method_4869(class_5001.Method_5007());
        Class_4751 class_4751 = class_5001.Method_5003().Method_4765(class_4595);
        Class_11917 class_11917 = Class_9265.Field_9314;
        if (class_283.Method_507(class_4751) && class_11917.Method_11924(class_283, class_4751, class_23823)) {
            if (!class_283.Field_306) {
                class_283.Method_462(class_4751, class_11917.\u0000strictfp().Method_3685(Class_11917.Field_11920, (Comparable)((Object)Class_4595.Field_4601)), 5699 & 16395);
                Class_4879 class_4879 = class_283.Method_429(class_4751);
                if (class_4879 instanceof Class_37700) {
                    if (class_23823.Method_23843() == (-32253 & 17415)) {
                        GameProfile gameProfile = null;
                        if (class_23823.Method_23842()) {
                            String string;
                            Class_1699 class_1699 = class_23823.Method_23845();
                            if (class_1699.Method_1715("SkullOwner", 522 & 16698)) {
                                gameProfile = Class_25852.Method_25856(class_1699.Method_1703("SkullOwner"));
                            } else if (class_1699.Method_1715("SkullOwner", 5132 & 25) && !Class_35310.Method_35315(string = class_1699.Method_1708("SkullOwner"))) {
                                gameProfile = new GameProfile((UUID)null, string);
                            }
                        }
                        ((Class_37700)class_4879).Method_37711(gameProfile);
                    } else {
                        ((Class_37700)class_4879).Method_37705(class_23823.Method_23843());
                    }
                    ((Class_37700)class_4879).Method_37713(class_4595.Method_4660().Method_4619() * (-25651 & 6));
                    Class_9265.Field_9314.Method_11935(class_283, class_4751, (Class_37700)class_4879);
                }
                class_23823.Field_23826 -= 16699 & -32251;
            }
        } else {
            this.Field_47683 = 2048 & 13896;
        }
        return class_23823;
    }

    private void Method_47686() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

