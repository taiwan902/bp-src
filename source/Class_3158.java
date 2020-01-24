/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true
 *  com.mojang.authlib.GameProfile
 */
import com.mojang.authlib.GameProfile;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.SocketAddress;

public class Class_3158
extends Class_3069 {
    private Class_1699 Field_3159;

    private void Method_3160() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_3158(Class_3013 class_3013) {
        super(class_3013);
        this.\u0000strictfp(16522 & 14155);
    }

    public Class_3013 Method_3161() {
        return (Class_3013)super.Method_3110();
    }

    public Class_2457 Method_3162() {
        return this.Method_3161();
    }

    public String Method_3163(SocketAddress socketAddress, GameProfile gameProfile) {
        return gameProfile.getName().equalsIgnoreCase(this.Method_3161().\u0000, 2()) && this.\u0000strictfp(gameProfile.getName()) != null ? "That name is already taken." : super.Method_3126(socketAddress, gameProfile);
    }

    protected void Method_3164(\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2) {
        if (\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000, `().equals(this.Method_3161().\u0000, 2())) {
            this.Field_3159 = new Class_1699();
            \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000
            (this.Field_3159);
        }
        super.Method_3097(\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2);
    }

    public Class_1699 Method_3165() {
        return this.Field_3159;
    }
}

