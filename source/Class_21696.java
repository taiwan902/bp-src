/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Comparator;
import java.util.List;

public class Class_21696 {
    public static final Comparator Field_21697 = new Class_11345();
    private final Class_7873 Field_21698;
    private int Field_21699;
    private boolean Field_21700;
    private boolean Field_21701;
    private final Class_20976 Field_21702;
    private final String Field_21703;

    public Class_20976 Method_21704() {
        return this.Field_21702;
    }

    public void Method_21705(boolean bl) {
        this.Field_21700 = bl;
    }

    public int Method_21706() {
        return this.Field_21699;
    }

    public void Method_21707(int n) {
        if (this.Field_21698.Method_7883().Method_27942()) {
            throw new IllegalStateException("Cannot modify read-only score");
        }
        this.Method_21709(this.Method_21706() + n);
    }

    public void Method_21708() {
        if (this.Field_21698.Method_7883().Method_27942()) {
            throw new IllegalStateException("Cannot modify read-only score");
        }
        this.Method_21707(-5625 & 33);
    }

    public void Method_21709(int n) {
        int n2 = this.Field_21699;
        this.Field_21699 = n;
        if (n2 != n || this.Field_21701) {
            this.Field_21701 = 8960 & 2113;
            this.Method_21704().Method_21001(this);
        }
    }

    public Class_21696(Class_20976 class_20976, Class_7873 class_7873, String string) {
        this.Field_21702 = class_20976;
        this.Field_21698 = class_7873;
        this.Field_21703 = string;
        this.Field_21701 = 1697 & -26559;
    }

    public void Method_21710(int n) {
        if (this.Field_21698.Method_7883().Method_27942()) {
            throw new IllegalStateException("Cannot modify read-only score");
        }
        this.Method_21709(this.Method_21706() - n);
    }

    public Class_7873 Method_21711() {
        return this.Field_21698;
    }

    private void Method_21712() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_21713(List list) {
        this.Method_21709(this.Field_21698.Method_7883().Method_27943(list));
    }

    public boolean Method_21714() {
        return this.Field_21700;
    }

    public String Method_21715() {
        return this.Field_21703;
    }
}

