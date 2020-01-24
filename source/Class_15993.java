/*
 * Decompiled with CFR 0.145.
 */
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.awt.image.DataBufferInt;
import java.awt.image.ImageObserver;
import java.awt.image.WritableRaster;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_15993
implements Class_7057 {
    private int[] Field_15994;
    private int Field_15995;
    private int Field_15996;

    private void Method_15997() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public BufferedImage Method_15998(BufferedImage bufferedImage) {
        if (bufferedImage == null) {
            return null;
        }
        this.Field_15995 = -24511 & 19056;
        this.Field_15996 = 9540 & 4162;
        int n = bufferedImage.getWidth();
        int n2 = bufferedImage.getHeight();
        int n3 = 65 & -30077;
        while (this.Field_15995 < n || this.Field_15996 < n2) {
            this.Field_15995 *= 1595 & 2114;
            this.Field_15996 *= 4098 & 1538;
            n3 *= 2 & 20994;
        }
        BufferedImage bufferedImage2 = new BufferedImage(this.Field_15995, this.Field_15996, 7 & 15010);
        Graphics graphics = bufferedImage2.getGraphics();
        graphics.drawImage(bufferedImage, 8391 & 16384, 9445 & 4864, null);
        if (bufferedImage.getHeight() == (112 & 22563) * n3) {
            graphics.drawImage(bufferedImage2, (-32680 & 410) * n3, (124 & 2482) * n3, (-30444 & 8924) * n3, (181 & 630) * n3, (548 & 22871) * n3, (8410 & 16688) * n3, (10906 & 4136) * n3, (2236 & -16043) * n3, null);
            graphics.drawImage(bufferedImage2, (62 & 1628) * n3, (-20815 & 4212) * n3, (8762 & -31272) * n3, (-24524 & 62) * n3, (4360 & 1032) * n3, (13841 & 16658) * n3, (8460 & -28657) * n3, (2589 & -23210) * n3, null);
            graphics.drawImage(bufferedImage2, (20 & -26025) * n3, (-22988 & 20980) * n3, (4434 & 188) * n3, (-16320 & 102) * n3, (10920 & 5389) * n3, (4692 & 18719) * n3, (2078 & 8460) * n3, (4448 & 1185) * n3, null);
            graphics.drawImage(bufferedImage2, (154 & 5657) * n3, (8309 & -12236) * n3, (11063 & -12268) * n3, (2115 & -32440) * n3, (-3836 & 13) * n3, (279 & 8860) * n3, (-26580 & 281) * n3, (-24544 & 1326) * n3, null);
            graphics.drawImage(bufferedImage2, (95 & -3428) * n3, (8252 & 2613) * n3, (17469 & 4248) * n3, (24776 & 358) * n3, (-32672 & 0) * n3, (-19084 & 2069) * n3, (-32764 & 21317) * n3, (-32735 & 24946) * n3, null);
            graphics.drawImage(bufferedImage2, (2084 & -28552) * n3, (1076 & 822) * n3, (1692 & 2335) * n3, (3396 & -19744) * n3, (9884 & -16369) * n3, (24759 & 84) * n3, (4248 & -23503) * n3, (-28632 & 1141) * n3, null);
            graphics.drawImage(bufferedImage2, (2280 & 17464) * n3, (626 & 6324) * n3, (17588 & 8551) * n3, (8886 & -29644) * n3, (5230 & -16339) * n3, (2512 & 8208) * n3, (14640 & 18096) * n3, (-30860 & 6173) * n3, null);
            graphics.drawImage(bufferedImage2, (125 & 2220) * n3, (18864 & -31688) * n3, (25656 & 4136) * n3, (52 & -21068) * n3, (2165 & 8368) * n3, (10257 & -28234) * n3, (16956 & 244) * n3, (-14316 & 150) * n3, null);
            graphics.drawImage(bufferedImage2, (37 & 12332) * n3, (9269 & 19326) * n3, (24880 & 4256) * n3, (14560 & 348) * n3, (4154 & 116) * n3, (-28459 & 1302) * n3, (16500 & 572) * n3, (37 & -2462) * n3, null);
            graphics.drawImage(bufferedImage2, (-22472 & 42) * n3, (180 & 4149) * n3, (20772 & 8318) * n3, (5446 & 209) * n3, (25148 & 4268) * n3, (-29508 & 12308) * n3, (-27984 & 2353) * n3, (-21919 & 288) * n3, null);
            graphics.drawImage(bufferedImage2, (2428 & -24532) * n3, (24821 & 2356) * n3, (17193 & -28612) * n3, (360 & 18497) * n3, (4200 & 45) * n3, (20500 & 10582) * n3, (1663 & 20908) * n3, (8298 & 20641) * n3, null);
            graphics.drawImage(bufferedImage2, (58 & 7217) * n3, (63 & 29044) * n3, (1196 & -8146) * n3, (338 & 4292) * n3, (-16266 & 14524) * n3, (-32356 & 86) * n3, (2488 & 9336) * n3, (16428 & 4144) * n3, null);
        }
        graphics.dispose();
        this.Field_15994 = ((DataBufferInt)bufferedImage2.getRaster().getDataBuffer()).getData();
        this.Method_15999(10241 & 17952, 2113 & -15232, (19124 & -32664) * n3, (23546 & 8209) * n3);
        this.Method_16000((2658 & 20529) * n3, 16648 & 14466, (-18344 & 192) * n3, (15520 & -16071) * n3);
        this.Method_15999(66 & -7679, (-31469 & 24728) * n3, (2112 & 9328) * n3, (41 & 17008) * n3);
        this.Method_16000(-30460 & 16384, (28728 & -32544) * n3, (22608 & 1684) * n3, (3702 & -3664) * n3);
        this.Method_16000((-27246 & 17) * n3, (27180 & 5281) * n3, (-13700 & 4393) * n3, (28720 & 1328) * n3);
        this.Method_16000((701 & 1320) * n3, (-20127 & 17066) * n3, (3258 & 8248) * n3, (4913 & 190) * n3);
        this.Method_16000(-10208 & 1026, (12336 & 2097) * n3, (-22511 & 124) * n3, (-16182 & 3153) * n3);
        this.Method_15999((88 & -23630) * n3, (8377 & 7284) * n3, (-15688 & 372) * n3, (192 & 3924) * n3);
        this.Method_16000((3194 & -31823) * n3, (561 & -14150) * n3, (-17852 & 16706) * n3, (5344 & 857) * n3);
        return bufferedImage2;
    }

    private void Method_15999(int n, int n2, int n3, int n4) {
        for (int i = n; i < n3; ++i) {
            for (int j = n2; j < n4; ++j) {
                int[] arrn = this.Field_15994;
                int n5 = i + j * this.Field_15995;
                arrn[n5] = arrn[n5] | -8107256 & -15687552;
            }
        }
    }

    private void Method_16000(int n, int n2, int n3, int n4) {
        if (!this.Method_16001(n, n2, n3, n4)) {
            for (int i = n; i < n3; ++i) {
                for (int j = n2; j < n4; ++j) {
                    int[] arrn = this.Field_15994;
                    int n5 = i + j * this.Field_15995;
                    arrn[n5] = arrn[n5] & (285212671 & -1979711489);
                }
            }
        }
    }

    private boolean Method_16001(int n, int n2, int n3, int n4) {
        for (int i = n; i < n3; ++i) {
            for (int j = n2; j < n4; ++j) {
                int n5 = this.Field_15994[i + j * this.Field_15995];
                if ((n5 >> (14942 & 281) & (13311 & 18687)) >= (24704 & 1512)) continue;
                return (417 & -5031) != 0;
            }
        }
        return (6212 & -32639) != 0;
    }

    public void Method_16002() {
    }
}

