/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.minecraft.MinecraftSessionService
 *  com.mojang.authlib.properties.Property
 *  com.mojang.authlib.properties.PropertyMap
 */
import com.google.common.collect.Iterables;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.properties.Property;
import com.mojang.authlib.properties.PropertyMap;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.UUID;

public class Class_37700
extends Class_4879 {
    private GameProfile Field_37701 = null;
    private int Field_37702;
    private int Field_37703;

    public static GameProfile Method_37704(GameProfile gameProfile) {
        if (gameProfile != null && !Class_35310.Method_35315(gameProfile.getName())) {
            if (gameProfile.isComplete() && gameProfile.getProperties().containsKey((Object)"textures")) {
                return gameProfile;
            }
            if (Class_2457.Method_2530() == null) {
                return gameProfile;
            }
            GameProfile gameProfile2 = Class_2457.Method_2530().Method_2626().Method_3198(gameProfile.getName());
            if (gameProfile2 == null) {
                return gameProfile;
            }
            Property property = (Property)Iterables.getFirst((Iterable)gameProfile2.getProperties().get((Object)"textures"), null);
            if (property == null) {
                gameProfile2 = Class_2457.Method_2530().Method_2560().fillProfileProperties(gameProfile2, (11457 & 41) != 0);
            }
            return gameProfile2;
        }
        return gameProfile;
    }

    public void Method_37705(int n) {
        this.Field_37703 = n;
        this.Field_37701 = null;
    }

    public void Method_37706(Class_1699 class_1699) {
        super.Method_4929(class_1699);
        class_1699.Method_1724("SkullType", (byte)(this.Field_37703 & (-26881 & 24831)));
        class_1699.Method_1724("Rot", (byte)(this.Field_37702 & (-28929 & 255)));
        if (this.Field_37701 != null) {
            Class_1699 class_16992 = new Class_1699();
            Class_25852.Method_25855(class_16992, this.Field_37701);
            class_1699.Method_1744("Owner", class_16992);
        }
    }

    public Class_1486 Method_37707() {
        Class_1699 class_1699 = new Class_1699();
        this.Method_37706(class_1699);
        return new Class_24663(this.\u0000strictfp, 908 & -24476, class_1699);
    }

    public GameProfile Method_37708() {
        return this.Field_37701;
    }

    private void Method_37709() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_37710() {
        return this.Field_37703;
    }

    public void Method_37711(GameProfile gameProfile) {
        this.Field_37703 = 16423 & -26933;
        this.Field_37701 = gameProfile;
        this.Method_37714();
    }

    public void Method_37712(Class_1699 class_1699) {
        super.Method_4911(class_1699);
        this.Field_37703 = class_1699.Method_1716("SkullType");
        this.Field_37702 = class_1699.Method_1716("Rot");
        if (this.Field_37703 == (8215 & -28565)) {
            String string;
            if (class_1699.Method_1715("Owner", 17546 & -32709)) {
                this.Field_37701 = Class_25852.Method_25856(class_1699.Method_1703("Owner"));
            } else if (class_1699.Method_1715("ExtraType", 1226 & -17656) && !Class_35310.Method_35315(string = class_1699.Method_1708("ExtraType"))) {
                this.Field_37701 = new GameProfile((UUID)null, string);
                this.Method_37714();
            }
        }
    }

    public void Method_37713(int n) {
        this.Field_37702 = n;
    }

    private void Method_37714() {
        this.Field_37701 = Class_37700.Method_37704(this.Field_37701);
        this.\u0000, for();
    }

    public int Method_37715() {
        return this.Field_37702;
    }
}

