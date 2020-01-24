/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.properties.Property
 *  com.mojang.authlib.properties.PropertyMap
 */
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import com.mojang.authlib.properties.PropertyMap;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.Set;
import java.util.UUID;

public final class Class_25852 {
    private void Method_25853() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static boolean Method_25854(Class_1674 class_1674, Class_1674 class_16742, boolean bl) {
        if (class_1674 == class_16742) {
            return (2049 & -20477) != 0;
        }
        if (class_1674 == null) {
            return (5653 & -16189) != 0;
        }
        if (class_16742 == null) {
            return (3858 & 68) != 0;
        }
        if (!class_1674.getClass().equals(class_16742.getClass())) {
            return (25089 & 2146) != 0;
        }
        if (class_1674 instanceof Class_1699) {
            Class_1699 class_1699 = (Class_1699)class_1674;
            Class_1699 class_16992 = (Class_1699)class_16742;
            for (String string : class_1699.Method_1710()) {
                Class_1674 class_16743 = class_1699.Method_1720(string);
                if (Class_25852.Method_25854(class_16743, class_16992.Method_1720(string), bl)) continue;
                return (5136 & -32187) != 0;
            }
            return (16465 & 2177) != 0;
        }
        if (class_1674 instanceof Class_1758 && bl) {
            Class_1758 class_1758 = (Class_1758)class_1674;
            Class_1758 class_17582 = (Class_1758)class_16742;
            if (class_1758.Method_1772() == 0) {
                return (class_17582.Method_1772() == 0 ? 23 & 21697 : 4 & 16834) != 0;
            }
            for (int i = 18945 & -32760; i < class_1758.Method_1772(); ++i) {
                Class_1674 class_16744 = class_1758.Method_1763(i);
                int n = 812 & -19456;
                for (int j = 264 & 16; j < class_17582.Method_1772(); ++j) {
                    if (!Class_25852.Method_25854(class_16744, class_17582.Method_1763(j), bl)) continue;
                    n = 10337 & 261;
                    break;
                }
                if (n != 0) continue;
                return (25608 & 4145) != 0;
            }
            return (16903 & -24335) != 0;
        }
        return class_1674.Method_1693(class_16742);
    }

    public static Class_1699 Method_25855(Class_1699 class_1699, GameProfile gameProfile) {
        if (!Class_35310.Method_35315(gameProfile.getName())) {
            class_1699.Method_1702("Name", gameProfile.getName());
        }
        if (gameProfile.getId() != null) {
            class_1699.Method_1702("Id", gameProfile.getId().toString());
        }
        if (!gameProfile.getProperties().isEmpty()) {
            Class_1699 class_16992 = new Class_1699();
            for (String string : gameProfile.getProperties().keySet()) {
                Class_1758 class_1758 = new Class_1758();
                for (Property property : gameProfile.getProperties().get((Object)string)) {
                    Class_1699 class_16993 = new Class_1699();
                    class_16993.Method_1702("Value", property.getValue());
                    if (property.hasSignature()) {
                        class_16993.Method_1702("Signature", property.getSignature());
                    }
                    class_1758.Method_1781(class_16993);
                }
                class_16992.Method_1744(string, class_1758);
            }
            class_1699.Method_1744("Properties", class_16992);
        }
        return class_1699;
    }

    public static GameProfile Method_25856(Class_1699 class_1699) {
        UUID uUID;
        String string = null;
        String string2 = null;
        if (class_1699.Method_1715("Name", 29257 & 2090)) {
            string = class_1699.Method_1708("Name");
        }
        if (class_1699.Method_1715("Id", 72 & 24072)) {
            string2 = class_1699.Method_1708("Id");
        }
        if (Class_35310.Method_35315(string) && Class_35310.Method_35315(string2)) {
            return null;
        }
        try {
            uUID = UUID.fromString(string2);
        }
        catch (Throwable throwable) {
            uUID = null;
        }
        GameProfile gameProfile = new GameProfile(uUID, string);
        if (class_1699.Method_1715("Properties", 10282 & 17422)) {
            Class_1699 class_16992 = class_1699.Method_1703("Properties");
            for (String string3 : class_16992.Method_1710()) {
                Class_1758 class_1758 = class_16992.Method_1735(string3, 7787 & -15986);
                for (int i = 0 & 8290; i < class_1758.Method_1772(); ++i) {
                    Class_1699 class_16993 = class_1758.Method_1768(i);
                    String string4 = class_16993.Method_1708("Value");
                    if (class_16993.Method_1715("Signature", 19464 & -32760)) {
                        gameProfile.getProperties().put((Object)string3, (Object)new Property(string3, string4, class_16993.Method_1708("Signature")));
                        continue;
                    }
                    gameProfile.getProperties().put((Object)string3, (Object)new Property(string3, string4));
                }
            }
        }
        return gameProfile;
    }
}

