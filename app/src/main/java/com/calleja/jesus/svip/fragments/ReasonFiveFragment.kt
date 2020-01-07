package com.calleja.jesus.svip.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.calleja.jesus.svip.R
import kotlinx.android.synthetic.main.fragment_reason.view.*

class ReasonFiveFragment: Fragment() {

    private lateinit var _view: View


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _view = inflater.inflate(R.layout.fragment_reason, container, false)
        setUpView()
        return _view
    }

    private fun setUpView(){
        _view.image.setImageDrawable(context!!.getDrawable(R.mipmap.ic_ios_path))
        _view.title.text = (context!!.getText(R.string.reason_five_title_extra))
        _view.description.text = (context!!.getText(R.string.reason_five_description))
    }
}
