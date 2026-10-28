package com.google.android.gms.internal;

import android.R;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class il extends WebChromeClient {
    private final hl a;

    public il(hl hlVar) {
        this.a = hlVar;
    }

    private static void a(AlertDialog.Builder builder, String str, JsResult jsResult) {
        builder.setMessage(str).setPositiveButton(R.string.ok, new io(jsResult)).setNegativeButton(R.string.cancel, new in(jsResult)).setOnCancelListener(new im(jsResult)).create().show();
    }

    private static void a(Context context, AlertDialog.Builder builder, String str, String str2, JsPromptResult jsPromptResult) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setText(str);
        EditText editText = new EditText(context);
        editText.setText(str2);
        linearLayout.addView(textView);
        linearLayout.addView(editText);
        builder.setView(linearLayout).setPositiveButton(R.string.ok, new ir(jsPromptResult, editText)).setNegativeButton(R.string.cancel, new iq(jsPromptResult)).setOnCancelListener(new ip(jsPromptResult)).create().show();
    }

    protected final void a(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        cp cpVarD = this.a.d();
        if (cpVarD == null) {
            hj.e("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
        } else {
            cpVarD.a(view, customViewCallback);
            cpVarD.a(i);
        }
    }

    protected boolean a(Context context, String str, String str2, String str3, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        try {
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setTitle(str);
            if (z) {
                a(context, builder, str2, str3, jsPromptResult);
            } else {
                a(builder, str2, jsResult);
            }
            return true;
        } catch (WindowManager.BadTokenException e) {
            hj.c("Fail to display Dialog.", e);
            return true;
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof hl)) {
            hj.e("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        cp cpVarD = ((hl) webView).d();
        if (cpVarD == null) {
            hj.e("Tried to close an AdWebView not associated with an overlay.");
        } else {
            cpVarD.a();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String str = "JS: " + consoleMessage.message() + " (" + consoleMessage.sourceId() + ":" + consoleMessage.lineNumber() + ")";
        switch (is.a[consoleMessage.messageLevel().ordinal()]) {
            case 1:
                hj.b(str);
                break;
            case 2:
                hj.e(str);
                break;
            case 3:
            case 4:
                hj.c(str);
                break;
            case 5:
                hj.a(str);
                break;
            default:
                hj.c(str);
                break;
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        webView2.setWebViewClient(this.a.f());
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        long j4 = 5242880 - j3;
        if (j4 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j == 0) {
            if (j2 > j4 || j2 > 1048576) {
                j2 = 0;
            }
        } else if (j2 == 0) {
            j2 = Math.min(Math.min(131072L, j4) + j, 1048576L);
        } else {
            if (j2 <= Math.min(1048576 - j, j4)) {
                j += j2;
            }
            j2 = j;
        }
        quotaUpdater.updateQuota(j2);
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        cp cpVarD = this.a.d();
        if (cpVarD == null) {
            hj.e("Could not get ad overlay when hiding custom view.");
        } else {
            cpVarD.c();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return (!(webView instanceof hl) || ((hl) webView).j() == null) ? a(webView.getContext(), str, str2, null, jsResult, null, false) : a(((hl) webView).j(), str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return a(webView.getContext(), str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return a(webView.getContext(), str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return a(webView.getContext(), str, str2, str3, null, jsPromptResult, true);
    }

    public final void onReachedMaxAppCacheSize(long j, long j2, WebStorage.QuotaUpdater quotaUpdater) {
        long j3 = 131072 + j;
        if (5242880 - j2 < j3) {
            quotaUpdater.updateQuota(0L);
        } else {
            quotaUpdater.updateQuota(j3);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        a(view, -1, customViewCallback);
    }
}
