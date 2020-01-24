/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.NoSuchElementException;

public class Class_22031
implements Class_20759 {
    final Class_44898 Field_22032;
    int Field_22033;
    Class_41640 Field_22034;
    int Field_22035;
    boolean Field_22036;
    int Field_22037;

    public boolean Method_22038() {
        return (this.Field_22035 != 0 ? 1153 & 30789 : 17221 & 136) != 0;
    }

    private Class_22031(Class_44898 class_44898) {
        this.Field_22032 = class_44898;
        this.Field_22033 = this.Field_22032.Field_44899;
        this.Field_22037 = -1 & -1;
        this.Field_22035 = this.Field_22032.Field_44906;
        this.Field_22036 = this.Field_22032.Field_44905;
    }

    private final void Method_22039(int n) {
        Object[] arrobject = this.Field_22032.Field_44901;
        do {
            Object object;
            int n2 = n;
            n = n2 + (8353 & 1561) & this.Field_22032.Field_44903;
            do {
                if ((object = arrobject[n]) == null) {
                    arrobject[n2] = null;
                    return;
                }
                int n3 = Class_17239.Method_17240(object.hashCode()) & this.Field_22032.Field_44903;
                if (n2 <= n ? n2 >= n3 || n3 > n : n2 >= n3 && n3 > n) break;
                n = n + (8203 & 3221) & this.Field_22032.Field_44903;
            } while (true);
            if (n < n2) {
                if (this.Field_22034 == null) {
                    this.Field_22034 = new Class_41640(2122 & -23913);
                }
                this.Field_22034.Method_41645(arrobject[n]);
            }
            arrobject[n2] = object;
        } while (true);
    }

    Class_22031(Class_44898 class_44898, Class_6084 class_6084) {
        this(class_44898);
    }

    public void Method_22040() {
        if (this.Field_22037 == (-1 & -1)) {
            throw new IllegalStateException();
        }
        if (this.Field_22037 == this.Field_22032.Field_44899) {
            this.Field_22032.Field_44905 = -32767 & 6816;
            this.Field_22032.Field_44901[this.Field_22032.Field_44899] = null;
        } else if (this.Field_22033 >= 0) {
            this.Method_22039(this.Field_22037);
        } else {
            this.Field_22032.Method_44907(this.Field_22034.Method_41648(-this.Field_22033 - (4225 & 1097), null));
            this.Field_22037 = -1 & -1;
            return;
        }
        this.Field_22032.Field_44906 -= 1 & 5187;
        this.Field_22037 = -1 & -1;
    }

    public Object Method_22041() {
        if (!this.Method_22038()) {
            throw new NoSuchElementException();
        }
        this.Field_22035 -= 8283 & 129;
        if (this.Field_22036) {
            this.Field_22036 = 22032 & -32434;
            this.Field_22037 = this.Field_22032.Field_44899;
            return this.Field_22032.Field_44901[this.Field_22032.Field_44899];
        }
        Object[] arrobject = this.Field_22032.Field_44901;
        do {
            if ((this.Field_22033 -= 17507 & 2945) >= 0) continue;
            this.Field_22037 = -1601650422 & -1675554812;
            return this.Field_22034.Method_41651(-this.Field_22033 - (4133 & 19841));
        } while (arrobject[this.Field_22033] == null);
        this.Field_22037 = this.Field_22033;
        return arrobject[this.Field_22037];
    }

    private void Method_22042() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

