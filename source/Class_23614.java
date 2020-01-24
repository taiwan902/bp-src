/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;

public class Class_23614
extends Class_13400 {
    private List Field_23615 = Lists.newLinkedList();

    public Class_23614(int n, Random random, int n2, int n3) {
        super(n);
        this.\u0000strictfp = new Class_42666(n2, 566 & 16571, n3, n2 + (-15217 & 4631) + random.nextInt(9231 & -16250), (15542 & 310) + random.nextInt(614 & 2062), n3 + (-32609 & 20039) + random.nextInt(-32761 & 17030));
    }

    public void Method_23616(Class_13400 class_13400, List list, Random random) {
        Class_42666 class_42666;
        Class_13400 class_134002;
        int n = this.\u0000strictfp();
        int n2 = this.\u0000strictfp.Method_42686() - (-11765 & 2195) - (329 & 8709);
        if (n2 <= 0) {
            n2 = 5665 & -32751;
        }
        int n3 = 704 & 4363;
        while (n3 < this.\u0000strictfp.Method_42687() && (n3 += random.nextInt(this.\u0000strictfp.Method_42687())) + (-14333 & 1027) <= this.\u0000strictfp.Method_42687()) {
            class_134002 = Class_26253.Method_26260(class_13400, list, random, this.\u0000strictfp.Field_42668 + n3, this.\u0000strictfp.Field_42672 + random.nextInt(n2) + (19689 & 261), this.\u0000strictfp.Field_42669 - (-31731 & 20497), Class_4595.Field_4598, n);
            if (class_134002 != null) {
                class_42666 = class_134002.Method_13415();
                this.Field_23615.add(new Class_42666(class_42666.Field_42668, class_42666.Field_42672, this.\u0000strictfp.Field_42669, class_42666.Field_42670, class_42666.Field_42671, this.\u0000strictfp.Field_42669 + (7453 & -15837)));
            }
            n3 += -29945 & 16396;
        }
        n3 = 22897 & 8832;
        while (n3 < this.\u0000strictfp.Method_42687() && (n3 += random.nextInt(this.\u0000strictfp.Method_42687())) + (1047 & -30205) <= this.\u0000strictfp.Method_42687()) {
            class_134002 = Class_26253.Method_26260(class_13400, list, random, this.\u0000strictfp.Field_42668 + n3, this.\u0000strictfp.Field_42672 + random.nextInt(n2) + (395 & 24577), this.\u0000strictfp.Field_42667 + (-32479 & 7681), Class_4595.Field_4613, n);
            if (class_134002 != null) {
                class_42666 = class_134002.Method_13415();
                this.Field_23615.add(new Class_42666(class_42666.Field_42668, class_42666.Field_42672, this.\u0000strictfp.Field_42667 - (6663 & 8337), class_42666.Field_42670, class_42666.Field_42671, this.\u0000strictfp.Field_42667));
            }
            n3 += 20774 & 9940;
        }
        n3 = 8200 & -13722;
        while (n3 < this.\u0000strictfp.Method_42676() && (n3 += random.nextInt(this.\u0000strictfp.Method_42676())) + (15395 & 267) <= this.\u0000strictfp.Method_42676()) {
            class_134002 = Class_26253.Method_26260(class_13400, list, random, this.\u0000strictfp.Field_42668 - (675 & 18713), this.\u0000strictfp.Field_42672 + random.nextInt(n2) + (-31679 & 4239), this.\u0000strictfp.Field_42669 + n3, Class_4595.Field_4602, n);
            if (class_134002 != null) {
                class_42666 = class_134002.Method_13415();
                this.Field_23615.add(new Class_42666(this.\u0000strictfp.Field_42668, class_42666.Field_42672, class_42666.Field_42669, this.\u0000strictfp.Field_42668 + (17449 & 2181), class_42666.Field_42671, class_42666.Field_42667));
            }
            n3 += 20 & -27380;
        }
        n3 = -24192 & 20497;
        while (n3 < this.\u0000strictfp.Method_42676() && (n3 += random.nextInt(this.\u0000strictfp.Method_42676())) + (-24573 & 2259) <= this.\u0000strictfp.Method_42676()) {
            class_134002 = Class_26253.Method_26260(class_13400, list, random, this.\u0000strictfp.Field_42670 + (2049 & 28673), this.\u0000strictfp.Field_42672 + random.nextInt(n2) + (3331 & -32759), this.\u0000strictfp.Field_42669 + n3, Class_4595.Field_4603, n);
            if (class_134002 != null) {
                class_42666 = class_134002.Method_13415();
                this.Field_23615.add(new Class_42666(this.\u0000strictfp.Field_42670 - (16709 & 539), class_42666.Field_42672, class_42666.Field_42669, this.\u0000strictfp.Field_42670, class_42666.Field_42671, class_42666.Field_42667));
            }
            n3 += 2308 & -8018;
        }
    }

    public boolean Method_23617(Class_283 class_283, Random random, Class_42666 class_42666) {
        if (this.\u0000strictfp(class_283, class_42666)) {
            return (16576 & 1297) != 0;
        }
        this.\u0000strictfp(class_283, class_42666, this.\u0000strictfp.Field_42668, this.\u0000strictfp.Field_42672, this.\u0000strictfp.Field_42669, this.\u0000strictfp.Field_42670, this.\u0000strictfp.Field_42672, this.\u0000strictfp.Field_42667, (Class_3436)Class_9265.Field_9272.Method_3293(), (Class_3436)Class_9265.Field_9351.Method_3293(), (161 & 8201) != 0);
        this.\u0000strictfp(class_283, class_42666, this.\u0000strictfp.Field_42668, this.\u0000strictfp.Field_42672 + (-32703 & 24613), this.\u0000strictfp.Field_42669, this.\u0000strictfp.Field_42670, Math.min(this.\u0000strictfp.Field_42672 + (3 & -27637), this.\u0000strictfp.Field_42671), this.\u0000strictfp.Field_42667, (Class_3436)Class_9265.Field_9351.Method_3293(), (Class_3436)Class_9265.Field_9351.Method_3293(), (-16220 & 9746) != 0);
        for (Class_42666 class_426662 : this.Field_23615) {
            this.\u0000strictfp(class_283, class_42666, class_426662.Field_42668, class_426662.Field_42671 - (31170 & 1035), class_426662.Field_42669, class_426662.Field_42670, class_426662.Field_42671, class_426662.Field_42667, (Class_3436)Class_9265.Field_9351.Method_3293(), (Class_3436)Class_9265.Field_9351.Method_3293(), (3072 & -4044) != 0);
        }
        this.\u0000strictfp(class_283, class_42666, this.\u0000strictfp.Field_42668, this.\u0000strictfp.Field_42672 + (8711 & 292), this.\u0000strictfp.Field_42669, this.\u0000strictfp.Field_42670, this.\u0000strictfp.Field_42671, this.\u0000strictfp.Field_42667, (Class_3436)Class_9265.Field_9351.Method_3293(), (74 & 8448) != 0);
        return (-32237 & 4297) != 0;
    }

    public void Method_23618(int n, int n2, int n3) {
        super.Method_13418(n, n2, n3);
        for (Class_42666 class_42666 : this.Field_23615) {
            class_42666.Method_42677(n, n2, n3);
        }
    }

    public Class_23614() {
    }

    private void Method_23619() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_23620(Class_1699 class_1699) {
        Class_1758 class_1758 = class_1699.Method_1735("Entrances", 9563 & -32245);
        for (int i = 16640 & 10250; i < class_1758.Method_1772(); ++i) {
            this.Field_23615.add(new Class_42666(class_1758.Method_1765(i)));
        }
    }

    protected void Method_23621(Class_1699 class_1699) {
        Class_1758 class_1758 = new Class_1758();
        for (Class_42666 class_42666 : this.Field_23615) {
            class_1758.Method_1781(class_42666.Method_42674());
        }
        class_1699.Method_1744("Entrances", class_1758);
    }
}

