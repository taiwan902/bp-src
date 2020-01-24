/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_6757 {
    private int Field_6758;
    private Class_23823 Field_6759;
    private Class_23823 Field_6760;
    private boolean Field_6761;
    private int Field_6762;
    private Class_23823 Field_6763;

    public void Method_6764(Class_1699 class_1699) {
        Class_1699 class_16992 = class_1699.Method_1703("buy");
        this.Field_6763 = Class_23823.Method_23840(class_16992);
        Class_1699 class_16993 = class_1699.Method_1703("sell");
        this.Field_6759 = Class_23823.Method_23840(class_16993);
        if (class_1699.Method_1715("buyB", 16398 & 986)) {
            this.Field_6760 = Class_23823.Method_23840(class_1699.Method_1703("buyB"));
        }
        if (class_1699.Method_1715("uses", 8307 & -32029)) {
            this.Field_6762 = class_1699.Method_1738("uses");
        }
        this.Field_6758 = class_1699.Method_1715("maxUses", 9587 & 6763) ? class_1699.Method_1738("maxUses") : 6311 & 17479;
        this.Field_6761 = class_1699.Method_1715("rewardExp", 147 & 1061) ? class_1699.Method_1733("rewardExp") : 20491 & 2117;
    }

    public Class_23823 Method_6765() {
        return this.Field_6760;
    }

    public Class_6757(Class_23823 class_23823, Class_1956 class_1956) {
        this(class_23823, new Class_23823(class_1956));
    }

    public Class_6757(Class_23823 class_23823, Class_23823 class_238232) {
        this(class_23823, null, class_238232);
    }

    public Class_6757(Class_23823 class_23823, Class_23823 class_238232, Class_23823 class_238233, int n, int n2) {
        this.Field_6763 = class_23823;
        this.Field_6760 = class_238232;
        this.Field_6759 = class_238233;
        this.Field_6762 = n;
        this.Field_6758 = n2;
        this.Field_6761 = -22523 & 259;
    }

    public Class_6757(Class_1699 class_1699) {
        this.Method_6764(class_1699);
    }

    public void Method_6766(int n) {
        this.Field_6758 += n;
    }

    public Class_23823 Method_6767() {
        return this.Field_6759;
    }

    public Class_6757(Class_23823 class_23823, Class_23823 class_238232, Class_23823 class_238233) {
        this(class_23823, class_238232, class_238233, 134 & 21064, 21543 & -30201);
    }

    public void Method_6768() {
        this.Field_6762 = this.Field_6758;
    }

    public Class_1699 Method_6769() {
        Class_1699 class_1699 = new Class_1699();
        class_1699.Method_1744("buy", this.Field_6763.Method_23841(new Class_1699()));
        class_1699.Method_1744("sell", this.Field_6759.Method_23841(new Class_1699()));
        if (this.Field_6760 != null) {
            class_1699.Method_1744("buyB", this.Field_6760.Method_23841(new Class_1699()));
        }
        class_1699.Method_1739("uses", this.Field_6762);
        class_1699.Method_1739("maxUses", this.Field_6758);
        class_1699.Method_1706("rewardExp", this.Field_6761);
        return class_1699;
    }

    public Class_23823 Method_6770() {
        return this.Field_6763;
    }

    public void Method_6771() {
        this.Field_6762 += 1025 & 841;
    }

    public int Method_6772() {
        return this.Field_6758;
    }

    private void Method_6773() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_6774() {
        return this.Field_6762;
    }

    public boolean Method_6775() {
        return (this.Field_6760 != null ? 3085 & -27981 : 25422 & 17) != 0;
    }

    public boolean Method_6776() {
        return (this.Field_6762 >= this.Field_6758 ? 3119 & -23999 : 256 & -26576) != 0;
    }

    public boolean Method_6777() {
        return this.Field_6761;
    }
}

