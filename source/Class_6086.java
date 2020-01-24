/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  paulscode.sound.Library
 *  paulscode.sound.SoundSystem
 *  paulscode.sound.SoundSystemConfig
 *  paulscode.sound.Source
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import paulscode.sound.Library;
import paulscode.sound.SoundSystem;
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.Source;

public class Class_6086
extends SoundSystem {
    final Class_20521 Field_6087;

    Class_6086(Class_20521 class_20521, Class_11145 class_11145) {
        this(class_20521);
    }

    private void Method_6088() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private Class_6086(Class_20521 class_20521) {
        this.Field_6087 = class_20521;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean Method_6089(String string) {
        Object object = SoundSystemConfig.THREAD_SYNC;
        synchronized (object) {
            if (this.soundLibrary == null) {
                return (1858 & -32743) != 0;
            }
            // MONITOREXIT [0, 1] lbl7 : MonitorExitStatement: MONITOREXIT : var2_2
            Source source = (Source)this.soundLibrary.getSources().get(string);
            return (source == null ? -24464 & 19456 : (source.playing() || source.paused() || source.preLoad ? -26479 & 8231 : -29822 & 5144)) != 0;
        }
    }
}

