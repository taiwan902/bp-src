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

public class Class_32367
implements Class_1486 {
    private GameProfile Field_32368;

    public void Method_32369(Class_29900 class_29900) {
        UUID uUID = this.Field_32368.getId();
        class_29900.Method_29960(uUID == null ? "" : uUID.toString());
        class_29900.Method_29960(this.Field_32368.getName());
    }

    public void Method_32370(Class_29900 class_29900) {
        String string = class_29900.Method_29991(-26394 & 16429);
        String string2 = class_29900.Method_29991(19856 & 4121);
        UUID uUID = UUID.fromString(string);
        this.Field_32368 = new GameProfile(uUID, string2);
    }

    public Class_32367(GameProfile gameProfile) {
        this.Field_32368 = gameProfile;
    }

    public void Method_32371(Class_17034 class_17034) {
        class_17034.Method_17037(this);
    }

    public Class_32367() {
    }

    private void Method_32372() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_32373(Class_10954 class_10954) {
        this.Method_32371((Class_17034)class_10954);
    }

    public GameProfile Method_32374() {
        return this.Field_32368;
    }
}

