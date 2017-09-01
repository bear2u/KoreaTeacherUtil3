package kth.pe.koreateacherutil.presenter.main

import android.util.Log
import kth.pe.koreateacherutil.view.main.MainView
import javax.inject.Inject

/**
 * Created by tommy on 2017-09-02.
 */
//class MainPresenterImpl
//    @Inject constructor(
//            private val mainView: MainView
//    ) :  MainPresenter {
class MainPresenterImpl :  MainPresenter {
    val mainView : MainView

    @Inject
    constructor(view: MainView) {
        this.mainView = view
    }

    override fun detachView() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//        mainView = null
    }

    override fun addNumberProc() {
        Log.d("KTH" , "addNumberProc execute")
    }
}