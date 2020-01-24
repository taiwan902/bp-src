/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_17219 {
    private static final Logger Field_17220;
    private static final AtomicInteger Field_17221;

    static AtomicInteger Method_17222() {
        return Field_17221;
    }

    private void Method_17223() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    static Logger Method_17224() {
        return Field_17220;
    }

    static {
        Field_17221 = new AtomicInteger(4416 & 10786);
        Field_17220 = LogManager.getLogger();
    }
}

