/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_17897
extends Class_1490 {
    private Class_42376 Field_17898;
    private final Class_1490 Field_17899;
    private String Field_17900 = "survival";
    private boolean Field_17901;
    private Class_42376 Field_17902;

    private void Method_17903() {
        this.Field_17898.Field_42381 = Class_9802.Method_9806("selectWorld.gameMode", new Object[16394 & 1745]) + " " + Class_9802.Method_9806("selectWorld.gameMode." + this.Field_17900, new Object[16677 & -19824]);
        this.Field_17902.Field_42381 = Class_9802.Method_9806("selectWorld.allowCommands", new Object[9512 & 515]) + " ";
        this.Field_17902.Field_42381 = this.Field_17901 ? this.Field_17902.Field_42381 + Class_9802.Method_9806("options.on", new Object[-32664 & 1284]) : this.Field_17902.Field_42381 + Class_9802.Method_9806("options.off", new Object[9360 & -32767]);
    }

    private void Method_17904() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_17905() {
        this.\u0000strictfp.clear();
        this.\u0000strictfp.add(new Class_42376(30309 & 357, this.\u0000= final / (-14142 & 8967) - (14779 & 159), this.\u0000, ` - (190 & -6883), 16542 & -30313, -6634 & 4565, Class_9802.Method_9806("lanServer.start", new Object[672 & -32753])));
        this.\u0000strictfp.add(new Class_42376(4198 & -12930, this.\u0000= final / (2194 & 24835) + (837 & 13), this.\u0000, ` - (9788 & 18718), 22743 & 8630, 16406 & 8668, Class_9802.Method_9806("gui.cancel", new Object[8528 & 16928])));
        this.Field_17898 = new Class_42376(2792 & -7826, this.\u0000= final / (-6134 & 1030) - (155 & 475), 9206 & -31644, 4246 & -15393, 6940 & -7947, Class_9802.Method_9806("selectWorld.gameMode", new Object[-6080 & 2]));
        this.\u0000strictfp.add(this.Field_17898);
        this.Field_17902 = new Class_42376(119 & 2407, this.\u0000= final / (16518 & -30694) + (-23995 & 3509), 4468 & 8429, 919 & 190, 3156 & 30, Class_9802.Method_9806("selectWorld.allowCommands", new Object[271 & 9408]));
        this.\u0000strictfp.add(this.Field_17902);
        this.Method_17903();
    }

    protected void Method_17906(Class_42376 class_42376) {
        if (class_42376.Field_42392 == (16502 & 5350)) {
            this.\u0000strictfp.Method_218(this.Field_17899);
        } else if (class_42376.Field_42392 == (-24712 & 108)) {
            this.Field_17900 = this.Field_17900.equals("spectator") ? "creative" : (this.Field_17900.equals("creative") ? "adventure" : (this.Field_17900.equals("adventure") ? "survival" : "spectator"));
            this.Method_17903();
        } else if (class_42376.Field_42392 == (9575 & -16257)) {
            this.Field_17901 = !this.Field_17901 ? 29763 & 2337 : 18723 & 5124;
            this.Method_17903();
        } else if (class_42376.Field_42392 == (-20379 & 17647)) {
            Class_2824 class_2824;
            this.\u0000strictfp.Method_218(null);
            String string = this.\u0000strictfp.Method_180().Method_3033(Class_35650.Method_35674(this.Field_17900), this.Field_17901);
            if (string != null) {
                Object[] arrobject = new Object[8711 & -32471];
                arrobject[280 & -8153] = string;
                class_2824 = new Class_2849("commands.publish.started", arrobject);
            } else {
                class_2824 = new Class_2840("commands.publish.failed");
            }
            this.\u0000strictfp.Field_105.Method_45458().Method_41188(class_2824);
        }
    }

    public void Method_17907(int n, int n2, float f) {
        this.\u0000, 2();
        this.\u0000strictfp(this.\u0000strictfp, Class_9802.Method_9806("lanServer.title", new Object[-28063 & 16384]), this.\u0000= final / (18770 & 1194), 14650 & 1074, 67108863 & 1358954495);
        this.\u0000strictfp(this.\u0000strictfp, Class_9802.Method_9806("lanServer.otherPlayers", new Object[2352 & 4160]), this.\u0000= final / (67 & -24034), 27250 & -32297, -2113929217 & 587202559);
        super.Method_1545(n, n2, f);
    }

    public Class_17897(Class_1490 class_1490) {
        this.Field_17899 = class_1490;
    }
}

