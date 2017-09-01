package kth.pe.koreateacherutil;

import android.app.Activity
import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import kth.pe.koreateacherutil.dagger2.DaggerAppComponent
import javax.inject.Inject

/**
 * Created by tommy on 2017-09-01.
 */

open class MyApp : Application() , HasActivityInjector {
    @Inject
    lateinit var androidInjector : DispatchingAndroidInjector<Activity> //초기화를 위해 lateinit 적용

    override fun onCreate() {
        super.onCreate()
        initDagger2()
    }

    private fun initDagger2() {
        DaggerAppComponent.builder().application(this).build().inject(this);
    }

    override fun activityInjector(): AndroidInjector<Activity> {
        return androidInjector;
    }
}
