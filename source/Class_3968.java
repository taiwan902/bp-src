/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Objects
 *  com.google.common.base.Objects$ToStringHelper
 */
import com.google.common.base.Objects;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;

public abstract class Class_3968
implements Class_3538 {
    private final Class Field_3969;
    private final String Field_3970;

    public boolean Method_3971(Object object) {
        if (this == object) {
            return (-32255 & 2249) != 0;
        }
        if (object != null && this.getClass() == object.getClass()) {
            Class_3968 class_3968 = (Class_3968)object;
            return (this.Field_3969.equals(class_3968.Field_3969) && this.Field_3970.equals(class_3968.Field_3970) ? 6185 & -32761 : -28671 & 3200) != 0;
        }
        return (-32507 & 18498) != 0;
    }

    public int Method_3972() {
        return (543 & 4127) * this.Field_3969.hashCode() + this.Field_3970.hashCode();
    }

    public Class Method_3973() {
        return this.Field_3969;
    }

    private void Method_3974() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_3975() {
        return this.Field_3970;
    }

    protected Class_3968(String string, Class class_) {
        this.Field_3969 = class_;
        this.Field_3970 = string;
    }

    public String Method_3976() {
        return Objects.toStringHelper((Object)this).add("name", (Object)this.Field_3970).add("clazz", (Object)this.Field_3969).add("values", (Object)this.\u0000strictfp()).toString();
    }
}

