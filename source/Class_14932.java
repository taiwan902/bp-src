/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Objects
 *  com.google.common.base.Objects$ToStringHelper
 *  com.mojang.authlib.GameProfile
 */
import com.google.common.base.Objects;
import com.mojang.authlib.GameProfile;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_14932 {
    private final GameProfile Field_14933;
    private final Class_35650 Field_14934;
    final Class_27970 Field_14935;
    private final int Field_14936;
    private final Class_1782 Field_14937;

    public String Method_14938() {
        return Objects.toStringHelper((Object)this).add("latency", this.Field_14936).add("gameMode", (Object)this.Field_14934).add("profile", (Object)this.Field_14933).add("displayName", this.Field_14937 == null ? null : Class_2814.Method_2821(this.Field_14937)).toString();
    }

    public int Method_14939() {
        return this.Field_14936;
    }

    public Class_35650 Method_14940() {
        return this.Field_14934;
    }

    public Class_1782 Method_14941() {
        return this.Field_14937;
    }

    private void Method_14942() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_14932(Class_27970 class_27970, GameProfile gameProfile, int n, Class_35650 class_35650, Class_1782 class_1782) {
        this.Field_14935 = class_27970;
        this.Field_14933 = gameProfile;
        this.Field_14936 = n;
        this.Field_14934 = class_35650;
        this.Field_14937 = class_1782;
    }

    public GameProfile Method_14943() {
        return this.Field_14933;
    }
}

