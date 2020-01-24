/*
 * Decompiled with CFR 0.145.
 */
import java.awt.geom.Point2D;
import java.io.Serializable;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_16755
extends Point2D.Double
implements Serializable {
    public Class_16755(Point2D.Double double_) {
        super(double_.x, double_.y);
    }

    public boolean Method_16756(Object object) {
        if (this == object) {
            return (25747 & -30459) != 0;
        }
        if (object == null) {
            return (16944 & 12680) != 0;
        }
        if (!(object instanceof Point2D.Double)) {
            return (386 & 2592) != 0;
        }
        Point2D.Double double_ = (Point2D.Double)object;
        if (Math.abs(this.x - double_.x) > 6.233766233766234E-4 * 1.6041666666666667) {
            return (8736 & 16579) != 0;
        }
        if (Math.abs(this.y - double_.y) > 0.4444444444444444 * 0.0022500000000000003) {
            return (-15786 & 14344) != 0;
        }
        return (-18527 & 16385) != 0;
    }

    public Point2D.Double Method_16757() {
        return new Point2D.Double(this.x, this.y);
    }

    public int Method_16758() {
        int n = -30111 & 8473;
        long l = Double.doubleToLongBits(this.x);
        n = (95 & 287) * n + (int)(l ^ l >>> (25660 & 160));
        l = Double.doubleToLongBits(this.y);
        n = (-31809 & 8223) * n + (int)(l ^ l >>> (4522 & -5020));
        return n;
    }

    public String Method_16759() {
        return "GuiPosition [x=" + this.x + ", y=" + this.y + "]";
    }

    private void Method_16760() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_16755(double d, double d2) {
        super(d, d2);
    }

    public Class_16755() {
    }
}

