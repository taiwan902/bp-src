/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SNIHostName;
import javax.net.ssl.SNIServerName;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;

public class Class_43109
extends Class_41947 {
    private boolean Field_43110;
    private String Field_43111;
    private Class_33149 Field_43112;
    private int Field_43113;

    protected void Method_43114(Class_26095 class_26095) {
        class_26095.Method_26106().Method_6279("timeout", new Class_45604(-4127097139532646514L & 1315784L, TimeUnit.MILLISECONDS));
        if (this.Field_43110) {
            SSLContext sSLContext = SSLContext.getDefault();
            SSLEngine sSLEngine = sSLContext.createSSLEngine();
            SSLParameters sSLParameters = new SSLParameters();
            SNIServerName[] arrsNIServerName = new SNIServerName[1561 & 24837];
            arrsNIServerName[-32384 & 3656] = new SNIHostName(this.Field_43111);
            sSLParameters.setServerNames(Arrays.asList(arrsNIServerName));
            sSLEngine.setSSLParameters(sSLParameters);
            sSLEngine.setUseClientMode((-29693 & 13073) != 0);
            class_26095.Method_26106().Method_6279("ssl", new Class_47372(sSLEngine));
        }
        class_26095.Method_26106().Method_6279("http", new Class_45286());
        class_26095.Method_26106().Method_6279("handler", new Class_44326(this.Field_43112));
    }

    public Class_43109(Class_33149 class_33149, boolean bl, String string, int n) {
        this.Field_43112 = class_33149;
        this.Field_43110 = bl;
        this.Field_43111 = string;
        this.Field_43113 = n;
    }

    private void Method_43115() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

