package com.havan.activities.base.presenter

import com.havan.activities.base.view.BaseView
import com.havan.network.FirebaseDataApi


// Created by HaVan on 5/26/2018.

open class BasePresenterImpl<in V : BaseView> : BasePresenter<V> {

    private var mView: V? = null
    override fun attachView(view: V) {
        mView = view
    }

    override fun detachView() {
        mView = null
    }

    override fun getData(path: String) {

    }
}