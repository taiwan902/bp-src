/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.input.Keyboard
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import internal.org.lwjgl.input.Keyboard;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_19842
extends Class_1490 {
    private boolean Field_19843;
    private static final Logger Field_19844 = LogManager.getLogger();
    private Class_42376 Field_19845;
    private final Class_35869 Field_19846;
    private Class_42376 Field_19847;
    private Class_38813 Field_19848;
    private Class_38813 Field_19849;
    private Class_42376 Field_19850;

    public void Method_19851() {
        this.Field_19848.Method_38847();
    }

    protected void Method_19852(int n, int n2, int n3) {
        super.Method_1537(n, n2, n3);
        this.Field_19848.Method_38855(n, n2, n3);
        this.Field_19849.Method_38855(n, n2, n3);
    }

    protected void Method_19853(char c, int n) {
        this.Field_19848.Method_38854(c, n);
        this.Field_19849.Method_38854(c, n);
        this.Field_19845.Field_42388 = this.Field_19848.Method_38848().trim().length() > 0 ? 22537 & 1761 : 6280 & -32672;
        int n2 = this.Field_19845.Field_42388 ? 1 : 0;
        if (n != (637 & 1052) && n != (31902 & -32356)) {
            if (n == (12313 & 385)) {
                this.Method_19854(this.Field_19847);
            }
        } else {
            this.Method_19854(this.Field_19845);
        }
    }

    protected void Method_19854(Class_42376 class_42376) {
        if (class_42376.Field_42388) {
            if (class_42376.Field_42392 == (-31741 & 26657)) {
                this.Field_19846.Method_35890(this.Field_19843);
                this.\u0000strictfp.Method_218(null);
            } else if (class_42376.Field_42392 == 0) {
                Class_29900 class_29900 = new Class_29900(Class_16620.Method_16633());
                class_29900.Method_29949(this.Field_19846.Method_35900());
                this.Field_19846.Method_35879(class_29900);
                class_29900.Method_29960(this.Field_19848.Method_38848());
                class_29900.Method_29980(this.Field_19846.Method_35884());
                this.\u0000strictfp.Method_271().Method_20245(new Class_28799("MC|AdvCdm", class_29900));
                if (!this.Field_19846.Method_35884()) {
                    this.Field_19846.Method_35887(null);
                }
                this.\u0000strictfp.Method_218(null);
            } else if (class_42376.Field_42392 == (868 & 16398)) {
                this.Field_19846.Method_35890((!this.Field_19846.Method_35884() ? -22719 & 16421 : 6161 & -16376) != 0);
                this.Method_19856();
            }
        }
    }

    public void Method_19855(int n, int n2, float f) {
        this.\u0000, 2();
        this.\u0000strictfp(this.\u0000strictfp, Class_9802.Method_9806("advMode.setCommand", new Object[164 & 12611]), this.\u0000= final / (4326 & -32510), 2772 & 13628, 1090519039 & 134217727);
        this.\u0000, `(this.\u0000strictfp, Class_9802.Method_9806("advMode.command", new Object[-10419 & 0]), this.\u0000= final / (1058 & 4227) - (6103 & 18582), 2085 & 375, 1190700209 & 10860776);
        this.Field_19848.Method_38849();
        int n3 = -32405 & 18635;
        int n4 = 561 & 4;
        int n5 = n4++;
        this.\u0000, `(this.\u0000strictfp, Class_9802.Method_9806("advMode.nearestPlayer", new Object[-27646 & 96]), this.\u0000= final / (8499 & 1026) - (-24361 & 4254), n3 + n5 * (17417 & 8473), 749777065 & 27451556);
        int n6 = n4++;
        this.\u0000, `(this.\u0000strictfp, Class_9802.Method_9806("advMode.randomPlayer", new Object[9632 & 514]), this.\u0000= final / (1422 & -4014) - (502 & 31894), n3 + n6 * (3357 & 12969), -1847335198 & 146579617);
        int n7 = n4++;
        this.\u0000, `(this.\u0000strictfp, Class_9802.Method_9806("advMode.allPlayers", new Object[2049 & -7168]), this.\u0000= final / (-9854 & 8811) - (4278 & 16791), n3 + n7 * (4201 & -22519), 48472480 & 1303421113);
        int n8 = n4++;
        this.\u0000, `(this.\u0000strictfp, Class_9802.Method_9806("advMode.allEntities", new Object[-30716 & 737]), this.\u0000= final / (16391 & 138) - (7327 & 918), n3 + n8 * (24585 & 395), 14726050 & -1045846872);
        int n9 = n4++;
        this.\u0000, `(this.\u0000strictfp, "", this.\u0000= final / (12731 & -16382) - (-27498 & 694), n3 + n9 * (2105 & 589), 217687272 & -2103383136);
        if (this.Field_19849.Method_38848().length() > 0) {
            n3 = n3 + n4 * (13757 & 75) + (-32679 & 22164);
            this.\u0000, `(this.\u0000strictfp, Class_9802.Method_9806("advMode.previousOutput", new Object[10824 & 261]), this.\u0000= final / (22550 & -32662) - (-26410 & 16791), n3, -1599557468 & 10742944);
            this.Field_19849.Method_38849();
        }
        super.Method_1545(n, n2, f);
    }

    private void Method_19856() {
        if (this.Field_19846.Method_35884()) {
            this.Field_19850.Field_42381 = "O";
            if (this.Field_19846.Method_35898() != null) {
                this.Field_19849.Method_38853(this.Field_19846.Method_35898().Method_1788());
            }
        } else {
            this.Field_19850.Field_42381 = "X";
            this.Field_19849.Method_38853("-");
        }
    }

    private void Method_19857() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_19842(Class_35869 class_35869) {
        this.Field_19846 = class_35869;
    }

    public void Method_19858() {
        Keyboard.enableRepeatEvents((2053 & 29706) != 0);
    }

    public void Method_19859() {
        Keyboard.enableRepeatEvents((11265 & 583) != 0);
        this.\u0000strictfp.clear();
        this.Field_19845 = new Class_42376(1033 & -7678, this.\u0000= final / (15622 & 16410) - (4 & -8892) - (222 & 29334), this.\u0000, ` / (3085 & -28460) + (9848 & -14215) + (9484 & 21005), 6326 & 158, 532 & 24629, Class_9802.Method_9806("gui.done", new Object[-23995 & 4130]));
        this.\u0000strictfp.add(this.Field_19845);
        this.Field_19847 = new Class_42376(16637 & -30461, this.\u0000= final / (-23037 & 22546) + (10556 & 17924), this.\u0000, ` / (24580 & -32354) + (121 & -32648) + (-31604 & 6189), 19927 & 670, 16412 & 4404, Class_9802.Method_9806("gui.cancel", new Object[29729 & 130]));
        this.\u0000strictfp.add(this.Field_19847);
        this.Field_19850 = new Class_42376(8236 & 17604, this.\u0000= final / (327 & 19986) + (-30562 & 9367) - (20 & 6877), -29737 & 20630, -19212 & 2588, -32491 & 13332, "O");
        this.\u0000strictfp.add(this.Field_19850);
        this.Field_19848 = new Class_38813(8274 & 1163, this.\u0000strictfp, this.\u0000= final / (16946 & 6530) - (158 & 18358), -32654 & 7218, 1836 & -16068, -14316 & 5948);
        this.Field_19848.Method_38859(-1 & 32767);
        this.Field_19848.Method_38858((18705 & 9225) != 0);
        this.Field_19848.Method_38853(this.Field_19846.Method_35888());
        this.Field_19849 = new Class_38813(16403 & 8619, this.\u0000strictfp, this.\u0000= final / (21122 & 2082) - (24726 & 5270), 26838 & 190, -31308 & 24917, 6300 & -32745);
        this.Field_19849.Method_38859(32767 & -1);
        this.Field_19849.Method_38862((-27998 & 24840) != 0);
        this.Field_19849.Method_38853("-");
        this.Field_19843 = this.Field_19846.Method_35884();
        this.Method_19856();
        this.Field_19845.Field_42388 = this.Field_19848.Method_38848().trim().length() > 0 ? 6181 & -6397 : 2628 & 8224;
    }
}

