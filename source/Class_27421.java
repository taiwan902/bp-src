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

public class Class_27421
implements Class_1486 {
    private boolean Field_27422;
    private GameProfile Field_27423;

    public Class_27421(GameProfile gameProfile, boolean bl) {
        this.Field_27423 = gameProfile;
        this.Field_27422 = bl;
    }

    public void Method_27424(Class_29900 class_29900) {
        class_29900.Method_29960(this.Field_27423.getName());
        if (this.Field_27422) {
            class_29900.Method_29980((-24287 & 1113) != 0);
        }
    }

    public GameProfile Method_27425() {
        return this.Field_27423;
    }

    public void Method_27426(Class_10954 class_10954) {
        this.Method_27429((Class_12050)class_10954);
    }

    public Class_27421() {
    }

    private void Method_27427() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_27428(Class_29900 class_29900) {
        this.Field_27423 = new GameProfile((UUID)null, class_29900.Method_29991(529 & -26224));
    }

    public void Method_27429(Class_12050 class_12050) {
        class_12050.Method_12051(this);
    }
}

