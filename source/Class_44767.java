/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Map;

public class Class_44767
extends Class_43634
implements Class_4993 {
    private Map Field_44768 = Maps.newHashMap();
    private String Field_44769;

    public int Method_44770(int n) {
        return this.Field_44768.containsKey(n) ? (Integer)this.Field_44768.get(n) : -32256 & 4113;
    }

    public void Method_44771(int n, int n2) {
        this.Field_44768.put(n, n2);
    }

    public Class_8295 Method_44772(Class_37781 class_37781, Class_626 class_626) {
        throw new UnsupportedOperationException();
    }

    public boolean Method_44773() {
        return (-20295 & 2048) != 0;
    }

    public Class_44767(String string, Class_1782 class_1782, int n) {
        super(class_1782, n);
        this.Field_44769 = string;
    }

    private void Method_44774() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_44775(Class_11641 class_11641) {
    }

    public Class_11641 Method_44776() {
        return Class_11641.Field_11643;
    }

    public String Method_44777() {
        return this.Field_44769;
    }

    public int Method_44778() {
        return this.Field_44768.size();
    }
}

