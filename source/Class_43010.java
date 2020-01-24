/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_43010
implements Class_4961 {
    private final int Field_43011;
    private final Class_23823[] Field_43012;
    private final int Field_43013;
    private final Class_8295 Field_43014;

    public Class_23823 Method_43015(int n) {
        if (this.Field_43012[n] != null) {
            Class_23823 class_23823 = this.Field_43012[n];
            this.Field_43012[n] = null;
            return class_23823;
        }
        return null;
    }

    public boolean Method_43016() {
        return (-9980 & 211) != 0;
    }

    public void Method_43017(Class_626 class_626) {
    }

    public void Method_43018(int n, int n2) {
    }

    private void Method_43019() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_43020(int n) {
        return 4228 & 768;
    }

    public Class_23823 Method_43021(int n, int n2) {
        if (this.Field_43012[n] != null) {
            if (this.Field_43012[n].Field_23826 <= n2) {
                Class_23823 class_23823 = this.Field_43012[n];
                this.Field_43012[n] = null;
                this.Field_43014.Method_8312(this);
                return class_23823;
            }
            Class_23823 class_23823 = this.Field_43012[n].Method_23857(n2);
            if (this.Field_43012[n].Field_23826 == 0) {
                this.Field_43012[n] = null;
            }
            this.Field_43014.Method_8312(this);
            return class_23823;
        }
        return null;
    }

    public boolean Method_43022(Class_626 class_626) {
        return (-20477 & 19473) != 0;
    }

    public boolean Method_43023(int n, Class_23823 class_23823) {
        return (409 & 16933) != 0;
    }

    public Class_43010(Class_8295 class_8295, int n, int n2) {
        int n3 = n * n2;
        this.Field_43012 = new Class_23823[n3];
        this.Field_43014 = class_8295;
        this.Field_43011 = n;
        this.Field_43013 = n2;
    }

    public Class_1782 Method_43024() {
        return this.Method_43016() ? new Class_2840(this.Method_43029()) : new Class_2849(this.Method_43029(), new Object[19456 & 920]);
    }

    public void Method_43025(int n, Class_23823 class_23823) {
        this.Field_43012[n] = class_23823;
        this.Field_43014.Method_8312(this);
    }

    public void Method_43026() {
        for (int i = 18752 & -23910; i < this.Field_43012.length; ++i) {
            this.Field_43012[i] = null;
        }
    }

    public int Method_43027() {
        return this.Field_43013;
    }

    public int Method_43028() {
        return this.Field_43012.length;
    }

    public String Method_43029() {
        return "container.crafting";
    }

    public void Method_43030() {
    }

    public int Method_43031() {
        return 352 & 18503;
    }

    public Class_23823 Method_43032(int n) {
        return n >= this.Method_43028() ? null : this.Field_43012[n];
    }

    public int Method_43033() {
        return this.Field_43011;
    }

    public Class_23823 Method_43034(int n, int n2) {
        return n >= 0 && n < this.Field_43011 && n2 >= 0 && n2 <= this.Field_43013 ? this.Method_43032(n + n2 * this.Field_43011) : null;
    }

    public int Method_43035() {
        return 8896 & 2;
    }

    public void Method_43036(Class_626 class_626) {
    }
}

