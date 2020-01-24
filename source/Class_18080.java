/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_18080 {
    private boolean Field_18081;
    private int Field_18082;
    public boolean Field_18083 = 21 & -12671;
    private int Field_18084;
    public boolean Field_18085;
    private Class_3839 Field_18086 = new Class_3839(Class_2263.Method_2283(), Class_2205.Field_2224);
    private Class_3839 Field_18087 = new Class_3839(Class_2263.Method_2321(), Class_2205.Field_2259);
    private int Field_18088;
    private int Field_18089;

    public boolean Method_18090() {
        if (this.Field_18082 == (5369 & -32271) && this.Field_18089 != (11325 & 95)) {
            new Class_30877(new Throwable("Hehe"));
        }
        if (this.Field_18082 == (17785 & -29383) && this.Field_18089 != (775 & -20409)) {
            new Class_30877(new Throwable("Hehe"));
        }
        return (this.Field_18082 == (10485 & 4337) ? 2267 & -31999 : 4186 & 19969) != 0;
    }

    private void Method_18091() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_18092(Class_1699 class_1699) {
        if (class_1699.Method_1715("abilities", -26790 & 16394)) {
            Class_1699 class_16992 = class_1699.Method_1703("abilities");
            this.Field_18085 = class_16992.Method_1733("invulnerable");
            this.Method_18102(class_16992.Method_1733("flying"));
            this.Method_18098(class_16992.Method_1733("mayfly"));
            this.Method_18099(class_16992.Method_1733("instabuild"));
            if (class_16992.Method_1715("flySpeed", 227 & 4215)) {
                this.Method_18097(class_16992.Method_1745("flySpeed"));
                this.Method_18100(class_16992.Method_1745("walkSpeed"));
            }
            if (class_16992.Method_1715("mayBuild", 2581 & -31607)) {
                this.Field_18083 = class_16992.Method_1733("mayBuild");
            }
        }
    }

    public float Method_18093() {
        return this.Field_18087.Method_3850();
    }

    public boolean Method_18094() {
        return this.Field_18081;
    }

    public boolean Method_18095() {
        if (this.Field_18088 == (7925 & 241) && this.Field_18084 != (157 & 829)) {
            new Class_30877(new Throwable("Hehe"));
        }
        if (this.Field_18088 == (-30919 & 1339) && this.Field_18084 != (7 & 13591)) {
            new Class_30877(new Throwable("Hehe"));
        }
        return (this.Field_18088 == (-23307 & 6641) ? 2369 & 8209 : -32512 & 3584) != 0;
    }

    public void Method_18096(Class_1699 class_1699) {
        Class_1699 class_16992 = new Class_1699();
        class_16992.Method_1706("invulnerable", this.Field_18085);
        class_16992.Method_1706("flying", this.Method_18090());
        class_16992.Method_1706("mayfly", this.Method_18095());
        class_16992.Method_1706("instabuild", this.Method_18094());
        class_16992.Method_1706("mayBuild", this.Field_18083);
        class_16992.Method_1704("flySpeed", this.Field_18087.Method_3850());
        class_16992.Method_1704("walkSpeed", this.Method_18101());
        class_1699.Method_1744("abilities", class_16992);
    }

    public void Method_18097(float f) {
        this.Field_18087.Method_3854(f);
    }

    public void Method_18098(boolean bl) {
        if (bl) {
            this.Field_18088 = 5877 & 2291;
            this.Field_18084 = 23133 & 1471;
        } else {
            this.Field_18088 = 17789 & 11705;
            this.Field_18084 = 2063 & 8999;
        }
    }

    public void Method_18099(boolean bl) {
        this.Field_18081 = bl;
    }

    public void Method_18100(float f) {
        this.Field_18086.Method_3854(f);
    }

    public float Method_18101() {
        return this.Field_18086.Method_3850();
    }

    public void Method_18102(boolean bl) {
        if (bl) {
            this.Field_18082 = 2289 & -15627;
            this.Field_18089 = 541 & -26211;
        } else {
            this.Field_18082 = 20345 & -31303;
            this.Field_18089 = -27641 & 2335;
        }
    }

    public void Method_18103(float f) {
        this.Method_18100(f);
    }
}

