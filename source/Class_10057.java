/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_10057
implements Comparable {
    private final int Field_10058;
    private final int Field_10059;
    private boolean Field_10060;
    private final Class_11372 Field_10061;
    private final int Field_10062;
    private float Field_10063 = 1.0f;

    public Class_10057(Class_11372 class_11372, int n) {
        this.Field_10061 = class_11372;
        this.Field_10059 = class_11372.Method_11431();
        this.Field_10058 = class_11372.Method_11424();
        this.Field_10062 = n;
        this.Field_10060 = Class_19810.Method_19826(this.Field_10058, n) > Class_19810.Method_19826(this.Field_10059, n) ? -16379 & 4145 : -25565 & 8532;
    }

    public int Method_10064(Object object) {
        return this.Method_10073((Class_10057)object);
    }

    public Class_11372 Method_10065() {
        return this.Field_10061;
    }

    private void Method_10066() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_10067(int n) {
        if (this.Field_10059 > n && this.Field_10058 > n) {
            this.Field_10063 = (float)n / (float)Math.min(this.Field_10059, this.Field_10058);
        }
    }

    public int Method_10068() {
        return this.Field_10060 ? Class_19810.Method_19826((int)((float)this.Field_10059 * this.Field_10063), this.Field_10062) : Class_19810.Method_19826((int)((float)this.Field_10058 * this.Field_10063), this.Field_10062);
    }

    public String Method_10069() {
        return "Holder{width=" + this.Field_10059 + ", height=" + this.Field_10058 + (char)(16639 & 8317);
    }

    public int Method_10070() {
        return this.Field_10060 ? Class_19810.Method_19826((int)((float)this.Field_10058 * this.Field_10063), this.Field_10062) : Class_19810.Method_19826((int)((float)this.Field_10059 * this.Field_10063), this.Field_10062);
    }

    public void Method_10071() {
        this.Field_10060 = !this.Field_10060 ? 1473 & 16945 : 4105 & 18468;
    }

    public boolean Method_10072() {
        return this.Field_10060;
    }

    public int Method_10073(Class_10057 class_10057) {
        int n;
        if (this.Method_10068() == class_10057.Method_10068()) {
            if (this.Method_10070() == class_10057.Method_10070()) {
                if (this.Field_10061.Method_11438() == null) {
                    return class_10057.Field_10061.Method_11438() == null ? 768 & 86 : -1 & -1;
                }
                return this.Field_10061.Method_11438().compareTo(class_10057.Field_10061.Method_11438());
            }
            n = this.Method_10070() < class_10057.Method_10070() ? 3601 & 355 : -1 & -1;
        } else {
            n = this.Method_10068() < class_10057.Method_10068() ? 2307 & 581 : -1 & -1;
        }
        return n;
    }
}

