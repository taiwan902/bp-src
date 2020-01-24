/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_3779 {
    public static final Class_3779 Field_3780;
    public static final Class_3779 Field_3781;
    public static final Class_3779 Field_3782;
    public static final Class_3779 Field_3783;
    public static final Class_3779 Field_3784;
    public static final Class_3779 Field_3785;
    public static final Class_3779 Field_3786;
    public static final Class_3779 Field_3787;
    public static final Class_3779 Field_3788;
    public static final Class_3779 Field_3789;
    public static final Class_3779 Field_3790;
    public static final Class_3779 Field_3791;
    public static final Class_3779 Field_3792;
    public final int Field_3793;
    public static final Class_3779 Field_3794;
    public static final Class_3779[] Field_3795;
    public static final Class_3779 Field_3796;
    public static final Class_3779 Field_3797;
    public static final Class_3779 Field_3798;
    public static final Class_3779 Field_3799;
    public static final Class_3779 Field_3800;
    public static final Class_3779 Field_3801;
    public static final Class_3779 Field_3802;
    public static final Class_3779 Field_3803;
    public static final Class_3779 Field_3804;
    public static final Class_3779 Field_3805;
    public static final Class_3779 Field_3806;
    public static final Class_3779 Field_3807;
    public static final Class_3779 Field_3808;
    public static final Class_3779 Field_3809;
    public static final Class_3779 Field_3810;
    public static final Class_3779 Field_3811;
    public int Field_3812;
    public static final Class_3779 Field_3813;
    public static final Class_3779 Field_3814;
    public static final Class_3779 Field_3815;
    public static final Class_3779 Field_3816;
    public static final Class_3779 Field_3817;
    public static final Class_3779 Field_3818;

    static {
        Field_3795 = new Class_3779[19008 & 66];
        Field_3807 = new Class_3779(10240 & 21124, 19062 & -24440);
        Field_3803 = new Class_3779(-30463 & 1673, 545240760 & 16757304);
        Field_3783 = new Class_3779(-15734 & 1367, 301459939 & 116916155);
        Field_3786 = new Class_3779(-29637 & 771, -1848121353 & 1825032135);
        Field_3789 = new Class_3779(11431 & -28148, 50268176 & 1895780802);
        Field_3814 = new Class_3779(2117 & 28685, -2086487809 & 1219601407);
        Field_3802 = new Class_3779(16942 & -23545, 480751527 & -2085095433);
        Field_3801 = new Class_3779(16471 & -30201, -990 & 31941);
        Field_3816 = new Class_3779(-8824 & 526, 150994943 & 822083583);
        Field_3818 = new Class_3779(-24215 & 4121, 145143994 & 279228152);
        Field_3788 = new Class_3779(12330 & 1354, 1289186639 & 43478893);
        Field_3785 = new Class_3779(-32689 & 5131, 276330352 & 175140977);
        Field_3799 = new Class_3779(25869 & 238, 37912319 & 552714495);
        Field_3804 = new Class_3779(29871 & -30195, -2119207090 & 752842712);
        Field_3796 = new Class_3779(527 & 16750, -503317251 & 352321527);
        Field_3813 = new Class_3779(559 & 335, 1658453875 & -1797750981);
        Field_3781 = new Class_3779(1552 & 10288, 280124668 & 162983384);
        Field_3811 = new Class_3779(18737 & 25, 1147575256 & -2140743208);
        Field_3808 = new Class_3779(-23438 & 19095, 552990515 & 417719735);
        Field_3809 = new Class_3779(1171 & 10515, -2113934307 & 545246267);
        Field_3810 = new Class_3779(596 & 21, -1796046851 & 1140752293);
        Field_3792 = new Class_3779(-30667 & 21, 542961262 & 88890572);
        Field_3780 = new Class_3779(4950 & 8351, 127515033 & 685366173);
        Field_3791 = new Class_3779(3095 & -19785, 961347545 & -1035108423);
        Field_3798 = new Class_3779(18458 & -31463, 41893811 & 637517746);
        Field_3784 = new Class_3779(8793 & 1177, 12274866 & 3362227);
        Field_3817 = new Class_3779(222 & 794, -2123969477 & 1291734259);
        Field_3794 = new Class_3779(8347 & -25249, 1097236275 & -1460240577);
        Field_3790 = new Class_3779(16732 & -32612, -1063274693 & 932805427);
        Field_3805 = new Class_3779(927 & -19427, 4004185 & -1671718599);
        Field_3800 = new Class_3779(-18018 & 63, 285142621 & 788196941);
        Field_3815 = new Class_3779(-26593 & 8895, 140303317 & 301785077);
        Field_3782 = new Class_3779(5793 & 108, -2108783361 & 561677055);
        Field_3787 = new Class_3779(-32725 & 18101, 1244846458 & -1534461638);
        Field_3806 = new Class_3779(28854 & -30877, 113333809 & -793282895);
        Field_3797 = new Class_3779(-28485 & 16419, 208790307 & 586419716);
    }

    private Class_3779(int n, int n2) {
        if (n < 0 || n > (127 & -21441)) {
            throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
        }
        this.Field_3793 = n;
        this.Field_3812 = n2;
        Class_3779.Field_3795[n] = this;
    }

    public int Method_3819(int n) {
        int n2 = 2270 & -15876;
        if (n == (-30697 & 515)) {
            n2 = 8839 & -32297;
        }
        if (n == (38 & 514)) {
            n2 = 28927 & -29953;
        }
        if (n == (8585 & 1029)) {
            n2 = 8668 & 18174;
        }
        if (n == 0) {
            n2 = -21836 & 4342;
        }
        int n3 = (this.Field_3812 >> (16 & 16665) & (18687 & 9215)) * n2 / (-32257 & 24831);
        int n4 = (this.Field_3812 >> (12617 & -15814) & (-24321 & 18687)) * n2 / (16639 & 9983);
        int n5 = (this.Field_3812 & (767 & 8703)) * n2 / (6911 & -31233);
        return -16243706 & -15728607 | n3 << (2205 & 21522) | n4 << (16840 & -22520) | n5;
    }

    private void Method_3820() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

