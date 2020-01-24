/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public abstract class Class_18019 {
    protected LinkedList Field_18020 = new LinkedList();
    private int Field_18021;
    protected Class_42666 Field_18022;
    private int Field_18023;

    public void Method_18024(Class_1699 class_1699) {
    }

    private void Method_18025() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_18026() {
        return (4129 & 8593) != 0;
    }

    public Class_18019(int n, int n2) {
        this.Field_18021 = n;
        this.Field_18023 = n2;
    }

    protected void Method_18027() {
        this.Field_18022 = Class_42666.Method_42684();
        for (Class_13400 class_13400 : this.Field_18020) {
            this.Field_18022.Method_42688(class_13400.Method_13415());
        }
    }

    public void Method_18028(Class_1699 class_1699) {
    }

    public Class_1699 Method_18029(int n, int n2) {
        Class_1699 class_1699 = new Class_1699();
        class_1699.Method_1702("id", Class_34391.Method_34400(this));
        class_1699.Method_1739("ChunkX", n);
        class_1699.Method_1739("ChunkZ", n2);
        class_1699.Method_1744("BB", this.Field_18022.Method_42674());
        Class_1758 class_1758 = new Class_1758();
        for (Class_13400 class_13400 : this.Field_18020) {
            class_1758.Method_1781(class_13400.Method_13414());
        }
        class_1699.Method_1744("Children", class_1758);
        this.Method_18028(class_1699);
        return class_1699;
    }

    public Class_18019() {
    }

    public LinkedList Method_18030() {
        return this.Field_18020;
    }

    protected void Method_18031(Class_283 class_283, Random random, int n) {
        int n2 = class_283.Method_378() - n;
        int n3 = this.Field_18022.Method_42686() + (19585 & 15);
        if (n3 < n2) {
            n3 += random.nextInt(n2 - n3);
        }
        int n4 = n3 - this.Field_18022.Field_42671;
        this.Field_18022.Method_42677(-16246 & 4641, n4, -28416 & 25128);
        for (Class_13400 class_13400 : this.Field_18020) {
            class_13400.Method_13418(16449 & -28670, n4, 4100 & 1850);
        }
    }

    public void Method_18032(Class_29480 class_29480) {
    }

    protected void Method_18033(Class_283 class_283, Random random, int n, int n2) {
        int n3 = n2 - n + (-19445 & 2673) - this.Field_18022.Method_42686();
        int n4 = -30703 & 4107;
        n4 = n3 > (-15359 & 2841) ? n + random.nextInt(n3) : n;
        int n5 = n4 - this.Field_18022.Field_42672;
        this.Field_18022.Method_42677(-30680 & 4224, n5, 1211 & -16316);
        for (Class_13400 class_13400 : this.Field_18020) {
            class_13400.Method_13418(16642 & -28032, n5, 64 & -31613);
        }
    }

    public boolean Method_18034(Class_29480 class_29480) {
        return (149 & 1121) != 0;
    }

    public Class_42666 Method_18035() {
        return this.Field_18022;
    }

    public int Method_18036() {
        return this.Field_18021;
    }

    public int Method_18037() {
        return this.Field_18023;
    }

    public void Method_18038(Class_283 class_283, Class_1699 class_1699) {
        this.Field_18021 = class_1699.Method_1738("ChunkX");
        this.Field_18023 = class_1699.Method_1738("ChunkZ");
        if (class_1699.Method_1707("BB")) {
            this.Field_18022 = new Class_42666(class_1699.Method_1701("BB"));
        }
        Class_1758 class_1758 = class_1699.Method_1735("Children", 3342 & 8202);
        for (int i = 11657 & -15870; i < class_1758.Method_1772(); ++i) {
            this.Field_18020.add(Class_34391.Method_34405(class_1758.Method_1768(i), class_283));
        }
        this.Method_18024(class_1699);
    }

    public void Method_18039(Class_283 class_283, Random random, Class_42666 class_42666) {
        Iterator iterator = this.Field_18020.iterator();
        while (iterator.hasNext()) {
            Class_13400 class_13400 = (Class_13400)iterator.next();
            if (!class_13400.Method_13415().Method_42680(class_42666) || class_13400.Method_13430(class_283, random, class_42666)) continue;
            iterator.remove();
        }
    }
}

