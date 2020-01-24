/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_33699 {
    private byte Field_33700;
    private byte Field_33701;
    private byte Field_33702;
    private byte Field_33703;

    public byte Method_33704() {
        return this.Field_33703;
    }

    public byte Method_33705() {
        return this.Field_33701;
    }

    public byte Method_33706() {
        return this.Field_33702;
    }

    public Class_33699(byte by, byte by2, byte by3, byte by4) {
        this.Field_33703 = by;
        this.Field_33700 = by2;
        this.Field_33702 = by3;
        this.Field_33701 = by4;
    }

    public int Method_33707() {
        int n = this.Field_33703;
        n = (159 & -29665) * n + this.Field_33700;
        n = (19295 & 31) * n + this.Field_33702;
        n = (19135 & 8287) * n + this.Field_33701;
        return n;
    }

    private void Method_33708() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public byte Method_33709() {
        return this.Field_33700;
    }

    public boolean Method_33710(Object object) {
        if (this == object) {
            return (-32655 & 25231) != 0;
        }
        if (!(object instanceof Class_33699)) {
            return (-31734 & 832) != 0;
        }
        Class_33699 class_33699 = (Class_33699)object;
        return (this.Field_33703 != class_33699.Field_33703 ? 2048 & -11036 : (this.Field_33701 != class_33699.Field_33701 ? 536 & 21507 : (this.Field_33700 != class_33699.Field_33700 ? 2304 & 556 : (this.Field_33702 == class_33699.Field_33702 ? 4137 & -15915 : 8717 & 5488)))) != 0;
    }
}

