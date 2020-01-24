/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Marker
 *  paulscode.sound.CommandThread
 *  paulscode.sound.SoundSystem
 *  paulscode.sound.SoundSystemConfig
 *  paulscode.sound.SoundSystemLogger
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import org.apache.logging.log4j.Marker;
import paulscode.sound.CommandThread;
import paulscode.sound.SoundSystem;
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.SoundSystemLogger;

public class Class_11145
implements Runnable {
    final Class_20521 Field_11146;

    Class_11145(Class_20521 class_20521) {
        this.Field_11146 = class_20521;
    }

    public void Method_11147() {
        try {
            SoundSystemConfig.setLogger((SoundSystemLogger)new Class_15002(this));
            Class_20521 class_20521 = this.Field_11146;
            class_20521.getClass();
            Class_20521.Method_20548(this.Field_11146, new Class_6086(class_20521, null));
            Class_20521.Method_20564(this.Field_11146, (2825 & -32605) != 0);
            Class_20521.Method_20558(this.Field_11146).setMasterVolume(Class_20521.Method_20570(this.Field_11146).Method_39932(Class_6295.Field_6300));
            Class_20521.Method_20547().info(Class_20521.Method_20541(), "Sound engine started");
            try {
                Field field = SoundSystem.class.getDeclaredField("commandThread");
                field.setAccessible((17081 & 2049) != 0);
                Object object = field.get((Object)Class_20521.Method_20558(this.Field_11146));
                if (object instanceof CommandThread) {
                    this.Field_11146.Field_20526 = (CommandThread)object;
                }
            }
            catch (Throwable throwable) {
                Class_20521.Method_20547().error(Class_20521.Method_20541(), "BlazingPack: can't get cmdt: ", throwable);
            }
        }
        catch (RuntimeException runtimeException) {
            Class_20521.Method_20547().error(Class_20521.Method_20541(), "Error starting SoundSystem. (BlazingPack: NOT turning off sounds & music) ", (Throwable)runtimeException);
        }
    }

    private void Method_11148() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

