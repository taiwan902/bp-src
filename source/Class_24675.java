/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.cef.CefApp
 *  org.cef.browser.CefBrowser
 *  org.cef.browser.CefFrame
 *  org.cef.callback.CefSchemeHandlerFactory
 *  org.cef.handler.CefAppHandlerAdapter
 *  org.cef.handler.CefResourceHandler
 *  org.cef.network.CefRequest
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import org.cef.CefApp;
import org.cef.browser.CefBrowser;
import org.cef.browser.CefFrame;
import org.cef.callback.CefSchemeHandlerFactory;
import org.cef.handler.CefAppHandlerAdapter;
import org.cef.handler.CefResourceHandler;
import org.cef.network.CefRequest;

public class Class_24675
extends CefAppHandlerAdapter {
    private static CefResourceHandler Method_24676(CefBrowser cefBrowser, CefFrame cefFrame, String string, CefRequest cefRequest) {
        if (string.equals("bp")) {
            return new Class_38454();
        }
        return null;
    }

    public Class_24675() {
        super(null);
    }

    private void Method_24677() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_24678() {
        CefApp cefApp = CefApp.getInstance();
        cefApp.registerSchemeHandlerFactory("bp", "", (arg_0, arg_1, arg_2, arg_3) -> Class_24675.Method_24676(arg_0, arg_1, arg_2, arg_3));
    }
}

