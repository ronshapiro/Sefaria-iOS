package org.sefaria.sefaria;

import android.app.Application;

import com.facebook.react.ReactApplication;
import com.actionsheet.ActionSheetPackage;
import com.transistorsoft.rnbackgroundfetch.RNBackgroundFetchPackage;
import com.reactnativecommunity.webview.RNCWebViewPackage;
import io.invertase.firebase.RNFirebasePackage;
import io.invertase.firebase.analytics.RNFirebaseAnalyticsPackage;
import com.reactnativecommunity.asyncstorage.AsyncStoragePackage;
import com.reactnativecommunity.netinfo.NetInfoPackage;
import com.rnziparchive.RNZipArchivePackage;
import com.apsl.versionnumber.RNVersionNumberPackage;
import org.devio.rn.splashscreen.SplashScreenReactPackage;
import com.zmxv.RNSound.RNSoundPackage;
import com.clipsub.RNShake.RNShakeEventPackage;
import com.rnfs.RNFSPackage;
import com.babisoft.ReactNativeLocalization.ReactNativeLocalizationPackage;
import com.github.droibit.android.reactnative.customtabs.CustomTabsPackage;
import com.rpt.reactnativecheckpackageinstallation.CheckPackageInstallationPackage;
import com.RNFetchBlob.RNFetchBlobPackage;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;
import com.facebook.react.modules.i18nmanager.I18nUtil;


import java.util.Arrays;
import java.util.List;

public class MainApplication extends Application implements ReactApplication {

  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
    @Override
    public boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }

    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
          new MainReactPackage(),
            new ActionSheetPackage(),
            new RNBackgroundFetchPackage(),
            new RNCWebViewPackage(),
            new RNFirebasePackage(),
            new RNFirebaseAnalyticsPackage(),
            new AsyncStoragePackage(),
            new NetInfoPackage(),
            new RNZipArchivePackage(),
            new RNVersionNumberPackage(),
            new SplashScreenReactPackage(),
            new RNSoundPackage(),
            new RNShakeEventPackage(),
            new RNFSPackage(),
            new CustomTabsPackage(),
            new CheckPackageInstallationPackage(),
            new ReactNativeLocalizationPackage(),
            new RNFetchBlobPackage()
      );
    }

    @Override
    protected String getJSMainModuleName() {
      return "index";
    }
  };

  @Override
  public ReactNativeHost getReactNativeHost() {
    return mReactNativeHost;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    I18nUtil sharedI18nUtilInstance = I18nUtil.getInstance();
    //sharedI18nUtilInstance.forceRTL(this,false);
    sharedI18nUtilInstance.allowRTL(this, false);
    SoLoader.init(this, /* native exopackage */ false);
  }
}
