/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.List;

public class Class_13316 {
    final Class_5164 Field_13317;
    private final Class_4751 Field_13318;
    private final Class_283 Field_13319;
    private final Class_5164 Field_13320;
    private final List Field_13321;
    private Class_3436 Field_13322;
    private final boolean Field_13323;

    public Class_13316(Class_5164 class_5164, Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        this.Field_13317 = class_5164;
        this.Field_13321 = Lists.newArrayList();
        this.Field_13319 = class_283;
        this.Field_13318 = class_4751;
        this.Field_13322 = class_3436;
        this.Field_13320 = (Class_5164)class_3436.Method_3442();
        Class_5183 class_5183 = (Class_5183)((Object)class_3436.Method_3440(class_5164.Method_5176()));
        this.Field_13323 = this.Field_13320.Field_5165;
        this.Method_13334(class_5183);
    }

    protected int Method_13324() {
        int n = 18946 & 5584;
        Iterator iterator = Class_4662.Field_4663.Method_4672();
        while (iterator.hasNext()) {
            Object e = iterator.next();
            Class_4595 class_4595 = (Class_4595)e;
            if (!this.Method_13327(this.Field_13318.Method_4765(class_4595))) continue;
            ++n;
        }
        return n;
    }

    private boolean Method_13325(Class_13316 class_13316) {
        return (this.Method_13328(class_13316) || this.Field_13321.size() != (6154 & 387) ? -32223 & 8385 : -11996 & 8272) != 0;
    }

    private void Method_13326() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private boolean Method_13327(Class_4751 class_4751) {
        return (Class_5164.Method_5172(this.Field_13319, class_4751) || Class_5164.Method_5172(this.Field_13319, class_4751.Method_4769()) || Class_5164.Method_5172(this.Field_13319, class_4751.Method_4782()) ? -23547 & 4481 : 8282 & 644) != 0;
    }

    private boolean Method_13328(Class_13316 class_13316) {
        return this.Method_13331(class_13316.Field_13318);
    }

    public Class_3436 Method_13329() {
        return this.Field_13322;
    }

    public Class_13316 Method_13330(boolean bl, boolean bl2) {
        Class_4751 class_4751 = this.Field_13318.Method_4778();
        Class_4751 class_47512 = this.Field_13318.Method_4784();
        Class_4751 class_47513 = this.Field_13318.Method_4771();
        Class_4751 class_47514 = this.Field_13318.Method_4770();
        boolean bl3 = this.Method_13332(class_4751);
        boolean bl4 = this.Method_13332(class_47512);
        boolean bl5 = this.Method_13332(class_47513);
        boolean bl6 = this.Method_13332(class_47514);
        Class_5183 class_5183 = null;
        if ((bl3 || bl4) && !bl5 && !bl6) {
            class_5183 = Class_5183.Field_5185;
        }
        if ((bl5 || bl6) && !bl3 && !bl4) {
            class_5183 = Class_5183.Field_5195;
        }
        if (!this.Field_13323) {
            if (bl4 && bl6 && !bl3 && !bl5) {
                class_5183 = Class_5183.Field_5186;
            }
            if (bl4 && bl5 && !bl3 && !bl6) {
                class_5183 = Class_5183.Field_5191;
            }
            if (bl3 && bl5 && !bl4 && !bl6) {
                class_5183 = Class_5183.Field_5187;
            }
            if (bl3 && bl6 && !bl4 && !bl5) {
                class_5183 = Class_5183.Field_5184;
            }
        }
        if (class_5183 == null) {
            if (bl3 || bl4) {
                class_5183 = Class_5183.Field_5185;
            }
            if (bl5 || bl6) {
                class_5183 = Class_5183.Field_5195;
            }
            if (!this.Field_13323) {
                if (bl) {
                    if (bl4 && bl6) {
                        class_5183 = Class_5183.Field_5186;
                    }
                    if (bl5 && bl4) {
                        class_5183 = Class_5183.Field_5191;
                    }
                    if (bl6 && bl3) {
                        class_5183 = Class_5183.Field_5184;
                    }
                    if (bl3 && bl5) {
                        class_5183 = Class_5183.Field_5187;
                    }
                } else {
                    if (bl3 && bl5) {
                        class_5183 = Class_5183.Field_5187;
                    }
                    if (bl6 && bl3) {
                        class_5183 = Class_5183.Field_5184;
                    }
                    if (bl5 && bl4) {
                        class_5183 = Class_5183.Field_5191;
                    }
                    if (bl4 && bl6) {
                        class_5183 = Class_5183.Field_5186;
                    }
                }
            }
        }
        if (class_5183 == Class_5183.Field_5185) {
            if (Class_5164.Method_5172(this.Field_13319, class_4751.Method_4769())) {
                class_5183 = Class_5183.Field_5196;
            }
            if (Class_5164.Method_5172(this.Field_13319, class_47512.Method_4769())) {
                class_5183 = Class_5183.Field_5192;
            }
        }
        if (class_5183 == Class_5183.Field_5195) {
            if (Class_5164.Method_5172(this.Field_13319, class_47514.Method_4769())) {
                class_5183 = Class_5183.Field_5190;
            }
            if (Class_5164.Method_5172(this.Field_13319, class_47513.Method_4769())) {
                class_5183 = Class_5183.Field_5189;
            }
        }
        if (class_5183 == null) {
            class_5183 = Class_5183.Field_5185;
        }
        this.Method_13334(class_5183);
        this.Field_13322 = this.Field_13322.Method_3437(this.Field_13320.Method_5176(), (Comparable)((Object)class_5183));
        if (bl2 || this.Field_13319.Method_375(this.Field_13318) != this.Field_13322) {
            this.Field_13319.Method_462(this.Field_13318, this.Field_13322, 17411 & -22381);
            for (int i = 8448 & -30638; i < this.Field_13321.size(); ++i) {
                Class_13316 class_13316 = this.Method_13335((Class_4751)this.Field_13321.get(i));
                if (class_13316 == null) continue;
                class_13316.Method_13336();
                if (!class_13316.Method_13325(this)) continue;
                class_13316.Method_13333(this);
            }
        }
        return this;
    }

    private boolean Method_13331(Class_4751 class_4751) {
        for (int i = 10773 & 392; i < this.Field_13321.size(); ++i) {
            Class_4751 class_47512 = (Class_4751)this.Field_13321.get(i);
            if (class_47512.\u0000= final() != class_4751.\u0000= final() || class_47512.\u0000strictfp() != class_4751.\u0000strictfp()) continue;
            return (161 & 16651) != 0;
        }
        return (-15982 & 12352) != 0;
    }

    private boolean Method_13332(Class_4751 class_4751) {
        Class_13316 class_13316 = this.Method_13335(class_4751);
        if (class_13316 == null) {
            return (8354 & 21512) != 0;
        }
        class_13316.Method_13336();
        return class_13316.Method_13325(this);
    }

    private void Method_13333(Class_13316 class_13316) {
        this.Field_13321.add(class_13316.Field_13318);
        Class_4751 class_4751 = this.Field_13318.Method_4778();
        Class_4751 class_47512 = this.Field_13318.Method_4784();
        Class_4751 class_47513 = this.Field_13318.Method_4771();
        Class_4751 class_47514 = this.Field_13318.Method_4770();
        boolean bl = this.Method_13331(class_4751);
        boolean bl2 = this.Method_13331(class_47512);
        boolean bl3 = this.Method_13331(class_47513);
        boolean bl4 = this.Method_13331(class_47514);
        Class_5183 class_5183 = null;
        if (bl || bl2) {
            class_5183 = Class_5183.Field_5185;
        }
        if (bl3 || bl4) {
            class_5183 = Class_5183.Field_5195;
        }
        if (!this.Field_13323) {
            if (bl2 && bl4 && !bl && !bl3) {
                class_5183 = Class_5183.Field_5186;
            }
            if (bl2 && bl3 && !bl && !bl4) {
                class_5183 = Class_5183.Field_5191;
            }
            if (bl && bl3 && !bl2 && !bl4) {
                class_5183 = Class_5183.Field_5187;
            }
            if (bl && bl4 && !bl2 && !bl3) {
                class_5183 = Class_5183.Field_5184;
            }
        }
        if (class_5183 == Class_5183.Field_5185) {
            if (Class_5164.Method_5172(this.Field_13319, class_4751.Method_4769())) {
                class_5183 = Class_5183.Field_5196;
            }
            if (Class_5164.Method_5172(this.Field_13319, class_47512.Method_4769())) {
                class_5183 = Class_5183.Field_5192;
            }
        }
        if (class_5183 == Class_5183.Field_5195) {
            if (Class_5164.Method_5172(this.Field_13319, class_47514.Method_4769())) {
                class_5183 = Class_5183.Field_5190;
            }
            if (Class_5164.Method_5172(this.Field_13319, class_47513.Method_4769())) {
                class_5183 = Class_5183.Field_5189;
            }
        }
        if (class_5183 == null) {
            class_5183 = Class_5183.Field_5185;
        }
        this.Field_13322 = this.Field_13322.Method_3437(this.Field_13320.Method_5176(), (Comparable)((Object)class_5183));
        this.Field_13319.Method_462(this.Field_13318, this.Field_13322, 4099 & 8223);
    }

    private void Method_13334(Class_5183 class_5183) {
        this.Field_13321.clear();
        switch (Class_19615.Field_19616[class_5183.ordinal()]) {
            case 1: {
                this.Field_13321.add(this.Field_13318.Method_4778());
                this.Field_13321.add(this.Field_13318.Method_4784());
                break;
            }
            case 2: {
                this.Field_13321.add(this.Field_13318.Method_4771());
                this.Field_13321.add(this.Field_13318.Method_4770());
                break;
            }
            case 3: {
                this.Field_13321.add(this.Field_13318.Method_4771());
                this.Field_13321.add(this.Field_13318.Method_4770().Method_4769());
                break;
            }
            case 4: {
                this.Field_13321.add(this.Field_13318.Method_4771().Method_4769());
                this.Field_13321.add(this.Field_13318.Method_4770());
                break;
            }
            case 5: {
                this.Field_13321.add(this.Field_13318.Method_4778().Method_4769());
                this.Field_13321.add(this.Field_13318.Method_4784());
                break;
            }
            case 6: {
                this.Field_13321.add(this.Field_13318.Method_4778());
                this.Field_13321.add(this.Field_13318.Method_4784().Method_4769());
                break;
            }
            case 7: {
                this.Field_13321.add(this.Field_13318.Method_4770());
                this.Field_13321.add(this.Field_13318.Method_4784());
                break;
            }
            case 8: {
                this.Field_13321.add(this.Field_13318.Method_4771());
                this.Field_13321.add(this.Field_13318.Method_4784());
                break;
            }
            case 9: {
                this.Field_13321.add(this.Field_13318.Method_4771());
                this.Field_13321.add(this.Field_13318.Method_4778());
                break;
            }
            case 10: {
                this.Field_13321.add(this.Field_13318.Method_4770());
                this.Field_13321.add(this.Field_13318.Method_4778());
            }
        }
    }

    private Class_13316 Method_13335(Class_4751 class_4751) {
        Class_13316 class_13316;
        Class_3436 class_3436 = this.Field_13319.Method_375(class_4751);
        if (Class_5164.Method_5178(class_3436)) {
            Class_5164 class_5164 = this.Field_13317;
            class_5164.getClass();
            return new Class_13316(class_5164, this.Field_13319, class_4751, class_3436);
        }
        Class_4751 class_47512 = class_4751.Method_4769();
        class_3436 = this.Field_13319.Method_375(class_47512);
        if (Class_5164.Method_5178(class_3436)) {
            Class_5164 class_5164 = this.Field_13317;
            class_5164.getClass();
            return new Class_13316(class_5164, this.Field_13319, class_47512, class_3436);
        }
        class_47512 = class_4751.Method_4782();
        class_3436 = this.Field_13319.Method_375(class_47512);
        if (Class_5164.Method_5178(class_3436)) {
            Class_5164 class_5164;
            class_13316 = new Class_13316(class_5164, this.Field_13319, class_47512, class_3436);
            class_5164 = this.Field_13317;
            class_5164.getClass();
        } else {
            class_13316 = null;
        }
        return class_13316;
    }

    private void Method_13336() {
        for (int i = 1088 & 6528; i < this.Field_13321.size(); ++i) {
            Class_13316 class_13316 = this.Method_13335((Class_4751)this.Field_13321.get(i));
            if (class_13316 != null && class_13316.Method_13328(this)) {
                this.Field_13321.set(i, class_13316.Field_13318);
                continue;
            }
            this.Field_13321.remove(i--);
        }
    }
}

