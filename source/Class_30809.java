/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_30809
extends Class_28932 {
    private Class_1490 Field_30810;
    private static final Logger Field_30811 = LogManager.getLogger();

    public void Method_30812(Class_1490 class_1490) {
        this.Field_30810 = class_1490;
        try {
            Class<?> class_ = Class.forName("com.mojang.realmsclient.RealmsMainScreen");
            Class[] arrclass = new Class[25249 & -32751];
            arrclass[2120 & 5] = Class_28932.class;
            Constructor<?> constructor = class_.getDeclaredConstructor(arrclass);
            constructor.setAccessible((12435 & 325) != 0);
            Object[] arrobject = new Object[2267 & -6651];
            arrobject[-30704 & 17504] = this;
            Object obj = constructor.newInstance(arrobject);
            Class_18.Field_89.Method_218(((Class_28932)obj).Method_28942());
        }
        catch (Exception exception) {
            Field_30811.error("Realms module missing", (Throwable)exception);
        }
    }

    public void Method_30813() {
        Class_18.Field_89.Method_218(this.Field_30810);
    }

    private void Method_30814() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

