/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  tv.twitch.broadcast.IngestServer
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import tv.twitch.broadcast.IngestServer;

public class Class_24743
extends Class_6841 {
    final Class_27103 Field_24744;

    protected int Method_24745() {
        return super.Method_6885() + (2623 & 17615);
    }

    private void Method_24746() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_24747() {
    }

    protected void Method_24748(int n, int n2, int n3, int n4, int n5, int n6) {
        IngestServer ingestServer = this.\u0000, `.Method_242().Method_1829()[n];
        String string = ingestServer.serverUrl.replaceAll("\\{stream_key\\}", "");
        String string2 = (int)ingestServer.bitrateKbps + " kbps";
        String string3 = null;
        Class_36089 class_36089 = this.\u0000, `.Method_242().Method_1842();
        if (class_36089 != null) {
            if (ingestServer == class_36089.Method_36120()) {
                string = (Object)((Object)Class_5478.Field_5497) + string;
                string2 = (int)(class_36089.Method_36118() * (98.96908f * 1.0104166f)) + "%";
            } else if (n < class_36089.Method_36123()) {
                if (ingestServer.bitrateKbps == 0.0f) {
                    string2 = (Object)((Object)Class_5478.Field_5505) + "Down!";
                }
            } else {
                string2 = (Object)((Object)Class_5478.Field_5490) + "1234" + (Object)((Object)Class_5478.Field_5507) + " kbps";
            }
        } else if (ingestServer.bitrateKbps == 0.0f) {
            string2 = (Object)((Object)Class_5478.Field_5505) + "Down!";
        }
        n2 -= 1039 & 2639;
        if (this.Method_24751(n)) {
            string3 = (Object)((Object)Class_5478.Field_5498) + "(Preferred)";
        } else if (ingestServer.defaultServer) {
            string3 = (Object)((Object)Class_5478.Field_5497) + "(Default)";
        }
        this.Field_24744.\u0000, `(Class_27103.Method_27112(this.Field_24744), ingestServer.serverName, n2 + (10274 & 1103), n3 + (-23931 & 17413), 50331647 & -1577058305);
        Class_27103.Method_27107(this.Field_24744);
        this.Field_24744.\u0000, `(Class_27103.Method_27114(this.Field_24744), string, n2 + (-20474 & 3850), n3 + (5641 & -6067) + (-7145 & 4613) + (-16233 & 11), 154251697 & 1618244144);
        this.Field_24744.\u0000, `(Class_27103.Method_27108(this.Field_24744), string2, this.Method_24745() - (4685 & -30587) - Class_27103.Method_27120(this.Field_24744).Method_28715(string2), n3 + (1189 & 23), 549495939 & -1702264704);
        if (string3 != null) {
            Class_27103.Method_27115(this.Field_24744);
            this.Field_24744.\u0000, `(Class_27103.Method_27110(this.Field_24744), string3, this.Method_24745() - (27015 & 13) - Class_27103.Method_27118(this.Field_24744).Method_28715(string3), n3 + (25119 & 229) + (79 & 12563) + (8603 & -12759), -2138922873 & 612421768);
        }
    }

    protected int Method_24749() {
        return this.\u0000, `.Method_242().Method_1829().length;
    }

    protected void Method_24750(int n, boolean bl, int n2, int n3) {
        this.\u0000, `.Field_84.Field_39777 = this.\u0000, `.Method_242().Method_1829()[n].serverUrl;
        this.\u0000, `.Field_84.Method_39903();
    }

    public Class_24743(Class_27103 class_27103, Class_18 class_18) {
        this.Field_24744 = class_27103;
        super(class_18, class_27103.\u0000= final, class_27103.\u0000, `, 17249 & -31698, class_27103.\u0000, ` - (-5597 & 4131), (int)(0.5116279069767442 * 17.59090909090909 * (0.05263157894736842 * 66.5)));
        this.\u0000= final((-31599 & 28996) != 0);
    }

    protected boolean Method_24751(int n) {
        return this.\u0000, `.Method_242().Method_1829()[n].serverUrl.equals(this.\u0000, `.Field_84.Field_39777);
    }
}

