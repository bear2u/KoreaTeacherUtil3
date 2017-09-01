package kth.pe.koreateacherutil.modules.main

import dagger.Module
import dagger.Provides
import kth.pe.koreateacherutil.dagger2.ActivityScope
import kth.pe.koreateacherutil.presenter.main.MainPresenter
import kth.pe.koreateacherutil.presenter.main.MainPresenterImpl
import kth.pe.koreateacherutil.view.main.MainActivity
import kth.pe.koreateacherutil.view.main.MainView

@Module
open class MainModule {
    @ActivityScope
    @Provides
    fun provideMainView( mainActivity: MainActivity ) : MainView {
        return mainActivity
    }

    @ActivityScope
    @Provides
    fun providesMainPresenter(view : MainView) : MainPresenter{
        return MainPresenterImpl(view)
    }
}