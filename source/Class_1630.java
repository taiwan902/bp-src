/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_1630
extends Class_1490
implements Class_1549 {
    private int Field_1631;
    private boolean Field_1632 = -32508 & 17921;

    public boolean Method_1633() {
        return (-32495 & 4096) != 0;
    }

    private void Method_1634() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_1635(Class_42376 class_42376) {
        switch (class_42376.Field_42392) {
            case 0: {
                this.\u0000strictfp.Field_48.Method_1431();
                this.\u0000strictfp.Method_218(null);
                break;
            }
            case 1: {
                if (this.\u0000strictfp.Field_72.\u0000strictfp().Method_31839()) {
                    this.\u0000strictfp.Method_218(new Class_1578());
                    break;
                }
                Class_1792 class_1792 = new Class_1792(this, Class_9802.Method_9806("deathScreen.quit.confirm", new Object[22753 & 18]), "", Class_9802.Method_9806("deathScreen.titleScreen", new Object[2208 & -31984]), Class_9802.Method_9806("deathScreen.respawn", new Object[-28416 & 136]), 6402 & 24712);
                this.\u0000strictfp.Method_218(class_1792);
                class_1792.Method_1805(21 & 10270);
            }
        }
    }

    public void Method_1636() {
        super.Method_1517();
        if (Class_18.Field_89.Field_127.Field_2178 > 0) {
            this.Field_1631 += 521 & 1303;
        }
        if (this.Field_1631 == (156 & 16436)) {
            for (Class_42376 class_42376 : this.\u0000strictfp) {
                class_42376.Field_42388 = 18693 & -32759;
            }
        }
    }

    public void Method_1637() {
        this.\u0000strictfp.clear();
        this.Field_1631 = 8488 & -10607;
        if (this.\u0000strictfp.Field_72.\u0000strictfp().Method_31839()) {
            if (this.\u0000strictfp.Method_251()) {
                this.\u0000strictfp.add(new Class_42376(4113 & 2049, this.\u0000= final / (2114 & -23281) - (7932 & 8293), this.\u0000, ` / (21046 & -29691) + (3296 & -32415), Class_9802.Method_9806("deathScreen.deleteWorld", new Object[4100 & 16411])));
            } else {
                this.\u0000strictfp.add(new Class_42376(-31743 & 8287, this.\u0000= final / (26646 & 5675) - (100 & 20069), this.\u0000, ` / (774 & -8076) + (9953 & 2400), Class_9802.Method_9806("deathScreen.leaveServer", new Object[1152 & -7615])));
            }
        } else {
            this.\u0000strictfp.add(new Class_42376(-3454 & 2336, this.\u0000= final / (17590 & 2059) - (16998 & 4332), this.\u0000, ` / (10254 & -31548) + (1352 & 4812), Class_9802.Method_9806("deathScreen.respawn", new Object[4321 & 10268])));
            this.\u0000strictfp.add(new Class_42376(-23807 & 2097, this.\u0000= final / (910 & 1026) - (16748 & -29580), this.\u0000, ` / (-32490 & 2596) + (1264 & -14237), Class_9802.Method_9806("deathScreen.titleScreen", new Object[66 & -23416])));
            if (this.\u0000strictfp.Method_265() == null) {
                ((Class_42376)this.\u0000strictfp.get((int)(129 & 12801))).Field_42388 = -32251 & 6224;
            }
        }
        for (Class_42376 class_42376 : this.\u0000strictfp) {
            class_42376.Field_42388 = 4770 & -24256;
        }
    }

    protected void Method_1638(char c, int n) {
    }

    public void Method_1639(int n, int n2, float f) {
        this.\u0000, `(1872 & 22702, -32109 & 12352, this.\u0000= final, this.\u0000, `, 1634803752 & -120551354, -1312456906 & -1400885063);
        Class_16867.Method_16961();
        Class_16867.Method_16973(2.0f, 2.0f, 2.0f);
        boolean bl = this.\u0000strictfp.Field_72.\u0000strictfp().Method_31839();
        String string = bl ? Class_9802.Method_9806("deathScreen.title.hardcore", new Object[600 & 21762]) : Class_9802.Method_9806("deathScreen.title", new Object[657 & -16344]);
        this.\u0000strictfp(this.\u0000strictfp, string, this.\u0000= final / (6182 & 24858) / (-24569 & 1458), 574 & 17694, -1845493761 & 16777215);
        Class_16867.Method_16945();
        if (bl) {
            this.\u0000strictfp(this.\u0000strictfp, Class_9802.Method_9806("deathScreen.hardcoreInfo", new Object[4610 & -15235]), this.\u0000= final / (-13846 & 8198), -26992 & 400, 83886079 & 553648127);
        }
        this.\u0000strictfp(this.\u0000strictfp, Class_9802.Method_9806("deathScreen.score", new Object[12480 & 20]) + ": " + (Object)((Object)Class_5478.Field_5485) + this.\u0000strictfp.Field_48.\u0000= int(), this.\u0000= final / (-30577 & 16914), 20589 & 8806, 889192447 & 33554431);
        super.Method_1545(n, n2, f);
    }

    public void Method_1640(boolean bl, int n) {
        if (bl) {
            if (this.\u0000strictfp.Field_72 != null) {
                this.\u0000strictfp.Field_72.Method_618();
            }
            this.\u0000strictfp.Method_199(null);
            this.\u0000strictfp.Method_218(new Class_1578());
        } else {
            this.\u0000strictfp.Field_48.Method_1431();
            this.\u0000strictfp.Method_218(null);
        }
    }
}

