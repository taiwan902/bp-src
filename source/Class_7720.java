/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

public final class Class_7720
extends SimpleDateFormat {
    Class_7720() {
        super("E MMM d HH:mm:ss yyyy", Locale.ENGLISH);
        this.setTimeZone(TimeZone.getTimeZone("GMT"));
    }

    private void Method_7721() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

