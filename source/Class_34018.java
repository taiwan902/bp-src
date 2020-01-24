/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.cef.browser.CefBrowserOsr
 */
import java.awt.Component;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import org.cef.browser.CefBrowserOsr;

public class Class_34018 {
    private int Field_34019;
    private Point Field_34020 = new Point(-1 & -1, -1 & -1);
    private boolean Field_34021;
    private long Field_34022 = 33570836L & 441592375486220289L;
    private final int Field_34023;
    private final int Field_34024;
    private final int Field_34025;

    public Class_34018(int n, int n2, int n3) {
        this.Field_34023 = n;
        this.Field_34024 = n2;
        this.Field_34025 = n3;
    }

    public boolean Method_34026(int n, int n2, boolean bl, boolean bl2, long l, int n3) {
        if (this.Field_34021 != bl2) {
            this.Field_34021 = bl2;
            if (bl2) {
                this.Field_34019 = l - this.Field_34022 > (long)this.Field_34024 ? -30205 & 289 : (this.Field_34019 += -30709 & 49);
                this.Field_34020.x = n;
                this.Field_34020.y = n2;
                Class_30724.Field_30732.sendMouseEvent(new MouseEvent(Class_30724.Field_30725, 17909 & -26123, l, this.Field_34025 | n3, n, n2, this.Field_34019, (-31678 & 23444) != 0, this.Field_34023));
                return (3 & 4389) != 0;
            }
            Class_30724.Field_30732.sendMouseEvent(new MouseEvent(Class_30724.Field_30725, 1526 & 8695, l, this.Field_34025 | n3, n, n2, this.Field_34019, (2064 & 16391) != 0, this.Field_34023));
            if (this.Field_34020.x == n && this.Field_34020.y == n2) {
                Class_30724.Field_30732.sendMouseEvent(new MouseEvent(Class_30724.Field_30725, 1524 & -11788, l, this.Field_34025 | n3, n, n2, this.Field_34019, (2320 & 4230) != 0, this.Field_34023));
                this.Field_34022 = l;
            }
            return (8217 & 3749) != 0;
        }
        if (bl) {
            if (bl2) {
                this.Field_34020.x = this.Field_34020.y = -1 & -1;
            } else if (this.Field_34019 > (2577 & 24589)) {
                this.Field_34019 = 19468 & -19949;
            }
        }
        return (-11232 & 8258) != 0;
    }

    private void Method_34027() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

