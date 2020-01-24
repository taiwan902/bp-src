/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_44480
implements Class_1486 {
    private String Field_44481 = "";
    private String Field_44482 = "";
    private Class_16202 Field_44483;
    private int Field_44484;

    public Class_44480(String string) {
        this.Field_44481 = string;
        this.Field_44482 = "";
        this.Field_44484 = 538 & -32667;
        this.Field_44483 = Class_16202.Field_16203;
    }

    public String Method_44485() {
        return this.Field_44482;
    }

    public Class_44480(Class_21696 class_21696) {
        this.Field_44481 = class_21696.Method_21715();
        this.Field_44482 = class_21696.Method_21711().Method_7881();
        this.Field_44484 = class_21696.Method_21706();
        this.Field_44483 = Class_16202.Field_16204;
    }

    public void Method_44486(Class_14856 class_14856) {
        class_14856.Method_14893(this);
    }

    public void Method_44487(Class_29900 class_29900) {
        class_29900.Method_29960(this.Field_44481);
        class_29900.Method_29964(this.Field_44483);
        class_29900.Method_29960(this.Field_44482);
        if (this.Field_44483 != Class_16202.Field_16203) {
            class_29900.Method_29982(this.Field_44484);
        }
    }

    public void Method_44488(Class_29900 class_29900) {
        this.Field_44481 = class_29900.Method_29991(363 & 9768);
        this.Field_44483 = (Class_16202)class_29900.Method_30009(Class_16202.class);
        this.Field_44482 = class_29900.Method_29991(912 & 1115);
        if (this.Field_44483 != Class_16202.Field_16203) {
            this.Field_44484 = class_29900.Method_30004();
        }
    }

    public Class_44480(String string, Class_7873 class_7873) {
        this.Field_44481 = string;
        this.Field_44482 = class_7873.Method_7881();
        this.Field_44484 = -24768 & 130;
        this.Field_44483 = Class_16202.Field_16203;
    }

    public Class_16202 Method_44489() {
        return this.Field_44483;
    }

    public String Method_44490() {
        return this.Field_44481;
    }

    public int Method_44491() {
        return this.Field_44484;
    }

    public Class_44480() {
    }

    private void Method_44492() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_44493(Class_10954 class_10954) {
        this.Method_44486((Class_14856)class_10954);
    }
}

