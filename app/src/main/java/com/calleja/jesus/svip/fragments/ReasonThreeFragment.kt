package com.calleja.jesus.svip.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.calleja.jesus.svip.R
import kotlinx.android.synthetic.main.fragment_reason.view.*

class ReasonThreeFragment: Fragment() {

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
        _view.image.setImageDrawable(context!!.getDrawable(R.mipmap.ic_talento_mobile))
        _view.title.text = (context!!.getText(R.string.reason_three_title))
        _view.description.text = (context!!.getText(R.string.reason_three_description))
    }
}
