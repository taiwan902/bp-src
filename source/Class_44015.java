/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 */
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Class_44015
extends Class_35728 {
    protected final Class_42339 Field_44016;
    private final int Field_44017;
    protected Predicate Field_44018;
    protected Class_859 Field_44019;
    protected final Class Field_44020;

    public Class_44015(Class_41853 class_41853, Class class_, boolean bl) {
        this(class_41853, class_, bl, (576 & 20481) != 0);
    }

    private void Method_44021() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_44015(Class_41853 class_41853, Class class_, int n, boolean bl, boolean bl2, Predicate predicate) {
        super(class_41853, bl, bl2);
        this.Field_44020 = class_;
        this.Field_44017 = n;
        this.Field_44016 = new Class_42339(class_41853);
        this.\u0000strictfp(-32487 & 27655);
        this.Field_44018 = new Class_26452(this, predicate);
    }

    public void Method_44022() {
        this.\u0000strictfp.\u0000, `(this.Field_44019);
        super.Method_35741();
    }

    public Class_44015(Class_41853 class_41853, Class class_, boolean bl, boolean bl2) {
        this(class_41853, class_, 8714 & 2062, bl, bl2, null);
    }

    public boolean Method_44023() {
        if (this.Field_44017 > 0 && this.\u0000strictfp.\u0000strictfp().nextInt(this.Field_44017) != 0) {
            return (3076 & 24608) != 0;
        }
        double d = this.\u0000strictfp();
        List list = this.\u0000strictfp.\u0000strictfp.Method_395(this.Field_44020, this.\u0000strictfp.\u0000, `().Method_11017(d, 1.5806451612903225 * 2.5306122448979593, d), Predicates.and((Predicate)this.Field_44018, (Predicate)Class_28857.Field_28860));
        Collections.sort(list, this.Field_44016);
        if (list.isEmpty()) {
            return (-16376 & 6672) != 0;
        }
        this.Field_44019 = (Class_859)list.get(0 & 8596);
        return (8353 & -32763) != 0;
    }
}

