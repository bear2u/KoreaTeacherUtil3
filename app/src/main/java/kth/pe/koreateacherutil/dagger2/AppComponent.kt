package kth.pe.koreateacherutil.dagger2

import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import kth.pe.koreateacherutil.MyApp

@Component( modules = arrayOf(
        AppModule::class,
        AndroidInjectionModule::class,
        ActivityModule::class
))
interface AppComponent{
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(app : MyApp) :Builder
        fun build() : AppComponent
    }

    fun inject(app : MyApp)
}