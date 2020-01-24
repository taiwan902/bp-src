/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  tv.twitch.broadcast.IStatCallbacks
 *  tv.twitch.broadcast.StatType
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import tv.twitch.broadcast.IStatCallbacks;
import tv.twitch.broadcast.StatType;

public class Class_16698
implements IStatCallbacks {
    final Class_37833 Field_16699;

    Class_16698(Class_37833 class_37833) {
        this.Field_16699 = class_37833;
    }

    private void Method_16700() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_16701(StatType statType, long l) {
    }
}

