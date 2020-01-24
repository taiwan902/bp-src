/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_47574
extends Class_42376 {
    private final Class_11216 Field_47575;
    private boolean Field_47576;
    private String Field_47577;

    public void Method_47578(boolean bl) {
        this.Field_47576 = bl;
        this.\u0000strictfp = this.Method_47581();
        this.Field_47575.Method_11218(this.\u0000
        , bl);
    }

    private void Method_47579() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_47574(Class_11216 class_11216, int n, int n2, int n3, String string, boolean bl) {
        super(n, n2, n3, -30825 & 10398, 1564 & -28521, "");
        this.Field_47577 = string;
        this.Field_47576 = bl;
        this.\u0000strictfp = this.Method_47581();
        this.Field_47575 = class_11216;
    }

    public boolean Method_47580(Class_18 class_18, int n, int n2) {
        if (super.Method_42404(class_18, n, n2)) {
            this.Field_47576 = !this.Field_47576 ? 65 & 4113 : 550 & -8056;
            this.\u0000strictfp = this.Method_47581();
            this.Field_47575.Method_11218(this.\u0000
            , this.Field_47576);
            return (257 & 6145) != 0;
        }
        return (17985 & 4) != 0;
    }

    private String Method_47581() {
        return Class_9802.Method_9806(this.Field_47577, new Object[-24286 & 17025]) + ": " + (this.Field_47576 ? Class_9802.Method_9806("gui.yes", new Object[2506 & 17440]) : Class_9802.Method_9806("gui.no", new Object[4352 & 1106]));
    }
}

