/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_40879
implements Comparable {
    private final long Field_40880;
    private final Class_35650 Field_40881;
    private final boolean Field_40882;
    private final long Field_40883;
    private final String Field_40884;
    private final boolean Field_40885;
    private final boolean Field_40886;
    private final String Field_40887;

    public boolean Method_40888() {
        return this.Field_40882;
    }

    public Class_40879(String string, String string2, long l, long l2, Class_35650 class_35650, boolean bl, boolean bl2, boolean bl3) {
        this.Field_40884 = string;
        this.Field_40887 = string2;
        this.Field_40883 = l;
        this.Field_40880 = l2;
        this.Field_40881 = class_35650;
        this.Field_40885 = bl;
        this.Field_40886 = bl2;
        this.Field_40882 = bl3;
    }

    public String Method_40889() {
        return this.Field_40887;
    }

    public int Method_40890(Object object) {
        return this.Method_40896((Class_40879)object);
    }

    public Class_35650 Method_40891() {
        return this.Field_40881;
    }

    public boolean Method_40892() {
        return this.Field_40886;
    }

    public String Method_40893() {
        return this.Field_40884;
    }

    private void Method_40894() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_40895() {
        return this.Field_40885;
    }

    public int Method_40896(Class_40879 class_40879) {
        return this.Field_40883 < class_40879.Field_40883 ? 401 & 3147 : (this.Field_40883 > class_40879.Field_40883 ? -1 & -1 : this.Field_40884.compareTo(class_40879.Field_40884));
    }

    public long Method_40897() {
        return this.Field_40883;
    }
}

