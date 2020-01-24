/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.util.UUIDTypeAdapter
 */
import com.mojang.authlib.GameProfile;
import com.mojang.util.UUIDTypeAdapter;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

public class Class_2109 {
    private final String Field_2110;
    private final String Field_2111;
    private final String Field_2112;
    private final Class_2121 Field_2113;

    public String Method_2114() {
        return this.Field_2111;
    }

    public Class_2109(String string, String string2, String string3, String string4) {
        this.Field_2110 = string;
        this.Field_2112 = string2;
        this.Field_2111 = string3;
        this.Field_2113 = Class_2121.Method_2134(string4);
    }

    public String Method_2115() {
        return this.Field_2112;
    }

    public String Method_2116() {
        return this.Field_2110;
    }

    public GameProfile Method_2117() {
        try {
            UUID uUID = this.Field_2112 == null || this.Field_2112.isEmpty() || this.Field_2112.equals("missing") || this.Field_2112.length() != (9893 & 16504) && this.Field_2112.length() != (-10194 & 9637) ? UUID.nameUUIDFromBytes(("OfflinePlayer:" + this.Field_2110).getBytes(StandardCharsets.UTF_8)) : UUIDTypeAdapter.fromString((String)this.Method_2115());
            return new GameProfile(uUID, this.Method_2116());
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return new GameProfile((UUID)null, this.Method_2116());
        }
    }

    private void Method_2118() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_2121 Method_2119() {
        return this.Field_2113;
    }

    public String Method_2120() {
        return "token:" + this.Field_2111 + ":" + this.Field_2112;
    }
}

