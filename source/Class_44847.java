/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SNIHostName;
import javax.net.ssl.SNIServerName;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;

public class Class_44847
extends Class_41947 {
    final Class_15266 Field_44848;

    private void Method_44849() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_44847(Class_15266 class_15266) {
        this.Field_44848 = class_15266;
    }

    protected void Method_44850(Class_43291 class_43291) {
        Class_24595.Method_24650(this.Field_44848.Field_15268, class_43291.eventLoop());
        SSLContext sSLContext = SSLContext.getDefault();
        SSLEngine sSLEngine = sSLContext.createSSLEngine();
        SSLParameters sSLParameters = new SSLParameters();
        SNIServerName[] arrsNIServerName = new SNIServerName[11077 & 4273];
        arrsNIServerName[1042 & 20493] = new SNIHostName("update2.blazingpack.pl");
        sSLParameters.setServerNames(Arrays.asList(arrsNIServerName));
        sSLEngine.setSSLParameters(sSLParameters);
        sSLEngine.setUseClientMode((8579 & 33) != 0);
        Class_31885[] arrclass_31885 = new Class_31885[5387 & 645];
        arrclass_31885[16448 & -31334] = new Class_45604(20106 & 334);
        Class_31885[] arrclass_318852 = new Class_31885[23553 & -24573];
        arrclass_318852[-32764 & 561] = new Class_47372(sSLEngine);
        Class_31885[] arrclass_318853 = new Class_31885[9601 & -32673];
        arrclass_318853[-32640 & 6241] = new Class_45286();
        Class_31885[] arrclass_318854 = new Class_31885[-16363 & 8459];
        arrclass_318854[-28264 & 2562] = new Class_40426();
        Class_31885[] arrclass_318855 = new Class_31885[513 & 25633];
        arrclass_318855[448 & -32726] = new Class_44157(this.Field_44848.Field_15268);
        class_43291.pipeline().Method_6275(arrclass_31885).Method_6275(arrclass_318852).Method_6275(arrclass_318853).Method_6275(arrclass_318854).Method_6275(arrclass_318855);
    }

    protected void Method_44851(Class_26095 class_26095) {
        this.Method_44850((Class_43291)class_26095);
    }
}

