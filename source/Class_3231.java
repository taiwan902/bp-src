/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_3231
extends PrintStream {
    private final String Field_3232;
    private static final Logger Field_3233 = LogManager.getLogger();

    private void Method_3234(String string) {
        StackTraceElement[] arrstackTraceElement = Thread.currentThread().getStackTrace();
        StackTraceElement stackTraceElement = arrstackTraceElement[Math.min(1427 & -28669, arrstackTraceElement.length)];
        Object[] arrobject = new Object[-32756 & 28628];
        arrobject[3712 & -24222] = this.Field_3232;
        arrobject[-24543 & 7961] = stackTraceElement.getFileName();
        arrobject[258 & 7246] = stackTraceElement.getLineNumber();
        arrobject[17455 & 10883] = string;
        Field_3233.info("[{}]@.({}:{}): {}", arrobject);
    }

    private void Method_3235() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_3231(String string, OutputStream outputStream) {
        super(outputStream);
        this.Field_3232 = string;
    }

    public void Method_3236(String string) {
        this.Method_3234(string);
    }

    public void Method_3237(Object object) {
        this.Method_3234(String.valueOf(object));
    }
}

