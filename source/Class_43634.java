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

public class Class_43634
implements Class_4961 {
    private String Field_43635;
    private int Field_43636;
    private Class_23823[] Field_43637;
    private List Field_43638;
    private boolean Field_43639;

    public Class_1782 Method_43640() {
        return this.Method_43653() ? new Class_2840(this.Method_43659()) : new Class_2849(this.Method_43659(), new Object[16920 & 2]);
    }

    public Class_43634(String string, boolean bl, int n) {
        this.Field_43635 = string;
        this.Field_43639 = bl;
        this.Field_43636 = n;
        this.Field_43637 = new Class_23823[n];
    }

    public void Method_43641(int n, int n2) {
    }

    public Class_23823 Method_43642(int n) {
        return n >= 0 && n < this.Field_43637.length ? this.Field_43637[n] : null;
    }

    public void Method_43643() {
        if (this.Field_43638 != null) {
            for (int i = 16899 & 9544; i < this.Field_43638.size(); ++i) {
                ((Class_18228)this.Field_43638.get(i)).Method_18229(this);
            }
        }
    }

    public void Method_43644(Class_18228 class_18228) {
        if (this.Field_43638 == null) {
            this.Field_43638 = Lists.newArrayList();
        }
        this.Field_43638.add(class_18228);
    }

    public boolean Method_43645(Class_626 class_626) {
        return (-32223 & 85) != 0;
    }

    private void Method_43646() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_43647(String string) {
        this.Field_43639 = -32623 & 25103;
        this.Field_43635 = string;
    }

    public int Method_43648(int n) {
        return 84 & 18433;
    }

    public boolean Method_43649(int n, Class_23823 class_23823) {
        return (13313 & -32499) != 0;
    }

    public Class_43634(Class_1782 class_1782, int n) {
        this(class_1782.Method_1788(), (-32763 & 1769) != 0, n);
    }

    public Class_23823 Method_43650(Class_23823 class_23823) {
        Class_23823 class_238232 = class_23823.Method_23850();
        for (int i = 8232 & 5076; i < this.Field_43636; ++i) {
            int n;
            int n2;
            Class_23823 class_238233 = this.Method_43642(i);
            if (class_238233 == null) {
                this.Method_43662(i, class_238232);
                this.Method_43643();
                return null;
            }
            if (!Class_23823.Method_23886(class_238233, class_238232) || (n2 = Math.min(class_238232.Field_23826, (n = Math.min(this.Method_43660(), class_238233.Method_23837())) - class_238233.Field_23826)) <= 0) continue;
            class_238233.Field_23826 += n2;
            class_238232.Field_23826 -= n2;
            if (class_238232.Field_23826 > 0) continue;
            this.Method_43643();
            return null;
        }
        if (class_238232.Field_23826 != class_23823.Field_23826) {
            this.Method_43643();
        }
        return class_238232;
    }

    public Class_23823 Method_43651(int n) {
        if (this.Field_43637[n] != null) {
            Class_23823 class_23823 = this.Field_43637[n];
            this.Field_43637[n] = null;
            return class_23823;
        }
        return null;
    }

    public int Method_43652() {
        return this.Field_43636;
    }

    public boolean Method_43653() {
        return this.Field_43639;
    }

    public void Method_43654(Class_626 class_626) {
    }

    public void Method_43655() {
        for (int i = -31732 & 18514; i < this.Field_43637.length; ++i) {
            this.Field_43637[i] = null;
        }
    }

    public void Method_43656(Class_626 class_626) {
    }

    public void Method_43657(Class_18228 class_18228) {
        this.Field_43638.remove(class_18228);
    }

    public Class_23823 Method_43658(int n, int n2) {
        if (this.Field_43637[n] != null) {
            if (this.Field_43637[n].Field_23826 <= n2) {
                Class_23823 class_23823 = this.Field_43637[n];
                this.Field_43637[n] = null;
                this.Method_43643();
                return class_23823;
            }
            Class_23823 class_23823 = this.Field_43637[n].Method_23857(n2);
            if (this.Field_43637[n].Field_23826 == 0) {
                this.Field_43637[n] = null;
            }
            this.Method_43643();
            return class_23823;
        }
        return null;
    }

    public String Method_43659() {
        return this.Field_43635;
    }

    public int Method_43660() {
        return 6208 & 332;
    }

    public int Method_43661() {
        return 21632 & 1;
    }

    public void Method_43662(int n, Class_23823 class_23823) {
        this.Field_43637[n] = class_23823;
        if (class_23823 != null && class_23823.Field_23826 > this.Method_43660()) {
            class_23823.Field_23826 = this.Method_43660();
        }
        this.Method_43643();
    }
}

