/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public final class Class_6252
extends SimpleDateFormat {
    private static final Class_34677 Field_6253 = new Class_46784();
    private final SimpleDateFormat Field_6254 = new Class_10299();
    private final SimpleDateFormat Field_6255 = new Class_7720();

    private void Method_6256() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Date Method_6257(String string, ParsePosition parsePosition) {
        Date date = super.parse(string, parsePosition);
        if (date == null) {
            date = this.Field_6254.parse(string, parsePosition);
        }
        if (date == null) {
            date = this.Field_6255.parse(string, parsePosition);
        }
        return date;
    }

    Class_6252(Class_46784 class_46784) {
        this();
    }

    private Class_6252() {
        super("E, dd MMM yyyy HH:mm:ss z", Locale.ENGLISH);
        this.setTimeZone(TimeZone.getTimeZone("GMT"));
    }

    static Class_6252 Method_6258() {
        return (Class_6252)Field_6253.Method_34684();
    }
}

