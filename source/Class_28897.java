/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_28897
extends Class_1490 {
    private Class_42876 Field_28898;
    private int Field_28899;
    private int Field_28900;
    private Class_42876 Field_28901;
    private int Field_28902;
    private Class_42876 Field_28903;
    private Class_46388 Field_28904;
    private int Field_28905;
    private int[] Field_28906;

    protected void Method_28907(char c, int n) {
        if (this.Field_28904 != null) {
            this.Field_28904.Method_46398().Method_34528(n);
            this.Field_28904 = null;
            this.\u0000strictfp.clear();
            this.Method_28908();
        } else if (n == (23553 & 101)) {
            Class_34481[] arrclass_34481 = Class_34481.Method_34512();
            for (int i = 8352 & -14778; i < this.Field_28906.length; ++i) {
                arrclass_34481[i].Method_34528(this.Field_28906[i]);
            }
            this.\u0000strictfp.Method_218(null);
        }
    }

    public void Method_28908() {
        int n;
        int n2 = this.Method_28911();
        int n3 = this.Method_28909();
        this.Field_28900 = (this.\u0000= final - n2 - n3 - (20460 & 13)) / (2 & -8174);
        this.Field_28905 = (this.\u0000= final + n2 + n3 + (-18420 & 1037)) / (2146 & -7150);
        this.Field_28899 = (this.\u0000, ` - Class_34481.Method_34512().length * (4619 & 14)) / (899 & 8202);
        this.Field_28902 = (this.\u0000, ` + Class_34481.Method_34512().length * (19790 & 58)) / (16403 & -27578);
        int n4 = this.Field_28899;
        Class_34481[] arrclass_34481 = Class_34481.Method_34512();
        int n5 = arrclass_34481.length;
        for (n = 320 & -2030; n < n5; ++n) {
            Class_34481 class_34481 = arrclass_34481[n];
            Class_46388 class_46388 = new Class_46388(this, 2248 & -31710, this.Field_28900, n4, n2, n3, class_34481);
            this.\u0000strictfp.add(class_46388);
            n4 += 10;
        }
        n = this.\u0000= final / (714 & 23);
        this.Field_28903 = new Class_42876(20768 & 8838, n - (590 & 8394), this.Field_28902 + (12807 & -31721), 447 & 4206, 2398 & 25135, "OK");
        this.\u0000strictfp.add(this.Field_28903);
        this.Field_28901 = new Class_42876(-32694 & 4484, n - (16663 & 2103), this.Field_28902 + (519 & -32377), 16750 & 686, 4622 & 8206, "Cancel");
        this.\u0000strictfp.add(this.Field_28901);
        this.Field_28898 = new Class_42876(-31995 & 16384, n + (4668 & 25695), this.Field_28902 + (13319 & 17015), -26578 & 383, 2126 & 20526, "Default");
        this.\u0000strictfp.add(this.Field_28898);
    }

    private int Method_28909() {
        Class_28636 class_28636 = this.\u0000strictfp.Field_27;
        int n = 9502 & -14306;
        Class_34481[] arrclass_34481 = Class_34481.Method_34512();
        int n2 = arrclass_34481.length;
        for (int i = 512 & 10528; i < n2; ++i) {
            Class_34481 class_34481 = arrclass_34481[i];
            n = Math.max(n, class_28636.Method_28715(">" + class_34481.Method_34503() + "<"));
        }
        return n + (9250 & -26366);
    }

    protected Class_46388 Method_28910() {
        return this.Field_28904;
    }

    private int Method_28911() {
        Class_28636 class_28636 = this.\u0000strictfp.Field_27;
        int n = -1 & -1;
        Class_34481[] arrclass_34481 = Class_34481.Method_34512();
        int n2 = arrclass_34481.length;
        for (int i = 130 & 2085; i < n2; ++i) {
            Class_34481 class_34481 = arrclass_34481[i];
            n = Math.max(n, class_28636.Method_28715(class_34481.name()));
        }
        return n;
    }

    public void Method_28912(int n, int n2, float f) {
        String string = "Key Config";
        int n3 = this.\u0000strictfp.Method_28715(string);
        int n4 = this.\u0000= final - n3 >> (3 & 2433);
        int n5 = this.\u0000= final + n3 >> (137 & 30823);
        Class_28897.\u0000, `((int)(n4 - (8290 & -28529)), (int)(this.Field_28899 - (-30505 & 29462)), (int)(n5 + (4426 & 8230)), (int)(this.Field_28899 - (16392 & 4108)), (int)(-1542979228 & -232456192));
        this.\u0000strictfp(this.\u0000strictfp, string, this.\u0000= final / (-29678 & 16875), this.Field_28899 - (-14309 & 5207), -1 & -1);
        Class_28897.\u0000, `((int)(this.Field_28900 - (-32494 & 32322)), (int)(this.Field_28899 - (7250 & -16381)), (int)(this.Field_28905 + (-24534 & 2051)), (int)(this.Field_28902 + (16513 & -24307)), (int)(-1530781560 & -232734719));
        super.Method_1545(n, n2, f);
    }

    protected void Method_28913(Class_42376 class_42376) {
        int n;
        Class_34481[] arrclass_34481;
        if (class_42376 instanceof Class_46388) {
            this.Field_28904 = (Class_46388)class_42376;
        }
        if (class_42376 == this.Field_28903) {
            if (Class_34481.Method_34511()) {
                Class_38196.Field_38285.Method_38429("\u00a7E[Rei's Minimap] Keyconfig Saved.");
            } else {
                Class_38196.Field_38285.Method_38429("\u00a7E[Rei's Minimap] Error Keyconfig Saving.");
            }
            this.\u0000strictfp.Method_218(new Class_24388());
        }
        if (class_42376 == this.Field_28898) {
            arrclass_34481 = Class_34481.Method_34512();
            n = arrclass_34481.length;
            for (int i = -23072 & 512; i < n; ++i) {
                Class_34481 class_34481 = arrclass_34481[i];
                class_34481.Method_34519();
            }
            this.\u0000strictfp.clear();
            this.Method_28908();
        }
        if (class_42376 == this.Field_28901) {
            arrclass_34481 = Class_34481.Method_34512();
            for (n = 28745 & -32768; n < this.Field_28906.length; ++n) {
                arrclass_34481[n].Method_34528(this.Field_28906[n]);
            }
            this.\u0000strictfp.Method_218(new Class_24388());
        }
    }

    protected Class_28897() {
        Class_34481[] arrclass_34481 = Class_34481.Method_34512();
        this.Field_28906 = new int[arrclass_34481.length];
        for (int i = 17 & 8352; i < this.Field_28906.length; ++i) {
            this.Field_28906[i] = arrclass_34481[i].Method_34531();
        }
    }

    private void Method_28914() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

