/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.IDN;
import java.util.Hashtable;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.InitialDirContext;
import org.apache.logging.log4j.Logger;

public class Class_15411 {
    private final int Field_15412;
    private final String Field_15413;

    public static Class_15411 Method_15414(String string) {
        Object object;
        int n;
        int n2;
        if (string == null) {
            return null;
        }
        String[] arrstring = string.split(":");
        if (string.startsWith("[") && (n2 = string.indexOf("]")) > 0) {
            String string2 = string.substring(10769 & -28607, n2);
            object = string.substring(n2 + (65 & 8721)).trim();
            if (object.startsWith(":") && object.length() > 0) {
                object = object.substring(593 & 26625);
                String[] arrstring2 = new String[4491 & -29598];
                arrstring2[12384 & -29567] = string2;
                arrstring2[24577 & -30663] = object;
                arrstring = arrstring2;
            } else {
                String[] arrstring3 = new String[18215 & 12305];
                arrstring3[2056 & 4224] = string2;
                arrstring = arrstring3;
            }
        }
        if (arrstring.length > (258 & -30525)) {
            String[] arrstring4 = new String[-7743 & 2105];
            arrstring4[-32768 & 3397] = string;
            arrstring = arrstring4;
        }
        String string3 = arrstring[15113 & -31568];
        int n3 = n = arrstring.length > (35 & 2901) ? Class_15411.Method_15419(arrstring[-22175 & 5267], 25565 & -3107) : 25565 & -3105;
        if (n == (29661 & -6179)) {
            object = Class_15411.Method_15415(string3);
            string3 = object[-23936 & 45];
            n = Class_15411.Method_15419(object[53 & -8183], -7171 & 26589);
        }
        return new Class_15411(string3, n);
    }

    private static String[] Method_15415(String string) {
        try {
            String string2 = "com.sun.jndi.dns.DnsContextFactory";
            Class.forName("com.sun.jndi.dns.DnsContextFactory");
            Hashtable<String, String> hashtable = new Hashtable<String, String>();
            hashtable.put("java.naming.factory.initial", "com.sun.jndi.dns.DnsContextFactory");
            hashtable.put("java.naming.provider.url", "dns:");
            hashtable.put("com.sun.jndi.dns.timeout.retries", "1");
            InitialDirContext initialDirContext = new InitialDirContext(hashtable);
            String[] arrstring = new String[-32253 & 4453];
            arrstring[14388 & 18187] = "SRV";
            Attributes attributes = initialDirContext.getAttributes("_minecraft._tcp." + string, arrstring);
            String[] arrstring2 = attributes.get("srv").get().toString().split(" ", 12293 & 12);
            String[] arrstring3 = new String[16579 & 6150];
            arrstring3[259 & -9712] = arrstring2[4107 & -29673];
            arrstring3[26845 & 291] = arrstring2[-32766 & 19910];
            return arrstring3;
        }
        catch (Throwable throwable) {
            Class_18.Field_19.warn("can't get SRV _minecraft._tcp." + string + ": " + throwable.getMessage());
            String[] arrstring = new String[1034 & -5438];
            arrstring[2049 & 9324] = string;
            arrstring[28777 & 3461] = Integer.toString(28637 & -7201);
            return arrstring;
        }
    }

    public int Method_15416() {
        return this.Field_15412;
    }

    private Class_15411(String string, int n) {
        this.Field_15413 = string;
        this.Field_15412 = n;
    }

    private void Method_15417() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_15418() {
        return IDN.toASCII(this.Field_15413);
    }

    private static int Method_15419(String string, int n) {
        try {
            return Integer.parseInt(string.trim());
        }
        catch (Exception exception) {
            return n;
        }
    }
}

