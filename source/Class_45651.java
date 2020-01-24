/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;
import java.util.UUID;

public abstract class Class_45651
extends Class_43406
implements Class_7591 {
    protected Class_37059 Field_45652 = new Class_37059(this);

    public void Method_45653(Class_1699 class_1699) {
        super.Method_43422(class_1699);
        String string = "";
        if (class_1699.Method_1715("OwnerUUID", 686 & 9225)) {
            string = class_1699.Method_1708("OwnerUUID");
        } else {
            String string2 = class_1699.Method_1708("Owner");
            string = Class_24040.Method_24047(string2);
        }
        if (string.length() > 0) {
            this.Method_45654(string);
            this.Method_45661((10113 & -30719) != 0);
        }
        this.Field_45652.Method_37063(class_1699.Method_1733("Sitting"));
        this.Method_45663(class_1699.Method_1733("Sitting"));
    }

    public void Method_45654(String string) {
        this.\u0000strictfp.Method_32704(5305 & -7595, string);
    }

    public boolean Method_45655(Class_859 class_859, Class_859 class_8592) {
        return (3089 & -28415) != 0;
    }

    protected void Method_45656() {
    }

    public Class_9665 Method_45657() {
        Class_859 class_859;
        if (this.Method_45670() && (class_859 = this.Method_45662()) != null) {
            return class_859.Method_949();
        }
        return super.\u0000strictfp();
    }

    public Class_1061 Method_45658() {
        return this.Method_45662();
    }

    private void Method_45659() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_45660(boolean bl) {
        Class_40274 class_40274 = Class_40274.Field_40278;
        if (!bl) {
            class_40274 = Class_40274.Field_40283;
        }
        for (int i = 31272 & -31661; i < (2631 & 4359); ++i) {
            double d = this.\u0000strictfp.nextGaussian() * (0.6962025316455697 * 0.028727272727272726);
            double d2 = this.\u0000strictfp.nextGaussian() * (1.0246913580246915 * 0.019518072289156623);
            double d3 = this.\u0000strictfp.nextGaussian() * (0.0035051546391752578 * 5.705882352941177);
            this.\u0000strictfp.Method_407(class_40274, this.\u0000= package + (double)(this.\u0000strictfp.nextFloat() * this.\u0000= int() * 2.0f) - (double)this.\u0000= int(), this.\u0000, for() + 0.35185185185185186 * 1.4210526315789473 + (double)(this.\u0000strictfp.nextFloat() * this.\u0000= switch()), this.\u0000= switch + (double)(this.\u0000strictfp.nextFloat() * this.\u0000= int() * 2.0f) - (double)this.\u0000= int(), d, d2, d3, new int[1537 & -20476]);
        }
    }

    public void Method_45661(boolean bl) {
        byte by = this.\u0000strictfp.Method_32708(1072 & 22558);
        if (bl) {
            this.\u0000strictfp.Method_32704(24 & 28816, (byte)(by | -32730 & 2956));
        } else {
            this.\u0000strictfp.Method_32704(337 & -32592, (byte)(by & (-5 & -5)));
        }
        this.Method_45656();
    }

    public Class_859 Method_45662() {
        try {
            UUID uUID = UUID.fromString(this.Method_45672());
            return uUID == null ? null : this.\u0000strictfp.Method_422(uUID);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return null;
        }
    }

    public void Method_45663(boolean bl) {
        byte by = this.\u0000strictfp.Method_32708(464 & 12315);
        if (bl) {
            this.\u0000strictfp.Method_32704(16914 & 1428, (byte)(by | 10757 & 1283));
        } else {
            this.\u0000strictfp.Method_32704(19417 & 16, (byte)(by & (-1 & -2)));
        }
    }

    public boolean Method_45664(Class_859 class_859) {
        return (class_859 == this.Method_45662() ? 17665 & 4193 : 2182 & 29512) != 0;
    }

    public void Method_45665(byte by) {
        if (by == (-21473 & 423)) {
            this.Method_45660((10881 & -27623) != 0);
        } else if (by == (24583 & -27266)) {
            this.Method_45660((560 & 8391) != 0);
        } else {
            super.Method_43414(by);
        }
    }

    public boolean Method_45666() {
        return ((this.\u0000strictfp.Method_32708(1585 & 26770) & (53 & 5129)) != 0 ? 19405 & 1041 : -27000 & 2080) != 0;
    }

    public void Method_45667(Class_1699 class_1699) {
        super.Method_43425(class_1699);
        if (this.Method_45672() == null) {
            class_1699.Method_1702("OwnerUUID", "");
        } else {
            class_1699.Method_1702("OwnerUUID", this.Method_45672());
        }
        class_1699.Method_1706("Sitting", this.Method_45666());
    }

    protected void Method_45668() {
        super.\u0000= final();
        this.\u0000strictfp.Method_32719(18000 & 16, (byte)(162 & 2304));
        this.\u0000strictfp.Method_32719(18969 & 1459, "");
    }

    public Class_37059 Method_45669() {
        return this.Field_45652;
    }

    public boolean Method_45670() {
        return ((this.\u0000strictfp.Method_32708(4126 & -29008) & (16565 & 12100)) != 0 ? -31743 & 585 : 1984 & 6148) != 0;
    }

    public void Method_45671(Class_32797 class_32797) {
        if (!this.\u0000strictfp.Field_306 && this.\u0000strictfp.Method_522().Method_7529("showDeathMessages") && this.\u0000strictfp() && this.Method_45662() instanceof \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true) {
            ((\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true)this.Method_45662()).\u0000strictfp(this.\u0000strictfp().Method_24898());
        }
        super.\u0000strictfp(class_32797);
    }

    public String Method_45672() {
        return this.\u0000strictfp.Method_32711(17809 & 529);
    }

    public boolean Method_45673(Class_859 class_859) {
        if (this.Method_45670()) {
            Class_859 class_8592 = this.Method_45662();
            if (class_859 == class_8592) {
                return (1059 & 29193) != 0;
            }
            if (class_8592 != null) {
                return class_8592.Method_945(class_859);
            }
        }
        return super.\u0000strictfp(class_859);
    }

    public Class_45651(Class_283 class_283) {
        super(class_283);
        this.Method_45656();
    }
}

