/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_27517
implements Class_1486 {
    private double Field_27518;
    private int Field_27519;
    private double Field_27520;
    private double Field_27521;
    private long Field_27522;
    private int Field_27523;
    private double Field_27524;
    private Class_21630 Field_27525;
    private int Field_27526;

    public void Method_27527(Class_10954 class_10954) {
        this.Method_27532((Class_14856)class_10954);
    }

    public void Method_27528(Class_29900 class_29900) {
        class_29900.Method_29964(this.Field_27525);
        switch (Class_42722.Field_42723[this.Field_27525.ordinal()]) {
            case 1: {
                class_29900.Method_29941(this.Field_27524);
                break;
            }
            case 2: {
                class_29900.Method_29941(this.Field_27520);
                class_29900.Method_29941(this.Field_27524);
                class_29900.Method_29913(this.Field_27522);
                break;
            }
            case 3: {
                class_29900.Method_29941(this.Field_27518);
                class_29900.Method_29941(this.Field_27521);
                break;
            }
            case 4: {
                class_29900.Method_29982(this.Field_27523);
                break;
            }
            case 5: {
                class_29900.Method_29982(this.Field_27519);
                break;
            }
            case 6: {
                class_29900.Method_29941(this.Field_27518);
                class_29900.Method_29941(this.Field_27521);
                class_29900.Method_29941(this.Field_27520);
                class_29900.Method_29941(this.Field_27524);
                class_29900.Method_29913(this.Field_27522);
                class_29900.Method_29982(this.Field_27526);
                class_29900.Method_29982(this.Field_27523);
                class_29900.Method_29982(this.Field_27519);
            }
        }
    }

    public void Method_27529(Class_31457 class_31457) {
        switch (Class_42722.Field_42723[this.Field_27525.ordinal()]) {
            case 1: {
                class_31457.Method_31501(this.Field_27524);
                break;
            }
            case 2: {
                class_31457.Method_31481(this.Field_27520, this.Field_27524, this.Field_27522);
                break;
            }
            case 3: {
                class_31457.Method_31478(this.Field_27518, this.Field_27521);
                break;
            }
            case 4: {
                class_31457.Method_31487(this.Field_27523);
                break;
            }
            case 5: {
                class_31457.Method_31472(this.Field_27519);
                break;
            }
            case 6: {
                class_31457.Method_31478(this.Field_27518, this.Field_27521);
                if (this.Field_27522 > (157622384L & 82373177771083776L)) {
                    class_31457.Method_31481(this.Field_27520, this.Field_27524, this.Field_27522);
                } else {
                    class_31457.Method_31501(this.Field_27524);
                }
                class_31457.Method_31496(this.Field_27526);
                class_31457.Method_31487(this.Field_27523);
                class_31457.Method_31472(this.Field_27519);
            }
        }
    }

    public void Method_27530(Class_29900 class_29900) {
        this.Field_27525 = (Class_21630)class_29900.Method_30009(Class_21630.class);
        switch (Class_42722.Field_42723[this.Field_27525.ordinal()]) {
            case 1: {
                this.Field_27524 = class_29900.Method_29948();
                break;
            }
            case 2: {
                this.Field_27520 = class_29900.Method_29948();
                this.Field_27524 = class_29900.Method_29948();
                this.Field_27522 = class_29900.Method_30019();
                break;
            }
            case 3: {
                this.Field_27518 = class_29900.Method_29948();
                this.Field_27521 = class_29900.Method_29948();
                break;
            }
            case 4: {
                this.Field_27523 = class_29900.Method_30004();
                break;
            }
            case 5: {
                this.Field_27519 = class_29900.Method_30004();
                break;
            }
            case 6: {
                this.Field_27518 = class_29900.Method_29948();
                this.Field_27521 = class_29900.Method_29948();
                this.Field_27520 = class_29900.Method_29948();
                this.Field_27524 = class_29900.Method_29948();
                this.Field_27522 = class_29900.Method_30019();
                this.Field_27526 = class_29900.Method_30004();
                this.Field_27523 = class_29900.Method_30004();
                this.Field_27519 = class_29900.Method_30004();
            }
        }
    }

    private void Method_27531() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_27532(Class_14856 class_14856) {
        class_14856.Method_14925(this);
    }

    public Class_27517() {
    }

    public Class_27517(Class_31457 class_31457, Class_21630 class_21630) {
        this.Field_27525 = class_21630;
        this.Field_27518 = class_31457.Method_31500();
        this.Field_27521 = class_31457.Method_31495();
        this.Field_27520 = class_31457.Method_31475();
        this.Field_27524 = class_31457.Method_31497();
        this.Field_27522 = class_31457.Method_31480();
        this.Field_27526 = class_31457.Method_31494();
        this.Field_27523 = class_31457.Method_31486();
        this.Field_27519 = class_31457.Method_31482();
    }
}

