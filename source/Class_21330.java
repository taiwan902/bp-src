/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
import com.mojang.authlib.GameProfile;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_21330 {
    private GameProfile[] Field_21331;
    private final int Field_21332;
    private final int Field_21333;

    private void Method_21334() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_21335(GameProfile[] arrgameProfile) {
        this.Field_21331 = arrgameProfile;
    }

    public int Method_21336() {
        return this.Field_21333;
    }

    public GameProfile[] Method_21337() {
        return this.Field_21331;
    }

    public Class_21330(int n, int n2) {
        this.Field_21332 = n;
        this.Field_21333 = n2;
    }

    public int Method_21338() {
        return this.Field_21332;
    }
}

