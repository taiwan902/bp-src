/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_21577
implements Class_20603 {
    private final Class_2457 Field_21578;
    private final Class_44584 Field_21579;

    private void Method_21580() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_21577(Class_2457 class_2457, Class_44584 class_44584) {
        this.Field_21578 = class_2457;
        this.Field_21579 = class_44584;
    }

    public void Method_21581(Class_1782 class_1782) {
    }

    public void Method_21582(Class_36280 class_36280) {
        switch (Class_17100.Field_17101[class_36280.Method_36287().ordinal()]) {
            case 1: {
                this.Field_21579.Method_44607(Class_11271.Field_11282);
                if (class_36280.Method_36289() > (12335 & 17983)) {
                    Class_2840 class_2840 = new Class_2840("Outdated server! I'm still on 1.8.8");
                    this.Field_21579.Method_44629(new Class_27494(class_2840));
                    this.Field_21579.Method_44622(class_2840);
                    break;
                }
                if (class_36280.Method_36289() < (-28625 & 9023)) {
                    Class_2840 class_2840 = new Class_2840("Outdated client! Please use 1.8.8");
                    this.Field_21579.Method_44629(new Class_27494(class_2840));
                    this.Field_21579.Method_44622(class_2840);
                    break;
                }
                this.Field_21579.Method_44630(new Class_30118(this.Field_21578, this.Field_21579));
                break;
            }
            case 2: {
                this.Field_21579.Method_44607(Class_11271.Field_11275);
                this.Field_21579.Method_44630(new Class_20966(this.Field_21578, this.Field_21579));
                break;
            }
            default: {
                throw new UnsupportedOperationException("Invalid intention " + (Object)((Object)class_36280.Method_36287()));
            }
        }
    }
}

