/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

public final class Class_10299
extends SimpleDateFormat {
    Class_10299() {
        super("E, dd-MMM-yy HH:mm:ss z", Locale.ENGLISH);
        this.setTimeZone(TimeZone.getTimeZone("GMT"));
    }

    private void Method_10300() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

