/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  internal.org.lwjgl.input.Keyboard
 */
import com.google.common.base.Predicate;
import internal.org.lwjgl.input.Keyboard;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_20150
extends Class_1490 {
    private Class_38813 Field_20151;
    private final Class_15474 Field_20152;
    private final Class_1490 Field_20153;
    private Class_38813 Field_20154;
    private Predicate Field_20155 = new Class_26193(this);
    private Class_42376 Field_20156;

    protected void Method_20157(char c, int n) {
        this.Field_20151.Method_38854(c, n);
        this.Field_20154.Method_38854(c, n);
        if (n == (4479 & 1551)) {
            this.Field_20151.Method_38858((!this.Field_20151.Method_38861() ? 129 & 4867 : 1121 & 386) != 0);
            this.Field_20154.Method_38858((!this.Field_20154.Method_38861() ? 19521 & 649 : 97 & 770) != 0);
        }
        if (n == (157 & 3100) || n == (9372 & 2268)) {
            this.Method_20161((Class_42376)this.\u0000strictfp.get(8292 & 18696));
        }
        ((Class_42376)this.\u0000strictfp.get((int)(16421 & 4608))).Field_42388 = this.Field_20154.Method_38848().length() > 0 && this.Field_20154.Method_38848().split(":").length > 0 && this.Field_20151.Method_38848().length() > 0 ? -12287 & 581 : -30715 & 25666;
    }

    public void Method_20158(int n, int n2, float f) {
        this.\u0000, 2();
        this.\u0000strictfp(this.\u0000strictfp, Class_9802.Method_9806("addServer.title", new Object[-32487 & 4676]), this.\u0000= final / (-8101 & 2082), 2577 & 8285, -1979711489 & 587202559);
        this.\u0000, `(this.\u0000strictfp, Class_9802.Method_9806("addServer.enterName", new Object[89 & 7460]), this.\u0000= final / (98 & -10238) - (2157 & 356), 53 & 63, 283160802 & 11266232);
        this.\u0000, `(this.\u0000strictfp, Class_9802.Method_9806("addServer.enterIp", new Object[2705 & 24652]), this.\u0000= final / (-30714 & 5987) - (4212 & 10983), -6050 & 126, 383889592 & 1235411426);
        this.Field_20151.Method_38849();
        this.Field_20154.Method_38849();
        super.Method_1545(n, n2, f);
    }

    public Class_20150(Class_1490 class_1490, Class_15474 class_15474) {
        this.Field_20153 = class_1490;
        this.Field_20152 = class_15474;
    }

    private void Method_20159() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_20160() {
        Keyboard.enableRepeatEvents((16912 & -19188) != 0);
    }

    protected void Method_20161(Class_42376 class_42376) {
        if (class_42376.Field_42388) {
            if (class_42376.Field_42392 == (10770 & -28277)) {
                this.Field_20152.Method_15497(Class_17874.Method_17887()[(this.Field_20152.Method_15502().ordinal() + (18465 & -32685)) % Class_17874.Method_17887().length]);
                this.Field_20156.Field_42381 = Class_9802.Method_9806("addServer.resourcePack", new Object[9290 & 17201]) + ": " + this.Field_20152.Method_15502().Method_17888().Method_1783();
            } else if (class_42376.Field_42392 == (12293 & 217)) {
                this.Field_20153.Method_1529((8448 & -30655) != 0, 11876 & 155);
            } else if (class_42376.Field_42392 == 0) {
                this.Field_20152.Field_15482 = this.Field_20151.Method_38848();
                this.Field_20152.Field_15484 = this.Field_20154.Method_38848();
                this.Field_20153.Method_1529((18449 & 291) != 0, 902 & 17409);
            }
        }
    }

    protected void Method_20162(int n, int n2, int n3) {
        super.Method_1537(n, n2, n3);
        this.Field_20154.Method_38855(n, n2, n3);
        this.Field_20151.Method_38855(n, n2, n3);
    }

    public void Method_20163() {
        Keyboard.enableRepeatEvents((353 & -30589) != 0);
        this.\u0000strictfp.clear();
        this.\u0000strictfp.add(new Class_42376(261 & -32518, this.\u0000= final / (18434 & -32766) - (-28570 & 28524), this.\u0000, ` / (21516 & 2165) + (3188 & 353) + (6707 & 16670), Class_9802.Method_9806("addServer.add", new Object[8244 & 7296])));
        this.\u0000strictfp.add(new Class_42376(1345 & 24591, this.\u0000= final / (658 & 8194) - (868 & 4199), this.\u0000, ` / (-10234 & 8244) + (765 & 376) + (-15173 & 530), Class_9802.Method_9806("gui.cancel", new Object[-30693 & 1056])));
        this.Field_20156 = new Class_42376(-32630 & 27398, this.\u0000= final / (-32221 & 2054) - (124 & -32281), this.\u0000, ` / (10580 & 21510) + (8648 & 79), Class_9802.Method_9806("addServer.resourcePack", new Object[17976 & 4485]) + ": " + this.Field_20152.Method_15502().Method_17888().Method_1783());
        this.\u0000strictfp.add(this.Field_20156);
        this.Field_20151 = new Class_38813(4804 & 304, this.\u0000strictfp, this.\u0000= final / (28938 & 1043) - (-32538 & 16500), 30810 & 967, 10440 & 456, 2198 & -23468);
        this.Field_20151.Method_38858((27705 & -32507) != 0);
        this.Field_20151.Method_38853(this.Field_20152.Field_15482);
        this.Field_20154 = new Class_38813(16899 & 1185, this.\u0000strictfp, this.\u0000= final / (8226 & 18454) - (8933 & 16510), 3178 & -28181, 2280 & -31799, 276 & 4701);
        this.Field_20154.Method_38859(151 & 18880);
        this.Field_20154.Method_38853(this.Field_20152.Field_15484);
        this.Field_20154.Method_38844(this.Field_20155);
        ((Class_42376)this.\u0000strictfp.get((int)(4096 & 936))).Field_42388 = this.Field_20154.Method_38848().length() > 0 && this.Field_20154.Method_38848().split(":").length > 0 && this.Field_20151.Method_38848().length() > 0 ? -14323 & 4817 : 2306 & 12809;
    }

    public void Method_20164() {
        this.Field_20151.Method_38847();
        this.Field_20154.Method_38847();
    }
}

