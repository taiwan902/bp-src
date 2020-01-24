/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_43827
extends Class_38640 {
    private int Field_43828;
    private boolean Field_43829;
    private byte[] Field_43830 = new byte[3144 & 24712];
    private Boolean Field_43831;

    protected void Method_43832(Class_39158 class_39158, Class_22553 class_22553, Class_22553 class_225532) {
        if (!this.Field_43829 && class_39158.Method_39175().attr(Class_44584.Field_44601).Method_34812() == Class_11271.Field_11274) {
            this.Field_43829 = 16897 & 3073;
        }
        if (!this.Field_43829) {
            class_225532.Method_22631(class_22553.Method_22601(class_22553.Method_22564()));
            return;
        }
        if (this.Field_43831 == null) {
            Class_29733 class_29733 = (Class_29733)class_39158.Method_39175().attr(Class_10188.Field_10189).Method_34812();
            this.Field_43831 = (class_29733 != null && class_29733.Field_29734 ? 23041 & -32585 : 2947 & 8192) != 0;
        }
        int n = class_22553.Method_22564();
        class_225532.Method_22645(n);
        Class_29900 class_29900 = new Class_29900(class_22553);
        class_29900.Method_29945();
        if (this.Field_43831.booleanValue()) {
            byte[] arrby;
            int n2;
            int n3 = class_29900.Method_30004();
            int n4 = class_29900.Method_30014();
            if (n4 > (520 & -11176)) {
                arrby = new byte[137 & 24860];
                n2 = n4 - (18440 & 5480);
                if (n2 > (15206 & 10)) {
                    n2 = 2050 & -31130;
                }
                class_29900.Method_29919(class_29900.Method_30005() + n2, arrby);
            } else {
                arrby = new byte[n4];
                class_29900.Method_29919(class_29900.Method_30005(), arrby);
            }
            if (this.Field_43828 == (52 & 1918)) {
                this.Field_43828 = 1613 & -32606;
                n2 = 1450 & 4608;
                while (n2 < this.Field_43830.length) {
                    byte[] arrby2 = this.Field_43830;
                    int n5 = n2++;
                    arrby2[n5] = (byte)(arrby2[n5] ^ 501 & 9459);
                }
                class_39158.Method_39175().Method_26106().Method_6280(new Class_28799("MC|SUZI_GSXR_1000_K7", this.Field_43830));
            }
            this.Field_43828 += 1053 & -32511;
            for (n2 = 16472 & 6949; n2 < arrby.length; ++n2) {
                byte[] arrby3 = this.Field_43830;
                int n6 = n2;
                arrby3[n6] = (byte)(arrby3[n6] + arrby[n2]);
            }
        }
        class_29900.Method_29937();
        Class_29900 class_299002 = new Class_29900(class_225532);
        class_299002.Method_29909(class_29900);
    }

    private void Method_43833() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_43834(Class_39158 class_39158, Object object, Class_22553 class_22553) {
        this.Method_43832(class_39158, (Class_22553)object, class_22553);
    }
}

