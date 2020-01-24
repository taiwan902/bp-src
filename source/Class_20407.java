/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.authlib.GameProfile
 */
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.UUID;
import net.minecraft.util.Vec3;

public class Class_20407 {
    private int Field_20408;
    private Class_283 Field_20409;
    private TreeMap Field_20410 = new TreeMap();
    private Class_4751 Field_20411 = Class_4751.Field_4760;
    private Class_4751 Field_20412 = Class_4751.Field_4760;
    private int Field_20413;
    private int Field_20414;
    private List Field_20415 = Lists.newArrayList();
    private final List Field_20416 = Lists.newArrayList();
    private int Field_20417;
    private int Field_20418;
    private int Field_20419;

    public Class_20407(Class_283 class_283) {
        this.Field_20409 = class_283;
    }

    private void Method_20420() {
        int n = this.Field_20416.size();
        if (n == 0) {
            this.Field_20411 = new Class_4751(20496 & 769, -31357 & 4612, -12152 & 275);
            this.Field_20414 = 2244 & -28126;
        } else {
            this.Field_20411 = new Class_4751(this.Field_20412.\u0000= final() / n, this.Field_20412.\u0000, `() / n, this.Field_20412.\u0000strictfp() / n);
            int n2 = 132 & 8265;
            for (Class_38163 class_38163 : this.Field_20416) {
                n2 = Math.max(class_38163.Method_38180(this.Field_20411), n2);
            }
            this.Field_20414 = Math.max(29100 & 2594, (int)Math.sqrt(n2) + (3075 & 4769));
        }
    }

    public Class_38163 Method_20421(Class_4751 class_4751) {
        Class_38163 class_38163 = null;
        int n = Integer.MAX_VALUE & Integer.MAX_VALUE;
        for (Class_38163 class_381632 : this.Field_20416) {
            int n2 = class_381632.Method_38180(class_4751);
            if (n2 >= n) continue;
            class_38163 = class_381632;
            n = n2;
        }
        return class_38163;
    }

    public void Method_20422() {
        this.Field_20413 = this.Field_20419;
    }

    public void Method_20423(Class_1699 class_1699) {
        Object object;
        this.Field_20418 = class_1699.Method_1738("PopSize");
        this.Field_20414 = class_1699.Method_1738("Radius");
        this.Field_20417 = class_1699.Method_1738("Golems");
        this.Field_20408 = class_1699.Method_1738("Stable");
        this.Field_20419 = class_1699.Method_1738("Tick");
        this.Field_20413 = class_1699.Method_1738("MTick");
        this.Field_20411 = new Class_4751(class_1699.Method_1738("CX"), class_1699.Method_1738("CY"), class_1699.Method_1738("CZ"));
        this.Field_20412 = new Class_4751(class_1699.Method_1738("ACX"), class_1699.Method_1738("ACY"), class_1699.Method_1738("ACZ"));
        Class_1758 class_1758 = class_1699.Method_1735("Doors", 5066 & -32741);
        for (int i = 304 & -13823; i < class_1758.Method_1772(); ++i) {
            Class_1699 class_16992 = class_1758.Method_1768(i);
            object = new Class_38163(new Class_4751(class_16992.Method_1738("X"), class_16992.Method_1738("Y"), class_16992.Method_1738("Z")), class_16992.Method_1738("IDX"), class_16992.Method_1738("IDZ"), class_16992.Method_1738("TS"));
            this.Field_20416.add(object);
        }
        Class_1758 class_17582 = class_1699.Method_1735("Players", 8699 & 18442);
        for (int i = 25218 & 64; i < class_17582.Method_1772(); ++i) {
            object = class_17582.Method_1768(i);
            if (((Class_1699)object).Method_1707("UUID")) {
                Class_3180 class_3180 = Class_2457.Method_2530().Method_2626();
                GameProfile gameProfile = class_3180.Method_3193(UUID.fromString(((Class_1699)object).Method_1708("UUID")));
                if (gameProfile == null) continue;
                this.Field_20410.put(gameProfile.getName(), ((Class_1699)object).Method_1738("S"));
                continue;
            }
            this.Field_20410.put(((Class_1699)object).Method_1708("Name"), ((Class_1699)object).Method_1738("S"));
        }
    }

    public boolean Method_20424() {
        return (this.Field_20413 == 0 || this.Field_20419 - this.Field_20413 >= (3984 & 7701) ? 1 & -18679 : 256 & -32203) != 0;
    }

    public void Method_20425(Class_1699 class_1699) {
        class_1699.Method_1739("PopSize", this.Field_20418);
        class_1699.Method_1739("Radius", this.Field_20414);
        class_1699.Method_1739("Golems", this.Field_20417);
        class_1699.Method_1739("Stable", this.Field_20408);
        class_1699.Method_1739("Tick", this.Field_20419);
        class_1699.Method_1739("MTick", this.Field_20413);
        class_1699.Method_1739("CX", this.Field_20411.\u0000= final());
        class_1699.Method_1739("CY", this.Field_20411.\u0000, `());
        class_1699.Method_1739("CZ", this.Field_20411.\u0000strictfp());
        class_1699.Method_1739("ACX", this.Field_20412.\u0000= final());
        class_1699.Method_1739("ACY", this.Field_20412.\u0000, `());
        class_1699.Method_1739("ACZ", this.Field_20412.\u0000strictfp());
        Class_1758 class_1758 = new Class_1758();
        for (Object object : this.Field_20416) {
            Object object2 = new Class_1699();
            ((Class_1699)object2).Method_1739("X", ((Class_38163)object).Method_38176().\u0000= final());
            ((Class_1699)object2).Method_1739("Y", ((Class_38163)object).Method_38176().\u0000, `());
            ((Class_1699)object2).Method_1739("Z", ((Class_38163)object).Method_38176().\u0000strictfp());
            ((Class_1699)object2).Method_1739("IDX", ((Class_38163)object).Method_38186());
            ((Class_1699)object2).Method_1739("IDZ", ((Class_38163)object).Method_38174());
            ((Class_1699)object2).Method_1739("TS", ((Class_38163)object).Method_38179());
            class_1758.Method_1781((Class_1674)object2);
        }
        class_1699.Method_1744("Doors", class_1758);
        Class_1758 class_17582 = new Class_1758();
        for (Object object2 : this.Field_20410.keySet()) {
            Class_1699 class_16992 = new Class_1699();
            Class_3180 class_3180 = Class_2457.Method_2530().Method_2626();
            GameProfile gameProfile = class_3180.Method_3198((String)object2);
            if (gameProfile == null) continue;
            class_16992.Method_1702("UUID", gameProfile.getId().toString());
            class_16992.Method_1739("S", (Integer)this.Field_20410.get(object2));
            class_17582.Method_1781(class_16992);
        }
        class_1699.Method_1744("Players", class_17582);
    }

    public void Method_20426(int n) {
        for (String string : this.Field_20410.keySet()) {
            this.Method_20450(string, n);
        }
    }

    public int Method_20427(String string) {
        Integer n = (Integer)this.Field_20410.get(string);
        return n != null ? n : 12358 & 18432;
    }

    public boolean Method_20428(String string) {
        return (this.Method_20427(string) <= (-15 & -15) ? 5633 & 299 : 16648 & 8290) != 0;
    }

    private void Method_20429() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_20430() {
        return this.Field_20416.size();
    }

    private void Method_20431() {
        Iterator iterator = this.Field_20415.iterator();
        while (iterator.hasNext()) {
            Class_8233 class_8233 = (Class_8233)iterator.next();
            if (class_8233.Field_8234.Method_1033() && Math.abs(this.Field_20419 - class_8233.Field_8235) <= (12588 & 3054)) continue;
            iterator.remove();
        }
    }

    public Class_38163 Method_20432(Class_4751 class_4751) {
        if (this.Field_20411.\u0000strictfp((Class_4792)class_4751) > (double)(this.Field_20414 * this.Field_20414)) {
            return null;
        }
        for (Class_38163 class_38163 : this.Field_20416) {
            if (class_38163.Method_38176().\u0000= final() != class_4751.\u0000= final() || class_38163.Method_38176().\u0000strictfp() != class_4751.\u0000strictfp() || Math.abs(class_38163.Method_38176().\u0000, `() - class_4751.\u0000, `()) > (9109 & 17409)) continue;
            return class_38163;
        }
        return null;
    }

    public Class_38163 Method_20433(Class_4751 class_4751) {
        Class_38163 class_38163 = null;
        int n = Integer.MAX_VALUE & -1;
        for (Class_38163 class_381632 : this.Field_20416) {
            int n2 = class_381632.Method_38180(class_4751);
            n2 = n2 > (25858 & 4352) ? (n2 *= 10218 & 5097) : class_381632.Method_38170();
            if (n2 >= n) continue;
            class_38163 = class_381632;
            n = n2;
        }
        return class_38163;
    }

    public void Method_20434(Class_38163 class_38163) {
        this.Field_20416.add(class_38163);
        this.Field_20412 = this.Field_20412.Method_4790(class_38163.Method_38176());
        this.Method_20420();
        this.Field_20408 = class_38163.Method_38179();
    }

    public int Method_20435() {
        return this.Field_20414;
    }

    private boolean Method_20436(Class_4751 class_4751, Class_4751 class_47512) {
        if (!Class_283.Method_538(this.Field_20409, class_47512.Method_4782())) {
            return (8 & 13056) != 0;
        }
        int n = class_47512.\u0000= final() - class_4751.\u0000= final() / (823 & -32758);
        int n2 = class_47512.\u0000strictfp() - class_4751.\u0000strictfp() / (16386 & 674);
        for (int i = n; i < n + class_4751.\u0000= final(); ++i) {
            for (int j = class_47512.\u0000, `(); j < class_47512.\u0000, `() + class_4751.\u0000, `(); ++j) {
                for (int k = n2; k < n2 + class_4751.\u0000strictfp(); ++k) {
                    if (!this.Field_20409.Method_375(new Class_4751(i, j, k)).Method_3442().Method_3400()) continue;
                    return (19984 & -24159) != 0;
                }
            }
        }
        return (5641 & -14189) != 0;
    }

    private void Method_20437() {
        List list = this.Field_20409.Method_488(Class_43334.class, new Class_10997(this.Field_20411.\u0000= final() - this.Field_20414, this.Field_20411.\u0000, `() - (20485 & -30076), this.Field_20411.\u0000strictfp() - this.Field_20414, this.Field_20411.\u0000= final() + this.Field_20414, this.Field_20411.\u0000, `() + (4100 & 8196), this.Field_20411.\u0000strictfp() + this.Field_20414));
        this.Field_20418 = list.size();
        if (this.Field_20418 == 0) {
            this.Field_20410.clear();
        }
    }

    public void Method_20438(Class_283 class_283) {
        this.Field_20409 = class_283;
    }

    public void Method_20439(int n) {
        Vec3 vec3;
        int n2;
        this.Field_20419 = n;
        this.Method_20444();
        this.Method_20431();
        if (n % (1172 & -3820) == 0) {
            this.Method_20437();
        }
        if (n % (-4034 & 606) == 0) {
            this.Method_20453();
        }
        if (this.Field_20417 < (n2 = this.Field_20418 / (9050 & 1194)) && this.Field_20416.size() > (16438 & -24427) && this.Field_20409.Field_307.nextInt(7035 & -9252) == 0 && (vec3 = this.Method_20443(this.Field_20411, 11714 & 10, -14681 & 12556, 535 & 28714)) != null) {
            Class_45624 class_45624 = new Class_45624(this.Field_20409);
            class_45624.\u0000%(vec3.\u0000= final, vec3.\u0000strictfp, vec3.\u0000, `);
            this.Field_20409.Method_350(class_45624);
            this.Field_20417 += 2141 & -2557;
        }
    }

    public void Method_20440(Class_859 class_859) {
        for (Class_8233 class_8233 : this.Field_20415) {
            if (class_8233.Field_8234 != class_859) continue;
            class_8233.Field_8235 = this.Field_20419;
            return;
        }
        this.Field_20415.add(new Class_8233(this, class_859, this.Field_20419));
    }

    public Class_859 Method_20441(Class_859 class_859) {
        double d = 8.53450276146756E307 * 2.106382978723404;
        Class_8233 class_8233 = null;
        for (int i = 293 & 18434; i < this.Field_20415.size(); ++i) {
            Class_8233 class_82332 = (Class_8233)this.Field_20415.get(i);
            double d2 = class_82332.Field_8234.\u0000strictfp((Class_1061)class_859);
            if (!(d2 <= d)) continue;
            class_8233 = class_82332;
            d = d2;
        }
        return class_8233 != null ? class_8233.Field_8234 : null;
    }

    public Class_626 Method_20442(Class_859 class_859) {
        double d = 1.0566037735849056 * 1.7013881454946916E308;
        Class_626 class_626 = null;
        for (String string : this.Field_20410.keySet()) {
            double d2;
            Class_626 class_6262;
            if (!this.Method_20428(string) || (class_6262 = this.Field_20409.Method_489(string)) == null || !((d2 = class_6262.\u0000strictfp((Class_1061)class_859)) <= d)) continue;
            class_626 = class_6262;
            d = d2;
        }
        return class_626;
    }

    private Vec3 Method_20443(Class_4751 class_4751, int n, int n2, int n3) {
        for (int i = -3784 & 2564; i < (7182 & 24619); ++i) {
            Class_4751 class_47512 = class_4751.Method_4791(this.Field_20409.Field_307.nextInt(446 & 16) - (601 & 16428), this.Field_20409.Field_307.nextInt(-30586 & 519) - (-26605 & 3), this.Field_20409.Field_307.nextInt(-31723 & 208) - (-24118 & 1065));
            if (!this.Method_20451(class_47512) || !this.Method_20436(new Class_4751(n, n2, n3), class_47512)) continue;
            return new Vec3(class_47512.\u0000= final(), class_47512.\u0000, `(), class_47512.\u0000strictfp());
        }
        return null;
    }

    private void Method_20444() {
        int n = 10304 & -27482;
        int n2 = this.Field_20409.Field_307.nextInt(15026 & 1338) == 0 ? 2053 & 13449 : -32764 & 18985;
        Iterator iterator = this.Field_20416.iterator();
        while (iterator.hasNext()) {
            Class_38163 class_38163 = (Class_38163)iterator.next();
            if (n2 != 0) {
                class_38163.Method_38177();
            }
            if (this.Method_20449(class_38163.Method_38176()) && Math.abs(this.Field_20419 - class_38163.Method_38179()) <= (-31308 & 9392)) continue;
            this.Field_20412 = this.Field_20412.Method_4777(class_38163.Method_38176());
            n = 49 & 8717;
            class_38163.Method_38178((-28671 & 17931) != 0);
            iterator.remove();
        }
        if (n != 0) {
            this.Method_20420();
        }
    }

    public Class_20407() {
    }

    public int Method_20445() {
        return this.Field_20419 - this.Field_20408;
    }

    public int Method_20446() {
        return this.Field_20418;
    }

    public boolean Method_20447() {
        return this.Field_20416.isEmpty();
    }

    public List Method_20448() {
        return this.Field_20416;
    }

    private boolean Method_20449(Class_4751 class_4751) {
        Class_3238 class_3238 = this.Field_20409.Method_375(class_4751).Method_3442();
        return (class_3238 instanceof Class_16100 ? (class_3238.Method_3373() == Class_3713.Field_3723 ? 4675 & -32751 : -26559 & 16898) : -7984 & 7981) != 0;
    }

    public int Method_20450(String string, int n) {
        int n2 = this.Method_20427(string);
        int n3 = Class_13337.Method_13367(n2 + n, -30 & -9, -11126 & 10794);
        this.Field_20410.put(string, n3);
        return n3;
    }

    public boolean Method_20451(Class_4751 class_4751) {
        return (this.Field_20411.\u0000strictfp((Class_4792)class_4751) < (double)(this.Field_20414 * this.Field_20414) ? 5443 & 8345 : 448 & 21) != 0;
    }

    public Class_4751 Method_20452() {
        return this.Field_20411;
    }

    private void Method_20453() {
        List list = this.Field_20409.Method_488(Class_45624.class, new Class_10997(this.Field_20411.\u0000= final() - this.Field_20414, this.Field_20411.\u0000, `() - (-24083 & 5124), this.Field_20411.\u0000strictfp() - this.Field_20414, this.Field_20411.\u0000= final() + this.Field_20414, this.Field_20411.\u0000, `() + (-8156 & 2311), this.Field_20411.\u0000strictfp() + this.Field_20414));
        this.Field_20417 = list.size();
    }
}

