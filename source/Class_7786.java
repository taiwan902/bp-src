/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.exceptions.AuthenticationUnavailableException
 *  com.mojang.authlib.minecraft.MinecraftSessionService
 */
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.math.BigInteger;
import java.security.KeyPair;
import java.security.PublicKey;
import java.util.UUID;

public class Class_7786
extends Thread {
    final Class_30118 Field_7787;

    private void Method_7788() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_7789() {
        GameProfile gameProfile = Class_30118.Method_30143(this.Field_7787);
        try {
            String string = new BigInteger(Class_31852.Method_31858(Class_30118.Method_30134(this.Field_7787), Class_30118.Method_30145(this.Field_7787).Method_2598().getPublic(), Class_30118.Method_30132(this.Field_7787))).toString(-24560 & 4336);
            Class_30118.Method_30141(this.Field_7787, Class_30118.Method_30145(this.Field_7787).Method_2560().hasJoinedServer(new GameProfile((UUID)null, gameProfile.getName()), string));
            if (Class_30118.Method_30143(this.Field_7787) != null) {
                Class_30118.Method_30137().info("UUID of player " + Class_30118.Method_30143(this.Field_7787).getName() + " is " + Class_30118.Method_30143(this.Field_7787).getId());
                Class_30118.Method_30136(this.Field_7787, Class_26562.Field_26565);
            } else if (Class_30118.Method_30145(this.Field_7787).Method_2538()) {
                Class_30118.Method_30137().warn("Failed to verify username but will let them in anyway!");
                Class_30118.Method_30141(this.Field_7787, this.Field_7787.Method_30131(gameProfile));
                Class_30118.Method_30136(this.Field_7787, Class_26562.Field_26565);
            } else {
                this.Field_7787.Method_30142("Failed to verify username!");
                Class_30118.Method_30137().error("Username '" + Class_30118.Method_30143(this.Field_7787).getName() + "' tried to join with an invalid session");
            }
        }
        catch (AuthenticationUnavailableException authenticationUnavailableException) {
            if (Class_30118.Method_30145(this.Field_7787).Method_2538()) {
                Class_30118.Method_30137().warn("Authentication servers are down but will let them in anyway!");
                Class_30118.Method_30141(this.Field_7787, this.Field_7787.Method_30131(gameProfile));
                Class_30118.Method_30136(this.Field_7787, Class_26562.Field_26565);
            }
            this.Field_7787.Method_30142("Authentication servers are down. Please try again later, sorry!");
            Class_30118.Method_30137().error("Couldn't verify username because servers are unavailable");
        }
    }

    Class_7786(Class_30118 class_30118, String string) {
        this.Field_7787 = class_30118;
        super(string);
    }
}

