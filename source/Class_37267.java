/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_37267
implements Class_1486 {
    public String Field_37268;
    public int Field_37269;
    public Class_41529 Field_37270;
    public int Field_37271;
    public int Field_37272;

    public void Method_37273(Class_10954 class_10954) {
        this.Method_37277((Class_14856)class_10954);
    }

    private void Method_37274() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_37267(Class_24879 class_24879, Class_41529 class_41529) {
        this.Field_37270 = class_41529;
        Class_859 class_859 = class_24879.Method_24890();
        switch (Class_11349.Field_11350[class_41529.ordinal()]) {
            case 1: {
                this.Field_37272 = class_24879.Method_24895();
                this.Field_37271 = class_859 == null ? -1 & -1 : class_859.\u0000, `();
                break;
            }
            case 2: {
                this.Field_37269 = class_24879.Method_24894().\u0000, `();
                this.Field_37271 = class_859 == null ? -1 & -1 : class_859.\u0000, `();
                this.Field_37268 = class_24879.Method_24898().Method_1788();
            }
        }
    }

    public void Method_37275(Class_29900 class_29900) {
        class_29900.Method_29964(this.Field_37270);
        if (this.Field_37270 == Class_41529.Field_41530) {
            class_29900.Method_29982(this.Field_37272);
            class_29900.Method_30010(this.Field_37271);
        } else if (this.Field_37270 == Class_41529.Field_41533) {
            class_29900.Method_29982(this.Field_37269);
            class_29900.Method_30010(this.Field_37271);
            class_29900.Method_29960(this.Field_37268);
        }
    }

    public Class_37267() {
    }

    public void Method_37276(Class_29900 class_29900) {
        this.Field_37270 = (Class_41529)class_29900.Method_30009(Class_41529.class);
        if (this.Field_37270 == Class_41529.Field_41530) {
            this.Field_37272 = class_29900.Method_30004();
            this.Field_37271 = class_29900.Method_29914();
        } else if (this.Field_37270 == Class_41529.Field_41533) {
            this.Field_37269 = class_29900.Method_30004();
            this.Field_37271 = class_29900.Method_29914();
            this.Field_37268 = class_29900.Method_29991(32767 & 32767);
        }
    }

    public void Method_37277(Class_14856 class_14856) {
        class_14856.Method_14916(this);
    }
}

