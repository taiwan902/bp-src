/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_20902 {
    int Field_20903;
    Class_46926[] Field_20904;
    int Field_20905;
    int Field_20906;
    final Class_36353 Field_20907;

    private void Method_20908() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_46926 Method_20909(int n, byte by) {
        return this.Field_20904[((n & this.Field_20905) << this.Field_20903) + ((by & (-31489 & 24831)) >>> (5146 & -16343) - this.Field_20903)];
    }

    Class_20902(Class_36353 class_36353) {
        this.Field_20907 = class_36353;
    }

    public void Method_20910() {
        int n = (10245 & 4481) << this.Field_20903 + this.Field_20906;
        for (int i = 11720 & 4096; i < n; ++i) {
            this.Field_20904[i].Method_46932();
        }
    }

    public void Method_20911(int n, int n2) {
        if (this.Field_20904 != null && this.Field_20903 == n2 && this.Field_20906 == n) {
            return;
        }
        this.Field_20906 = n;
        this.Field_20905 = ((-28671 & 26375) << n) - (13701 & 2083);
        this.Field_20903 = n2;
        int n3 = (24603 & 1793) << this.Field_20903 + this.Field_20906;
        this.Field_20904 = new Class_46926[n3];
        for (int i = 8449 & -16374; i < n3; ++i) {
            this.Field_20904[i] = new Class_46926(this);
        }
    }
}

