/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Class_7985 {
    private Set Field_7986 = new LinkedHashSet();
    private Map Field_7987 = new LinkedHashMap();
    private String Field_7988 = null;

    public Class_7985(String string) {
        this.Field_7988 = string;
    }

    public String[] Method_7989() {
        Set set = this.Field_7987.keySet();
        String[] arrstring = set.toArray(new String[set.size()]);
        return arrstring;
    }

    public boolean Method_7990(String string) {
        return this.Field_7986.contains(string);
    }

    public void Method_7991(String string, String string2) {
        this.Field_7987.put(string, string2);
    }

    public Collection Method_7992() {
        return new LinkedHashSet(this.Field_7986);
    }

    public void Method_7993(String string) {
        this.Field_7986.remove(string);
    }

    public String Method_7994() {
        return this.Field_7988;
    }

    private void Method_7995() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_7996(String string) {
        this.Field_7986.add(string);
    }

    public void Method_7997(Collection collection) {
        this.Field_7986.addAll(collection);
    }

    public String Method_7998(String string) {
        return (String)this.Field_7987.get(string);
    }

    public void Method_7999(Class_7985 class_7985) {
        if (class_7985 != null) {
            this.Field_7987.putAll(class_7985.Field_7987);
        }
    }
}

