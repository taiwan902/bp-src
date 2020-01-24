/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.apache.logging.log4j.Marker
 *  org.apache.logging.log4j.MarkerManager
 */
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public class Class_40492
extends Class_38640 {
    private static final Marker Field_40493;
    private final Class_31224 Field_40494;
    private static final Logger Field_40495;

    public Class_40492(Class_31224 class_31224) {
        this.Field_40494 = class_31224;
    }

    private void Method_40496() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_40497(Class_39158 class_39158, Class_1486 class_1486, Class_22553 class_22553) {
        Integer n = ((Class_11271)((Object)class_39158.Method_39175().attr(Class_44584.Field_44601).Method_34812())).Method_11284(this.Field_40494, class_1486);
        if (Field_40495.isDebugEnabled()) {
            Object[] arrobject = new Object[579 & 299];
            arrobject[576 & 5290] = class_39158.Method_39175().attr(Class_44584.Field_44601).Method_34812();
            arrobject[-1931 & 129] = n;
            arrobject[2102 & 1034] = class_1486.getClass().getName();
            Field_40495.debug(Field_40493, "OUT: [{}:{}] {}", arrobject);
        }
        if (n == null) {
            throw new IOException("Can't serialize unregistered packet");
        }
        Class_29900 class_29900 = new Class_29900(class_22553);
        class_29900.Method_29982(n);
        try {
            class_1486.Method_1488(class_29900);
        }
        catch (Throwable throwable) {
            Field_40495.error((Object)throwable);
        }
    }

    static {
        Field_40495 = LogManager.getLogger();
        Field_40493 = MarkerManager.getMarker((String)Class_40492.Method_40499("\u2000\u2000\u2001\u2000\u2001\u2001\u2001\u2004\u2005\u2007\u2006"), (Marker)Class_44584.Field_44585);
    }

    protected void Method_40498(Class_39158 class_39158, Object object, Class_22553 class_22553) {
        this.Method_40497(class_39158, (Class_1486)object, class_22553);
    }

    private static String Method_40499(String string) {
        int n = 8868;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_40492.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

