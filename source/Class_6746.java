/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  tv.twitch.broadcast.IStatCallbacks
 *  tv.twitch.broadcast.RTMPState
 *  tv.twitch.broadcast.StatType
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import tv.twitch.broadcast.IStatCallbacks;
import tv.twitch.broadcast.RTMPState;
import tv.twitch.broadcast.StatType;

public class Class_6746
implements IStatCallbacks {
    final Class_36089 Field_6747;

    Class_6746(Class_36089 class_36089) {
        this.Field_6747 = class_36089;
    }

    private void Method_6748() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_6749(StatType statType, long l) {
        switch (Class_20306.Field_20308[statType.ordinal()]) {
            case 1: {
                this.Field_6747.Field_36112 = RTMPState.lookupValue((int)((int)l));
                break;
            }
            case 2: {
                this.Field_6747.Field_36100 = l;
            }
        }
    }
}

