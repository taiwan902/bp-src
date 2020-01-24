/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.yggdrasil.YggdrasilMinecraftSessionService
 */
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.yggdrasil.YggdrasilMinecraftSessionService;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.math.BigInteger;
import java.security.PublicKey;
import javax.crypto.SecretKey;

public class Class_20487
extends Thread {
    final Class_20605 Field_20488;
    final Class_19025 Field_20489;

    public void Method_20490() {
        try {
            SecretKey secretKey = Class_31852.Method_31854();
            String string = this.Field_20488.Method_20615();
            PublicKey publicKey = this.Field_20488.Method_20611();
            String string2 = new BigInteger(Class_31852.Method_31858(string, publicKey, secretKey)).toString(26 & 12816);
            Class_18 class_18 = Class_18.Field_89;
            class_18.Method_141().joinServer(class_18.Method_265().Method_2117(), class_18.Method_265().Method_2114(), string2);
            this.Field_20489.Field_19033.Method_47080(new Class_25635(secretKey, publicKey, this.Field_20488.Method_20613()));
        }
        catch (Exception exception) {
            this.Field_20489.Field_19033.Method_47080(new Class_25635(exception.toString()));
        }
    }

    Class_20487(Class_19025 class_19025, Class_20605 class_20605) {
        this.Field_20489 = class_19025;
        this.Field_20488 = class_20605;
    }

    private void Method_20491() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

