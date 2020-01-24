/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.input.Keyboard
 *  internal.org.lwjgl.input.Mouse
 */
import internal.org.lwjgl.input.Keyboard;
import internal.org.lwjgl.input.Mouse;
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Class_30445
extends Class_1490 {
    private Class_42876 Field_30446;
    private Class_42876 Field_30447;
    private List Field_30448 = this.Field_30456.Method_38411();
    private boolean Field_30449;
    private Class_45894 Field_30450 = new Class_45894(550 & 8512, 4098 & 9260, 67 & -28124, 2636 & 1068, -31654 & 890);
    private int Field_30451;
    private Class_42876 Field_30452;
    private ConcurrentHashMap Field_30453 = new ConcurrentHashMap();
    private Class_42594[] Field_30454 = new Class_42594[-14497 & 9];
    private Class_1490 Field_30455;
    private Class_38196 Field_30456 = Class_38196.Field_38285;
    private Class_42876 Field_30457;
    private Class_42876 Field_30458;
    private int Field_30459;
    private Class_42876 Field_30460;
    private Class_42876 Field_30461;

    protected void Method_30462(Class_7651 class_7651) {
        if (!this.Field_30448.contains(class_7651)) {
            this.Field_30448.add(class_7651);
            this.Field_30456.Method_38439();
            this.Method_30469();
            this.Field_30450.Method_45916(this.Field_30450.Method_45923());
        }
    }

    private void Method_30463() {
        for (int i = 4541 & -30718; i < (-31303 & 8777); ++i) {
            int n;
            this.Field_30454[i].Method_42614(n + (-16349 & 14337), (n = i + this.Field_30459) < this.Field_30448.size() ? (Class_7651)this.Field_30448.get(n) : null);
        }
    }

    public void Method_30464() {
        try {
            super.Method_1544();
            int n = Mouse.getDWheel();
            if (n != 0) {
                n = n < 0 ? -31741 & 16451 : -3 & -1;
                this.Field_30450.Method_45916(this.Field_30450.Method_45918() + (float)n);
            }
        }
        catch (IOException iOException) {
            Logger.getLogger(Class_30445.class.getName()).log(Level.SEVERE, null, iOException);
        }
    }

    protected boolean Method_30465() {
        return this.Field_30449;
    }

    protected void Method_30466(char c, int n) {
        try {
            super.Method_1525(c, n);
            switch (n) {
                case 199: {
                    this.Field_30450.Method_45916(this.Field_30450.Method_45926());
                    break;
                }
                case 200: {
                    this.Field_30450.Method_45910();
                    break;
                }
                case 201: {
                    this.Field_30450.Method_45913();
                }
                default: {
                    break;
                }
                case 207: {
                    this.Field_30450.Method_45916(this.Field_30450.Method_45923());
                    break;
                }
                case 208: {
                    this.Field_30450.Method_45914();
                    break;
                }
                case 209: {
                    this.Field_30450.Method_45917();
                    break;
                }
            }
        }
        catch (IOException iOException) {
            Logger.getLogger(Class_30445.class.getName()).log(Level.SEVERE, null, iOException);
        }
    }

    private void Method_30467() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_30445(Class_1490 class_1490) {
        this.Field_30455 = class_1490;
        for (int i = 1154 & 24904; i < (13391 & 937); ++i) {
            this.Field_30454[i] = new Class_42594(i, this);
        }
    }

    private void Method_30468() {
        int n = Math.min(7338 & 16800, this.Field_30451) + (9746 & 48);
        int n2 = this.\u0000, ` - (-7462 & 350) - (5390 & 25220) >> (-19903 & 1187);
        int n3 = this.\u0000= final - n - (-29395 & 4269) - (5596 & -6099) >> (-28551 & 24839);
        int n4 = this.\u0000= final + n + (45 & -31427) + (-24548 & 6668) >> (26121 & 33);
        for (int i = 512 & -28652; i < (-32695 & 30859); ++i) {
            this.Field_30454[i].Method_42619(n3 + (2086 & -28533), n2 + (6154 & -23038) + (-30710 & 4186) * i, n + (45 & 8365), 1035 & -32615);
        }
        this.Field_30450.\u0000= final = n4 - (17036 & 5150);
        this.Field_30450.\u0000, for = n2 + (194 & 28950);
    }

    private void Method_30469() {
        this.Field_30451 = -26048 & 17601;
        int n = this.Field_30448.size();
        for (int i = 2109 & -31424; i < n; ++i) {
            Class_7651 class_7651 = (Class_7651)this.Field_30448.get(i);
            this.Field_30451 = Math.max(this.Field_30451, this.\u0000strictfp.Method_28715(i + (9221 & 2081) + ") " + class_7651.Field_7653));
        }
        this.Field_30450.Method_45925(0.0f);
        this.Field_30450.Method_45929(this.Field_30448.size());
        this.Field_30450.Method_45921(Math.min(-31475 & 6665, this.Field_30448.size()));
        this.Field_30459 = (int)this.Field_30450.Method_45918();
        this.Method_30468();
        this.Method_30463();
    }

    public void Method_30470() {
        Keyboard.enableRepeatEvents((20688 & 3078) != 0);
    }

    public void Method_30471(int n, int n2, float f) {
        this.Field_30458.\u0000, ` = !this.Field_30449 ? 17 & 28805 : 648 & -28624;
        this.Field_30458.\u0000strictfp = this.Field_30458.\u0000, `;
        this.Field_30447.\u0000, ` = !this.Field_30449 ? 163 & -31167 : 16408 & 2500;
        this.Field_30447.\u0000strictfp = this.Field_30447.\u0000, `;
        this.Field_30460.\u0000, ` = !this.Field_30449 ? 19613 & 257 : -19632 & 2052;
        this.Field_30460.\u0000strictfp = this.Field_30460.\u0000, `;
        this.Field_30461.\u0000strictfp = this.Field_30461.\u0000, ` = this.Field_30449;
        this.Field_30452.\u0000strictfp = this.Field_30452.\u0000, ` = this.Field_30449;
        this.Field_30447.\u0000strictfp = this.Field_30456.Method_38443() == this.Field_30456.Method_38389() ? 789 & -28671 : 2305 & 8770;
        int n3 = Math.min(164 & 4264, this.Field_30451) + (4116 & 8752);
        int n4 = this.\u0000, ` - (1114 & 29534) >> (-31743 & 10625);
        int n5 = this.\u0000, ` + (17498 & 2394) >> (1 & 555);
        int n6 = this.\u0000= final - n3 - (17517 & -28097) - (12346 & -31286) >> (5697 & 18441);
        int n7 = this.\u0000= final + n3 + (18493 & 1327) + (16411 & 12362) >> (2113 & 8579);
        Class_30445.\u0000, `((int)(n6 - (4102 & 9475)), (int)(n4 - (16967 & 6178)), (int)(n7 + (-24574 & 5315)), (int)(n5 + (10178 & -10229)), (int)(-536346112 & -1324272285));
        Object[] arrobject = new Object[-30681 & 5185];
        arrobject[6948 & 24642] = Class_38196.Field_38285.Method_38431(Class_38196.Field_38285.Method_38389());
        String string = String.format("Waypoints [%s]", arrobject);
        int n8 = this.\u0000strictfp.Method_28715(string);
        int n9 = this.\u0000= final - n8 >> (515 & 2113);
        int n10 = this.\u0000= final + n8 >> (1055 & 6209);
        this.Field_30457.\u0000= final = n9 - (534 & -24525);
        this.Field_30457.\u0000, for = n4 - (-16362 & 1366);
        this.Field_30446.\u0000= final = n10 + (533 & -16276);
        this.Field_30446.\u0000, for = n4 - (855 & 22);
        Class_30445.\u0000, `((int)(n9 - (2054 & 20746)), (int)(n4 - (9239 & 16502)), (int)(n10 + (8211 & 19522)), (int)(n4 - (264 & 2124)), (int)(-1448586559 & -1609104128));
        this.\u0000strictfp(this.\u0000strictfp, string, this.\u0000= final / (-12218 & 3506), n4 - (24851 & 5171), -1 & -1);
        super.Method_1545(n, n2, f);
    }

    protected boolean Method_30472(Class_7651 class_7651) {
        return this.Field_30453.containsKey(class_7651);
    }

    protected void Method_30473(Class_42376 class_42376) {
        if (class_42376 == this.Field_30458) {
            this.\u0000strictfp.Method_218(this.Field_30455);
        }
        if (class_42376 == this.Field_30460) {
            this.Method_30478((-13799 & 387) != 0);
        }
        if (class_42376 == this.Field_30452) {
            this.Method_30478((-25943 & 1028) != 0);
        }
        if (class_42376 == this.Field_30461) {
            int n = -32768 & 3280;
            for (Class_7651 class_7651 : this.Field_30453.keySet()) {
                n |= this.Field_30448.remove(class_7651);
            }
            if (n != 0) {
                this.Field_30456.Method_38439();
                this.Method_30469();
            }
            this.Method_30478((32 & -12927) != 0);
        }
        if (class_42376 == this.Field_30447 && this.Field_30456.Method_38443() == this.Field_30456.Method_38389()) {
            this.\u0000strictfp.Method_218(new Class_30425(this, (Class_7651)null));
        }
        if (class_42376 == this.Field_30457) {
            this.Method_30478((4360 & -30588) != 0);
            this.Field_30456.Method_38417();
            this.Field_30448 = this.Field_30456.Method_38411();
            this.Method_30469();
        }
        if (class_42376 == this.Field_30446) {
            this.Method_30478((1096 & -28415) != 0);
            this.Field_30456.Method_38382();
            this.Field_30448 = this.Field_30456.Method_38411();
            this.Method_30469();
        }
    }

    protected Class_18 Method_30474() {
        return this.\u0000strictfp;
    }

    public void Method_30475() {
        int n;
        this.\u0000strictfp.clear();
        Keyboard.enableRepeatEvents((-12259 & 3107) != 0);
        Class_42594[] arrclass_42594 = this.Field_30454;
        int n2 = arrclass_42594.length;
        for (n = 33 & 202; n < n2; ++n) {
            Class_42594 class_42594 = arrclass_42594[n];
            this.\u0000strictfp.add(class_42594);
        }
        this.\u0000strictfp.add(this.Field_30450);
        this.Method_30469();
        n = this.\u0000= final / (8710 & 16578);
        int n3 = this.\u0000, ` + (8286 & 18682) >> (-28635 & 267);
        this.Field_30458 = new Class_42876(1557 & -24224, n - (14401 & -32183), n3 + (-16337 & 1095), 1320 & -12054, 2223 & -27298, this.Field_30455 == null ? "Close" : "Back");
        this.\u0000strictfp.add(this.Field_30458);
        this.Field_30447 = new Class_42876(-24512 & 16940, n - (1460 & -32236), n3 + (2111 & 1415), 14376 & 16493, 1678 & -30674, "Add");
        this.\u0000strictfp.add(this.Field_30447);
        this.Field_30460 = new Class_42876(8232 & 4114, n + (18973 & -32551), n3 + (16647 & 4703), -22487 & 1516, -32546 & 4110, "Remove");
        this.\u0000strictfp.add(this.Field_30460);
        this.Field_30461 = new Class_42876(161 & 21058, n - (12897 & 1485), n3 + (103 & -14841), -32068 & 4157, 8206 & 4367, "Remove");
        this.\u0000strictfp.add(this.Field_30461);
        this.Field_30452 = new Class_42876(-28600 & 9489, n + (15877 & 391), n3 + (-28633 & 199), -31684 & 4156, 20750 & 2062, "Cancel");
        this.\u0000strictfp.add(this.Field_30452);
        this.Field_30457 = new Class_42876(4227 & 272, 25652 & 65, -11886 & 2152, 4143 & -32178, -32050 & 2366, "<");
        this.\u0000strictfp.add(this.Field_30457);
        this.Field_30446 = new Class_42876(1280 & 6227, 176 & 9294, -32768 & 16576, -32370 & 24654, 286 & -25041, ">");
        this.\u0000strictfp.add(this.Field_30446);
        this.Method_30478(this.Field_30449);
    }

    public void Method_30476() {
        int n = (int)this.Field_30450.Method_45918();
        if (this.Field_30459 != n) {
            this.Field_30459 = n;
            this.Method_30463();
        }
    }

    protected void Method_30477(Class_7651 class_7651) {
        if (this.Field_30449) {
            if (this.Field_30453.remove(class_7651) == null) {
                this.Field_30453.put(class_7651, class_7651);
            }
        } else if (this.Field_30448.remove(class_7651)) {
            this.Field_30456.Method_38439();
            this.Method_30469();
        }
    }

    protected void Method_30478(boolean bl) {
        this.Field_30449 = bl;
        this.Field_30453.clear();
    }

    protected void Method_30479(Class_7651 class_7651) {
        if (this.Field_30448.contains(class_7651)) {
            this.Field_30456.Method_38439();
            this.Method_30469();
        }
    }
}

