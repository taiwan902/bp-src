/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_42594
extends Class_42376 {
    private static final int[] Field_42595;
    private String Field_42596;
    private Class_30445 Field_42597;
    private int Field_42598;
    private int Field_42599;
    private int Field_42600;
    private int Field_42601;
    private int Field_42602;
    private int Field_42603;
    private static final int[] Field_42604;
    private int Field_42605;
    private long Field_42606 = System.nanoTime();
    private int Field_42607;
    private int Field_42608;
    private int Field_42609;
    private int Field_42610;
    private int Field_42611;
    private int Field_42612;
    private Class_7651 Field_42613;

    protected void Method_42614(int n, Class_7651 class_7651) {
        this.Field_42605 = n;
        this.Field_42613 = class_7651;
        this.Field_42596 = null;
    }

    protected Class_42594(int n, Class_30445 class_30445) {
        super(n, -27004 & 16642, 1856 & 12288, 1074 & 576, 3656 & -24543, null);
        this.Field_42597 = class_30445;
    }

    private void Method_42615() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_42616(Class_18 class_18, int n, int n2) {
        if (this.Field_42613 == null) {
            return (4960 & -31599) != 0;
        }
        if (this.Method_42618(n, n2)) {
            if (this.Method_42621(n, n2) && this.Method_42617(class_18) && this.Field_42613.Field_7660 > 0) {
                class_18.Method_218(new Class_28149(this.Field_42597, this.Field_42613));
                return (-24055 & 6449) != 0;
            }
            if (this.Method_42622(n, n2)) {
                if (this.Field_42597.Method_30465()) {
                    this.Field_42597.Method_30477(this.Field_42613);
                } else {
                    this.Field_42613.Field_7658 = !this.Field_42613.Field_7658 ? -22143 & 16465 : 65 & 5380;
                    this.Field_42597.Method_30479(this.Field_42613);
                }
                return (15369 & 5) != 0;
            }
            long l = System.nanoTime();
            if (!this.Field_42597.Method_30465() && l < this.Field_42606 + (536458024L & 1374007047L)) {
                class_18.Method_218(new Class_30425(this.Field_42597, this.Field_42613));
                return (1025 & 6753) != 0;
            }
            this.Field_42606 = l;
        }
        return (-10624 & 10580) != 0;
    }

    private boolean Method_42617(Class_18 class_18) {
        if (class_18 == null) {
            return (271 & 6176) != 0;
        }
        if (class_18.Method_180() == null) {
            return (9432 & 16674) != 0;
        }
        if (class_18.Method_180().\u0000strictfp.length == 0) {
            return (0 & 704) != 0;
        }
        return (class_18.Method_180().\u0000strictfp.length > 0 && class_18.Method_180().\u0000strictfp[60 & -31165].\u0000strictfp() != null && class_18.Method_180().\u0000strictfp[4098 & 2832].\u0000strictfp().Method_31774() && class_18.Field_48.\u0000= catch == Class_38196.Field_38285.Method_38389() ? 29539 & 1025 : -27358 & 196) != 0;
    }

    private boolean Method_42618(int n, int n2) {
        return (n2 >= this.Field_42611 && n2 < this.Field_42600 && n >= this.Field_42603 && n < this.Field_42598 ? 4097 & -23811 : 16520 & 5971) != 0;
    }

    static {
        int[] arrn = new int[8835 & -32766];
        arrn[-32768 & 9472] = -1 & -1;
        arrn[25611 & 6257] = -24320 & -64479;
        Field_42595 = arrn;
        int[] arrn2 = new int[1794 & 26770];
        arrn2[2570 & -2875] = -3017792 & -2044696;
        arrn2[-12287 & 8375] = -3897312 & -1019759;
        Field_42604 = arrn2;
    }

    protected void Method_42619(int n, int n2, int n3, int n4) {
        this.\u0000= final = n;
        this.\u0000, for = n2;
        this.\u0000, ` = n3;
        this.\u0000strictfp = n4;
        this.Field_42611 = n2;
        this.Field_42600 = n2 + n4;
        this.Field_42603 = n;
        this.Field_42598 = n + n3;
        this.Field_42610 = this.Field_42611;
        this.Field_42607 = this.Field_42600;
        this.Field_42601 = this.Field_42598 - (-24446 & 7715) - (20767 & -32162) - (-32702 & 63);
        this.Field_42609 = this.Field_42601 - (16701 & 521);
        this.Field_42599 = this.Field_42611;
        this.Field_42608 = this.Field_42600;
        this.Field_42602 = this.Field_42598 - (2 & -29518);
        this.Field_42612 = this.Field_42602 - (1054 & 8415);
    }

    public void Method_42620(Class_18 class_18, int n, int n2) {
        String string;
        if (this.Field_42613 == null) {
            return;
        }
        Class_28636 class_28636 = class_18.Field_27;
        if (this.Field_42596 == null) {
            this.Field_42596 = this.Field_42605 + ") " + this.Field_42613.Field_7653;
            while (class_28636.Method_28715(this.Field_42596) > (8368 & 18338)) {
                this.Field_42596 = this.Field_42596.substring(-32686 & 13984, this.Field_42596.length() - (-16189 & 3081));
            }
        }
        boolean bl = this.Method_42618(n, n2);
        this.\u0000, `(class_28636, this.Field_42596, this.\u0000= final + (-24159 & 1561), this.\u0000, for + (-16297 & 3593), Field_42604[this.Field_42613.Field_7652]);
        int n3 = bl && n < this.Field_42609 ? 4879 & 9457 : 24730 & 0;
        int n4 = (int)(this.Field_42613.Field_7662 * (0.054945055f * 4641.0f)) & (-7169 & 3327);
        int n5 = (int)(this.Field_42613.Field_7654 * (272.0f * 0.9375f)) & (-12801 & 4863);
        int n6 = (int)(this.Field_42613.Field_7659 * (248.46153f * 1.0263158f)) & (8959 & 2303);
        int n7 = -13614575 & -16777182 | n4 << (-16366 & 2068) | n5 << (2632 & -31608) | n6;
        Class_42594.\u0000, `((int)this.Field_42609, (int)this.Field_42610, (int)this.Field_42601, (int)this.Field_42607, (int)n7);
        bl = this.Method_42622(n, n2);
        String string2 = this.Field_42613.Field_7658 ? "ON" : (this.Field_42597.Method_30465() ? "KEEP" : (string = this.Field_42597.Method_30472(this.Field_42613) ? "X" : "OFF"));
        n7 = this.Field_42613.Field_7658 ? -516423740 & -1472135408 : (string == "KEEP" ? -1606090866 & -1582235856 : (string == "X" ? -251706704 & -1375783671 : (bl ? -2113929217 & -1996488705 : -1526783848 & -503332828)));
        Class_42594.\u0000, `((int)this.Field_42612, (int)this.Field_42599, (int)this.Field_42602, (int)this.Field_42608, (int)n7);
        this.\u0000strictfp(class_18.Field_27, string, this.Field_42612 + this.Field_42602 >> (17429 & 2689), this.Field_42599 + (-32751 & 33), -1 & -1);
        if (n3 != 0) {
            Object[] arrobject = new Object[2434 & 25634];
            arrobject[-16116 & 1216] = this.Field_42613.Field_7655;
            arrobject[-28637 & 9473] = this.Field_42613.Field_7657;
            String string3 = String.format("%+d, %+d", arrobject);
            int n8 = class_28636.Method_28715(string3);
            int n9 = n - n8 / (-15013 & 10402) - (-30954 & 28803);
            int n10 = n9 + n8 + (26931 & -28153);
            Class_42594.\u0000, `((int)n9, (int)(n2 - (-23879 & 2065)), (int)n10, (int)(n2 + (132 & -15074)), (int)(-1474295739 & -1303485904));
            this.\u0000strictfp(class_28636, string3, n, n2 - (8207 & 16463), -1 & -1);
            Object[] arrobject2 = new Object[-22471 & 1089];
            arrobject2[272 & 24704] = this.Field_42613.Field_7660;
            this.\u0000strictfp(class_28636, String.format("%d", arrobject2), n, n2 - (333 & 4133), -1 & -1);
        }
    }

    private boolean Method_42621(int n, int n2) {
        return (n2 >= this.Field_42610 && n2 < this.Field_42607 && n >= this.Field_42609 && n < this.Field_42601 ? 22537 & -23389 : 4228 & -7392) != 0;
    }

    private boolean Method_42622(int n, int n2) {
        return (n2 >= this.Field_42599 && n2 < this.Field_42608 && n >= this.Field_42612 && n < this.Field_42602 ? 20513 & -23933 : 8338 & -13051) != 0;
    }
}

