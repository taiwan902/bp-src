/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_35790
implements Class_31211 {
    protected final List Field_35791;
    protected final boolean Field_35792;
    protected final Class_15852 Field_35793;
    protected final boolean Field_35794;
    protected final List Field_35795;
    protected final Class_11372 Field_35796;

    public Class_11372 Method_35797() {
        return this.Field_35796;
    }

    public Class_15852 Method_35798() {
        return this.Field_35793;
    }

    public boolean Method_35799() {
        return (12545 & 544) != 0;
    }

    private void Method_35800() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_35801() {
        return this.Field_35792;
    }

    public Class_35790(List list, List list2, boolean bl, boolean bl2, Class_11372 class_11372, Class_15852 class_15852) {
        this.Field_35795 = list;
        this.Field_35791 = list2;
        this.Field_35792 = bl;
        this.Field_35794 = bl2;
        this.Field_35796 = class_11372;
        this.Field_35793 = class_15852;
    }

    public boolean Method_35802() {
        return this.Field_35794;
    }

    public List Method_35803() {
        return this.Field_35795;
    }

    public List Method_35804(Class_4595 class_4595) {
        return (List)this.Field_35791.get(class_4595.ordinal());
    }
}

