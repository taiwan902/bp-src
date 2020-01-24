/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_44732
implements Class_1486 {
    private int Field_44733;
    private int Field_44734;
    private int Field_44735;
    private int Field_44736;
    private int Field_44737;
    private int Field_44738;
    private int Field_44739;
    private int Field_44740;
    private int Field_44741;
    private int Field_44742;
    private int Field_44743;

    public void Method_44744(int n) {
        this.Field_44735 = n;
    }

    public int Method_44745() {
        return this.Field_44740;
    }

    public int Method_44746() {
        return this.Field_44739;
    }

    public void Method_44747(int n) {
        this.Field_44738 = n;
    }

    public void Method_44748(int n) {
        this.Field_44739 = n;
    }

    public void Method_44749(int n) {
        this.Field_44742 = n;
    }

    public int Method_44750() {
        return this.Field_44741;
    }

    private void Method_44751() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_44752() {
        return this.Field_44743;
    }

    public Class_44732(Class_1061 class_1061, int n) {
        this(class_1061, n, 8705 & -31548);
    }

    public int Method_44753() {
        return this.Field_44733;
    }

    public void Method_44754(Class_10954 class_10954) {
        this.Method_44757((Class_14856)class_10954);
    }

    public void Method_44755(Class_29900 class_29900) {
        this.Field_44741 = class_29900.Method_30004();
        this.Field_44736 = class_29900.Method_29944();
        this.Field_44738 = class_29900.Method_29914();
        this.Field_44743 = class_29900.Method_29914();
        this.Field_44733 = class_29900.Method_29914();
        this.Field_44740 = class_29900.Method_29944();
        this.Field_44737 = class_29900.Method_29944();
        this.Field_44734 = class_29900.Method_29914();
        if (this.Field_44734 > 0) {
            this.Field_44739 = class_29900.Method_30008();
            this.Field_44735 = class_29900.Method_30008();
            this.Field_44742 = class_29900.Method_30008();
        }
    }

    public void Method_44756(int n) {
        this.Field_44733 = n;
    }

    public void Method_44757(Class_14856 class_14856) {
        class_14856.Method_14926(this);
    }

    public void Method_44758(int n) {
        this.Field_44743 = n;
    }

    public int Method_44759() {
        return this.Field_44738;
    }

    public int Method_44760() {
        return this.Field_44736;
    }

    public int Method_44761() {
        return this.Field_44735;
    }

    public int Method_44762() {
        return this.Field_44742;
    }

    public int Method_44763() {
        return this.Field_44737;
    }

    public Class_44732() {
    }

    public void Method_44764(Class_29900 class_29900) {
        class_29900.Method_29982(this.Field_44741);
        class_29900.Method_29949(this.Field_44736);
        class_29900.Method_30010(this.Field_44738);
        class_29900.Method_30010(this.Field_44743);
        class_29900.Method_30010(this.Field_44733);
        class_29900.Method_29949(this.Field_44740);
        class_29900.Method_29949(this.Field_44737);
        class_29900.Method_30010(this.Field_44734);
        if (this.Field_44734 > 0) {
            class_29900.Method_29922(this.Field_44739);
            class_29900.Method_29922(this.Field_44735);
            class_29900.Method_29922(this.Field_44742);
        }
    }

    public void Method_44765(int n) {
        this.Field_44734 = n;
    }

    public int Method_44766() {
        return this.Field_44734;
    }

    public Class_44732(Class_1061 class_1061, int n, int n2) {
        this.Field_44741 = class_1061.Method_1311();
        this.Field_44738 = Class_13337.Method_13371(class_1061.Field_1130 * (2.2857142857142856 * 14.0));
        this.Field_44743 = Class_13337.Method_13371(class_1061.Method_1324() * (373.3333333333333 * 0.08571428571428572));
        this.Field_44733 = Class_13337.Method_13371(class_1061.Field_1106 * (24.695652173913043 * 1.295774647887324));
        this.Field_44740 = Class_13337.Method_13377(class_1061.Field_1093 * (1.0888889f * 235.10204f) / (0.63492066f * 567.0f));
        this.Field_44737 = Class_13337.Method_13377(class_1061.Field_1079 * (450.56f * 0.5681818f) / (0.3137255f * 1147.5f));
        this.Field_44736 = n;
        this.Field_44734 = n2;
        if (n2 > 0) {
            double d = class_1061.Field_1071;
            double d2 = class_1061.Method_1224();
            double d3 = class_1061.Field_1072;
            double d4 = 0.5 * 7.8;
            if (d < -d4) {
                d = -d4;
            }
            if (d2 < -d4) {
                d2 = -d4;
            }
            if (d3 < -d4) {
                d3 = -d4;
            }
            if (d > d4) {
                d = d4;
            }
            if (d2 > d4) {
                d2 = d4;
            }
            if (d3 > d4) {
                d3 = d4;
            }
            this.Field_44739 = (int)(d * (1.3035714285714286 * 6136.986301369863));
            this.Field_44735 = (int)(d2 * (0.5945945945945946 * 13454.545454545454));
            this.Field_44742 = (int)(d3 * (2222.222222222222 * 3.6));
        }
    }
}

