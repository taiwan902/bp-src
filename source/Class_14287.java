/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Class_14287
extends Class_9848 {
    protected final Date Field_14288;
    public static final SimpleDateFormat Field_14289 = new SimpleDateFormat(Class_14287.Method_14298("\u0725\u0725\u0727\u0727\u0721\u0701\u0703\u0723\u0728\u0728\u072e\u070e\u070c\u072c\u072b\u072b\u0724\u0725\u0727\u0726\u0704"));
    protected final String Field_14290;
    protected final Date Field_14291;
    protected final String Field_14292;

    public String Method_14293() {
        return this.Field_14290;
    }

    protected Class_14287(Object object, JsonObject jsonObject) {
        super(object, jsonObject);
        Date date;
        Date date2;
        try {
            date2 = jsonObject.has("created") ? Field_14289.parse(jsonObject.get("created").getAsString()) : new Date();
        }
        catch (ParseException parseException) {
            date2 = new Date();
        }
        this.Field_14291 = date2;
        this.Field_14292 = jsonObject.has("source") ? jsonObject.get("source").getAsString() : "(Unknown)";
        try {
            date = jsonObject.has("expires") ? Field_14289.parse(jsonObject.get("expires").getAsString()) : null;
        }
        catch (ParseException parseException) {
            date = null;
        }
        this.Field_14288 = date;
        this.Field_14290 = jsonObject.has("reason") ? jsonObject.get("reason").getAsString() : "Banned by an operator.";
    }

    public Date Method_14294() {
        return this.Field_14288;
    }

    boolean Method_14295() {
        return (this.Field_14288 == null ? 8960 & -29564 : this.Field_14288.before(new Date())) != 0;
    }

    public Class_14287(Object object, Date date, String string, Date date2, String string2) {
        super(object);
        this.Field_14291 = date == null ? new Date() : date;
        this.Field_14292 = string == null ? "(Unknown)" : string;
        this.Field_14288 = date2;
        this.Field_14290 = string2 == null ? "Banned by an operator." : string2;
    }

    private void Method_14296() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_14297(JsonObject jsonObject) {
        jsonObject.addProperty("created", Field_14289.format(this.Field_14291));
        jsonObject.addProperty("source", this.Field_14292);
        jsonObject.addProperty("expires", this.Field_14288 == null ? "forever" : Field_14289.format(this.Field_14288));
        jsonObject.addProperty("reason", this.Field_14290);
    }

    private static String Method_14298(String string) {
        int n = 6564;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14287.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

