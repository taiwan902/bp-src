/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.input.Keyboard
 */
import internal.org.lwjgl.input.Keyboard;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_35710
extends Class_1490 {
    private final String Field_35711;
    private Class_1490 Field_35712;
    private Class_38813 Field_35713;

    protected void Method_35714(Class_42376 class_42376) {
        if (class_42376.Field_42388) {
            if (class_42376.Field_42392 == (16397 & -25711)) {
                this.\u0000strictfp.Method_218(this.Field_35712);
            } else if (class_42376.Field_42392 == 0) {
                Class_2047 class_2047 = this.\u0000strictfp.Method_172();
                class_2047.Method_2051(this.Field_35711, this.Field_35713.Method_38848().trim());
                this.\u0000strictfp.Method_218(this.Field_35712);
            }
        }
    }

    public void Method_35715() {
        Keyboard.enableRepeatEvents((144 & 97) != 0);
    }

    public void Method_35716(int n, int n2, float f) {
        this.\u0000, 2();
        this.\u0000strictfp(this.\u0000strictfp, Class_9802.Method_9806("selectWorld.renameTitle", new Object[7321 & -32508]), this.\u0000= final / (16514 & 787), 436 & -26090, 285212671 & 218103807);
        this.\u0000, `(this.\u0000strictfp, Class_9802.Method_9806("selectWorld.enterName", new Object[-31968 & 4236]), this.\u0000= final / (20482 & 518) - (4726 & -32275), 5423 & -16273, 301002932 & -1565876062);
        this.Field_35713.Method_38849();
        super.Method_1545(n, n2, f);
    }

    public Class_35710(Class_1490 class_1490, String string) {
        this.Field_35712 = class_1490;
        this.Field_35711 = string;
    }

    protected void Method_35717(int n, int n2, int n3) {
        super.Method_1537(n, n2, n3);
        this.Field_35713.Method_38855(n, n2, n3);
    }

    public void Method_35718() {
        this.Field_35713.Method_38847();
    }

    private void Method_35719() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_35720() {
        Keyboard.enableRepeatEvents((9731 & -14271) != 0);
        this.\u0000strictfp.clear();
        this.\u0000strictfp.add(new Class_42376(9474 & 16393, this.\u0000= final / (8354 & -8950) - (13684 & -14228), this.\u0000, ` / (-6124 & 37) + (98 & 13281) + (2335 & 4268), Class_9802.Method_9806("selectWorld.renameButton", new Object[4312 & 26112])));
        this.\u0000strictfp.add(new Class_42376(1 & 9521, this.\u0000= final / (9222 & 2178) - (1908 & 8292), this.\u0000, ` / (-22500 & 17700) + (-16002 & 8312) + (-32754 & 22525), Class_9802.Method_9806("gui.cancel", new Object[68 & 11417])));
        Class_2047 class_2047 = this.\u0000strictfp.Method_172();
        Class_31717 class_31717 = class_2047.Method_2054(this.Field_35711);
        String string = class_31717.Method_31831();
        this.Field_35713 = new Class_38813(20942 & -30717, this.\u0000strictfp, this.\u0000= final / (1026 & 29154) - (24693 & -32540), -4867 & 62, 5338 & 16616, 8349 & 4150);
        this.Field_35713.Method_38858((-24511 & 2483) != 0);
        this.Field_35713.Method_38853(string);
    }

    protected void Method_35721(char c, int n) {
        this.Field_35713.Method_38854(c, n);
        ((Class_42376)this.\u0000strictfp.get((int)(24600 & -28223))).Field_42388 = this.Field_35713.Method_38848().trim().length() > 0 ? 16655 & 1553 : 18769 & 1192;
        int n2 = ((Class_42376)this.\u0000strictfp.get((int)(24600 & -28223))).Field_42388 ? 1 : 0;
        if (n == (124 & 6556) || n == (18908 & -31556)) {
            this.Method_35714((Class_42376)this.\u0000strictfp.get(1028 & -8167));
        }
    }
}

