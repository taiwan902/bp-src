/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.List;

public class Class_1792
extends Class_1490 {
    protected String Field_1793;
    protected Class_1549 Field_1794;
    protected String Field_1795;
    protected int Field_1796;
    protected String Field_1797;
    private int Field_1798;
    private final List Field_1799 = Lists.newArrayList();
    private String Field_1800;

    public Class_1792(Class_1549 class_1549, String string, String string2, String string3, String string4, int n) {
        this.Field_1794 = class_1549;
        this.Field_1793 = string;
        this.Field_1800 = string2;
        this.Field_1795 = string3;
        this.Field_1797 = string4;
        this.Field_1796 = n;
    }

    protected void Method_1801(Class_42376 class_42376) {
        this.Field_1794.Method_1550((class_42376.Field_42392 == 0 ? 25219 & 1073 : 324 & 24736) != 0, this.Field_1796);
    }

    public void Method_1802(int n, int n2, float f) {
        this.\u0000, 2();
        this.\u0000strictfp(this.\u0000strictfp, this.Field_1793, this.\u0000= final / (12807 & -29462), 6727 & 1390, 1828716543 & 16777215);
        int n3 = 218 & -16289;
        for (String string : this.Field_1799) {
            this.\u0000strictfp(this.\u0000strictfp, string, this.\u0000= final / (16394 & 11843), n3, 570425343 & 1090519039);
            n3 += 20617 & -22487;
        }
        super.Method_1545(n, n2, f);
    }

    public Class_1792(Class_1549 class_1549, String string, String string2, int n) {
        this.Field_1794 = class_1549;
        this.Field_1793 = string;
        this.Field_1800 = string2;
        this.Field_1796 = n;
        this.Field_1795 = Class_9802.Method_9806("gui.yes", new Object[-29664 & 276]);
        this.Field_1797 = Class_9802.Method_9806("gui.no", new Object[16528 & -24576]);
    }

    private void Method_1803() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_1804() {
        super.Method_1517();
        if (Class_18.Field_89.Field_127.Field_2178 > 0) {
            this.Field_1798 -= 65 & -14191;
        }
        if (this.Field_1798 == 0) {
            for (Class_42376 class_42376 : this.\u0000strictfp) {
                class_42376.Field_42388 = 4101 & -29879;
            }
        }
    }

    public void Method_1805(int n) {
        this.Field_1798 = n;
        for (Class_42376 class_42376 : this.\u0000strictfp) {
            class_42376.Field_42388 = 33 & -28600;
        }
    }

    public void Method_1806() {
        this.\u0000strictfp.add(new Class_43202(16929 & 5400, this.\u0000= final / (10 & 4166) - (20667 & -31525), this.\u0000, ` / (24582 & 1454) + (874 & 16500), this.Field_1795));
        this.\u0000strictfp.add(new Class_43202(513 & -32759, this.\u0000= final / (1118 & 930) - (-32353 & 19099) + (-18263 & 16886), this.\u0000, ` / (-24554 & 1990) + (-32672 & 25442), this.Field_1797));
        this.Field_1799.clear();
        this.Field_1799.addAll(this.\u0000strictfp.Method_28733(this.Field_1800, this.\u0000= final - (-16333 & 4150)));
    }
}

