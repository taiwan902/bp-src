/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Objects
 *  com.google.common.collect.Lists
 */
import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;

public class Class_10233 {
    private int Field_10234;
    private static final Class_14683 Field_10235;
    private final Class_37045 Field_10236;
    private static final Class_14683 Field_10237;
    private final List Field_10238 = Lists.newArrayList();
    private static final Class_14683 Field_10239;
    public static final Class_14683 Field_10240;
    private int Field_10241 = -1 & -1;
    private Class_40184 Field_10242 = new Class_44944();
    private static final Class_14683 Field_10243;

    static int Method_10244(Class_10233 class_10233, int n) {
        class_10233.Field_10234 = n;
        return class_10233.Field_10234;
    }

    public void Method_10245() {
        this.Field_10236.Method_37046(this);
    }

    public Class_10233(Class_37045 class_37045) {
        this.Field_10236 = class_37045;
    }

    public void Method_10246(Class_40184 class_40184) {
        this.Field_10238.add(this.Method_10253());
        this.Field_10242 = class_40184;
        this.Field_10241 = -1 & -1;
        this.Field_10234 = 17 & -25848;
    }

    static {
        Field_10243 = new Class_35748(null);
        Field_10235 = new Class_20638(-1 & -1, (8307 & 17409) != 0);
        Field_10239 = new Class_20638(-14295 & 387, (-32377 & 12849) != 0);
        Field_10237 = new Class_20638(25633 & 149, (-30440 & 9411) != 0);
        Field_10240 = new Class_42435();
    }

    public Class_14683 Method_10247() {
        return this.Method_10254(this.Field_10241);
    }

    public int Method_10248() {
        return this.Field_10241;
    }

    public void Method_10249(int n) {
        Class_14683 class_14683 = this.Method_10254(n);
        if (class_14683 != Field_10240) {
            if (this.Field_10241 == n && class_14683.Method_14684()) {
                class_14683.Method_14686(this);
            } else {
                this.Field_10241 = n;
            }
        }
    }

    public Class_40184 Method_10250() {
        return this.Field_10242;
    }

    private void Method_10251() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public List Method_10252() {
        ArrayList arrayList = Lists.newArrayList();
        for (int i = 16928 & 8200; i <= (8216 & 19114); ++i) {
            arrayList.add(this.Method_10254(i));
        }
        return arrayList;
    }

    public Class_10422 Method_10253() {
        return new Class_10422(this.Field_10242, this.Method_10252(), this.Field_10241);
    }

    public Class_14683 Method_10254(int n) {
        int n2 = n + this.Field_10234 * (19054 & 134);
        return this.Field_10234 > 0 && n == 0 ? Field_10235 : (n == (16407 & 775) ? (n2 < this.Field_10242.Method_40185().size() ? Field_10239 : Field_10237) : (n == (4174 & -15095) ? Field_10243 : (n2 >= 0 && n2 < this.Field_10242.Method_40185().size() ? (Class_14683)Objects.firstNonNull(this.Field_10242.Method_40185().get(n2), (Object)Field_10240) : Field_10240)));
    }
}

