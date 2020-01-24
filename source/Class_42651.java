/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  \u0000default long this static interface ] try break finally 3 else super ^ default 0 break strictfp 7 - class catch final ! 9 finally boolean case & true 1 default - try catch 2 - double # finally goto public ~ 3 ? 9 short ] import class ` ' try abstract public
 *  internal.org.lwjgl.opengl.GL11
 */
import internal.org.lwjgl.opengl.GL11;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_42651
extends Class_37430 {
    public int Field_42652;
    public boolean Field_42653 = -32751 & 18977;
    public int Field_42654 = -16323 & 7060;
    private int Field_42655;
    public int Field_42656;
    private double Field_42657;
    public int Field_42658;
    public int Field_42659;
    private int Field_42660;

    private void Method_42661(String string, int n, double d) {
        double d2;
        double d3 = (double)(this.Field_42658 * n / (-32408 & 9064)) - this.Field_42657;
        if (d3 > (double)(this.Field_42658 / (15 & 15570))) {
            d3 -= (double)this.Field_42658;
        }
        if (d3 < (double)(-this.Field_42658 / (370 & 5134))) {
            d3 += (double)this.Field_42658;
        }
        if ((d2 = 1.0 - Math.abs(d3) / ((double)this.Field_42652 / (0.8085106382978723 * 2.473684210526316))) > 0.08 * 1.25) {
            int n2 = this.\u0000strictfp.Field_84.Field_39732.Field_8859.\u0000strictfp() & (-1056964609 & 234881023);
            int n3 = n2 | (int)(d2 * (0.5714285714285714 * 446.25)) << (23064 & 9624);
            float f = (float)this.Field_42660 + (float)d3 - (float)((int)((double)this.\u0000strictfp.Method_28715(string) * d / (0.9259259259259258 * 2.16)));
            int n4 = this.Field_42656 + this.Field_42654 / (10838 & -15070) - (int)(5.526315789473684 * 1.6285714285714286 * d / (1.1304347826086958 * 1.7692307692307692));
            GL11.glEnable((int)(4070 & 3043));
            GL11.glPushMatrix();
            GL11.glTranslated((double)((double)(-f) * (d - 1.0)), (double)((double)(-n4) * (d - 1.0)), (double)0.0);
            GL11.glScaled((double)d, (double)d, (double)1.0);
            if (this.Field_42653) {
                this.\u0000strictfp.Method_28729(string, f, n4, n3);
            } else {
                this.\u0000strictfp.Method_28725(string, f, n4, n3, (24597 & 34) != 0);
            }
            GL11.glPopMatrix();
            GL11.glDisable((int)(27635 & 8162));
        }
    }

    private void Method_42662() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_42651() {
        super("compass", -22345 & 5270, 1053 & 2964);
    }

    public void Method_42663(int n, int n2, float f) {
        if (this.\u0000strictfp.Field_48 == null || !((Boolean)this.\u0000strictfp.Field_84.Field_39732.Field_8900.\u0000strictfp()).booleanValue()) {
            return;
        }
        this.Field_42659 = this.\u0000, for;
        this.Field_42656 = this.\u0000, 2;
        this.Field_42652 = (Integer)this.\u0000strictfp.Field_84.Field_39732.Field_8840.\u0000strictfp();
        this.\u0000, `(this.Field_42652, this.Field_42654);
        this.Field_42658 = (Integer)this.\u0000strictfp.Field_84.Field_39732.Field_8866.\u0000strictfp();
        this.Field_42653 = (Boolean)this.\u0000strictfp.Field_84.Field_39732.Field_8869.\u0000strictfp();
        this.Field_42655 = this.\u0000strictfp.Field_84.Field_39732.Field_8843.\u0000strictfp();
        double d = this.Method_42665(this.\u0000strictfp.Field_48.\u0000= ?);
        this.Field_42657 = (double)this.Field_42658 * (d / (0.9558823529411765 * 376.6153846153846));
        this.Field_42660 = this.Field_42659 + this.Field_42652 / (-20446 & 2059);
        if (((Boolean)this.\u0000strictfp.Field_84.Field_39732.Field_8875.\u0000strictfp()).booleanValue()) {
            Class_1551.Method_1558(this.Field_42660 - this.Field_42652 / (4102 & 1098), this.Field_42656, this.Field_42660 + this.Field_42652 / (5410 & 8731), this.Field_42656 + this.Field_42654, -1155342074 & -1363144080);
        }
        this.Method_42664();
        int n3 = (Integer)this.\u0000strictfp.Field_84.Field_39732.Field_8890.\u0000strictfp();
        if (n3 >= 0) {
            this.Method_42661("S", 8242 & 2369, 0.95 * 1.5789473684210527);
            this.Method_42661("W", 94 & -27302, 3.5 * 0.42857142857142855);
            this.Method_42661("N", -11594 & 1205, 0.8048780487804879 * 1.8636363636363635);
            this.Method_42661("E", 830 & 20878, 1.5294117647058822 * 0.9807692307692308);
        }
        if (n3 >= (27905 & 521)) {
            this.Method_42661("SW", -30163 & 1453, 1.0);
            this.Method_42661("NW", 223 & 5255, 1.0);
            this.Method_42661("NE", 8433 & 225, 1.0);
            this.Method_42661("SE", 25979 & 319, 1.0);
        }
        if (n3 >= (8230 & 594)) {
            this.Method_42661("15", -20209 & 2079, 0.7258064516129031 * 1.0333333333333334);
            this.Method_42661("30", -32610 & 27934, 8.0 * 0.09375);
            this.Method_42661("60", -25540 & 8317, 0.7878787878787878 * 0.951923076923077);
            this.Method_42661("75", 27775 & -28085, 0.25806451612903225 * 2.90625);
            this.Method_42661("105", -29847 & 9337, 1.78125 * 0.42105263157894735);
            this.Method_42661("120", 16632 & 8313, 0.6532258064516129 * 1.1481481481481481);
            this.Method_42661("150", 5782 & -24425, 0.76171875 * 0.9846153846153847);
            this.Method_42661("165", 743 & 17829, 0.9423076923076923 * 0.7959183673469388);
            this.Method_42661("195", 22759 & -32573, 0.7142857142857143 * 1.05);
            this.Method_42661("210", 17618 & 2262, 0.6166666666666667 * 1.2162162162162162);
            this.Method_42661("240", 240 & 6648, 1.3499999999999999 * 0.5555555555555556);
            this.Method_42661("255", 1279 & -14081, 0.7819148936170213 * 0.9591836734693877);
            this.Method_42661("285", 10525 & 831, 0.4880952380952381 * 1.5365853658536586);
            this.Method_42661("300", 12716 & -31937, 1.4142857142857144 * 0.5303030303030303);
            this.Method_42661("330", -7858 & 1371, 3.4761904761904763 * 0.21575342465753425);
            this.Method_42661("345", -23207 & 17245, 3.8947368421052633 * 0.19256756756756757);
        }
    }

    private void Method_42664() {
        Class_7644 class_7644 = Class_7644.Method_7649();
        Class_22385 class_22385 = class_7644.Method_7648();
        Class_16867.Method_16947();
        Class_16867.Method_16922();
        Class_16867.Method_16984(17154 & 1015, -13549 & 1859, 1441 & 85, -32752 & 18592);
        Class_16867.Method_16924((float)(this.Field_42655 >> (29200 & 1202) & (1791 & -30465)) / (510.0f * 0.5f), (float)(this.Field_42655 >> (12 & 1672) & (16895 & -25857)) / (205.84337f * 1.238806f), (float)(this.Field_42655 & (4863 & 26879)) / (235.38461f * 1.0833334f), 1.0f);
        class_22385.Method_22417(-22977 & 6, Class_29585.Field_29602);
        class_22385.Method_22443(this.Field_42660, this.Field_42656 + (423 & -32741), 0.0).Method_22451();
        class_22385.Method_22443(this.Field_42660 + (2483 & 1103), this.Field_42656, 0.0).Method_22451();
        class_22385.Method_22443(this.Field_42660 - (4619 & 195), this.Field_42656, 0.0).Method_22451();
        class_7644.Method_7647();
        Class_16867.Method_16965();
        Class_16867.Method_16952();
    }

    private double Method_42665(double d) {
        if ((d = 6.166666666666667 * 58.37837837837838 + d % (121.26315789473684 * 2.96875)) > 742.5 * 0.48484848484848486) {
            d -= 4.75 * 75.78947368421052;
        }
        return d;
    }
}

