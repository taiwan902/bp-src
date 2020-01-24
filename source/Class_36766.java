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

public class Class_36766
extends Class_1551 {
    private int Field_36767;
    private boolean Field_36768;
    private int Field_36769;
    public int Field_36770;
    public boolean Field_36771 = -32575 & 20009;
    public int Field_36772;
    private List Field_36773;
    public int Field_36774;
    private int Field_36775;
    private boolean Field_36776;
    private int Field_36777;
    protected int Field_36778 = 1788 & 8392;
    protected int Field_36779 = 16532 & -28290;
    private Class_28636 Field_36780;
    private int Field_36781;

    public void Method_36782(String string) {
        this.Field_36773.add(Class_9802.Method_9806(string, new Object[16477 & 2]));
    }

    private void Method_36783() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_36784(Class_18 class_18, int n, int n2) {
        if (this.Field_36771) {
            Class_16867.Method_16947();
            Class_16867.Method_16984(-21518 & 17155, 923 & 7939, 10401 & -11767, -31480 & 8884);
            this.Method_36785(class_18, n, n2);
            int n3 = this.Field_36770 + this.Field_36779 / (12290 & 1538) + this.Field_36781 / (103 & -30182);
            int n4 = n3 - this.Field_36773.size() * (18842 & 4206) / (20678 & -30974);
            for (int i = -16368 & 4781; i < this.Field_36773.size(); ++i) {
                if (this.Field_36768) {
                    this.\u0000strictfp(this.Field_36780, (String)this.Field_36773.get(i), this.Field_36774 + this.Field_36778 / (-23742 & 4238), n4 + i * (17818 & 10250), this.Field_36777);
                    continue;
                }
                this.\u0000, `(this.Field_36780, (String)this.Field_36773.get(i), this.Field_36774, n4 + i * (8459 & 730), this.Field_36777);
            }
        }
    }

    protected void Method_36785(Class_18 class_18, int n, int n2) {
        if (this.Field_36776) {
            int n3 = this.Field_36778 + this.Field_36781 * (-30206 & 28678);
            int n4 = this.Field_36779 + this.Field_36781 * (1050 & -9566);
            int n5 = this.Field_36774 - this.Field_36781;
            int n6 = this.Field_36770 - this.Field_36781;
            Class_36766.\u0000, `((int)n5, (int)n6, (int)(n5 + n3), (int)(n6 + n4), (int)this.Field_36767);
            this.\u0000strictfp(n5, n5 + n3, n6, this.Field_36769);
            this.\u0000strictfp(n5, n5 + n3, n6 + n4, this.Field_36775);
            this.\u0000, `(n5, n6, n6 + n4, this.Field_36769);
            this.\u0000, `(n5 + n3, n6, n6 + n4, this.Field_36775);
        }
    }

    public Class_36766 Method_36786() {
        this.Field_36768 = 17673 & -26619;
        return this;
    }

    public Class_36766(Class_28636 class_28636, int n, int n2, int n3, int n4, int n5, int n6) {
        this.Field_36780 = class_28636;
        this.Field_36772 = n;
        this.Field_36774 = n2;
        this.Field_36770 = n3;
        this.Field_36778 = n4;
        this.Field_36779 = n5;
        this.Field_36773 = Lists.newArrayList();
        this.Field_36768 = 8210 & -28608;
        this.Field_36776 = 11296 & 20741;
        this.Field_36777 = n6;
        this.Field_36767 = -1 & -1;
        this.Field_36769 = -1 & -1;
        this.Field_36775 = -1 & -1;
        this.Field_36781 = 572 & 13376;
    }
}

