/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
import com.mojang.authlib.GameProfile;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.UUID;

public class Class_21755
implements Class_1486 {
    private int Field_21756;
    private byte Field_21757;
    private List Field_21758;
    private int Field_21759;
    private UUID Field_21760;
    private byte Field_21761;
    private Class_32695 Field_21762;
    private int Field_21763;
    private int Field_21764;
    private int Field_21765;

    public int Method_21766() {
        return this.Field_21759;
    }

    private void Method_21767() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_21768() {
        return this.Field_21763;
    }

    public void Method_21769(Class_14856 class_14856) {
        class_14856.Method_14921(this);
    }

    public void Method_21770(Class_29900 class_29900) {
        this.Field_21763 = class_29900.Method_30004();
        this.Field_21760 = class_29900.Method_30011();
        this.Field_21764 = class_29900.Method_29914();
        this.Field_21756 = class_29900.Method_29914();
        this.Field_21765 = class_29900.Method_29914();
        this.Field_21761 = class_29900.Method_29944();
        this.Field_21757 = class_29900.Method_29944();
        this.Field_21759 = class_29900.Method_30008();
        this.Field_21758 = Class_32695.Method_32717(class_29900);
    }

    public byte Method_21771() {
        return this.Field_21757;
    }

    public Class_21755(Class_626 class_626) {
        this.Field_21763 = class_626.\u0000, `();
        this.Field_21760 = class_626.Method_749().getId();
        this.Field_21764 = Class_13337.Method_13371(class_626.\u0000= package * (20.210526315789476 * 1.5833333333333333));
        this.Field_21756 = Class_13337.Method_13371(class_626.\u0000, for() * (0.6956521739130435 * 46.0));
        this.Field_21765 = Class_13337.Method_13371(class_626.\u0000= switch * (4.7368421052631575 * 6.755555555555556));
        this.Field_21761 = (byte)(class_626.\u0000= ? * (268.96204f * 0.9518072f) / (1.2666667f * 284.21054f));
        this.Field_21757 = (byte)(class_626.\u0000= float * (256.0f * 1.0f) / (23760.0f * 0.015151516f));
        Class_23823 class_23823 = class_626.Field_628.Method_37821();
        this.Field_21759 = class_23823 == null ? 2112 & -28233 : Class_1956.Method_1986(class_23823.Method_23844());
        this.Field_21762 = class_626.\u0000strictfp();
    }

    public List Method_21772() {
        if (this.Field_21758 == null) {
            this.Field_21758 = this.Field_21762.Method_32707();
        }
        return this.Field_21758;
    }

    public int Method_21773() {
        return this.Field_21765;
    }

    public int Method_21774() {
        return this.Field_21764;
    }

    public int Method_21775() {
        return this.Field_21756;
    }

    public UUID Method_21776() {
        return this.Field_21760;
    }

    public byte Method_21777() {
        return this.Field_21761;
    }

    public void Method_21778(Class_10954 class_10954) {
        this.Method_21769((Class_14856)class_10954);
    }

    public void Method_21779(Class_29900 class_29900) {
        class_29900.Method_29982(this.Field_21763);
        class_29900.Method_29997(this.Field_21760);
        class_29900.Method_30010(this.Field_21764);
        class_29900.Method_30010(this.Field_21756);
        class_29900.Method_30010(this.Field_21765);
        class_29900.Method_29949(this.Field_21761);
        class_29900.Method_29949(this.Field_21757);
        class_29900.Method_29922(this.Field_21759);
        this.Field_21762.Method_32716(class_29900);
    }

    public Class_21755() {
    }
}

