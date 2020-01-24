/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true
 *  com.google.gson.JsonParseException
 *  org.apache.commons.lang3.exception.ExceptionUtils
 */
import com.google.gson.JsonParseException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import org.apache.commons.lang3.exception.ExceptionUtils;

public class Class_39290
extends Class_36787 {
    public void Method_39291(Class_1367 class_1367, String[] arrstring) {
        if (arrstring.length < (16387 & 5662)) {
            throw new Class_34974("commands.tellraw.usage", new Object[31744 & 512]);
        }
        \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2 = Class_39290.\u0000strictfp((Class_1367)class_1367, (String)arrstring[9896 & 260]);
        String string = Class_39290.\u0000strictfp((String[])arrstring, (int)(807 & 12433));
        try {
            Class_1782 class_1782 = Class_2814.Method_2819(string);
            \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000strictfp(Class_21303.Method_21304(class_1367, class_1782, (Class_1061)\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2));
        }
        catch (JsonParseException jsonParseException) {
            Throwable throwable = ExceptionUtils.getRootCause((Throwable)jsonParseException);
            Object[] arrobject = new Object[4097 & 3113];
            arrobject[18176 & 2198] = throwable == null ? "" : throwable.getMessage();
            throw new Class_32994("commands.tellraw.jsonException", arrobject);
        }
    }

    public int Method_39292() {
        return 2062 & -24462;
    }

    public String Method_39293(Class_1367 class_1367) {
        return "commands.tellraw.usage";
    }

    public String Method_39294() {
        return "tellraw";
    }

    public boolean Method_39295(String[] arrstring, int n) {
        return (n == 0 ? 8449 & -26593 : -23550 & 17049) != 0;
    }

    private void Method_39296() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public List Method_39297(Class_1367 class_1367, String[] arrstring, Class_4751 class_4751) {
        return arrstring.length == (10567 & -32759) ? Class_39290.\u0000strictfp((String[])arrstring, (String[])Class_2457.Method_2530().Method_2554()) : null;
    }
}

