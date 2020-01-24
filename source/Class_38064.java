/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Objects
 *  com.google.common.base.Objects$ToStringHelper
 *  com.google.common.collect.Maps
 *  com.google.gson.Gson
 */
import com.google.common.base.Objects;
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Map;

public class Class_38064 {
    private final String Field_38065;
    private static final Gson Field_38066 = new Gson();
    private String Field_38067;
    private Map Field_38068;

    public String Method_38069() {
        return Objects.toStringHelper((Object)this).add("name", (Object)this.Field_38065).add("description", (Object)this.Field_38067).add("data", (Object)this.Method_38073()).toString();
    }

    public void Method_38070(String string) {
        this.Field_38067 = string;
    }

    public String Method_38071() {
        return this.Field_38067 == null ? this.Field_38065 : this.Field_38067;
    }

    private void Method_38072() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_38073() {
        return this.Field_38068 != null && !this.Field_38068.isEmpty() ? Field_38066.toJson((Object)this.Field_38068) : null;
    }

    public Class_38064(String string, String string2) {
        this.Field_38065 = string;
        this.Field_38067 = string2;
    }

    public Class_38064(String string) {
        this(string, null);
    }

    public String Method_38074() {
        return this.Field_38065;
    }

    public void Method_38075(String string, String string2) {
        if (this.Field_38068 == null) {
            this.Field_38068 = Maps.newHashMap();
        }
        if (this.Field_38068.size() > (20666 & 886)) {
            throw new IllegalArgumentException("Metadata payload is full, cannot add more to it!");
        }
        if (string == null) {
            throw new IllegalArgumentException("Metadata payload key cannot be null!");
        }
        if (string.length() > (767 & -13825)) {
            throw new IllegalArgumentException("Metadata payload key is too long!");
        }
        if (string2 == null) {
            throw new IllegalArgumentException("Metadata payload value cannot be null!");
        }
        if (string2.length() > (2303 & 16895)) {
            throw new IllegalArgumentException("Metadata payload value is too long!");
        }
        this.Field_38068.put(string, string2);
    }
}

