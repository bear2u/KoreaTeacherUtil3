package kth.pe.koreateacherutil.view.main

import android.content.Context
import android.os.Bundle
import dagger.android.AndroidInjection
import kth.pe.koreateacherutil.R
import kth.pe.koreateacherutil.base.BaseActivity
import kth.pe.koreateacherutil.presenter.main.MainPresenter
import javax.inject.Inject

class MainActivity : BaseActivity() , MainView{
    @Inject lateinit var presenter : MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter.addNumberProc()
    }

    override fun getContext(): Context {
        return this
    }

    override fun addNumberDonew(number: Int) {

    }
}
