package kth.pe.koreateacherutil.dagger2

import dagger.Module
import dagger.android.ContributesAndroidInjector
import kth.pe.koreateacherutil.modules.main.MainModule
import kth.pe.koreateacherutil.view.main.MainActivity

@Module
abstract class ActivityModule {
    @ActivityScope
    @ContributesAndroidInjector(modules = arrayOf(MainModule::class))
    abstract fun bindMainActivityInjector() : MainActivity
}