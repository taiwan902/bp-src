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

public class Class_37196
implements Class_14683 {
    private final GameProfile Field_37197;
    private final Class_2080 Field_37198;

    public Class_1782 Method_37199() {
        return new Class_2840(this.Field_37197.getName());
    }

    public Class_37196(GameProfile gameProfile) {
        this.Field_37197 = gameProfile;
        this.Field_37198 = Class_1456.Method_1465(gameProfile.getName());
        Class_1456.Method_1469(this.Field_37198, gameProfile.getName());
    }

    private void Method_37200() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_37201(Class_10233 class_10233) {
        Class_18.Field_89.Method_271().Method_20245(new Class_32249(this.Field_37197.getId()));
    }

    public void Method_37202(float f, int n) {
        Class_18.Field_89.Method_253().Method_34707(this.Field_37198);
        Class_16867.Method_16924(1.0f, 1.0f, 1.0f, (float)n / (0.012987013f * 19635.0f));
        Class_1551.Method_1560(10470 & 20994, 16642 & 227, 4.4761906f * 1.7872341f, 1.0240964f * 7.8117647f, 16952 & 2058, -10226 & 120, -22004 & 16396, 25309 & -32756, 1.7894737f * 35.764706f, 0.8235294f * 77.71429f);
        Class_1551.Method_1560(23554 & -32754, 3398 & -23885, 1.0789474f * 37.07317f, 11.096774f * 0.7209302f, 4282 & 72, 2089 & 4172, -32500 & 10876, 143 & -22996, 201.14287f * 0.3181818f, 108.0f * 0.5925926f);
    }

    public boolean Method_37203() {
        return (24657 & 525) != 0;
    }
}

