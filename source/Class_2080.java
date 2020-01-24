/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import org.apache.commons.lang3.StringUtils;

public class Class_2080 {
    protected final String Field_2081;
    protected final String Field_2082;

    private void Method_2083() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_2084() {
        return this.Field_2082;
    }

    public Class_2080(String string, String string2) {
        this.Field_2081 = StringUtils.isEmpty((CharSequence)string) ? "minecraft" : string.toLowerCase();
        this.Field_2082 = string2;
        if (this.Field_2082 == null) {
            throw new NullPointerException("resourcePath null in ResourceLocation.<init>3");
        }
    }

    public String Method_2085() {
        return this.Field_2081;
    }

    public Class_2080(String string) {
        int n = string.indexOf(-31942 & 6206);
        String string2 = null;
        String string3 = string;
        if (n >= 0) {
            string3 = string.substring(n + (17285 & 14339), string.length());
            if (n > (5683 & -24563)) {
                string2 = string.substring(-31469 & 2180, n);
            }
        }
        this.Field_2081 = StringUtils.isEmpty(string2) ? "minecraft" : string2.toLowerCase();
        this.Field_2082 = string3;
        if (this.Field_2082 == null) {
            throw new NullPointerException("resourcePath null in ResourceLocation.<init>2");
        }
    }

    public String Method_2086() {
        return this.Field_2081 + (char)(190 & -10629) + this.Field_2082;
    }

    public boolean Method_2087(Object object) {
        if (this == object) {
            return (17449 & -23919) != 0;
        }
        if (!(object instanceof Class_2080)) {
            return (10256 & 777) != 0;
        }
        Class_2080 class_2080 = (Class_2080)object;
        return (this.Field_2081.equals(class_2080.Field_2081) && this.Field_2082.equals(class_2080.Field_2082) ? 20545 & 3089 : 8192 & 4377) != 0;
    }

    protected static String[] Method_2088(String string) {
        String[] arrstring = new String[-20349 & 2050];
        arrstring[2496 & 16932] = null;
        arrstring[24593 & 2337] = string;
        String[] arrstring2 = arrstring;
        int n = string.indexOf(12666 & 19515);
        if (n >= 0) {
            arrstring2[-32351 & 22535] = string.substring(n + (4433 & 167), string.length());
            if (n > (-16375 & 15361)) {
                arrstring2[17616 & -32723] = string.substring(8848 & 2056, n);
            }
        }
        return arrstring2;
    }

    public int Method_2089() {
        return (8223 & -27617) * this.Field_2081.hashCode() + this.Field_2082.hashCode();
    }

    protected Class_2080(int n, String ... arrstring) {
        this.Field_2081 = StringUtils.isEmpty((CharSequence)arrstring[2242 & 1281]) ? "minecraft" : arrstring[19098 & -32508].toLowerCase();
        this.Field_2082 = arrstring[-24541 & 265];
        if (this.Field_2082 == null) {
            throw new NullPointerException("resourcePath null in ResourceLocation.<init>1");
        }
    }
}

