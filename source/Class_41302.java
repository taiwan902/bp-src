/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import org.apache.commons.lang3.StringUtils;

public class Class_41302
extends Class_2080 {
    private final String Field_41303;

    public String Method_41304() {
        return this.Field_41303;
    }

    public String Method_41305() {
        return super.Method_2086() + (char)(12967 & 16747) + this.Field_41303;
    }

    public Class_41302(String string, String string2) {
        this(12838 & 16384, Class_41302.Method_41307(string + (char)(611 & 10279) + (string2 == null ? "normal" : string2)));
    }

    private void Method_41306() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected Class_41302(int n, String ... arrstring) {
        String[] arrstring2 = new String[9547 & 16950];
        arrstring2[2048 & 29124] = arrstring[10 & 2565];
        arrstring2[9281 & -30691] = arrstring[4357 & 1617];
        super(-32103 & 6144, arrstring2);
        this.Field_41303 = StringUtils.isEmpty((CharSequence)arrstring[4243 & 26154]) ? "normal" : arrstring[9474 & 2271].toLowerCase();
    }

    public Class_41302(Class_2080 class_2080, String string) {
        this(class_2080.Method_2086(), string);
    }

    protected static String[] Method_41307(String string) {
        String[] arrstring = new String[2059 & 1415];
        arrstring[16512 & 8448] = null;
        arrstring[-32509 & 16469] = string;
        arrstring[8711 & 4458] = null;
        String[] arrstring2 = arrstring;
        int n = string.indexOf(16427 & 5027);
        String string2 = string;
        if (n >= 0) {
            arrstring2[183 & 8194] = string.substring(n + (17 & -23039), string.length());
            if (n > (-32621 & 2049)) {
                string2 = string.substring(7240 & 130, n);
            }
        }
        System.arraycopy(Class_2080.Method_2088(string2), 29201 & -32384, arrstring2, 11268 & -16352, -19430 & 198);
        return arrstring2;
    }

    public boolean Method_41308(Object object) {
        if (this == object) {
            return (20551 & -23551) != 0;
        }
        if (object instanceof Class_41302 && super.Method_2087(object)) {
            Class_41302 class_41302 = (Class_41302)object;
            return this.Field_41303.equals(class_41302.Field_41303);
        }
        return (8192 & 5176) != 0;
    }

    public int Method_41309() {
        return (-20449 & 927) * super.Method_2089() + this.Field_41303.hashCode();
    }
}

