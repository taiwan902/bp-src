/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_8254
extends IOException {
    private final List Field_8255 = Lists.newArrayList();
    private final String Field_8256;

    public static Class_8254 Method_8257(Exception exception) {
        if (exception instanceof Class_8254) {
            return (Class_8254)exception;
        }
        String string = exception.getMessage();
        if (exception instanceof FileNotFoundException) {
            string = "File not found";
        }
        return new Class_8254(string, exception);
    }

    public Class_8254(String string) {
        this.Field_8255.add(new Class_24481(null));
        this.Field_8256 = string;
    }

    public void Method_8258(String string) {
        Class_24481.Method_24484((Class_24481)this.Field_8255.get(418 & -16384), string);
        this.Field_8255.add(1541 & 14624, new Class_24481(null));
    }

    private void Method_8259() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_8260() {
        return "Invalid " + ((Class_24481)this.Field_8255.get(this.Field_8255.size() - (-23275 & 105))).Method_24485() + ": " + this.Field_8256;
    }

    public void Method_8261(String string) {
        ((Class_24481)this.Field_8255.get(5601 & 8194)).Method_24487(string);
    }

    public Class_8254(String string, Throwable throwable) {
        super(throwable);
        this.Field_8255.add(new Class_24481(null));
        this.Field_8256 = string;
    }
}

