/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
import com.mojang.authlib.GameProfile;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Date;

public class Class_3206 {
    final Class_3180 Field_3207;
    private final GameProfile Field_3208;
    private final Date Field_3209;

    Class_3206(Class_3180 class_3180, GameProfile gameProfile, Date date, Class_3201 class_3201) {
        this(class_3180, gameProfile, date);
    }

    static Date Method_3210(Class_3206 class_3206) {
        return class_3206.Field_3209;
    }

    private void Method_3211() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public GameProfile Method_3212() {
        return this.Field_3208;
    }

    private Class_3206(Class_3180 class_3180, GameProfile gameProfile, Date date) {
        this.Field_3207 = class_3180;
        this.Field_3208 = gameProfile;
        this.Field_3209 = date;
    }

    public Date Method_3213() {
        return this.Field_3209;
    }
}

