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

public class Class_17912
extends Class_1490 {
    private Class_38813 Field_17913;
    private final Class_15474 Field_17914;
    private final Class_1490 Field_17915;

    public void Method_17916() {
        this.Field_17913.Method_38847();
    }

    public void Method_17917() {
        Keyboard.enableRepeatEvents((-27392 & 8322) != 0);
        this.\u0000strictfp.Field_84.Field_39827 = this.Field_17913.Method_38848();
        this.\u0000strictfp.Field_84.Method_39903();
    }

    protected void Method_17918(int n, int n2, int n3) {
        super.Method_1537(n, n2, n3);
        this.Field_17913.Method_38855(n, n2, n3);
    }

    private void Method_17919() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_17920() {
        Keyboard.enableRepeatEvents((-12283 & 3595) != 0);
        this.\u0000strictfp.clear();
        this.\u0000strictfp.add(new Class_42376(8257 & -15870, this.\u0000= final / (15939 & 146) - (25462 & 100), this.\u0000, ` / (4359 & -16364) + (-28448 & 120) + (-25556 & 204), Class_9802.Method_9806("selectServer.select", new Object[-32703 & 18444])));
        this.\u0000strictfp.add(new Class_42376(257 & -27517, this.\u0000= final / (-20157 & 18978) - (238 & -4763), this.\u0000, ` / (-27577 & 52) + (12409 & 2424) + (430 & -19940), Class_9802.Method_9806("gui.cancel", new Object[13328 & 17292])));
        this.Field_17913 = new Class_38813(1098 & -19950, this.\u0000strictfp, this.\u0000= final / (20618 & 1091) - (118 & -30619), 1148 & -23946, -32039 & 20936, 6005 & 8212);
        this.Field_17913.Method_38859(-11133 & 176);
        this.Field_17913.Method_38858((273 & 12327) != 0);
        this.Field_17913.Method_38853(this.\u0000strictfp.Field_84.Field_39827);
        ((Class_42376)this.\u0000strictfp.get((int)(8196 & -31646))).Field_42388 = this.Field_17913.Method_38848().length() > 0 && this.Field_17913.Method_38848().split(":").length > 0 ? -31743 & 31059 : 8704 & 2532;
    }

    public void Method_17921(int n, int n2, float f) {
        this.\u0000, 2();
        this.\u0000strictfp(this.\u0000strictfp, Class_9802.Method_9806("selectServer.direct", new Object[9224 & -32571]), this.\u0000= final / (24582 & 4130), 16981 & -31724, -2130706433 & 285212671);
        this.\u0000, `(this.\u0000strictfp, Class_9802.Method_9806("addServer.enterIp", new Object[9344 & 2309]), this.\u0000= final / (3755 & 16386) - (24677 & -30218), 17524 & 8421, 15115168 & -1195856729);
        this.Field_17913.Method_38849();
        super.Method_1545(n, n2, f);
    }

    protected void Method_17922(char c, int n) {
        if (this.Field_17913.Method_38854(c, n)) {
            ((Class_42376)this.\u0000strictfp.get((int)(264 & 10320))).Field_42388 = this.Field_17913.Method_38848().length() > 0 && this.Field_17913.Method_38848().split(":").length > 0 ? 8197 & 2657 : 27251 & 4;
        } else if (n == (156 & -6017) || n == (159 & 10140)) {
            this.Method_17923((Class_42376)this.\u0000strictfp.get(11536 & 4709));
        }
    }

    protected void Method_17923(Class_42376 class_42376) {
        if (class_42376.Field_42388) {
            if (class_42376.Field_42392 == (161 & -30637)) {
                this.Field_17915.Method_1529((1488 & 4098) != 0, 6145 & -16358);
            } else if (class_42376.Field_42392 == 0) {
                this.Field_17914.Field_15484 = this.Field_17913.Method_38848().trim();
                this.Field_17915.Method_1529((-31743 & 16385) != 0, 5204 & 26624);
            }
        }
    }

    public Class_17912(Class_1490 class_1490, Class_15474 class_15474) {
        this.Field_17915 = class_1490;
        this.Field_17914 = class_15474;
    }
}

